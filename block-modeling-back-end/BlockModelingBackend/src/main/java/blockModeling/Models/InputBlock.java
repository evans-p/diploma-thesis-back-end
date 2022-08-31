package blockModeling.Models;

import java.util.ArrayList;

public class InputBlock {
	
	private String id;
	private String type;
	private String image;
	private String infoTextEL;
	private String infoTextEN;
	private String variableName;
	private String iconCursor;
	private float minValue;
	private float maxValue;
	private float defaultValue;
	private String defaultValueEL;
	private String defaultValueEN;
	private boolean noMinValue;
	private boolean noMaxValue;
	private boolean noDefaultValue;
	private ArrayList<Option> hasOptions;
	private ArrayList<Error> errors;
	
	public InputBlock() {
	}

	public InputBlock(String id, String type, String image, String infoTextEL, String infoTextEN, String variableName,
			String iconCursor, float minValue, float maxValue, float defaultValue, String defaultValueEL,
			String defaultValueEN, boolean noMinValue, boolean noMaxValue, boolean noDefaultValue,
			ArrayList<Option> hasOptions, ArrayList<Error> errors) {
		super();
		this.id = id;
		this.type = type;
		this.image = image;
		this.infoTextEL = infoTextEL;
		this.infoTextEN = infoTextEN;
		this.variableName = variableName;
		this.iconCursor = iconCursor;
		this.minValue = minValue;
		this.maxValue = maxValue;
		this.defaultValue = defaultValue;
		this.defaultValueEL = defaultValueEL;
		this.defaultValueEN = defaultValueEN;
		this.noMinValue = noMinValue;
		this.noMaxValue = noMaxValue;
		this.noDefaultValue = noDefaultValue;
		this.hasOptions = hasOptions;
		this.errors = errors;
	}
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getInfoTextEL() {
		return infoTextEL;
	}

	public void setInfoTextEL(String infoTextEL) {
		this.infoTextEL = infoTextEL;
	}

	public String getInfoTextEN() {
		return infoTextEN;
	}

	public void setInfoTextEN(String infoTextEN) {
		this.infoTextEN = infoTextEN;
	}

	public String getVariableName() {
		return variableName;
	}

	public void setVariableName(String variableName) {
		this.variableName = variableName;
	}

	public String getIconCursor() {
		return iconCursor;
	}

	public void setIconCursor(String iconCursor) {
		this.iconCursor = iconCursor;
	}

	public float getMinValue() {
		return minValue;
	}

	public void setMinValue(float minValue) {
		this.minValue = minValue;
	}

	public float getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(float maxValue) {
		this.maxValue = maxValue;
	}

	public float getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(float defaultValue) {
		this.defaultValue = defaultValue;
	}

	public String getDefaultValueEL() {
		return defaultValueEL;
	}

	public void setDefaultValueEL(String defaultValueEL) {
		this.defaultValueEL = defaultValueEL;
	}

	public String getDefaultValueEN() {
		return defaultValueEN;
	}

	public void setDefaultValueEN(String defaultValueEN) {
		this.defaultValueEN = defaultValueEN;
	}

	public boolean getNoMinValue() {
		return noMinValue;
	}

	public void setNoMinValue(boolean noMinValue) {
		this.noMinValue = noMinValue;
	}

	public boolean getNoMaxValue() {
		return noMaxValue;
	}

	public void setNoMaxValue(boolean noMaxValue) {
		this.noMaxValue = noMaxValue;
	}

	public boolean getNoDefaultValue() {
		return noDefaultValue;
	}

	public void setNoDefaultValue(boolean noDefaultValue) {
		this.noDefaultValue = noDefaultValue;
	}

	public ArrayList<Option> getHasOptions() {
		return hasOptions;
	}

	public void setHasOptions(ArrayList<Option> hasOptions) {
		this.hasOptions = hasOptions;
	}

	public ArrayList<Error> getErrors() {
		return errors;
	}

	public void setErrors(ArrayList<Error> errors) {
		this.errors = errors;
	}

	@Override
	public String toString() {
		return "InputBlock [id=" + id + ", type=" + type + ", image=" + image + ", infoTextEL=" + infoTextEL
				+ ", infoTextEN=" + infoTextEN + ", variableName=" + variableName + ", iconCursor=" + iconCursor
				+ ", minValue=" + minValue + ", maxValue=" + maxValue + ", defaultValue=" + defaultValue
				+ ", defaultValueEL=" + defaultValueEL + ", defaultValueEN=" + defaultValueEN + ", noMinValue="
				+ noMinValue + ", noMaxValue=" + noMaxValue + ", noDefaultValue=" + noDefaultValue + ", hasOptions="
				+ hasOptions + ", errors=" + errors + "]";
	}

	public void addError(Error err) {
		this.errors.add(err);
	}
}
