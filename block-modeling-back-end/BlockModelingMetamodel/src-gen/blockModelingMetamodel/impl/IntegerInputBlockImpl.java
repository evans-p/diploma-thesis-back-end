/**
 */
package blockModelingMetamodel.impl;

import blockModelingMetamodel.BlockModelingMetamodelPackage;
import blockModelingMetamodel.IntegerInputBlock;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer Input Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link blockModelingMetamodel.impl.IntegerInputBlockImpl#isNoMinValue <em>No Min Value</em>}</li>
 *   <li>{@link blockModelingMetamodel.impl.IntegerInputBlockImpl#isNoMaxValue <em>No Max Value</em>}</li>
 *   <li>{@link blockModelingMetamodel.impl.IntegerInputBlockImpl#isNoDefaultValue <em>No Default Value</em>}</li>
 *   <li>{@link blockModelingMetamodel.impl.IntegerInputBlockImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link blockModelingMetamodel.impl.IntegerInputBlockImpl#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link blockModelingMetamodel.impl.IntegerInputBlockImpl#getMinValue <em>Min Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntegerInputBlockImpl extends InputBlockImpl implements IntegerInputBlock {
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
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final int DEFAULT_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected int defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected int maxValue = MAX_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected int minValue = MIN_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerInputBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockModelingMetamodelPackage.Literals.INTEGER_INPUT_BLOCK;
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
					BlockModelingMetamodelPackage.INTEGER_INPUT_BLOCK__NO_MIN_VALUE, oldNoMinValue, noMinValue));
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
					BlockModelingMetamodelPackage.INTEGER_INPUT_BLOCK__NO_MAX_VALUE, oldNoMaxValue, noMaxValue));
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
					BlockModelingMetamodelPackage.INTEGER_INPUT_BLOCK__NO_DEFAULT_VALUE, oldNoDefaultValue,
					noDefaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinValue() {
		return minValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValue(int newMinValue) {
		int oldMinValue = minValue;
		minValue = newMinValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.INTEGER_INPUT_BLOCK__MIN_VALUE, oldMinValue, minValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxValue() {
		return maxValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValue(int newMaxValue) {
		int oldMaxValue = maxValue;
		maxValue = newMaxValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.INTEGER_INPUT_BLOCK__MAX_VALUE, oldMaxValue, maxValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(int newDefaultValue) {
		int oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.INTEGER_INPUT_BLOCK__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BlockModelingMetamodelPackage.INTEGER_INPUT_BLOCK__NO_MIN_VALUE:
			return isNoMinValue();
		case BlockModelingMetamodelPackage.INTEGER_INPUT_BLOCK__NO_MAX_VALUE:
			return isNoMaxValue();
		case BlockModelingMetamodelPackage.INTEGER_INPUT_BLOCK__NO_DEFAULT_VALUE:
			return isNoDefaultValue();
		case BlockModelingMetamodelPackage.INTEGER_INPUT_BLOCK__DEFAULT_VALUE:
			return getDefaultValue();
		case BlockModelingMetamodelPackage.INTEGER_INPUT_BLOCK__MAX_VALUE:
			return getMaxValue();
		case BlockModelingMetamodelPackage.INTEGER_INPUT_BLOCK__MIN_VALUE:
			return getMinValue();
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
		case BlockModelingMetamodelPackage.INTEGER_INPUT_BLOCK__NO_MIN_VALUE:
			setNoMinValue((Boolean) newValue);
			return;
		case BlockModelingMetamodelPackage.INTEGER_INPUT_BLOCK__NO_MAX_VALUE:
			setNoMaxValue((Boolean) newValue);
			return;
		case BlockModelingMetamodelPackage.INTEGER_INPUT_BLOCK__NO_DEFAULT_VALUE:
			setNoDefaultValue((Boolean) newValue);
			return;
		case BlockModelingMetamodelPackage.INTEGER_INPUT_BLOCK__DEFAULT_VALUE:
			setDefaultValue((Integer) newValue);
			return;
		case BlockModelingMetamodelPackage.INTEGER_INPUT_BLOCK__MAX_VALUE:
			setMaxValue((Integer) newValue);
			return;
		case BlockModelingMetamodelPackage.INTEGER_INPUT_BLOCK__MIN_VALUE:
			setMinValue((Integer) newValue);
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
		case BlockModelingMetamodelPackage.INTEGER_INPUT_BLOCK__NO_MIN_VALUE:
			setNoMinValue(NO_MIN_VALUE_EDEFAULT);
			return;
		case BlockModelingMetamodelPackage.INTEGER_INPUT_BLOCK__NO_MAX_VALUE:
			setNoMaxValue(NO_MAX_VALUE_EDEFAULT);
			return;
		case BlockModelingMetamodelPackage.INTEGER_INPUT_BLOCK__NO_DEFAULT_VALUE:
			setNoDefaultValue(NO_DEFAULT_VALUE_EDEFAULT);
			return;
		case BlockModelingMetamodelPackage.INTEGER_INPUT_BLOCK__DEFAULT_VALUE:
			setDefaultValue(DEFAULT_VALUE_EDEFAULT);
			return;
		case BlockModelingMetamodelPackage.INTEGER_INPUT_BLOCK__MAX_VALUE:
			setMaxValue(MAX_VALUE_EDEFAULT);
			return;
		case BlockModelingMetamodelPackage.INTEGER_INPUT_BLOCK__MIN_VALUE:
			setMinValue(MIN_VALUE_EDEFAULT);
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
		case BlockModelingMetamodelPackage.INTEGER_INPUT_BLOCK__NO_MIN_VALUE:
			return noMinValue != NO_MIN_VALUE_EDEFAULT;
		case BlockModelingMetamodelPackage.INTEGER_INPUT_BLOCK__NO_MAX_VALUE:
			return noMaxValue != NO_MAX_VALUE_EDEFAULT;
		case BlockModelingMetamodelPackage.INTEGER_INPUT_BLOCK__NO_DEFAULT_VALUE:
			return noDefaultValue != NO_DEFAULT_VALUE_EDEFAULT;
		case BlockModelingMetamodelPackage.INTEGER_INPUT_BLOCK__DEFAULT_VALUE:
			return defaultValue != DEFAULT_VALUE_EDEFAULT;
		case BlockModelingMetamodelPackage.INTEGER_INPUT_BLOCK__MAX_VALUE:
			return maxValue != MAX_VALUE_EDEFAULT;
		case BlockModelingMetamodelPackage.INTEGER_INPUT_BLOCK__MIN_VALUE:
			return minValue != MIN_VALUE_EDEFAULT;
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
		result.append(" (noMinValue: ");
		result.append(noMinValue);
		result.append(", noMaxValue: ");
		result.append(noMaxValue);
		result.append(", noDefaultValue: ");
		result.append(noDefaultValue);
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(", maxValue: ");
		result.append(maxValue);
		result.append(", minValue: ");
		result.append(minValue);
		result.append(')');
		return result.toString();
	}

} //IntegerInputBlockImpl
