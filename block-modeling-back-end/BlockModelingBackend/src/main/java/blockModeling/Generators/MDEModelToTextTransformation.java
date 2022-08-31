package blockModeling.Generators;

import blockModeling.Generators.Main;


public class MDEModelToTextTransformation {
	
	private String modelDirectory;
	private String modelFile;
	
	public MDEModelToTextTransformation(String directory, String file) {
		this.modelDirectory = directory;
		this.modelFile = file;
	}
	
	public void executeModelToTextTransformation() {
		
		String[] acceleoArguments = new String[2];
		
		acceleoArguments[0] = this.modelFile;
		acceleoArguments[1] = this.modelDirectory;
//		acceleoArguments[1] = "/BlockModelingBackend/Resources/ActionBlock-2021-18-02-02-18-45/ecore/";
//		acceleoArguments[0] = "/BlockModelingBackend/Resources/ActionBlock-2021-18-02-02-18-45/ecore/ActionBlockecoreModel.xmi";
		
		Main.main(acceleoArguments);
	}
}
