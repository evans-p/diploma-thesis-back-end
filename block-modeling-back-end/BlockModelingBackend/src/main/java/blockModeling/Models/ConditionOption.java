package blockModeling.Models;

import java.util.ArrayList;

public class ConditionOption {
	
	private String id;
	private String optionTextEL;
	private String optionTextEN;
	private String comparisonType;
	private ArrayList<String> comparators;
	private ArrayList<Option> hasOptions;
	private ArrayList<Error> errors;
	
	public ConditionOption() {
		super();
	}
	
	public ConditionOption(String id, String optionTextEL, String optionTextEN, String comparisonType,
			ArrayList<String> comparators, ArrayList<Option> hasOptions, ArrayList<Error> errors) {
		super();
		this.id = id;
		this.optionTextEL = optionTextEL;
		this.optionTextEN = optionTextEN;
		this.comparisonType = comparisonType;
		this.comparators = comparators;
		this.hasOptions = hasOptions;
		this.errors = errors;
	}

	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOptionTextEL() {
		return optionTextEL;
	}

	public void setOptionTextEL(String optionTextEL) {
		this.optionTextEL = optionTextEL;
	}

	public String getOptionTextEN() {
		return optionTextEN;
	}

	public void setOptionTextEN(String optionTextEN) {
		this.optionTextEN = optionTextEN;
	}

	public String getComparisonType() {
		return comparisonType;
	}

	public void setComparisonType(String comparisonType) {
		this.comparisonType = comparisonType;
	}

	public ArrayList<String> getComparators() {
		return comparators;
	}

	public void setComparators(ArrayList<String> comparators) {
		this.comparators = comparators;
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
		return "ConditionOption [id=" + id + ", optionTextEL=" + optionTextEL + ", optionTextEN=" + optionTextEN
				+ ", comparisonType=" + comparisonType + ", comparators=" + comparators + ", hasOptions=" + hasOptions
				+ ", errors=" + errors + "]";
	}

	public void addError(Error err) {
		this.errors.add(err);
	}
}
