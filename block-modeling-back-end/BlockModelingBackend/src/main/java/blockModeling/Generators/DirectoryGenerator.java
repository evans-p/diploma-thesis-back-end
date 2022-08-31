package blockModeling.Generators;

import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.text.DateFormat;  
import java.text.SimpleDateFormat;  

import java.util.Date;  
import java.util.Calendar; 

public class DirectoryGenerator {
	// The base path of all the folders to be generated.
	private String basePath;
	// The main folder. Contains all the files that represent the model.
	private String baseDirectory;
	// A folder to store the ecore model.
	private String ecoreXMIDirectory;
	// A folder to store the js files of the model.
	private String filesDirectory;
	// A folder to store the images of the
	private String imagesDirectory;
	// The name of the base directory.
	private String baseDirectoryName;
	
	
	public DirectoryGenerator(String basePath) {
		this.basePath = basePath;
	}
	
	
	public void createBaseDirectory(String blockType) {
		try {
			this.baseDirectoryName = blockType + "-" + DateToString();
			this.baseDirectory = this.basePath + this.baseDirectoryName;
			Path path = Paths.get(baseDirectory);
			
			Files.createDirectories(path);
		}
		catch(IOException e) {
			System.err.println("Failed to create directory!" + e.getMessage());
		}
	}

	public void createEcoreXMIDirectory() {
		try {
			this.ecoreXMIDirectory = this.baseDirectory + "/ecore";
			Path path = Paths.get(ecoreXMIDirectory);
			
			Files.createDirectories(path);
		}
		catch(IOException e) {
			System.err.println("Failed to create directory!" + e.getMessage());
		}
	}
	
	public void createFilesDirectory() {
		try {
			this.filesDirectory = this.baseDirectory + "/source";
			Path path = Paths.get(filesDirectory);
			
			Files.createDirectories(path);
		}
		catch(IOException e) {
			System.err.println("Failed to create directory!" + e.getMessage());
		}
	}
	
	public void createImagesDirectory() {
		try {
			this.imagesDirectory = this.baseDirectory + "/img";
			Path path = Paths.get(imagesDirectory);
			
			Files.createDirectories(path);
		}
		catch(IOException e) {
			System.err.println("Failed to create directory!" + e.getMessage());
		}
	}
	
	private String DateToString() {
		
		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh-mm-ss");
		String strDate = dateFormat.format(date).replace(" ", "-");
		
		return strDate;		
	}
	
	public String getBaseDirectoryName() {
		return baseDirectoryName;
	}

	public String getBasePath() {
		return basePath;
	}


	public String getBaseDirectory() {
		return baseDirectory;
	}


	public String getEcoreXMIDirectory() {
		return ecoreXMIDirectory;
	}


	public String getFilesDirectory() {
		return filesDirectory;
	}


	public String getImagesDirectory() {
		return imagesDirectory;
	}
}
