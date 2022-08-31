package blockModeling.Models;

public class Error {
	
	private String name;
	private String EL;
	private String EN;
	
	
	public Error() {
		
	}
	
	public Error(String name, String EL, String EN) {
		super();
		this.name = name;
		this.EL = EL;
		this.EN = EN;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEL() {
		return EL;
	}

	public void setEL(String eL) {
		EL = eL;
	}

	public String getEN() {
		return EN;
	}

	public void setEN(String eN) {
		EN = eN;
	}

	@Override
	public String toString() {
		return "Error [name=" + name + ", EL=" + EL + ", EN=" + EN + "]";
	}
}
