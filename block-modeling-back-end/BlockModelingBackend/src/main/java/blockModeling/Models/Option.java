package blockModeling.Models;

public class Option {
	
	private String id;
	private String optionTextEL;
	private String optionTextEN;
	
	public Option() {
	}

	public Option(String id, String optionTextEL, String optionTextEN) {
		super();
		this.id = id;
		this.optionTextEL = optionTextEL;
		this.optionTextEN = optionTextEN;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOptionTextEL() {
		return optionTextEL;
	}

	public void setOptionTextEL(String optionTextEL) {
		this.optionTextEL = optionTextEL;
	}

	public String getOptionTextEN() {
		return optionTextEN;
	}

	public void setOptionTextEN(String optionTextEN) {
		this.optionTextEN = optionTextEN;
	}

	@Override
	public String toString() {
		return "Option [id=" + id + ", optionTextEL=" + optionTextEL + ", optionTextEN=" + optionTextEN + "]";
	}

	
}
