package blockModeling.Validators;

import java.util.Set;

import blockModeling.Models.Information;
import blockModeling.Models.Error;



public class InformationValidator {
	
	private Information information;
	// a set of possible values for the block's image cursor
	private static final Set<String> imageCursors = 
			Set.of("help", "pointer", "default");
	
	public InformationValidator() {
		super();
	}

	public InformationValidator(Information information) {
		super();
		this.information = information;
	}

	public Information getInformation() {
		return information;
	}

	public void setInformation(Information information) {
		this.information = information;
	}

	public void validate() {
		// Check if the element has the informationTextEL attribute filled out.	
		if(this.information.getInformationTextEL() == null) {
			System.out.println("Iformation has no TextEL\n");
			this.information.addError(
					new Error(
					"informationTextEL",
					"Το στοιχείο πληροφορίας πρέπει να έχει πληροφορίες μπλοκ.",
					"Information Element must have Block Information.")
					);
		}
		
		// Check if the element has the informationTextEL attribute filled out.	
		if(this.information.getInformationTextEN() == null) {
			System.out.println("Iformation has no TextEN\n");
			this.information.addError(
					new Error(
					"informationTextEN",
					"Το στοιχείο πληροφορίας πρέπει να έχει πληροφορίες μπλοκ.",
					"Information Element must have Block Information.")
					);
		}
		
		// Check if the block's cursonIcon attribute has one of the designated values. 
		if(!imageCursors.contains(this.information.getCursor())) {
			System.out.println("Illegal ImageCursor.\n");
			this.information.addError(
					new Error(
					"cursor",
					"Ο δρομέας  πρέπει να έχει μία από τις τιμές: 'Βοήθεια', 'Δείκτης', 'Προκαθορισμένος'.",
					"Cursor must have one of the values: 'help', 'pointer', 'default'.")
					);
		}
		
	}
}
