package blockModeling.webApi;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.http.HttpHeaders;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.multipart.MultipartFile;

import blockModeling.Models.ReferenceBlock;
import blockModeling.Models.ActionBlock;
import blockModeling.Models.DecisionBlock;

import blockModeling.Generators.DirectoryGenerator;
import blockModeling.Generators.EcoreXMIExtractor;
import blockModeling.Generators.MDEModelToTextTransformation;

import blockModeling.Validators.ReferenceBlockValidator;
import blockModeling.Validators.ActionBlockValidator;
import blockModeling.Validators.DecisionBlockValidator;

import blockModeling.utils.AppModelParser;
import blockModeling.utils.ZipUtils;

import blockModeling.fileUploading.UploadFileResponse;
import blockModeling.fileUploading.FileStorageService;
import blockModeling.fileUploading.FileStorageProperties;

import blockModelingMetamodel.BlockApp;


@RestController
public class WebAPI {
	
	private DirectoryGenerator dGenerator = null;
	
	@CrossOrigin
	@PostMapping("/reference-block")
	public ReferenceBlock receiveReferenceBlock(@RequestBody ReferenceBlock refBlock) {
		System.out.println("Receiving Reference Block...\n");
		
		ReferenceBlockValidator validator = new ReferenceBlockValidator(refBlock);
		validator.validate();
		
		System.out.println(validator.getBlock());
		return validator.getBlock();
	}
	
	@CrossOrigin
	@PostMapping("/action-block")
	public ActionBlock receiveActionBlock(@RequestBody ActionBlock aBlock) {
		System.out.println("Receiving Action Block...\n");
		
		System.out.println(aBlock);
		ActionBlockValidator validator = new ActionBlockValidator(aBlock);
		validator.validate();
		
		return validator.getBlock();
	}
	
	@CrossOrigin
	@PostMapping("/decision-block")
	public DecisionBlock receiveDecisionBlock(@RequestBody DecisionBlock dBlock) {
		System.out.println("Receiving Action Block...\n");
		
		System.out.println(dBlock);
		DecisionBlockValidator validator = new DecisionBlockValidator(dBlock);
		validator.validate();
		
		return validator.getBlock();
	}
	
	@CrossOrigin
	@PostMapping("/deploy-decision-block")
	public String deployDecisionBlock(@RequestBody DecisionBlock dBlock) {
		
		System.out.println("Received Decision Block...\n");
		// Initialize The Parser, witch creates an ecore model, using the input model.
		AppModelParser parser = new AppModelParser();
		System.out.println("Parsing Decision Block...\n");
		// Create the ecore model.
		BlockApp app = parser.createDecisionEcoreModel(dBlock);
		System.out.println("Decision Block Parsed Succesfully!\n");
		
		if(this.dGenerator == null) {
			// Initialize the folder generator. Will be used to create the folders that store all
			// the files for the block, including the ecore model and the images.
			this.dGenerator = new DirectoryGenerator("/home/evans-p/Desktop/block-modeling-back-end/BlockModelingBackend/Resources/");
			
			// Create the base directory.
			this.dGenerator.createBaseDirectory("Decision");
			// Create the directory to store the xmi file of the model.
			this.dGenerator.createEcoreXMIDirectory();
			// Create the directory to the files that represent the block.
			this.dGenerator.createFilesDirectory();
			// Create the directory to store the images of the block.
			this.dGenerator.createImagesDirectory();
		}
		System.out.println("Generating Code...\n");
		// Export the model to the desired location.
		EcoreXMIExtractor eExtractor = new EcoreXMIExtractor(dGenerator.getEcoreXMIDirectory(), "DecisionBlock");
		eExtractor.exportEcoreXMI(app);
		
		MDEModelToTextTransformation M2TGenerator = new MDEModelToTextTransformation(
				dGenerator.getFilesDirectory()+"/", dGenerator.getEcoreXMIDirectory() + "/" + eExtractor.getModelName());
		
		M2TGenerator.executeModelToTextTransformation();
		
		ZipUtils appZip = new ZipUtils(this.dGenerator.getBaseDirectory()+".zip", this.dGenerator.getBaseDirectory());
        appZip.zip();
		
		System.out.println("GENERATION COMPLETE!");
		
        String fileName = this.dGenerator.getBaseDirectoryName()+".zip";
        
		this.dGenerator = null;
		
		return fileName;
	}
	
	@CrossOrigin
	@PostMapping("/deploy-action-block")
	public String deployActionBlock(@RequestBody ActionBlock aBlock) {
		
		System.out.println("Received Action Block!\n");
		// Initialize The Parser, witch creates an ecore model, using the input model.
		AppModelParser parser = new AppModelParser();
		System.out.println("Parsing Action Block..\n");
		// Create the ecore model.
		BlockApp app = parser.createActionEcoreModel(aBlock);
		System.out.println("Action Block Parsed Succesfully!\n");
		
		if(this.dGenerator == null) {
			// Initialize the folder generator. Will be used to create the folders that store all
			// the files for the block, including the ecore model and the images.
			this.dGenerator = new DirectoryGenerator("/home/evans-p/Desktop/block-modeling-back-end/BlockModelingBackend/Resources/");
			
			// Create the base directory.
			this.dGenerator.createBaseDirectory("ActionBlock");
			// Create the directory to store the xmi file of the model.
			this.dGenerator.createEcoreXMIDirectory();
			// Create the directory to the files that represent the block.
			this.dGenerator.createFilesDirectory();
			// Create the directory to store the images of the block.
			this.dGenerator.createImagesDirectory();
		}
		
		// Export the model to the desired location.
		EcoreXMIExtractor eExtractor = new EcoreXMIExtractor(dGenerator.getEcoreXMIDirectory(), "ActionBlock");
		eExtractor.exportEcoreXMI(app);
		System.out.println("Generating Code...\n");
		MDEModelToTextTransformation M2TGenerator = new MDEModelToTextTransformation(
				dGenerator.getFilesDirectory()+"/", dGenerator.getEcoreXMIDirectory() + "/" + eExtractor.getModelName());
		
		M2TGenerator.executeModelToTextTransformation();
		
        ZipUtils appZip = new ZipUtils(this.dGenerator.getBaseDirectory()+".zip", this.dGenerator.getBaseDirectory());
        appZip.zip();
		
		System.out.println("GENERATION COMPLETE!");
		
        String fileName = this.dGenerator.getBaseDirectoryName()+".zip";
        
		this.dGenerator = null;
		
		return fileName;
	}
	
	@CrossOrigin
	@PostMapping("/deploy-reference-block")
	public String deployReferenceBlock(@RequestBody ReferenceBlock refBlock) {
		
		System.out.println("Received Reference Block!\n");
		// Initialize The Parser, witch creates an ecore model, using the input model.
		AppModelParser parser = new AppModelParser();
		System.out.println("Parsing Reference Block...\n");
		// Create the ecore model.
		BlockApp app = parser.createReferenceEcoreModel(refBlock);
		System.out.println("Reference Block Parsed Succesfully!\n");

		if(this.dGenerator == null) {
			// Initialize the folder generator. Will be used to create the folders that store all
			// the files for the block, including the ecore model and the images.
			this.dGenerator = new DirectoryGenerator("/home/evans-p/Desktop/block-modeling-back-end/BlockModelingBackend/Resources/");
			
			// Create the base directory.
			this.dGenerator.createBaseDirectory("ReferenceBlock");
			// Create the directory to store the xmi file of the model.
			this.dGenerator.createEcoreXMIDirectory();
			// Create the directory to the files that represent the block.
			this.dGenerator.createFilesDirectory();
			// Create the directory to store the images of the block.
			this.dGenerator.createImagesDirectory();
		}
		
		// Export the model to the desired location.
		EcoreXMIExtractor eExtractor = new EcoreXMIExtractor(dGenerator.getEcoreXMIDirectory(), "ReferenceBlock");
		eExtractor.exportEcoreXMI(app);
		System.out.println("Generating Code...\n");
		MDEModelToTextTransformation M2TGenerator = new MDEModelToTextTransformation(
				dGenerator.getFilesDirectory()+"/", dGenerator.getEcoreXMIDirectory() + "/" + eExtractor.getModelName());
		
		M2TGenerator.executeModelToTextTransformation();
		
		ZipUtils appZip = new ZipUtils(this.dGenerator.getBaseDirectory()+".zip", this.dGenerator.getBaseDirectory());
        appZip.zip();
        
        System.out.println("GENERATION COMPLETE!");
		
        String fileName = this.dGenerator.getBaseDirectoryName()+".zip";
        
		this.dGenerator = null;
		
		return fileName;
	}
	
	@CrossOrigin
	@PostMapping("/image-upload")
	public UploadFileResponse uploadImage(@RequestParam("file") MultipartFile file, @RequestParam("name") String name, @RequestParam("blockType") String blockType) {
		
		if(this.dGenerator == null) {
			// Initialize the folder generator. Will be used to create the folders that store all
			// the files for the block, including the ecore model and the images.
			this.dGenerator = new DirectoryGenerator("/home/evans-p/Desktop/block-modeling-back-end/BlockModelingBackend/Resources/");
			
			// Create the base directory.
			this.dGenerator.createBaseDirectory(blockType);
			// Create the directory to store the xmi file of the model.
			this.dGenerator.createEcoreXMIDirectory();
			// Create the directory to the files that represent the block.
			this.dGenerator.createFilesDirectory();
			// Create the directory to store the images of the block.
			this.dGenerator.createImagesDirectory();
		}
		
		FileStorageProperties fileStorageProperties = new FileStorageProperties(this.dGenerator.getImagesDirectory());
		FileStorageService fileStorageService = new FileStorageService(fileStorageProperties);
		
		String fileName = fileStorageService.storeFile(file, name);
		
        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/downloadFile/")
                .path(fileName)
                .toUriString();

        return new UploadFileResponse(fileName, fileDownloadUri, file.getContentType(), file.getSize());
	}
	
//	@GetMapping(value="", produces="application/zip")
	@CrossOrigin
	@RequestMapping(value = "/download/{fileName}", method = RequestMethod.GET, produces="application/zip")
	@ResponseBody
	public ResponseEntity<Resource> downloadZipFile(@PathVariable String fileName) throws IOException{
		System.out.println("Get Request for File:" + fileName);
		File file = new File("/home/evans-p/Desktop/block-modeling-back-end/BlockModelingBackend/Resources/" + fileName);
		
		HttpHeaders header = new HttpHeaders();
		
//		ContentDisposition cDisposition = ContentDisposition.builder(type)
		header.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + fileName);
        header.add("Cache-Control", "no-cache, no-store, must-revalidate");
        header.add("Pragma", "no-cache");
        header.add("Expires", "0");
		
        Path path = Paths.get(file.getAbsolutePath());
        ByteArrayResource resource = new ByteArrayResource(Files.readAllBytes(path));
        
        System.out.println(fileName + " was just posted!");
        
	    return ResponseEntity.ok()
	            .headers(header)
	            .contentLength(file.length())
	            .body(resource);		
	}
}
