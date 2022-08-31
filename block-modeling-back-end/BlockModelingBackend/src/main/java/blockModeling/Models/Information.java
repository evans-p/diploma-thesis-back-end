package blockModeling.Models;

import java.util.ArrayList;

public class Information {
	
	private String informationTextEL;
	private String informationTextEN;
	private String cursor;
	private ArrayList<Error> errors = null;
	
	
	public Information() {
	}

	public Information(String informationTextEL, String informationTextEN, String cursor, ArrayList<Error> errors) {
		super();
		this.informationTextEL = informationTextEL;
		this.informationTextEN = informationTextEN;
		this.cursor = cursor;
		this.errors = errors;
	}

	public String getInformationTextEL() {
		return informationTextEL;
	}

	public void setInformationTextEL(String informationTextEL) {
		this.informationTextEL = informationTextEL;
	}

	public String getInformationTextEN() {
		return informationTextEN;
	}

	public void setInformationTextEN(String informationTextEN) {
		this.informationTextEN = informationTextEN;
	}

	public String getCursor() {
		return cursor;
	}

	public void setCursor(String cursor) {
		this.cursor = cursor;
	}

	public ArrayList<Error> getErrors() {
		return errors;
	}

	public void setErrors(ArrayList<Error> errors) {
		this.errors = errors;
	}
	
	public void addError(Error err) {
		this.errors.add(err);
	}

	@Override
	public String toString() {
		return "Information [informationTextEL=" + informationTextEL + ", informationTextEN=" + informationTextEN
				+ ", cursor=" + cursor + ", errors=" + errors + "]";
	}
	
	
}
