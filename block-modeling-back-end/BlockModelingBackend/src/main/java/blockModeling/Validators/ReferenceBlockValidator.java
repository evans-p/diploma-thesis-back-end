package blockModeling.Validators;

import java.util.Set;

import blockModeling.Models.ReferenceBlock;
import blockModeling.Models.Error;

public class ReferenceBlockValidator {
	//	The block to be validated
	private ReferenceBlock block;
	
	// a set of possible values for the imageBackroundShape block attribute
	private static final Set<String> imageBackroundShapeValues = 
			Set.of("circle", "square", "hexagon", "octagon");
	
	// a set of possible values for the block's category
	private static final Set<String> categories = 
			Set.of("MOVE", "DETECTION", "SOUND", "TOOLS", "VARIOUS");
	
	// a set of possible values for the block's image cursor
	private static final Set<String> imageCursors = 
			Set.of("help", "pointer", "default");
	
	public ReferenceBlockValidator() {
		super();
	}

	public ReferenceBlockValidator(ReferenceBlock block) {
		super();
		this.block = block;
	}

	public ReferenceBlock getBlock() {
		return block;
	}

	public void setBlock(ReferenceBlock block) {
		this.block = block;
	}

	@Override
	public String toString() {
		return "ReferenceBlockValidator [block=" + block + "]";
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
		// Check if the block has the blockImageBackroundShape attribute filled out.		
		if(this.block.getImageBackroundShape() == null) {
			System.out.println("Block Has No imageBackroundShape\n");
			this.block.addError(
					new Error(
					"imageBackroundShape",
					"Το μπλοκ πρέπει να έχει ένα σχήμα παρασκηνίου εικόνας.",
					"Block must have an image background shape.")
					);
		}
		// Check if the block's blockImageBackroundShape attribute has one of the designated values. 
		else if(!imageBackroundShapeValues.contains(this.block.getImageBackroundShape())) {
			System.out.println("Illegal BackroundcolorShape.\n");
			this.block.addError(
					new Error(
					"imageBackroundShape",
					"To σχήμα παρασκηνίου εικόνας πρέπει να έχει μία από τις τιμές: 'Κύκλος', 'Τετράγωνο', 'Εξάγωνο', 'Οκτάγωνο'",
					"Image background shape must have one of the values: 'Circle', 'Square', 'Hexagon', 'Octagon'")
					);
		}
		// Check if the block has the hasNextBlock attribute filled out.		
		if(this.block.getHasNextBlock() == null) {
			System.out.println("Block Has No has Next Block\n");
			this.block.addError(
					new Error(
					"hasNextBlock",
					"Το μπλοκ πρέπει να έχει μία τιμή για την μεταβλητή 'Έχει Επόμενο μπλοκ'.",
					"Block must have a value for 'Has Next Block'.")
					);
		}
		
		// Check if the block's cursonIcon attribute has one of the designated values. 
		if(!imageCursors.contains(this.block.getImageCursor())) {
			System.out.println("Illegal ImageCursor.\n");
			this.block.addError(
					new Error(
					"imageCursor",
					"Ο δρομέας εικόνας πρέπει να έχει μία από τις τιμές: 'Βοήθεια', 'Δείκτης', 'Προκαθορισμένος'.",
					"Image cursor must have one of the values: 'help', 'pointer', 'default'.")
					);
		}
		
		if(this.block.getHasInfo() == null) {
			System.out.println("Block Has NO information\n");
			this.block.addError(
					new Error(
					"hasInfo",
					"Το μπλοκ πρέπει να έχει ένα μπλοκ-στοιχείο πληροφορίας.",
					"Block must have an information block.")
					);
		}
		else {
			InformationValidator infoValidator = new InformationValidator(this.block.getHasInfo());
			infoValidator.validate();
			this.block.setHasInfo(infoValidator.getInformation());
		}
	}
}
