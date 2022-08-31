/**
 */
package blockModelingMetamodel.impl;

import blockModelingMetamodel.BlockModelingMetamodelPackage;
import blockModelingMetamodel.Cursor;
import blockModelingMetamodel.InputBlock;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link blockModelingMetamodel.impl.InputBlockImpl#getImage <em>Image</em>}</li>
 *   <li>{@link blockModelingMetamodel.impl.InputBlockImpl#getInfoTextEN <em>Info Text EN</em>}</li>
 *   <li>{@link blockModelingMetamodel.impl.InputBlockImpl#getInfoTextEL <em>Info Text EL</em>}</li>
 *   <li>{@link blockModelingMetamodel.impl.InputBlockImpl#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link blockModelingMetamodel.impl.InputBlockImpl#getIconCursor <em>Icon Cursor</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InputBlockImpl extends MinimalEObjectImpl.Container implements InputBlock {
	/**
	 * The default value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected String image = IMAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInfoTextEN() <em>Info Text EN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfoTextEN()
	 * @generated
	 * @ordered
	 */
	protected static final String INFO_TEXT_EN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInfoTextEN() <em>Info Text EN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfoTextEN()
	 * @generated
	 * @ordered
	 */
	protected String infoTextEN = INFO_TEXT_EN_EDEFAULT;

	/**
	 * The default value of the '{@link #getInfoTextEL() <em>Info Text EL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfoTextEL()
	 * @generated
	 * @ordered
	 */
	protected static final String INFO_TEXT_EL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInfoTextEL() <em>Info Text EL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfoTextEL()
	 * @generated
	 * @ordered
	 */
	protected String infoTextEL = INFO_TEXT_EL_EDEFAULT;

	/**
	 * The default value of the '{@link #getVariableName() <em>Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableName()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVariableName() <em>Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableName()
	 * @generated
	 * @ordered
	 */
	protected String variableName = VARIABLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIconCursor() <em>Icon Cursor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconCursor()
	 * @generated
	 * @ordered
	 */
	protected static final Cursor ICON_CURSOR_EDEFAULT = Cursor.DEFAULT;

	/**
	 * The cached value of the '{@link #getIconCursor() <em>Icon Cursor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconCursor()
	 * @generated
	 * @ordered
	 */
	protected Cursor iconCursor = ICON_CURSOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockModelingMetamodelPackage.Literals.INPUT_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage(String newImage) {
		String oldImage = image;
		image = newImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockModelingMetamodelPackage.INPUT_BLOCK__IMAGE,
					oldImage, image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInfoTextEN() {
		return infoTextEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfoTextEN(String newInfoTextEN) {
		String oldInfoTextEN = infoTextEN;
		infoTextEN = newInfoTextEN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.INPUT_BLOCK__INFO_TEXT_EN, oldInfoTextEN, infoTextEN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInfoTextEL() {
		return infoTextEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfoTextEL(String newInfoTextEL) {
		String oldInfoTextEL = infoTextEL;
		infoTextEL = newInfoTextEL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.INPUT_BLOCK__INFO_TEXT_EL, oldInfoTextEL, infoTextEL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVariableName() {
		return variableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableName(String newVariableName) {
		String oldVariableName = variableName;
		variableName = newVariableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.INPUT_BLOCK__VARIABLE_NAME, oldVariableName, variableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cursor getIconCursor() {
		return iconCursor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIconCursor(Cursor newIconCursor) {
		Cursor oldIconCursor = iconCursor;
		iconCursor = newIconCursor == null ? ICON_CURSOR_EDEFAULT : newIconCursor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.INPUT_BLOCK__ICON_CURSOR, oldIconCursor, iconCursor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BlockModelingMetamodelPackage.INPUT_BLOCK__IMAGE:
			return getImage();
		case BlockModelingMetamodelPackage.INPUT_BLOCK__INFO_TEXT_EN:
			return getInfoTextEN();
		case BlockModelingMetamodelPackage.INPUT_BLOCK__INFO_TEXT_EL:
			return getInfoTextEL();
		case BlockModelingMetamodelPackage.INPUT_BLOCK__VARIABLE_NAME:
			return getVariableName();
		case BlockModelingMetamodelPackage.INPUT_BLOCK__ICON_CURSOR:
			return getIconCursor();
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
		case BlockModelingMetamodelPackage.INPUT_BLOCK__IMAGE:
			setImage((String) newValue);
			return;
		case BlockModelingMetamodelPackage.INPUT_BLOCK__INFO_TEXT_EN:
			setInfoTextEN((String) newValue);
			return;
		case BlockModelingMetamodelPackage.INPUT_BLOCK__INFO_TEXT_EL:
			setInfoTextEL((String) newValue);
			return;
		case BlockModelingMetamodelPackage.INPUT_BLOCK__VARIABLE_NAME:
			setVariableName((String) newValue);
			return;
		case BlockModelingMetamodelPackage.INPUT_BLOCK__ICON_CURSOR:
			setIconCursor((Cursor) newValue);
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
		case BlockModelingMetamodelPackage.INPUT_BLOCK__IMAGE:
			setImage(IMAGE_EDEFAULT);
			return;
		case BlockModelingMetamodelPackage.INPUT_BLOCK__INFO_TEXT_EN:
			setInfoTextEN(INFO_TEXT_EN_EDEFAULT);
			return;
		case BlockModelingMetamodelPackage.INPUT_BLOCK__INFO_TEXT_EL:
			setInfoTextEL(INFO_TEXT_EL_EDEFAULT);
			return;
		case BlockModelingMetamodelPackage.INPUT_BLOCK__VARIABLE_NAME:
			setVariableName(VARIABLE_NAME_EDEFAULT);
			return;
		case BlockModelingMetamodelPackage.INPUT_BLOCK__ICON_CURSOR:
			setIconCursor(ICON_CURSOR_EDEFAULT);
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
		case BlockModelingMetamodelPackage.INPUT_BLOCK__IMAGE:
			return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
		case BlockModelingMetamodelPackage.INPUT_BLOCK__INFO_TEXT_EN:
			return INFO_TEXT_EN_EDEFAULT == null ? infoTextEN != null : !INFO_TEXT_EN_EDEFAULT.equals(infoTextEN);
		case BlockModelingMetamodelPackage.INPUT_BLOCK__INFO_TEXT_EL:
			return INFO_TEXT_EL_EDEFAULT == null ? infoTextEL != null : !INFO_TEXT_EL_EDEFAULT.equals(infoTextEL);
		case BlockModelingMetamodelPackage.INPUT_BLOCK__VARIABLE_NAME:
			return VARIABLE_NAME_EDEFAULT == null ? variableName != null : !VARIABLE_NAME_EDEFAULT.equals(variableName);
		case BlockModelingMetamodelPackage.INPUT_BLOCK__ICON_CURSOR:
			return iconCursor != ICON_CURSOR_EDEFAULT;
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
		result.append(" (image: ");
		result.append(image);
		result.append(", infoTextEN: ");
		result.append(infoTextEN);
		result.append(", infoTextEL: ");
		result.append(infoTextEL);
		result.append(", variableName: ");
		result.append(variableName);
		result.append(", iconCursor: ");
		result.append(iconCursor);
		result.append(')');
		return result.toString();
	}

} //InputBlockImpl
