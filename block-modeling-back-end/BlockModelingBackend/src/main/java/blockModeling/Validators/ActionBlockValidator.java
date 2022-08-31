package blockModeling.Validators;

import java.util.Set;

import blockModeling.Models.ActionBlock;
import blockModeling.Models.Error;

public class ActionBlockValidator{
	
	//	The block to be validated
	private ActionBlock block;
	
	// a set of possible values for the block's category
	private static final Set<String> categories = 
			Set.of("MOVE", "DETECTION", "SOUND", "TOOLS", "VARIOUS");

	public ActionBlockValidator() {
		super();
	}

	public ActionBlockValidator(ActionBlock block) {
		super();
		this.block = block;
	}
	
	

	public ActionBlock getBlock() {
		return block;
	}

	public void setBlock(ActionBlock block) {
		this.block = block;
	}

	@Override
	public String toString() {
		return "ActionBlockValidator [block=" + block + "]";
	}
	
	public void validate() {
		
		// Check if the block has the blockNameEL attribute filled out.
		if(this.block.getBlockNameEL() == null) {
			System.out.println("Block Has No blockNameEL\n");
			this.block.addError(
					new Error(
					"blockNameEL",
					"Το μπλοκ πρέπει να έχει όνομα.",
					"Block must have a name.")
					);
		}
		// Check if the block has the blockNameEN attribute filled out.
		if(this.block.getBlockNameEN() == null) {
			System.out.println("Block Has No blockNameEN\n");
			this.block.addError(
					new Error(
					"blockNameEN",
					"Το μπλοκ πρέπει να έχει όνομα.",
					"Block must have a name.")
					);
		}	
		// Check if the block has the category attribute filled out.		
		if(this.block.getCategory() == null) {
			System.out.println("Block Has No Category\n");
			this.block.addError(
					new Error(
					"category",
					"Το μπλοκ πρέπει να ανήκει σε μία από τις ορισμένες κατηγορίες.",
					"Block must belong to one of the designated categories.")
					);
		}
		// Check if the block's category has one of the designated values. 
		else if(!categories.contains(this.block.getCategory())) {
			System.out.println("Illegal Block category.\n");
			this.block.addError(
					new Error(
					"category",
					"Το μπλοκ πρέπει να ανήκει σε μία από τις ορισμένες κατηγορίες.",
					"Block must belong to one of the designated categories.")
					);
		}
		// Check if the block has the BackroundColor attribute filled out.		
		if(this.block.getBackroundColor() == null) {
			System.out.println("Block Has No backroundColor\n");
			this.block.addError(
					new Error(
					"backroundColor",
					"Το μπλοκ πρέπει να έχει Χρώμα.",
					"Block must have a color.")
					);
		}
		
		// Check if the block has the blockTitleEL attribute filled out.
		if(this.block.getBlockTitleEL() == null) {
			System.out.println("Block Has No blockTitleEL\n");
			this.block.addError(
					new Error(
					"blockTitleEL",
					"Το μπλοκ πρέπει να έχει επιγραφή.",
					"Block must have a label.")
					);
		}
		
		// Check if the block has the blockTitleEN attribute filled out.		
		if(this.block.getBlockTitleEN() == null) {
			System.out.println("Block Has No blockTitleEN\n");
			this.block.addError(
					new Error(
					"blockTitleEN",
					"Το μπλοκ πρέπει να έχει επιγραφή.",
					"Block must have a label.")
					);
		}	
		
		// Check if the block has the blockImage attribute filled out.
		if(this.block.getBlockImage() == null) {
			System.out.println("Block Has No blockImage\n");
			this.block.addError(
					new Error(
					"blockImage",
					"Το μπλοκ πρέπει να έχει εικόνα.",
					"Block must have an image.")
					);
		}
		// Check if the block has an information component.		
		if(this.block.getHasInfo() == null) {
			System.out.println("Block Has NO information\n");
			this.block.addError(
					new Error(
					"hasInfo",
					"Το μπλοκ πρέπει να έχει ένα μπλοκ-στοιχείο πληροφορίας.",
					"Block must have an information block.")
					);
		}
		// Validate the block's information component.
		else {
			InformationValidator infoValidator = new InformationValidator(this.block.getHasInfo());
			infoValidator.validate();
			this.block.setHasInfo(infoValidator.getInformation());
		}
		
		// Validate the block's input blocks.		
		if((this.block.getHasInput() != null)&&(this.block.getHasInput().size() > 0)) {
			
			boolean variableNameError = false;
			InputBlockValidator inputValidator = new InputBlockValidator();
			
			for(int i=0; i < this.block.getHasInput().size(); i++) {
				for(int j=0; j < this.block.getHasInput().size(); j++) {
					if(i!=j) {
						if(this.block.getHasInput().get(i).getVariableName() != null &&
							this.block.getHasInput().get(j).getVariableName() != null) {
							if(this.block.getHasInput().get(i).getVariableName().
								equals(this.block.getHasInput().get(j).getVariableName())) {
										variableNameError = true;
										break;
							}
						}
					}
				}
				
				inputValidator.setBlock(this.block.getHasInput().get(i));
				inputValidator.validate(variableNameError);
				
				this.block.setInputBlock(i, inputValidator.getBlock());
				variableNameError = false;
			}
		}
		
		if(this.block.getHasPopover()) {
			
			
			// Check if the block has the popoverIcon attribute filled out.
			if(this.block.getPopoverIcon() == null) {
				System.out.println("Block Has No popoverIcon\n");
				this.block.addError(
						new Error(
						"popoverIcon",
						"Το μπλοκ πρέπει να έχει εικόνα αναδυόμενου παραθύρου.",
						"Block must have a popover icon.")
						);
			}
			
			// Check the popover help text validation.			
			if(
				(this.block.getPopoverHelpTextEL() == null)&&(!(this.block.getPopoverHelpTextEN() == null))||
				(!(this.block.getPopoverHelpTextEL() == null))&&(this.block.getPopoverHelpTextEN() == null)
				) {
				
				System.out.println("Popover help text problem \n");
				this.block.addError(
				new Error(
				"popoverHelpTextEL",
				"Το βοηθητικό κείμενο παραθύρου πρέπει είτε να είναι ορισμένο και για τις δύο γλώσσες, είτε για καμία.",
				"Popover help text must either be defined for both languages or for none.")
				);
				
				this.block.addError(
				new Error(
				"popoverHelpTextEN",
				"Το βοηθητικό κείμενο παραθύρου πρέπει είτε να είναι ορισμένο και για τις δύο γλώσσες, είτε για καμία.",
				"Popover help text must either be defined for both languages or for none.")
				);
			}
			// Validate the block's settings popover.			
			SettingsPopoverValidator settingsValidator = new SettingsPopoverValidator(this.block.getHasSettingsPopover());
			settingsValidator.validate();
			this.block.setHasSettingsPopover(settingsValidator.getPopover());
		}
	}
}
