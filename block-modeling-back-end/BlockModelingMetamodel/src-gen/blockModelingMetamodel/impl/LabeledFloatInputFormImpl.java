/**
 */
package blockModelingMetamodel.impl;

import blockModelingMetamodel.BlockModelingMetamodelPackage;
import blockModelingMetamodel.LabeledFloatInputForm;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Labeled Float Input Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link blockModelingMetamodel.impl.LabeledFloatInputFormImpl#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link blockModelingMetamodel.impl.LabeledFloatInputFormImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link blockModelingMetamodel.impl.LabeledFloatInputFormImpl#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link blockModelingMetamodel.impl.LabeledFloatInputFormImpl#isNoMaxValue <em>No Max Value</em>}</li>
 *   <li>{@link blockModelingMetamodel.impl.LabeledFloatInputFormImpl#isNoMinValue <em>No Min Value</em>}</li>
 *   <li>{@link blockModelingMetamodel.impl.LabeledFloatInputFormImpl#isNoDefaultValue <em>No Default Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LabeledFloatInputFormImpl extends LabeledInputFormImpl implements LabeledFloatInputForm {
	/**
	 * The default value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected float minValue = MIN_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final float DEFAULT_VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected float defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected float maxValue = MAX_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isNoMaxValue() <em>No Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoMaxValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NO_MAX_VALUE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isNoMaxValue() <em>No Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoMaxValue()
	 * @generated
	 * @ordered
	 */
	protected boolean noMaxValue = NO_MAX_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isNoMinValue() <em>No Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoMinValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NO_MIN_VALUE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isNoMinValue() <em>No Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoMinValue()
	 * @generated
	 * @ordered
	 */
	protected boolean noMinValue = NO_MIN_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isNoDefaultValue() <em>No Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NO_DEFAULT_VALUE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isNoDefaultValue() <em>No Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected boolean noDefaultValue = NO_DEFAULT_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabeledFloatInputFormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockModelingMetamodelPackage.Literals.LABELED_FLOAT_INPUT_FORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinValue() {
		return minValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValue(float newMinValue) {
		float oldMinValue = minValue;
		minValue = newMinValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.LABELED_FLOAT_INPUT_FORM__MIN_VALUE, oldMinValue, minValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(float newDefaultValue) {
		float oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.LABELED_FLOAT_INPUT_FORM__DEFAULT_VALUE, oldDefaultValue,
					defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxValue() {
		return maxValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValue(float newMaxValue) {
		float oldMaxValue = maxValue;
		maxValue = newMaxValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.LABELED_FLOAT_INPUT_FORM__MAX_VALUE, oldMaxValue, maxValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNoMaxValue() {
		return noMaxValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoMaxValue(boolean newNoMaxValue) {
		boolean oldNoMaxValue = noMaxValue;
		noMaxValue = newNoMaxValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.LABELED_FLOAT_INPUT_FORM__NO_MAX_VALUE, oldNoMaxValue, noMaxValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNoMinValue() {
		return noMinValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoMinValue(boolean newNoMinValue) {
		boolean oldNoMinValue = noMinValue;
		noMinValue = newNoMinValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.LABELED_FLOAT_INPUT_FORM__NO_MIN_VALUE, oldNoMinValue, noMinValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNoDefaultValue() {
		return noDefaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoDefaultValue(boolean newNoDefaultValue) {
		boolean oldNoDefaultValue = noDefaultValue;
		noDefaultValue = newNoDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.LABELED_FLOAT_INPUT_FORM__NO_DEFAULT_VALUE, oldNoDefaultValue,
					noDefaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BlockModelingMetamodelPackage.LABELED_FLOAT_INPUT_FORM__MIN_VALUE:
			return getMinValue();
		case BlockModelingMetamodelPackage.LABELED_FLOAT_INPUT_FORM__DEFAULT_VALUE:
			return getDefaultValue();
		case BlockModelingMetamodelPackage.LABELED_FLOAT_INPUT_FORM__MAX_VALUE:
			return getMaxValue();
		case BlockModelingMetamodelPackage.LABELED_FLOAT_INPUT_FORM__NO_MAX_VALUE:
			return isNoMaxValue();
		case BlockModelingMetamodelPackage.LABELED_FLOAT_INPUT_FORM__NO_MIN_VALUE:
			return isNoMinValue();
		case BlockModelingMetamodelPackage.LABELED_FLOAT_INPUT_FORM__NO_DEFAULT_VALUE:
			return isNoDefaultValue();
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
		case BlockModelingMetamodelPackage.LABELED_FLOAT_INPUT_FORM__MIN_VALUE:
			setMinValue((Float) newValue);
			return;
		case BlockModelingMetamodelPackage.LABELED_FLOAT_INPUT_FORM__DEFAULT_VALUE:
			setDefaultValue((Float) newValue);
			return;
		case BlockModelingMetamodelPackage.LABELED_FLOAT_INPUT_FORM__MAX_VALUE:
			setMaxValue((Float) newValue);
			return;
		case BlockModelingMetamodelPackage.LABELED_FLOAT_INPUT_FORM__NO_MAX_VALUE:
			setNoMaxValue((Boolean) newValue);
			return;
		case BlockModelingMetamodelPackage.LABELED_FLOAT_INPUT_FORM__NO_MIN_VALUE:
			setNoMinValue((Boolean) newValue);
			return;
		case BlockModelingMetamodelPackage.LABELED_FLOAT_INPUT_FORM__NO_DEFAULT_VALUE:
			setNoDefaultValue((Boolean) newValue);
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
		case BlockModelingMetamodelPackage.LABELED_FLOAT_INPUT_FORM__MIN_VALUE:
			setMinValue(MIN_VALUE_EDEFAULT);
			return;
		case BlockModelingMetamodelPackage.LABELED_FLOAT_INPUT_FORM__DEFAULT_VALUE:
			setDefaultValue(DEFAULT_VALUE_EDEFAULT);
			return;
		case BlockModelingMetamodelPackage.LABELED_FLOAT_INPUT_FORM__MAX_VALUE:
			setMaxValue(MAX_VALUE_EDEFAULT);
			return;
		case BlockModelingMetamodelPackage.LABELED_FLOAT_INPUT_FORM__NO_MAX_VALUE:
			setNoMaxValue(NO_MAX_VALUE_EDEFAULT);
			return;
		case BlockModelingMetamodelPackage.LABELED_FLOAT_INPUT_FORM__NO_MIN_VALUE:
			setNoMinValue(NO_MIN_VALUE_EDEFAULT);
			return;
		case BlockModelingMetamodelPackage.LABELED_FLOAT_INPUT_FORM__NO_DEFAULT_VALUE:
			setNoDefaultValue(NO_DEFAULT_VALUE_EDEFAULT);
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
		case BlockModelingMetamodelPackage.LABELED_FLOAT_INPUT_FORM__MIN_VALUE:
			return minValue != MIN_VALUE_EDEFAULT;
		case BlockModelingMetamodelPackage.LABELED_FLOAT_INPUT_FORM__DEFAULT_VALUE:
			return defaultValue != DEFAULT_VALUE_EDEFAULT;
		case BlockModelingMetamodelPackage.LABELED_FLOAT_INPUT_FORM__MAX_VALUE:
			return maxValue != MAX_VALUE_EDEFAULT;
		case BlockModelingMetamodelPackage.LABELED_FLOAT_INPUT_FORM__NO_MAX_VALUE:
			return noMaxValue != NO_MAX_VALUE_EDEFAULT;
		case BlockModelingMetamodelPackage.LABELED_FLOAT_INPUT_FORM__NO_MIN_VALUE:
			return noMinValue != NO_MIN_VALUE_EDEFAULT;
		case BlockModelingMetamodelPackage.LABELED_FLOAT_INPUT_FORM__NO_DEFAULT_VALUE:
			return noDefaultValue != NO_DEFAULT_VALUE_EDEFAULT;
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
		result.append(" (minValue: ");
		result.append(minValue);
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(", maxValue: ");
		result.append(maxValue);
		result.append(", noMaxValue: ");
		result.append(noMaxValue);
		result.append(", noMinValue: ");
		result.append(noMinValue);
		result.append(", noDefaultValue: ");
		result.append(noDefaultValue);
		result.append(')');
		return result.toString();
	}

} //LabeledFloatInputFormImpl
