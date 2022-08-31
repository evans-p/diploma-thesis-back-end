package blockModeling.Models;

public class ReferenceBlock extends Block{
	
	private String blockTitleEN;
	private String blockTitleEL;
	private String blockImage;
	private String imageBackroundShape;
	private String imageBackroundShapeColor = "#FFFFFF";
	private Boolean hasNextBlock;
	private String imageCursor = "DEFAULT";
	private Information hasInfo;

	public ReferenceBlock() {
		super();
	}

	public ReferenceBlock(String blockTitleEN, String blockTitleEL, String blockImage, String imageBackroundShape,
			String imageBackroundShapeColor, Boolean hasNextBlock, String imageCursor, Information hasInfo) {
		super();
		this.blockTitleEN = blockTitleEN;
		this.blockTitleEL = blockTitleEL;
		this.blockImage = blockImage;
		this.imageBackroundShape = imageBackroundShape;
		this.imageBackroundShapeColor = imageBackroundShapeColor;
		this.hasNextBlock = hasNextBlock;
		this.imageCursor = imageCursor;
		this.hasInfo = hasInfo;
	}

	public String getBlockTitleEN() {
		return blockTitleEN;
	}

	public void setBlockTitleEN(String blockTitleEN) {
		this.blockTitleEN = blockTitleEN;
	}

	public String getBlockTitleEL() {
		return blockTitleEL;
	}

	public void setBlockTitleEL(String blockTitleEL) {
		this.blockTitleEL = blockTitleEL;
	}

	public String getBlockImage() {
		return blockImage;
	}

	public void setBlockImage(String blockImage) {
		this.blockImage = blockImage;
	}

	public String getImageBackroundShape() {
		return imageBackroundShape;
	}

	public void setImageBackroundShape(String imageBackroundShape) {
		this.imageBackroundShape = imageBackroundShape;
	}

	public String getImageBackroundShapeColor() {
		return imageBackroundShapeColor;
	}

	public void setImageBackroundShapeColor(String imageBackroundShapeColor) {
		this.imageBackroundShapeColor = imageBackroundShapeColor;
	}

	public Boolean getHasNextBlock() {
		return hasNextBlock;
	}

	public void setHasNextBlock(Boolean hasNextBlock) {
		this.hasNextBlock = hasNextBlock;
	}

	public String getImageCursor() {
		return imageCursor;
	}

	public void setImageCursor(String imageCursor) {
		this.imageCursor = imageCursor;
	}

	public Information getHasInfo() {
		return hasInfo;
	}

	public void setHasInfo(Information hasInfo) {
		this.hasInfo = hasInfo;
	}

	@Override
	public String toString() {
		return "ReferenceBlock [blockTitleEN=" + blockTitleEN + ", blockTitleEL=" + blockTitleEL + ", blockImage="
				+ blockImage + ", imageBackroundShape=" + imageBackroundShape + ", imageBackroundShapeColor="
				+ imageBackroundShapeColor + ", hasNextBlock=" + hasNextBlock + ", imageCursor=" + imageCursor
				+ ", hasInfo=" + hasInfo + "]";
	}
}
