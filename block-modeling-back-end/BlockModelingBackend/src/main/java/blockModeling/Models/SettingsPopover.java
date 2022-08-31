package blockModeling.Models;

public class SettingsPopover extends Popover{
	
	private Form hasForm;

	public SettingsPopover() {
		super();
	}

	public SettingsPopover(Form hasForm) {
		super();
		this.hasForm = hasForm;
	}

	public Form getHasForm() {
		return hasForm;
	}

	public void setHasForm(Form hasForm) {
		this.hasForm = hasForm;
	}

	@Override
	public String toString() {
		return "SettingsPopover [hasForm=" + hasForm + "]";
	}
}
