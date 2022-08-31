/**
 */
package blockModelingMetamodel.impl;

import blockModelingMetamodel.BlockModelingMetamodelPackage;
import blockModelingMetamodel.Popover;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Popover</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link blockModelingMetamodel.impl.PopoverImpl#getPopoverTitleEL <em>Popover Title EL</em>}</li>
 *   <li>{@link blockModelingMetamodel.impl.PopoverImpl#getPopoverTitleEN <em>Popover Title EN</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PopoverImpl extends MinimalEObjectImpl.Container implements Popover {
	/**
	 * The default value of the '{@link #getPopoverTitleEL() <em>Popover Title EL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopoverTitleEL()
	 * @generated
	 * @ordered
	 */
	protected static final String POPOVER_TITLE_EL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPopoverTitleEL() <em>Popover Title EL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopoverTitleEL()
	 * @generated
	 * @ordered
	 */
	protected String popoverTitleEL = POPOVER_TITLE_EL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPopoverTitleEN() <em>Popover Title EN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopoverTitleEN()
	 * @generated
	 * @ordered
	 */
	protected static final String POPOVER_TITLE_EN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPopoverTitleEN() <em>Popover Title EN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopoverTitleEN()
	 * @generated
	 * @ordered
	 */
	protected String popoverTitleEN = POPOVER_TITLE_EN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PopoverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockModelingMetamodelPackage.Literals.POPOVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPopoverTitleEL() {
		return popoverTitleEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPopoverTitleEL(String newPopoverTitleEL) {
		String oldPopoverTitleEL = popoverTitleEL;
		popoverTitleEL = newPopoverTitleEL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.POPOVER__POPOVER_TITLE_EL, oldPopoverTitleEL, popoverTitleEL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPopoverTitleEN() {
		return popoverTitleEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPopoverTitleEN(String newPopoverTitleEN) {
		String oldPopoverTitleEN = popoverTitleEN;
		popoverTitleEN = newPopoverTitleEN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.POPOVER__POPOVER_TITLE_EN, oldPopoverTitleEN, popoverTitleEN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BlockModelingMetamodelPackage.POPOVER__POPOVER_TITLE_EL:
			return getPopoverTitleEL();
		case BlockModelingMetamodelPackage.POPOVER__POPOVER_TITLE_EN:
			return getPopoverTitleEN();
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
		case BlockModelingMetamodelPackage.POPOVER__POPOVER_TITLE_EL:
			setPopoverTitleEL((String) newValue);
			return;
		case BlockModelingMetamodelPackage.POPOVER__POPOVER_TITLE_EN:
			setPopoverTitleEN((String) newValue);
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
		case BlockModelingMetamodelPackage.POPOVER__POPOVER_TITLE_EL:
			setPopoverTitleEL(POPOVER_TITLE_EL_EDEFAULT);
			return;
		case BlockModelingMetamodelPackage.POPOVER__POPOVER_TITLE_EN:
			setPopoverTitleEN(POPOVER_TITLE_EN_EDEFAULT);
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
		case BlockModelingMetamodelPackage.POPOVER__POPOVER_TITLE_EL:
			return POPOVER_TITLE_EL_EDEFAULT == null ? popoverTitleEL != null
					: !POPOVER_TITLE_EL_EDEFAULT.equals(popoverTitleEL);
		case BlockModelingMetamodelPackage.POPOVER__POPOVER_TITLE_EN:
			return POPOVER_TITLE_EN_EDEFAULT == null ? popoverTitleEN != null
					: !POPOVER_TITLE_EN_EDEFAULT.equals(popoverTitleEN);
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
		result.append(" (popoverTitleEL: ");
		result.append(popoverTitleEL);
		result.append(", popoverTitleEN: ");
		result.append(popoverTitleEN);
		result.append(')');
		return result.toString();
	}

} //PopoverImpl
