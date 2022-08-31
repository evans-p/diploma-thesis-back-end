package blockModeling.Validators;

import java.util.Set;

import blockModeling.Models.ConditionOption;
import blockModeling.Models.Error;

public class ConditionOptionValidator{
	// The option to be validated.	
	private ConditionOption option;
	// A set of valid condition types for the attribute "conditionType".	
	private static final Set<String> comparisonTypes = 
			Set.of("none", "select", "input");
	
	
	public ConditionOptionValidator() {
		super();
	}

	public ConditionOptionValidator(ConditionOption option) {
		super();
		this.option = option;
	}
	
	public ConditionOption getOption() {
		return option;
	}

	public void setOption(ConditionOption option) {
		this.option = option;
	}

	public void validate() {
		// Make sure optionTextEL is filled out.		
		if(this.option.getOptionTextEL() == null) {
			this.option.addError(
					new Error(
					"optionTextEL",
					"Η επιλογή πρέπει να έχει ορισμένο το κείμενο επιλογής.",
					"Option must have the option text defined.")
				);			
		}
		
		// Make sure optionTextEL is filled out.		
		if(this.option.getOptionTextEN() == null) {
			this.option.addError(
					new Error(
					"optionTextEN",
					"Η επιλογή πρέπει να έχει ορισμένο το κείμενο επιλογής.",
					"Option must have the option text defined.")
				);			
		}
		
		// Make sure that comparisonType exists. 		
		if(this.option.getComparisonType() == null) {
			this.option.addError(
					new Error(
					"comparisonType",
					"Η επιλογή πρέπει να έχει έναν τρόπο σύγκρισης.",
					"Option must have a comparison type.")
				);	
		}
		// Make sure that comparisonType has a proper value. 	
		else if(!comparisonTypes.contains(this.option.getComparisonType())) {
			this.option.addError(
					new Error(
					"comparisonType",
					"Λανθασμένος τρόπος σύγκρισης. Ο τελευταίος πρέπει να έχει μία από τις τιμές: 'κανένας', 'επιλογή', 'είσοδος'.",
					"Illegal comparison type. Must be equal to one of: 'none', 'select', 'input'.")
				);	
		}
		// make sure that the block has the comparators attribute filled out,
		// if comparisonType==input or comparisonType==select 		
		if(this.option.getComparisonType().equals("input")||
			this.option.getComparisonType().equals("select")) {
			if(
				this.option.getComparators() == null ||
				(this.option.getComparators().size()==0) ||
				((this.option.getComparators().size()==1) &&
				 (this.option.getComparators().get(0).equals("")))
				) {
				this.option.addError(
						new Error(
						"comparators",
						"Εφόσον ο τύπος σύκρισης είναι 'επιλογή' ή 'είσοδος', η παρούσα επιλογή πρέπει να έχει συγκριτές.",
						"While comparison type is 'select' or 'input', the option must have comparators.")
					);	
			}
			
		}
		// If comparisonType==select make sure that the option has at least one option.		
		if(this.option.getComparisonType().equals("select")){
			if(this.option.getHasOptions().size() <= 0) {
				this.option.addError(
						new Error(
						"hasOptions",
						"Εφόσον ο τύπος σύκρισης είναι 'επιλογή', πρέπει να υπάρχει τουλάχιστον μία επιλογή.",
						"While comparison type is 'select', there must be at least one option.")
					);	
			}
		}
	}
}
