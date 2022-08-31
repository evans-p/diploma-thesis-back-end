/**
 */
package blockModelingMetamodel.impl;

import blockModelingMetamodel.BlockModelingMetamodelPackage;
import blockModelingMetamodel.Cursor;
import blockModelingMetamodel.ImageBackgroundShape;
import blockModelingMetamodel.Information;
import blockModelingMetamodel.ReferenceBlock;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link blockModelingMetamodel.impl.ReferenceBlockImpl#getBlockTitleEL <em>Block Title EL</em>}</li>
 *   <li>{@link blockModelingMetamodel.impl.ReferenceBlockImpl#getBlockTitleEN <em>Block Title EN</em>}</li>
 *   <li>{@link blockModelingMetamodel.impl.ReferenceBlockImpl#getBlockImage <em>Block Image</em>}</li>
 *   <li>{@link blockModelingMetamodel.impl.ReferenceBlockImpl#getImageBackroundShape <em>Image Backround Shape</em>}</li>
 *   <li>{@link blockModelingMetamodel.impl.ReferenceBlockImpl#isHasNextBlock <em>Has Next Block</em>}</li>
 *   <li>{@link blockModelingMetamodel.impl.ReferenceBlockImpl#getImageCursor <em>Image Cursor</em>}</li>
 *   <li>{@link blockModelingMetamodel.impl.ReferenceBlockImpl#getImageBackroundShapeColor <em>Image Backround Shape Color</em>}</li>
 *   <li>{@link blockModelingMetamodel.impl.ReferenceBlockImpl#getHasInfo <em>Has Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceBlockImpl extends BlockImpl implements ReferenceBlock {
	/**
	 * The default value of the '{@link #getBlockTitleEL() <em>Block Title EL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockTitleEL()
	 * @generated
	 * @ordered
	 */
	protected static final String BLOCK_TITLE_EL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlockTitleEL() <em>Block Title EL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockTitleEL()
	 * @generated
	 * @ordered
	 */
	protected String blockTitleEL = BLOCK_TITLE_EL_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlockTitleEN() <em>Block Title EN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockTitleEN()
	 * @generated
	 * @ordered
	 */
	protected static final String BLOCK_TITLE_EN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlockTitleEN() <em>Block Title EN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockTitleEN()
	 * @generated
	 * @ordered
	 */
	protected String blockTitleEN = BLOCK_TITLE_EN_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlockImage() <em>Block Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockImage()
	 * @generated
	 * @ordered
	 */
	protected static final String BLOCK_IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlockImage() <em>Block Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockImage()
	 * @generated
	 * @ordered
	 */
	protected String blockImage = BLOCK_IMAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getImageBackroundShape() <em>Image Backround Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageBackroundShape()
	 * @generated
	 * @ordered
	 */
	protected static final ImageBackgroundShape IMAGE_BACKROUND_SHAPE_EDEFAULT = ImageBackgroundShape.CIRCLE;

	/**
	 * The cached value of the '{@link #getImageBackroundShape() <em>Image Backround Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageBackroundShape()
	 * @generated
	 * @ordered
	 */
	protected ImageBackgroundShape imageBackroundShape = IMAGE_BACKROUND_SHAPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isHasNextBlock() <em>Has Next Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasNextBlock()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_NEXT_BLOCK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasNextBlock() <em>Has Next Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasNextBlock()
	 * @generated
	 * @ordered
	 */
	protected boolean hasNextBlock = HAS_NEXT_BLOCK_EDEFAULT;

	/**
	 * The default value of the '{@link #getImageCursor() <em>Image Cursor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageCursor()
	 * @generated
	 * @ordered
	 */
	protected static final Cursor IMAGE_CURSOR_EDEFAULT = Cursor.DEFAULT;

	/**
	 * The cached value of the '{@link #getImageCursor() <em>Image Cursor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageCursor()
	 * @generated
	 * @ordered
	 */
	protected Cursor imageCursor = IMAGE_CURSOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getImageBackroundShapeColor() <em>Image Backround Shape Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageBackroundShapeColor()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_BACKROUND_SHAPE_COLOR_EDEFAULT = "#FFFFFF";

	/**
	 * The cached value of the '{@link #getImageBackroundShapeColor() <em>Image Backround Shape Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageBackroundShapeColor()
	 * @generated
	 * @ordered
	 */
	protected String imageBackroundShapeColor = IMAGE_BACKROUND_SHAPE_COLOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasInfo() <em>Has Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasInfo()
	 * @generated
	 * @ordered
	 */
	protected Information hasInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockModelingMetamodelPackage.Literals.REFERENCE_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBlockTitleEL() {
		return blockTitleEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlockTitleEL(String newBlockTitleEL) {
		String oldBlockTitleEL = blockTitleEL;
		blockTitleEL = newBlockTitleEL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.REFERENCE_BLOCK__BLOCK_TITLE_EL, oldBlockTitleEL, blockTitleEL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBlockTitleEN() {
		return blockTitleEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlockTitleEN(String newBlockTitleEN) {
		String oldBlockTitleEN = blockTitleEN;
		blockTitleEN = newBlockTitleEN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.REFERENCE_BLOCK__BLOCK_TITLE_EN, oldBlockTitleEN, blockTitleEN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBlockImage() {
		return blockImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlockImage(String newBlockImage) {
		String oldBlockImage = blockImage;
		blockImage = newBlockImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.REFERENCE_BLOCK__BLOCK_IMAGE, oldBlockImage, blockImage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageBackgroundShape getImageBackroundShape() {
		return imageBackroundShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageBackroundShape(ImageBackgroundShape newImageBackroundShape) {
		ImageBackgroundShape oldImageBackroundShape = imageBackroundShape;
		imageBackroundShape = newImageBackroundShape == null ? IMAGE_BACKROUND_SHAPE_EDEFAULT : newImageBackroundShape;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.REFERENCE_BLOCK__IMAGE_BACKROUND_SHAPE, oldImageBackroundShape,
					imageBackroundShape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasNextBlock() {
		return hasNextBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasNextBlock(boolean newHasNextBlock) {
		boolean oldHasNextBlock = hasNextBlock;
		hasNextBlock = newHasNextBlock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.REFERENCE_BLOCK__HAS_NEXT_BLOCK, oldHasNextBlock, hasNextBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cursor getImageCursor() {
		return imageCursor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageCursor(Cursor newImageCursor) {
		Cursor oldImageCursor = imageCursor;
		imageCursor = newImageCursor == null ? IMAGE_CURSOR_EDEFAULT : newImageCursor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.REFERENCE_BLOCK__IMAGE_CURSOR, oldImageCursor, imageCursor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImageBackroundShapeColor() {
		return imageBackroundShapeColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageBackroundShapeColor(String newImageBackroundShapeColor) {
		String oldImageBackroundShapeColor = imageBackroundShapeColor;
		imageBackroundShapeColor = newImageBackroundShapeColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.REFERENCE_BLOCK__IMAGE_BACKROUND_SHAPE_COLOR,
					oldImageBackroundShapeColor, imageBackroundShapeColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Information getHasInfo() {
		return hasInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasInfo(Information newHasInfo, NotificationChain msgs) {
		Information oldHasInfo = hasInfo;
		hasInfo = newHasInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.REFERENCE_BLOCK__HAS_INFO, oldHasInfo, newHasInfo);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasInfo(Information newHasInfo) {
		if (newHasInfo != hasInfo) {
			NotificationChain msgs = null;
			if (hasInfo != null)
				msgs = ((InternalEObject) hasInfo).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - BlockModelingMetamodelPackage.REFERENCE_BLOCK__HAS_INFO, null, msgs);
			if (newHasInfo != null)
				msgs = ((InternalEObject) newHasInfo).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BlockModelingMetamodelPackage.REFERENCE_BLOCK__HAS_INFO, null, msgs);
			msgs = basicSetHasInfo(newHasInfo, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.REFERENCE_BLOCK__HAS_INFO, newHasInfo, newHasInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BlockModelingMetamodelPackage.REFERENCE_BLOCK__HAS_INFO:
			return basicSetHasInfo(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BlockModelingMetamodelPackage.REFERENCE_BLOCK__BLOCK_TITLE_EL:
			return getBlockTitleEL();
		case BlockModelingMetamodelPackage.REFERENCE_BLOCK__BLOCK_TITLE_EN:
			return getBlockTitleEN();
		case BlockModelingMetamodelPackage.REFERENCE_BLOCK__BLOCK_IMAGE:
			return getBlockImage();
		case BlockModelingMetamodelPackage.REFERENCE_BLOCK__IMAGE_BACKROUND_SHAPE:
			return getImageBackroundShape();
		case BlockModelingMetamodelPackage.REFERENCE_BLOCK__HAS_NEXT_BLOCK:
			return isHasNextBlock();
		case BlockModelingMetamodelPackage.REFERENCE_BLOCK__IMAGE_CURSOR:
			return getImageCursor();
		case BlockModelingMetamodelPackage.REFERENCE_BLOCK__IMAGE_BACKROUND_SHAPE_COLOR:
			return getImageBackroundShapeColor();
		case BlockModelingMetamodelPackage.REFERENCE_BLOCK__HAS_INFO:
			return getHasInfo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BlockModelingMetamodelPackage.REFERENCE_BLOCK__BLOCK_TITLE_EL:
			setBlockTitleEL((String) newValue);
			return;
		case BlockModelingMetamodelPackage.REFERENCE_BLOCK__BLOCK_TITLE_EN:
			setBlockTitleEN((String) newValue);
			return;
		case BlockModelingMetamodelPackage.REFERENCE_BLOCK__BLOCK_IMAGE:
			setBlockImage((String) newValue);
			return;
		case BlockModelingMetamodelPackage.REFERENCE_BLOCK__IMAGE_BACKROUND_SHAPE:
			setImageBackroundShape((ImageBackgroundShape) newValue);
			return;
		case BlockModelingMetamodelPackage.REFERENCE_BLOCK__HAS_NEXT_BLOCK:
			setHasNextBlock((Boolean) newValue);
			return;
		case BlockModelingMetamodelPackage.REFERENCE_BLOCK__IMAGE_CURSOR:
			setImageCursor((Cursor) newValue);
			return;
		case BlockModelingMetamodelPackage.REFERENCE_BLOCK__IMAGE_BACKROUND_SHAPE_COLOR:
			setImageBackroundShapeColor((String) newValue);
			return;
		case BlockModelingMetamodelPackage.REFERENCE_BLOCK__HAS_INFO:
			setHasInfo((Information) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case BlockModelingMetamodelPackage.REFERENCE_BLOCK__BLOCK_TITLE_EL:
			setBlockTitleEL(BLOCK_TITLE_EL_EDEFAULT);
			return;
		case BlockModelingMetamodelPackage.REFERENCE_BLOCK__BLOCK_TITLE_EN:
			setBlockTitleEN(BLOCK_TITLE_EN_EDEFAULT);
			return;
		case BlockModelingMetamodelPackage.REFERENCE_BLOCK__BLOCK_IMAGE:
			setBlockImage(BLOCK_IMAGE_EDEFAULT);
			return;
		case BlockModelingMetamodelPackage.REFERENCE_BLOCK__IMAGE_BACKROUND_SHAPE:
			setImageBackroundShape(IMAGE_BACKROUND_SHAPE_EDEFAULT);
			return;
		case BlockModelingMetamodelPackage.REFERENCE_BLOCK__HAS_NEXT_BLOCK:
			setHasNextBlock(HAS_NEXT_BLOCK_EDEFAULT);
			return;
		case BlockModelingMetamodelPackage.REFERENCE_BLOCK__IMAGE_CURSOR:
			setImageCursor(IMAGE_CURSOR_EDEFAULT);
			return;
		case BlockModelingMetamodelPackage.REFERENCE_BLOCK__IMAGE_BACKROUND_SHAPE_COLOR:
			setImageBackroundShapeColor(IMAGE_BACKROUND_SHAPE_COLOR_EDEFAULT);
			return;
		case BlockModelingMetamodelPackage.REFERENCE_BLOCK__HAS_INFO:
			setHasInfo((Information) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case BlockModelingMetamodelPackage.REFERENCE_BLOCK__BLOCK_TITLE_EL:
			return BLOCK_TITLE_EL_EDEFAULT == null ? blockTitleEL != null
					: !BLOCK_TITLE_EL_EDEFAULT.equals(blockTitleEL);
		case BlockModelingMetamodelPackage.REFERENCE_BLOCK__BLOCK_TITLE_EN:
			return BLOCK_TITLE_EN_EDEFAULT == null ? blockTitleEN != null
					: !BLOCK_TITLE_EN_EDEFAULT.equals(blockTitleEN);
		case BlockModelingMetamodelPackage.REFERENCE_BLOCK__BLOCK_IMAGE:
			return BLOCK_IMAGE_EDEFAULT == null ? blockImage != null : !BLOCK_IMAGE_EDEFAULT.equals(blockImage);
		case BlockModelingMetamodelPackage.REFERENCE_BLOCK__IMAGE_BACKROUND_SHAPE:
			return imageBackroundShape != IMAGE_BACKROUND_SHAPE_EDEFAULT;
		case BlockModelingMetamodelPackage.REFERENCE_BLOCK__HAS_NEXT_BLOCK:
			return hasNextBlock != HAS_NEXT_BLOCK_EDEFAULT;
		case BlockModelingMetamodelPackage.REFERENCE_BLOCK__IMAGE_CURSOR:
			return imageCursor != IMAGE_CURSOR_EDEFAULT;
		case BlockModelingMetamodelPackage.REFERENCE_BLOCK__IMAGE_BACKROUND_SHAPE_COLOR:
			return IMAGE_BACKROUND_SHAPE_COLOR_EDEFAULT == null ? imageBackroundShapeColor != null
					: !IMAGE_BACKROUND_SHAPE_COLOR_EDEFAULT.equals(imageBackroundShapeColor);
		case BlockModelingMetamodelPackage.REFERENCE_BLOCK__HAS_INFO:
			return hasInfo != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (blockTitleEL: ");
		result.append(blockTitleEL);
		result.append(", blockTitleEN: ");
		result.append(blockTitleEN);
		result.append(", blockImage: ");
		result.append(blockImage);
		result.append(", imageBackroundShape: ");
		result.append(imageBackroundShape);
		result.append(", hasNextBlock: ");
		result.append(hasNextBlock);
		result.append(", imageCursor: ");
		result.append(imageCursor);
		result.append(", imageBackroundShapeColor: ");
		result.append(imageBackroundShapeColor);
		result.append(')');
		return result.toString();
	}

} //ReferenceBlockImpl
