package blockModeling.Validators;

import blockModeling.Models.ConfigurationPopover;
import blockModeling.Models.Error;

public class ConfigurationPopoverValidator{
	
	private ConfigurationPopover popover;
	
	public ConfigurationPopoverValidator() {
	}

	public ConfigurationPopoverValidator(ConfigurationPopover popover) {
		super();
		this.popover = popover;
	}
	
	public ConfigurationPopover getPopover() {
		return popover;
	}

	public void setPopover(ConfigurationPopover popover) {
		this.popover = popover;
	}

	public void validate() {
		// Check if popoverTitleEL is filled out.		
		if(this.popover.getPopoverTitleEL() == null) {
			this.popover.addError(
					new Error(
					"popoverTitleEL",
					"Το παράθυρο πρέπει να έχει έναν τίτλο.",
					"Popover must have a title.")
					);			
			
			}

		// Check if popoverTitleEN is filled out.
		if(this.popover.getPopoverTitleEN() == null) {
			this.popover.addError(
					new Error(
					"popoverTitleEN",
					"Το παράθυρο πρέπει να έχει έναν τίτλο.",
					"Popover must have a title.")
					);			
			
			}
		// Make sure that the popover has at least one input block.		
		if(
			(this.popover.getHasInput() == null)||
			(this.popover.getHasInput().size() <= 0)) {
			this.popover.addError(
					new Error(
					"hasInput",
					"Το παράθυρο πρέπει να τουλάχιστον μία είσοδο.",
					"Popover must have at least one input.")
					);
		}
		// Validate the popover's input blocks.
		else {
			boolean variableNameError = false;
			InputBlockValidator inputValidator = new InputBlockValidator();
			
			for(int i=0; i < this.popover.getHasInput().size(); i++) {
				for(int j=0; j < this.popover.getHasInput().size(); j++) {
					if(i!=j) {
						if(this.popover.getHasInput().get(i).getVariableName() != null &&
							this.popover.getHasInput().get(j).getVariableName() != null) {
							if(this.popover.getHasInput().get(i).getVariableName().
								equals(this.popover.getHasInput().get(j).getVariableName())) {
										variableNameError = true;
										break;
							}
						}
					}
				}
			
				
				inputValidator.setBlock(this.popover.getHasInput().get(i));
				inputValidator.validate(variableNameError);
				
				this.popover.setInputBlock(i, inputValidator.getBlock());
				variableNameError = false;
			}
		}
	}
}
