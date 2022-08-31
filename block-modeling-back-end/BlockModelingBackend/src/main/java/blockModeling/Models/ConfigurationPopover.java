package blockModeling.Models;

import java.util.ArrayList;

public class ConfigurationPopover extends Popover{
	
	private ArrayList<InputBlock> hasInput;

	public ConfigurationPopover() {
		super();
	}

	public ConfigurationPopover(ArrayList<InputBlock> hasInput) {
		super();
		this.hasInput = hasInput;
	}

	public ArrayList<InputBlock> getHasInput() {
		return hasInput;
	}

	public void setHasInput(ArrayList<InputBlock> hasInput) {
		this.hasInput = hasInput;
	}

	@Override
	public String toString() {
		return "ConfigurationPopover [hasInput=" + hasInput + "]";
	}
	
	public void setInputBlock(int index, InputBlock block) {
		this.hasInput.set(index, block);
	}
}
