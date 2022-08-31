/**
 */
package blockModelingMetamodel.impl;

import blockModelingMetamodel.BlockModelingMetamodelPackage;
import blockModelingMetamodel.Cursor;
import blockModelingMetamodel.Information;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link blockModelingMetamodel.impl.InformationImpl#getInformationTextEL <em>Information Text EL</em>}</li>
 *   <li>{@link blockModelingMetamodel.impl.InformationImpl#getInformationTextEN <em>Information Text EN</em>}</li>
 *   <li>{@link blockModelingMetamodel.impl.InformationImpl#getCursor <em>Cursor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InformationImpl extends MinimalEObjectImpl.Container implements Information {
	/**
	 * The default value of the '{@link #getInformationTextEL() <em>Information Text EL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationTextEL()
	 * @generated
	 * @ordered
	 */
	protected static final String INFORMATION_TEXT_EL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInformationTextEL() <em>Information Text EL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationTextEL()
	 * @generated
	 * @ordered
	 */
	protected String informationTextEL = INFORMATION_TEXT_EL_EDEFAULT;

	/**
	 * The default value of the '{@link #getInformationTextEN() <em>Information Text EN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationTextEN()
	 * @generated
	 * @ordered
	 */
	protected static final String INFORMATION_TEXT_EN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInformationTextEN() <em>Information Text EN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationTextEN()
	 * @generated
	 * @ordered
	 */
	protected String informationTextEN = INFORMATION_TEXT_EN_EDEFAULT;

	/**
	 * The default value of the '{@link #getCursor() <em>Cursor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCursor()
	 * @generated
	 * @ordered
	 */
	protected static final Cursor CURSOR_EDEFAULT = Cursor.DEFAULT;

	/**
	 * The cached value of the '{@link #getCursor() <em>Cursor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCursor()
	 * @generated
	 * @ordered
	 */
	protected Cursor cursor = CURSOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockModelingMetamodelPackage.Literals.INFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInformationTextEL() {
		return informationTextEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInformationTextEL(String newInformationTextEL) {
		String oldInformationTextEL = informationTextEL;
		informationTextEL = newInformationTextEL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.INFORMATION__INFORMATION_TEXT_EL, oldInformationTextEL,
					informationTextEL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInformationTextEN() {
		return informationTextEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInformationTextEN(String newInformationTextEN) {
		String oldInformationTextEN = informationTextEN;
		informationTextEN = newInformationTextEN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.INFORMATION__INFORMATION_TEXT_EN, oldInformationTextEN,
					informationTextEN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cursor getCursor() {
		return cursor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCursor(Cursor newCursor) {
		Cursor oldCursor = cursor;
		cursor = newCursor == null ? CURSOR_EDEFAULT : newCursor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockModelingMetamodelPackage.INFORMATION__CURSOR,
					oldCursor, cursor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BlockModelingMetamodelPackage.INFORMATION__INFORMATION_TEXT_EL:
			return getInformationTextEL();
		case BlockModelingMetamodelPackage.INFORMATION__INFORMATION_TEXT_EN:
			return getInformationTextEN();
		case BlockModelingMetamodelPackage.INFORMATION__CURSOR:
			return getCursor();
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
		case BlockModelingMetamodelPackage.INFORMATION__INFORMATION_TEXT_EL:
			setInformationTextEL((String) newValue);
			return;
		case BlockModelingMetamodelPackage.INFORMATION__INFORMATION_TEXT_EN:
			setInformationTextEN((String) newValue);
			return;
		case BlockModelingMetamodelPackage.INFORMATION__CURSOR:
			setCursor((Cursor) newValue);
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
		case BlockModelingMetamodelPackage.INFORMATION__INFORMATION_TEXT_EL:
			setInformationTextEL(INFORMATION_TEXT_EL_EDEFAULT);
			return;
		case BlockModelingMetamodelPackage.INFORMATION__INFORMATION_TEXT_EN:
			setInformationTextEN(INFORMATION_TEXT_EN_EDEFAULT);
			return;
		case BlockModelingMetamodelPackage.INFORMATION__CURSOR:
			setCursor(CURSOR_EDEFAULT);
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
		case BlockModelingMetamodelPackage.INFORMATION__INFORMATION_TEXT_EL:
			return INFORMATION_TEXT_EL_EDEFAULT == null ? informationTextEL != null
					: !INFORMATION_TEXT_EL_EDEFAULT.equals(informationTextEL);
		case BlockModelingMetamodelPackage.INFORMATION__INFORMATION_TEXT_EN:
			return INFORMATION_TEXT_EN_EDEFAULT == null ? informationTextEN != null
					: !INFORMATION_TEXT_EN_EDEFAULT.equals(informationTextEN);
		case BlockModelingMetamodelPackage.INFORMATION__CURSOR:
			return cursor != CURSOR_EDEFAULT;
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
		result.append(" (informationTextEL: ");
		result.append(informationTextEL);
		result.append(", informationTextEN: ");
		result.append(informationTextEN);
		result.append(", cursor: ");
		result.append(cursor);
		result.append(')');
		return result.toString();
	}

} //InformationImpl
