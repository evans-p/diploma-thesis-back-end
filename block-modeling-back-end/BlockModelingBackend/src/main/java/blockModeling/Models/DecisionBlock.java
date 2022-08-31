package blockModeling.Models;

public class DecisionBlock extends Block{
	
	private String blockImage;
	private int numberOfBranches;
	private int numberOfColumns;
	private String blockImageCursor;
	private SettingsPopover hasSettingsPopover;
	private ConfigurationPopover hasConfigurationPopover;
	
	public DecisionBlock() {
		super();
	}

	public DecisionBlock(String blockImage, int numberOfBranches, int numberOfColumns, String blockImageCursor,
			SettingsPopover hasSettingsPopover, ConfigurationPopover hasConfigurationPopover) {
		super();
		this.blockImage = blockImage;
		this.numberOfBranches = numberOfBranches;
		this.numberOfColumns = numberOfColumns;
		this.blockImageCursor = blockImageCursor;
		this.hasSettingsPopover = hasSettingsPopover;
		this.hasConfigurationPopover = hasConfigurationPopover;
	}

	public String getBlockImage() {
		return blockImage;
	}

	public void setBlockImage(String blockImage) {
		this.blockImage = blockImage;
	}

	public int getNumberOfBranches() {
		return numberOfBranches;
	}

	public void setNumberOfBranches(int numberOfBranches) {
		this.numberOfBranches = numberOfBranches;
	}

	public int getNumberOfColumns() {
		return numberOfColumns;
	}

	public void setNumberOfColumns(int numberOfColumns) {
		this.numberOfColumns = numberOfColumns;
	}

	public String getBlockImageCursor() {
		return blockImageCursor;
	}

	public void setBlockImageCursor(String blockImageCursor) {
		this.blockImageCursor = blockImageCursor;
	}

	public SettingsPopover getHasSettingsPopover() {
		return hasSettingsPopover;
	}

	public void setHasSettingsPopover(SettingsPopover hasSettingsPopover) {
		this.hasSettingsPopover = hasSettingsPopover;
	}

	public ConfigurationPopover getHasConfigurationPopover() {
		return hasConfigurationPopover;
	}

	public void setHasConfigurationPopover(ConfigurationPopover hasConfigurationPopover) {
		this.hasConfigurationPopover = hasConfigurationPopover;
	}

	@Override
	public String toString() {
		return "DecisionBlock [blockImage=" + blockImage + ", numberOfBranches=" + numberOfBranches
				+ ", numberOfColumns=" + numberOfColumns + ", blockImageCursor=" + blockImageCursor
				+ ", hasSettingsPopover=" + hasSettingsPopover + ", hasConfigurationPopover=" + hasConfigurationPopover
				+ "]";
	}
}
