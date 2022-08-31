package blockModeling.Models;

import java.util.ArrayList;

abstract class Popover {
	
	private String popoverTitleEL;
	private String popoverTitleEN;
	private ArrayList<Error> errors;
	
	public Popover() {
	}

	public Popover(String popoverTitleEL, String popoverTitleEN, ArrayList<Error> errors) {
		super();
		this.popoverTitleEL = popoverTitleEL;
		this.popoverTitleEN = popoverTitleEN;
		this.errors = errors;
	}

	public String getPopoverTitleEL() {
		return popoverTitleEL;
	}

	public void setPopoverTitleEL(String popoverTitleEL) {
		this.popoverTitleEL = popoverTitleEL;
	}

	public String getPopoverTitleEN() {
		return popoverTitleEN;
	}

	public void setPopoverTitleEN(String popoverTitleEN) {
		this.popoverTitleEN = popoverTitleEN;
	}

	public ArrayList<Error> getErrors() {
		return errors;
	}

	public void setErrors(ArrayList<Error> errors) {
		this.errors = errors;
	}

	@Override
	public String toString() {
		return "Popover [popoverTitleEL=" + popoverTitleEL + ", popoverTitleEN=" + popoverTitleEN + ", errors=" + errors
				+ "]";
	}
	
	public void addError(Error err) {
		this.errors.add(err);
	}
}
