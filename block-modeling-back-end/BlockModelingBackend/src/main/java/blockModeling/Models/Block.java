package blockModeling.Models;

import java.util.ArrayList;


abstract class Block {
	
	private String type;
	private String category;
	private String blockNameEL;
	private String blockNameEN;
	private String backroundColor;
	private String blockType;
	private ArrayList<Error> errors;
	
	public Block() {
		super();
	}

	public Block(String type, String category, String blockNameEL, String blockNameEN, String backroundColor,
			String blockType, ArrayList<Error> errors) {
		super();
		this.type = type;
		this.category = category;
		this.blockNameEL = blockNameEL;
		this.blockNameEN = blockNameEN;
		this.backroundColor = backroundColor;
		this.blockType = blockType;
		this.errors = errors;
	}


	public String getType() {
		return type;
	}
	
	

	public String getBlockNameEL() {
		return blockNameEL;
	}

	public void setBlockNameEL(String blockNameEL) {
		this.blockNameEL = blockNameEL;
	}

	public String getBlockNameEN() {
		return blockNameEN;
	}

	public void setBlockNameEN(String blockNameEN) {
		this.blockNameEN = blockNameEN;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getBackroundColor() {
		return backroundColor;
	}

	public void setBackroundColor(String backroundColor) {
		this.backroundColor = backroundColor;
	}

	public String getBlockType() {
		return blockType;
	}

	public void setBlockType(String blockType) {
		this.blockType = blockType;
	}

	public ArrayList<Error> getErrors() {
		return errors;
	}

	public void setErrors(ArrayList<Error> errors) {
		this.errors = errors;
	}

	@Override
	public String toString() {
		return "Block [type=" + type + ", category=" + category + ", blockNameEL=" + blockNameEL + ", blockNameEN="
				+ blockNameEN + ", backroundColor=" + backroundColor + ", blockType=" + blockType + ", errors=" + errors
				+ "]";
	}
	
	public void addError(Error err) {
		this.errors.add(err);
	}
}
