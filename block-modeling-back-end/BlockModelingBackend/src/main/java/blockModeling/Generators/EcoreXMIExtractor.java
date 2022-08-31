package blockModeling.Generators;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
//import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import blockModelingMetamodel.BlockApp;

public class EcoreXMIExtractor {
	
	private ResourceSet resourceSet;
	private URI oURI;
	private Resource resource;
	private String modelName;
	
	public EcoreXMIExtractor(String outputDir, String modelName) {
		
		// Create a resource set.
		resourceSet = new ResourceSetImpl();
		
		this.resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		
		this.modelName = modelName + "ecoreModel.xmi";
		
		File xmiFile = new File(outputDir + "/" + this.modelName);
		// Get the URI of the model file.
		oURI = URI.createFileURI(xmiFile.getAbsolutePath());
		System.out.println("Exporting xmi at: " + oURI.path() + "\n");
		// Create a resource for this file.
		resource = resourceSet.createResource(oURI);
	}
	
	public String getModelName() {
		return this.modelName;
	}
	
	public void exportEcoreXMI(BlockApp app) {
		
		
		System.out.println(app);
		this.resource.getContents().add(app);
		
		try {
			this.resource.save(Collections.EMPTY_MAP);
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
