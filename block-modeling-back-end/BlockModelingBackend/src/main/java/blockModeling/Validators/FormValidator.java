package blockModeling.Validators;

import blockModeling.Models.Error;
import blockModeling.Models.Form;

public class FormValidator {
	
	private Form form;
	
	public FormValidator() {
	}
	
	public FormValidator(Form form) {
		super();
		this.form = form;
	}
	
	public Form getForm() {
		return form;
	}

	public void setForm(Form form) {
		this.form = form;
	}

	private void validateLabeledTextInputForm() {
		// Make sure VariableLabelEL exists.
		if(this.form.getVariableLabelEL()==null) {	
			this.form.addError(
					new Error(
					"variableLabelEL",
					"Το μπλοκ πρέπει να έχει όνομα μεταβλητής.",
					"Block must have a variable name.")
					);			
		}
		
		// Make sure VariableLabelEL exists.
		if(this.form.getVariableLabelEN()==null) {	
			this.form.addError(
					new Error(
					"variableLabelEN",
					"Το μπλοκ πρέπει να έχει όνομα μεταβλητής.",
					"Block must have a variable name.")
					);			
		}
	}
	
	private void validateLabeledFloatInputForm() {
		// Make sure VariableLabelEL exists.
		if(this.form.getVariableLabelEL()==null) {	
			this.form.addError(
					new Error(
					"variableLabelEL",
					"Το μπλοκ πρέπει να έχει όνομα μεταβλητής.",
					"Block must have a variable name.")
					);			
		}
		
		// Make sure VariableLabelEL exists.
		if(this.form.getVariableLabelEN()==null) {	
			this.form.addError(
					new Error(
					"variableLabelEN",
					"Το μπλοκ πρέπει να έχει όνομα μεταβλητής.",
					"Block must have a variable name.")
					);			
		}

		// Make sure that minValue < maxValue.
		if(!(this.form.getNoMinValue()) && !(this.form.getNoMaxValue())) {
			
			if (this.form.getMinValue()>=this.form.getMaxValue()) {
				System.out.println("Min value greater than max value");
				this.form.addError(
						new Error(
						"minValue",
						"Η ελάχιστη τιμή, εφόσον υπάρχει πρέπει να είναι αυστηρά μικρότερη από την μέγιστη.",
						"Minimum value must be lesser than Maximum Value.")
						);
				this.form.addError(
						new Error(
						"maxValue",
						"Η μέγιστη τιμή, εφόσον υπάρχει πρέπει να είναι αυστηρά μεγαλύτερη από την ελάχιστη.",
						"Maximum value must be greater than minimum value.")
						);	
			}
		}
		
		// Make sure that minValue <= defaultValue <= maxValue
		if(!this.form.getNoDefaultValue()) {
			if(!(this.form.getNoMinValue())&&this.form.getNoMaxValue()) {
				if(this.form.getMinValue() > this.form.getDefaultValue()) {
					this.form.addError(
							new Error(
							"defaultValue",
							"Η προκαθορισμένη τιμή, εφόσον υπάρχει, πρέπει να είναι μεγαλύτερη από την ελάχιστη τιμή.",
							"Default value must be greater than minimum value.")
							);
				}
			}
			
			else if(!(this.form.getNoMaxValue())&&this.form.getNoMinValue()) {
				if(this.form.getMaxValue() < this.form.getDefaultValue()) {
					this.form.addError(
							new Error(
							"defaultValue",
							"Η προκαθορισμένη τιμή, εφόσον υπάρχει, πρέπει να είναι μικρότερη από την μέγιστη τιμή.",
							"Default value must be less than maximum value.")
							);
				}
			}
			
			else if(!(this.form.getNoMaxValue())&&(!this.form.getNoMinValue())) {
				if(
					(this.form.getMaxValue() < this.form.getDefaultValue())||
					(this.form.getMinValue() > this.form.getDefaultValue())
					) {
					this.form.addError(
							new Error(
							"defaultValue",
							"Η προκαθορισμένη τιμή, εφόσον υπάρχει, πρέπει να είναι μικρότερη από την μέγιστη τιμή και Μεγαλύτερη από την ελάχιστη τιμή.",
							"Default value must be less than maximum value and greater than minimum value.")
							);
				}
			}
		}		
	}
	
	private void validateLabeledIntegerInputForm() {		
		String minValueMessageEL = "";
		String minValueMessageEN = "";
		String maxValueMessageEL = "";
		String maxValueMessageEN = "";
		String defaultValueMessageEL = "";
		String defaultValueMessageEN = "";

		// Make sure that min value is an integer.
		if(!this.form.getNoMinValue()){
			if (this.form.getMinValue() - (int)this.form.getMinValue() != 0) {

				System.out.println("Min value not an Integer");

				minValueMessageEL += "Η Ελάχιστη τιμή πρέπει να είναι ακέραιος αριθμός. ";
				minValueMessageEN += "Minimum Value must be an integer value. ";
				
			}
		}

		// Make sure that max value is an integer.
		if(!this.form.getNoMaxValue()){
			if (this.form.getMaxValue() - (int)this.form.getMaxValue() != 0) {

				System.out.println("Max value not an Integer");

				maxValueMessageEL += "Η Μέγιστη τιμή πρέπει να είναι ακέραιος αριθμός. ";
				maxValueMessageEN += "Maximum Value must be an integer value. ";
				
			}
		}
		// Make sure that default value is an integer.
		if(!this.form.getNoDefaultValue()){
			if (this.form.getDefaultValue() - (int)this.form.getDefaultValue() != 0) {

				System.out.println("Default value not an Integer");

				defaultValueMessageEL += "Η προκαθορισμένη τιμή πρέπει να είναι ακέραιος αριθμός. ";
				defaultValueMessageEN += "Default Value must be an integer value. ";
			}
		}

		// Make sure that minValue < maxValue.
		if(!(this.form.getNoMinValue()) && !(this.form.getNoMaxValue())) {
			
			if (this.form.getMinValue()>=this.form.getMaxValue()) {

				System.out.println("Min value greater than max value");

				minValueMessageEL += "Η ελάχιστη τιμή, εφόσον υπάρχει πρέπει να είναι αυστηρά μικρότερη από την μέγιστη.";
				minValueMessageEN += "Minimum value must be lesser than Maximum Value.";
				maxValueMessageEL += "Η μέγιστη τιμή, εφόσον υπάρχει πρέπει να είναι αυστηρά μεγαλύτερη από την ελάχιστη.";
				maxValueMessageEN += "Maximum value must be greater than minimum value.";
			}
			
		}

		// Make sure that minValue <= defaultValue <= maxValue
		if(!this.form.getNoDefaultValue()) {
			if(!(this.form.getNoMinValue())&&this.form.getNoMaxValue()) {
				if(this.form.getMinValue() > this.form.getDefaultValue()) {

					defaultValueMessageEL += "Η προκαθορισμένη τιμή, εφόσον υπάρχει, πρέπει να είναι μεγαλύτερη από την ελάχιστη τιμή.";
					defaultValueMessageEN += "Default value must be greater than minimum value.";				
				}
			}
			
			else if(!(this.form.getNoMaxValue())&&this.form.getNoMinValue()) {
				if(this.form.getMaxValue() < this.form.getDefaultValue()) {

					defaultValueMessageEL += "Η προκαθορισμένη τιμή, εφόσον υπάρχει, πρέπει να είναι μικρότερη από την μέγιστη τιμή.";
					defaultValueMessageEN += "Default value must be less than maximum value.";
				}
			}
			
			else if(!(this.form.getNoMaxValue())&&(!this.form.getNoMinValue())) {
				if(
					(this.form.getMaxValue() < this.form.getDefaultValue())||
					(this.form.getMinValue() > this.form.getDefaultValue())
					) {

					defaultValueMessageEL += "Η προκαθορισμένη τιμή, εφόσον υπάρχει, πρέπει να είναι μικρότερη από την μέγιστη τιμή και Μεγαλύτερη από την ελάχιστη τιμή.";
					defaultValueMessageEN += "Default value must be less than maximum value and greater than minimum value.";				
				}
			}
		}

		if(!(minValueMessageEL.equals(""))&&!(minValueMessageEN.equals(""))){
			this.form.addError(
				new Error(
				"minValue",
				minValueMessageEL,
				minValueMessageEN)
			);
		}

		if(!(maxValueMessageEL.equals(""))&&!(maxValueMessageEN.equals(""))){
			this.form.addError(
				new Error(
				"maxValue",
				maxValueMessageEL,
				maxValueMessageEN)
			);
		}

		if(!(defaultValueMessageEL.equals(""))&&!(defaultValueMessageEN.equals(""))){
			this.form.addError(
				new Error(
				"defaultValue",
				defaultValueMessageEL,
				defaultValueMessageEN)
			);
		}
	}
	
	private void validateParameterInputForm() {
		// Make sure that the form has at least one option.		
		if(this.form.getHasOptions().size() <= 0) {
			this.form.addError(
					new Error(
					"hasOptions",
					"Η φόρμα πρέπει να έχει τουλάχιστον μία επιλογή.",
					"Form must have at least one option.")
				);				
		}
	}
	
	private void validateConditionInputForm() {
		// Make sure that the form has at least one option.		
		if(this.form.getConditionHasOptions().size() <= 0 ) {
			this.form.addError(
					new Error(
					"hasOptions",
					"Η φόρμα πρέπει να έχει τουλάχιστον μία επιλογή.",
					"Form must have at least one option.")
				);			
		}
		// Validate the form's option.		
		else {
			ConditionOptionValidator conditionValidator = new ConditionOptionValidator();
			for(int i=0; i<this.form.getConditionHasOptions().size(); i++) {
				
				conditionValidator.setOption(this.form.getConditionHasOptions().get(i));
				conditionValidator.validate();
				
				this.form.setConditionOption(i, conditionValidator.getOption());
			}
			
		}
	}
	
	public void validate() {
		// Validate labeled text input form		
		if(this.form.getType().equals("labeled-text-input")) {
			this.validateLabeledTextInputForm();			
		}
		// Validate labeled float input form
		else if(this.form.getType().equals("labeled-float-input")) {
			this.validateLabeledFloatInputForm();
		}
		// Validate labeled integer input form
		else if(this.form.getType().equals("labeled-integer-input")) {
			this.validateLabeledIntegerInputForm();
		}
		// Validate Parameter Input form
		else if(this.form.getType().equals("parameter-input")) {
			this.validateParameterInputForm();
			
		}
		// Validate Condition Input form
		else if(this.form.getType().equals("condition-input")) {
			this.validateConditionInputForm();			
		}
	}
}
