package blockModeling.Validators;

import java.util.Set;

import blockModeling.Models.DecisionBlock;
import blockModeling.Models.Error;

public class DecisionBlockValidator {
	
	private DecisionBlock block;
	// a set of possible values for the block's category
	private static final Set<String> categories = 
			Set.of("MOVE", "DETECTION", "SOUND", "TOOLS", "VARIOUS");
	// a set of possible values for the block's image cursor
	private static final Set<String> imageCursors = 
			Set.of("help", "pointer", "default");
	
	public DecisionBlockValidator() {
		super();
	}

	public DecisionBlockValidator(DecisionBlock block) {
		super();
		this.block = block;
	}
	
	

	public DecisionBlock getBlock() {
		return block;
	}

	public void setBlock(DecisionBlock block) {
		this.block = block;
	}

	
	@Override
	public String toString() {
		return "DecisionBlockValidator [block=" + block + "]";
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
//		// Make sure numberOfBrunches exists and 1 <= numberOfBrunches <=5
//		if((this.block.getNumberOfBranches() < 1)||
//			(this.block.getNumberOfBranches() > 5)) {
//			this.block.addError(
//					new Error(
//					"numberOfBranches",
//					"Ο αριθμός των διακλαδώσεων πρέπει να είναι από ένα(1) έως πέντε(5).",
//					"Number of brunches must be an integer between one(1) and five(5).")
//					);
//		}
		
		// Make sure numberOfColumns==1 or numberOfColumns == 2.
		if(
			!((this.block.getNumberOfColumns() == 1)||
			(this.block.getNumberOfColumns() == 2))
			) {
			this.block.addError(
					new Error(
					"numberOfColumns",
					"Το μπλοκ μπορεί να έχει είτε μία(1) είτε δύο(2) στείλες",
					"Block must have either one(1) or two(2) columns.")
					);
		}
		
		// If the block has one column, make sure the block has a settings
		// Popover as well
		else if(this.block.getNumberOfColumns()==1) {
			// Make sure that the block has a settings popover.				
			if(this.block.getHasSettingsPopover() == null) {
				this.block.addError(
						new Error(
						"hasSettingsPopover",
						"Το μπλοκ πρέπει να έχει ένα παράθυρο ρύθμισης.",
						"Block must have a configuration popover.")
						);
			}
			// Validate the block's settings popover.				
			else {
				SettingsPopoverValidator settingsValidator = new SettingsPopoverValidator(this.block.getHasSettingsPopover());
				settingsValidator.validate();
				this.block.setHasSettingsPopover(settingsValidator.getPopover());					
			}
		}
		// If the block has two columns, check if it has a popover as well and if it does
		// validate it.
		else if(this.block.getNumberOfColumns()==2) {
			if(!(this.block.getHasSettingsPopover() == null)) {
				SettingsPopoverValidator settingsValidator = new SettingsPopoverValidator(this.block.getHasSettingsPopover());
				settingsValidator.validate();
				this.block.setHasSettingsPopover(settingsValidator.getPopover());				
			}
			
		}
		// Make sure that the block's image cursor is valid.				
		if(!imageCursors.contains(this.block.getBlockImageCursor())) {
			this.block.addError(
					new Error(
					"blockImageCursor",
					"Ο δρομέας εικόνας πρέπει να έχει μία από τις τιμές: 'Βοήθεια', 'Δείκτης', 'Προκαθορισμένος'.",
					"Image cursor must have one of the values: 'help', 'pointer', 'default'.")
					);
		}
		
		// Validate the block's configuration popover. 
		if(this.block.getHasConfigurationPopover() != null) {
			ConfigurationPopoverValidator configValidator = new ConfigurationPopoverValidator(this.block.getHasConfigurationPopover());
			configValidator.validate();
			this.block.setHasConfigurationPopover(configValidator.getPopover());
		}
	}
}
