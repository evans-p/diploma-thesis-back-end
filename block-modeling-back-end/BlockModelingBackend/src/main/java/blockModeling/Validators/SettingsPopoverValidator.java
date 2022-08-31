package blockModeling.Validators;

import blockModeling.Models.Error;
import  blockModeling.Models.SettingsPopover;

public class SettingsPopoverValidator {
	
	private SettingsPopover popover;
	
	
	
	public SettingsPopoverValidator() {
		super();
	}

	public SettingsPopoverValidator(SettingsPopover popover) {
		super();
		this.popover = popover;
	}

	public SettingsPopover getPopover() {
		return popover;
	}

	public void setPopover(SettingsPopover popover) {
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
		
		if(this.popover.getHasForm() == null) {
			this.popover.addError(
					new Error(
					"hasForm",
					"Το παράθυρο πρέπει να έχει μία φόρμα.",
					"Popover must have a form.")
					);			
		}
		else {
			FormValidator formValidator = new FormValidator(this.popover.getHasForm());
			
			formValidator.validate();
			
			this.popover.setHasForm(formValidator.getForm());
		}
	}
}
