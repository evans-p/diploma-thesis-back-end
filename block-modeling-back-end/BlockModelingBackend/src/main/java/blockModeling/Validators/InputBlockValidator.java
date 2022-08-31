package blockModeling.Validators;

import java.util.Set;

import blockModeling.Models.Error;
import blockModeling.Models.InputBlock;

public class InputBlockValidator {
	
	private InputBlock block;
	
	// a set of possible values for the block's image cursor
	private static final Set<String> imageCursors = 
			Set.of("help", "pointer", "default");

	public InputBlockValidator() {
		super();
	}

	public InputBlockValidator(InputBlock block) {
		super();
		this.block = block;
	}

	public InputBlock getBlock() {
		return block;
	}

	public void setBlock(InputBlock block) {
		this.block = block;
	}

	@Override
	public String toString() {
		return "InputBlockValidator [block=" + block + "]";
	}
	
	public void validate(boolean variableNameError) {
		// Check if the block has the infoTextEL attribute filled out.	
		if(this.block.getInfoTextEL() == null) {
			System.out.println("Block Has No infoTextEL\n");
			this.block.addError(
					new Error(
					"infoTextEL",
					"Το μπλοκ πρέπει να έχει Πληροφορίες Εισόδου.",
					"Block must have input Information.")
					);
		}
		
		
		// Check if the block has the infoTextEL attribute filled out.	
		if(this.block.getInfoTextEN() == null) {
			System.out.println("Block Has No infoTextEN\n");
			this.block.addError(
					new Error(
					"infoTextEN",
					"Το μπλοκ πρέπει να έχει Πληροφορίες Εισόδου.",
					"Block must have input Information.")
					);
		}
		
		// Check if the block has an image.	
		if(this.block.getImage() == null) {
			System.out.println("Block Has No Image\n");
			this.block.addError(
					new Error(
					"image",
					"Το μπλοκ πρέπει να έχει Εικόνα.",
					"Block must have an Image.")
					);
		}
		
		
		// Check if the block the variableName attribute filled out.	
		if(this.block.getVariableName() == null) {
			System.out.println("Block Has No Image\n");
			this.block.addError(
					new Error(
					"variableName",
					"Το μπλοκ πρέπει να έχει oρισμένη μεταβλητή εισόδου.",
					"Block must have an input variable.")
					);
		}
		// Make sure VariableName is unique.
		else if(variableNameError) {
			this.block.addError(
					new Error(
					"variableName",
					"Η μεταβλητή εισόδου κάθε μπλοκ πρέπει να είναι μοναδική.",
					"Input Variable of each block Must be unique.")
					);
		}
		// Make sure VariableName contains only letters.
		else if(!this.block.getVariableName().matches("^[ A-Za-z]+$")){			
			this.block.addError(
					new Error(
					"variableName",
					"Η μεταβλητή εισόδου πρέπει να περιέχει μόνο λατινικούς χαρακτήρες.",
					"Input Variable must only contain  latin characters.")
					);
		}
		
		
		// Check if the block's cursonIcon attribute has one of the designated values. 
		if(!imageCursors.contains(this.block.getIconCursor())) {
			System.out.println("Illegal ImageCursor.\n");
			this.block.addError(
					new Error(
					"iconCursor",
					"Ο δρομέας εικόνας πρέπει να έχει μία από τις τιμές: 'Βοήθεια', 'Δείκτης', 'Προκαθορισμένος'.",
					"Icon curson must have one of the values: 'help', 'pointer', 'default'.")
					);
		}
		
		if(this.block.getType().equals("select-input-block")) {
			if(this.block.getHasOptions().size() == 0) {
				System.out.println("Select input has no options");
				this.block.addError(
						new Error(
						"hasOptions",
						"Η είσοδος πρέπει να έχει τουλάχιστον μία επιλογή.",
						"Input must have at least one option.")
					);				
			}
		}

		if(this.block.getType().equals("float-input-block")) {
			// Make sure that minValue < maxValue.
			if(!(this.block.getNoMinValue()) && !(this.block.getNoMaxValue())) {
				
				if (this.block.getMinValue()>=this.block.getMaxValue()) {
					System.out.println("Min value greater than max value");
					this.block.addError(
							new Error(
							"minValue",
							"Η ελάχιστη τιμή, εφόσον υπάρχει πρέπει να είναι αυστηρά μικρότερη από την μέγιστη.",
							"Minimum value must be lesser than Maximum Value.")
							);
					this.block.addError(
							new Error(
							"maxValue",
							"Η μέγιστη τιμή, εφόσον υπάρχει πρέπει να είναι αυστηρά μεγαλύτερη από την ελάχιστη.",
							"Maximum value must be greater than minimum value.")
							);
					
				}
				
			}
			
			// Make sure that minValue <= defaultValue <= maxValue
			if(!this.block.getNoDefaultValue()) {
				if(!(this.block.getNoMinValue())&&this.block.getNoMaxValue()) {
					if(this.block.getMinValue() > this.block.getDefaultValue()) {
						this.block.addError(
								new Error(
								"defaultValue",
								"Η προκαθορισμένη τιμή, εφόσον υπάρχει, πρέπει να είναι μεγαλύτερη από την ελάχιστη τιμή.",
								"Default value must be greater than minimum value.")
								);
						
					}
					
				}
				
				else if(!(this.block.getNoMaxValue())&&this.block.getNoMinValue()) {
					if(this.block.getMaxValue() < this.block.getDefaultValue()) {
						this.block.addError(
								new Error(
								"defaultValue",
								"Η προκαθορισμένη τιμή, εφόσον υπάρχει, πρέπει να είναι μικρότερη από την μέγιστη τιμή.",
								"Default value must be less than maximum value.")
								);
						
					}
					
				}
				
				else if(!(this.block.getNoMaxValue())&&(!this.block.getNoMinValue())) {
					if(
						(this.block.getMaxValue() < this.block.getDefaultValue())||
						(this.block.getMinValue() > this.block.getDefaultValue())
						) {
						this.block.addError(
								new Error(
								"defaultValue",
								"Η προκαθορισμένη τιμή, εφόσον υπάρχει, πρέπει να είναι μικρότερη από την μέγιστη τιμή και Μεγαλύτερη από την ελάχιστη τιμή.",
								"Default value must be less than maximum value and greater than minimum value.")
								);
						
					}
				}
			}
		}
		
		if(this.block.getType().equals("integer-input-block")) {
			String minValueMessageEL = "";
			String minValueMessageEN = "";
			String maxValueMessageEL = "";
			String maxValueMessageEN = "";
			String defaultValueMessageEL = "";
			String defaultValueMessageEN = "";

			// Make sure that min value is an integer.
			if(!this.block.getNoMinValue()){

				


				if (this.block.getMinValue() - (int)this.block.getMinValue() != 0) {

					System.out.println("Min value not an Integer");

					minValueMessageEL += "Η Ελάχιστη τιμή πρέπει να είναι ακέραιος αριθμός. ";
					minValueMessageEN += "Minimum Value must be an integer value. ";
					
				}
			}

			// Make sure that max value is an integer.
			if(!this.block.getNoMaxValue()){
				if (this.block.getMaxValue() - (int)this.block.getMaxValue() != 0) {

					System.out.println("Max value not an Integer");

					maxValueMessageEL += "Η Μέγιστη τιμή πρέπει να είναι ακέραιος αριθμός. ";
					maxValueMessageEN += "Maximum Value must be an integer value. ";
					
				}
			}
			// Make sure that default value is an integer.
			if(!this.block.getNoDefaultValue()){
				if (this.block.getDefaultValue() - (int)this.block.getDefaultValue() != 0) {

					System.out.println("Default value not an Integer");

					defaultValueMessageEL += "Η προκαθορισμένη τιμή πρέπει να είναι ακέραιος αριθμός. ";
					defaultValueMessageEN += "Default Value must be an integer value. ";
				}
			}

			// Make sure that minValue < maxValue.
			if(!(this.block.getNoMinValue()) && !(this.block.getNoMaxValue())) {
				
				if (this.block.getMinValue()>=this.block.getMaxValue()) {

					System.out.println("Min value greater than max value");

					minValueMessageEL += "Η ελάχιστη τιμή, εφόσον υπάρχει πρέπει να είναι αυστηρά μικρότερη από την μέγιστη.";
					minValueMessageEN += "Minimum value must be lesser than Maximum Value.";
					maxValueMessageEL += "Η μέγιστη τιμή, εφόσον υπάρχει πρέπει να είναι αυστηρά μεγαλύτερη από την ελάχιστη.";
					maxValueMessageEN += "Maximum value must be greater than minimum value.";
				}
				
			}

			// Make sure that minValue <= defaultValue <= maxValue
			if(!this.block.getNoDefaultValue()) {
				if(!(this.block.getNoMinValue())&&this.block.getNoMaxValue()) {
					if(this.block.getMinValue() > this.block.getDefaultValue()) {

						defaultValueMessageEL += "Η προκαθορισμένη τιμή, εφόσον υπάρχει, πρέπει να είναι μεγαλύτερη από την ελάχιστη τιμή.";
						defaultValueMessageEN += "Default value must be greater than minimum value.";				
					}
				}
				
				else if(!(this.block.getNoMaxValue())&&this.block.getNoMinValue()) {
					if(this.block.getMaxValue() < this.block.getDefaultValue()) {

						defaultValueMessageEL += "Η προκαθορισμένη τιμή, εφόσον υπάρχει, πρέπει να είναι μικρότερη από την μέγιστη τιμή.";
						defaultValueMessageEN += "Default value must be less than maximum value.";
					}
				}
				
				else if(!(this.block.getNoMaxValue())&&(!this.block.getNoMinValue())) {
					if(
						(this.block.getMaxValue() < this.block.getDefaultValue())||
						(this.block.getMinValue() > this.block.getDefaultValue())
						) {

						defaultValueMessageEL += "Η προκαθορισμένη τιμή, εφόσον υπάρχει, πρέπει να είναι μικρότερη από την μέγιστη τιμή και Μεγαλύτερη από την ελάχιστη τιμή.";
						defaultValueMessageEN += "Default value must be less than maximum value and greater than minimum value.";				
					}
				}
			}

			if(!(minValueMessageEL.equals(""))&&!(minValueMessageEN.equals(""))){
				this.block.addError(
					new Error(
					"minValue",
					minValueMessageEL,
					minValueMessageEN)
				);
			}

			if(!(maxValueMessageEL.equals(""))&&!(maxValueMessageEN.equals(""))){
				this.block.addError(
					new Error(
					"maxValue",
					maxValueMessageEL,
					maxValueMessageEN)
				);
			}

			if(!(defaultValueMessageEL.equals(""))&&!(defaultValueMessageEN.equals(""))){
				this.block.addError(
					new Error(
					"defaultValue",
					defaultValueMessageEL,
					defaultValueMessageEN)
				);
			}
		}
	}
}
