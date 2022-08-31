package blockModeling.Models;

public class PhrasesInputForm extends Form{
	
	private String placeholderEL;
	private String placeholderEN;
	
	public PhrasesInputForm() {
		super();
	}

	public PhrasesInputForm(String placeholderEL, String placeholderEN) {
		super();
		this.placeholderEL = placeholderEL;
		this.placeholderEN = placeholderEN;
	}

	public String getPlaceholderEL() {
		return placeholderEL;
	}

	public void setPlaceholderEL(String placeholderEL) {
		this.placeholderEL = placeholderEL;
	}

	public String getPlaceholderEN() {
		return placeholderEN;
	}

	public void setPlaceholderEN(String placeholderEN) {
		this.placeholderEN = placeholderEN;
	}

	@Override
	public String toString() {
		return "PhrasesInputForm [placeholderEL=" + placeholderEL + ", placeholderEN=" + placeholderEN + "]";
	}	
}
