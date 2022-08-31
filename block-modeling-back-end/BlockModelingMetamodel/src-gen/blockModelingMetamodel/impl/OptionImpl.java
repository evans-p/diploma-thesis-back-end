/**
 */
package blockModelingMetamodel.impl;

import blockModelingMetamodel.BlockModelingMetamodelPackage;
import blockModelingMetamodel.Option;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link blockModelingMetamodel.impl.OptionImpl#getOptionTextEL <em>Option Text EL</em>}</li>
 *   <li>{@link blockModelingMetamodel.impl.OptionImpl#getOptionTextEN <em>Option Text EN</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptionImpl extends MinimalEObjectImpl.Container implements Option {
	/**
	 * The default value of the '{@link #getOptionTextEL() <em>Option Text EL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionTextEL()
	 * @generated
	 * @ordered
	 */
	protected static final String OPTION_TEXT_EL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOptionTextEL() <em>Option Text EL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionTextEL()
	 * @generated
	 * @ordered
	 */
	protected String optionTextEL = OPTION_TEXT_EL_EDEFAULT;

	/**
	 * The default value of the '{@link #getOptionTextEN() <em>Option Text EN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionTextEN()
	 * @generated
	 * @ordered
	 */
	protected static final String OPTION_TEXT_EN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOptionTextEN() <em>Option Text EN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionTextEN()
	 * @generated
	 * @ordered
	 */
	protected String optionTextEN = OPTION_TEXT_EN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockModelingMetamodelPackage.Literals.OPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOptionTextEL() {
		return optionTextEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptionTextEL(String newOptionTextEL) {
		String oldOptionTextEL = optionTextEL;
		optionTextEL = newOptionTextEL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockModelingMetamodelPackage.OPTION__OPTION_TEXT_EL,
					oldOptionTextEL, optionTextEL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOptionTextEN() {
		return optionTextEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptionTextEN(String newOptionTextEN) {
		String oldOptionTextEN = optionTextEN;
		optionTextEN = newOptionTextEN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockModelingMetamodelPackage.OPTION__OPTION_TEXT_EN,
					oldOptionTextEN, optionTextEN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BlockModelingMetamodelPackage.OPTION__OPTION_TEXT_EL:
			return getOptionTextEL();
		case BlockModelingMetamodelPackage.OPTION__OPTION_TEXT_EN:
			return getOptionTextEN();
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
		case BlockModelingMetamodelPackage.OPTION__OPTION_TEXT_EL:
			setOptionTextEL((String) newValue);
			return;
		case BlockModelingMetamodelPackage.OPTION__OPTION_TEXT_EN:
			setOptionTextEN((String) newValue);
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
		case BlockModelingMetamodelPackage.OPTION__OPTION_TEXT_EL:
			setOptionTextEL(OPTION_TEXT_EL_EDEFAULT);
			return;
		case BlockModelingMetamodelPackage.OPTION__OPTION_TEXT_EN:
			setOptionTextEN(OPTION_TEXT_EN_EDEFAULT);
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
		case BlockModelingMetamodelPackage.OPTION__OPTION_TEXT_EL:
			return OPTION_TEXT_EL_EDEFAULT == null ? optionTextEL != null
					: !OPTION_TEXT_EL_EDEFAULT.equals(optionTextEL);
		case BlockModelingMetamodelPackage.OPTION__OPTION_TEXT_EN:
			return OPTION_TEXT_EN_EDEFAULT == null ? optionTextEN != null
					: !OPTION_TEXT_EN_EDEFAULT.equals(optionTextEN);
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
		result.append(" (optionTextEL: ");
		result.append(optionTextEL);
		result.append(", optionTextEN: ");
		result.append(optionTextEN);
		result.append(')');
		return result.toString();
	}

} //OptionImpl
