/**
 */
package blockModelingMetamodel.impl;

import blockModelingMetamodel.BlockModelingMetamodelPackage;
import blockModelingMetamodel.Option;
import blockModelingMetamodel.ParameterInputForm;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Input Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link blockModelingMetamodel.impl.ParameterInputFormImpl#getDefaultValueEL <em>Default Value EL</em>}</li>
 *   <li>{@link blockModelingMetamodel.impl.ParameterInputFormImpl#getDefaultValueEN <em>Default Value EN</em>}</li>
 *   <li>{@link blockModelingMetamodel.impl.ParameterInputFormImpl#getHasOptions <em>Has Options</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterInputFormImpl extends FormImpl implements ParameterInputForm {
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
	 * The cached value of the '{@link #getHasOptions() <em>Has Options</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Option> hasOptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterInputFormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockModelingMetamodelPackage.Literals.PARAMETER_INPUT_FORM;
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
					BlockModelingMetamodelPackage.PARAMETER_INPUT_FORM__DEFAULT_VALUE_EL, oldDefaultValueEL,
					defaultValueEL));
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
					BlockModelingMetamodelPackage.PARAMETER_INPUT_FORM__DEFAULT_VALUE_EN, oldDefaultValueEN,
					defaultValueEN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Option> getHasOptions() {
		if (hasOptions == null) {
			hasOptions = new EObjectContainmentEList<Option>(Option.class, this,
					BlockModelingMetamodelPackage.PARAMETER_INPUT_FORM__HAS_OPTIONS);
		}
		return hasOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BlockModelingMetamodelPackage.PARAMETER_INPUT_FORM__HAS_OPTIONS:
			return ((InternalEList<?>) getHasOptions()).basicRemove(otherEnd, msgs);
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
		case BlockModelingMetamodelPackage.PARAMETER_INPUT_FORM__DEFAULT_VALUE_EL:
			return getDefaultValueEL();
		case BlockModelingMetamodelPackage.PARAMETER_INPUT_FORM__DEFAULT_VALUE_EN:
			return getDefaultValueEN();
		case BlockModelingMetamodelPackage.PARAMETER_INPUT_FORM__HAS_OPTIONS:
			return getHasOptions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BlockModelingMetamodelPackage.PARAMETER_INPUT_FORM__DEFAULT_VALUE_EL:
			setDefaultValueEL((String) newValue);
			return;
		case BlockModelingMetamodelPackage.PARAMETER_INPUT_FORM__DEFAULT_VALUE_EN:
			setDefaultValueEN((String) newValue);
			return;
		case BlockModelingMetamodelPackage.PARAMETER_INPUT_FORM__HAS_OPTIONS:
			getHasOptions().clear();
			getHasOptions().addAll((Collection<? extends Option>) newValue);
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
		case BlockModelingMetamodelPackage.PARAMETER_INPUT_FORM__DEFAULT_VALUE_EL:
			setDefaultValueEL(DEFAULT_VALUE_EL_EDEFAULT);
			return;
		case BlockModelingMetamodelPackage.PARAMETER_INPUT_FORM__DEFAULT_VALUE_EN:
			setDefaultValueEN(DEFAULT_VALUE_EN_EDEFAULT);
			return;
		case BlockModelingMetamodelPackage.PARAMETER_INPUT_FORM__HAS_OPTIONS:
			getHasOptions().clear();
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
		case BlockModelingMetamodelPackage.PARAMETER_INPUT_FORM__DEFAULT_VALUE_EL:
			return DEFAULT_VALUE_EL_EDEFAULT == null ? defaultValueEL != null
					: !DEFAULT_VALUE_EL_EDEFAULT.equals(defaultValueEL);
		case BlockModelingMetamodelPackage.PARAMETER_INPUT_FORM__DEFAULT_VALUE_EN:
			return DEFAULT_VALUE_EN_EDEFAULT == null ? defaultValueEN != null
					: !DEFAULT_VALUE_EN_EDEFAULT.equals(defaultValueEN);
		case BlockModelingMetamodelPackage.PARAMETER_INPUT_FORM__HAS_OPTIONS:
			return hasOptions != null && !hasOptions.isEmpty();
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
		result.append(" (defaultValueEL: ");
		result.append(defaultValueEL);
		result.append(", defaultValueEN: ");
		result.append(defaultValueEN);
		result.append(')');
		return result.toString();
	}

} //ParameterInputFormImpl
