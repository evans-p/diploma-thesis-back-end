/**
 */
package blockModelingMetamodel.impl;

import blockModelingMetamodel.BlockModelingMetamodelPackage;
import blockModelingMetamodel.LabeledTextInputForm;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Labeled Text Input Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link blockModelingMetamodel.impl.LabeledTextInputFormImpl#getDefaultValueEN <em>Default Value EN</em>}</li>
 *   <li>{@link blockModelingMetamodel.impl.LabeledTextInputFormImpl#getDefaultValueEL <em>Default Value EL</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LabeledTextInputFormImpl extends LabeledInputFormImpl implements LabeledTextInputForm {
	/**
	 * The default value of the '{@link #getDefaultValueEN() <em>Default Value EN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueEN()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValueEN() <em>Default Value EN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueEN()
	 * @generated
	 * @ordered
	 */
	protected String defaultValueEN = DEFAULT_VALUE_EN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValueEL() <em>Default Value EL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueEL()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValueEL() <em>Default Value EL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueEL()
	 * @generated
	 * @ordered
	 */
	protected String defaultValueEL = DEFAULT_VALUE_EL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabeledTextInputFormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockModelingMetamodelPackage.Literals.LABELED_TEXT_INPUT_FORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValueEN() {
		return defaultValueEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueEN(String newDefaultValueEN) {
		String oldDefaultValueEN = defaultValueEN;
		defaultValueEN = newDefaultValueEN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.LABELED_TEXT_INPUT_FORM__DEFAULT_VALUE_EN, oldDefaultValueEN,
					defaultValueEN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValueEL() {
		return defaultValueEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueEL(String newDefaultValueEL) {
		String oldDefaultValueEL = defaultValueEL;
		defaultValueEL = newDefaultValueEL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.LABELED_TEXT_INPUT_FORM__DEFAULT_VALUE_EL, oldDefaultValueEL,
					defaultValueEL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BlockModelingMetamodelPackage.LABELED_TEXT_INPUT_FORM__DEFAULT_VALUE_EN:
			return getDefaultValueEN();
		case BlockModelingMetamodelPackage.LABELED_TEXT_INPUT_FORM__DEFAULT_VALUE_EL:
			return getDefaultValueEL();
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
		case BlockModelingMetamodelPackage.LABELED_TEXT_INPUT_FORM__DEFAULT_VALUE_EN:
			setDefaultValueEN((String) newValue);
			return;
		case BlockModelingMetamodelPackage.LABELED_TEXT_INPUT_FORM__DEFAULT_VALUE_EL:
			setDefaultValueEL((String) newValue);
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
		case BlockModelingMetamodelPackage.LABELED_TEXT_INPUT_FORM__DEFAULT_VALUE_EN:
			setDefaultValueEN(DEFAULT_VALUE_EN_EDEFAULT);
			return;
		case BlockModelingMetamodelPackage.LABELED_TEXT_INPUT_FORM__DEFAULT_VALUE_EL:
			setDefaultValueEL(DEFAULT_VALUE_EL_EDEFAULT);
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
		case BlockModelingMetamodelPackage.LABELED_TEXT_INPUT_FORM__DEFAULT_VALUE_EN:
			return DEFAULT_VALUE_EN_EDEFAULT == null ? defaultValueEN != null
					: !DEFAULT_VALUE_EN_EDEFAULT.equals(defaultValueEN);
		case BlockModelingMetamodelPackage.LABELED_TEXT_INPUT_FORM__DEFAULT_VALUE_EL:
			return DEFAULT_VALUE_EL_EDEFAULT == null ? defaultValueEL != null
					: !DEFAULT_VALUE_EL_EDEFAULT.equals(defaultValueEL);
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
		result.append(" (defaultValueEN: ");
		result.append(defaultValueEN);
		result.append(", defaultValueEL: ");
		result.append(defaultValueEL);
		result.append(')');
		return result.toString();
	}

} //LabeledTextInputFormImpl
