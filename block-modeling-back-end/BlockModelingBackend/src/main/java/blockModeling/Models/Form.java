package blockModeling.Models;

import java.util.ArrayList;

public class Form {

	private String type;
	private String placeholderEL;
	private String placeholderEN;
	private String variableLabelEL;
	private String variableLabelEN;
	private String defaultValueEL;
	private String defaultValueEN;
	private float minValue;
	private float maxValue;
	private float defaultValue;
	private boolean noMinValue;
	private boolean noMaxValue;
	private boolean noDefaultValue;
	private ArrayList<ConditionOption> conditionHasOptions;
	private ArrayList<Option> hasOptions;
	private ArrayList<Error> errors;
	
	public Form() {
		super();
	}

	public Form(String type, String placeholderEL, String placeholderEN, String variableLabelEL, String variableLabelEN,
			String defaultValueEL, String defaultValueEN, float minValue, float maxValue, float defaultValue,
			boolean noMinValue, boolean noMaxValue, boolean noDefaultValue,
			ArrayList<ConditionOption> conditionHasOptions, ArrayList<Option> hasOptions, ArrayList<Error> errors) {
		super();
		this.type = type;
		this.placeholderEL = placeholderEL;
		this.placeholderEN = placeholderEN;
		this.variableLabelEL = variableLabelEL;
		this.variableLabelEN = variableLabelEN;
		this.defaultValueEL = defaultValueEL;
		this.defaultValueEN = defaultValueEN;
		this.minValue = minValue;
		this.maxValue = maxValue;
		this.defaultValue = defaultValue;
		this.noMinValue = noMinValue;
		this.noMaxValue = noMaxValue;
		this.noDefaultValue = noDefaultValue;
		this.conditionHasOptions = conditionHasOptions;
		this.hasOptions = hasOptions;
		this.errors = errors;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPlaceholderEL() {
		return placeholderEL;
	}

	public void setPlaceholderEL(String placeholderEL) {
		this.placeholderEL = placeholderEL;
	}

	public String getPlaceholderEN() {
		return placeholderEN;
	}

	public void setPlaceholderEN(String placeholderEN) {
		this.placeholderEN = placeholderEN;
	}

	public String getVariableLabelEL() {
		return variableLabelEL;
	}

	public void setVariableLabelEL(String variableLabelEL) {
		this.variableLabelEL = variableLabelEL;
	}

	public String getVariableLabelEN() {
		return variableLabelEN;
	}

	public void setVariableLabelEN(String variableLabelEN) {
		this.variableLabelEN = variableLabelEN;
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

	public ArrayList<ConditionOption> getConditionHasOptions() {
		return conditionHasOptions;
	}

	public void setConditionHasOptions(ArrayList<ConditionOption> conditionHasOptions) {
		this.conditionHasOptions = conditionHasOptions;
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
		return "Form [type=" + type + ", placeholderEL=" + placeholderEL + ", placeholderEN=" + placeholderEN
				+ ", variableLabelEL=" + variableLabelEL + ", variableLabelEN=" + variableLabelEN + ", defaultValueEL="
				+ defaultValueEL + ", defaultValueEN=" + defaultValueEN + ", minValue=" + minValue + ", maxValue="
				+ maxValue + ", defaultValue=" + defaultValue + ", noMinValue=" + noMinValue + ", noMaxValue="
				+ noMaxValue + ", noDefaultValue=" + noDefaultValue + ", conditionHasOptions=" + conditionHasOptions
				+ ", hasOptions=" + hasOptions + ", errors=" + errors + "]";
	}

	public void addError(Error err) {
		this.errors.add(err);
	}
	
	public void setConditionOption(int index, ConditionOption option) {
		this.conditionHasOptions.set(index, option);
	}
}
