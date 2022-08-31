/**
 */
package blockModelingMetamodel.impl;

import blockModelingMetamodel.BlockModelingMetamodelPackage;
import blockModelingMetamodel.ComparisonType;
import blockModelingMetamodel.ConditionOption;
import blockModelingMetamodel.Option;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link blockModelingMetamodel.impl.ConditionOptionImpl#getOptionTextEL <em>Option Text EL</em>}</li>
 *   <li>{@link blockModelingMetamodel.impl.ConditionOptionImpl#getOptionTextEN <em>Option Text EN</em>}</li>
 *   <li>{@link blockModelingMetamodel.impl.ConditionOptionImpl#getComparisonType <em>Comparison Type</em>}</li>
 *   <li>{@link blockModelingMetamodel.impl.ConditionOptionImpl#getComparators <em>Comparators</em>}</li>
 *   <li>{@link blockModelingMetamodel.impl.ConditionOptionImpl#getHasOptions <em>Has Options</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionOptionImpl extends MinimalEObjectImpl.Container implements ConditionOption {
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
	 * The default value of the '{@link #getComparisonType() <em>Comparison Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparisonType()
	 * @generated
	 * @ordered
	 */
	protected static final ComparisonType COMPARISON_TYPE_EDEFAULT = ComparisonType.NONE;

	/**
	 * The cached value of the '{@link #getComparisonType() <em>Comparison Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparisonType()
	 * @generated
	 * @ordered
	 */
	protected ComparisonType comparisonType = COMPARISON_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComparators() <em>Comparators</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparators()
	 * @generated
	 * @ordered
	 */
	protected EList<String> comparators;

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
	protected ConditionOptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockModelingMetamodelPackage.Literals.CONDITION_OPTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.CONDITION_OPTION__OPTION_TEXT_EL, oldOptionTextEL, optionTextEL));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.CONDITION_OPTION__OPTION_TEXT_EN, oldOptionTextEN, optionTextEN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonType getComparisonType() {
		return comparisonType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparisonType(ComparisonType newComparisonType) {
		ComparisonType oldComparisonType = comparisonType;
		comparisonType = newComparisonType == null ? COMPARISON_TYPE_EDEFAULT : newComparisonType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.CONDITION_OPTION__COMPARISON_TYPE, oldComparisonType,
					comparisonType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getComparators() {
		if (comparators == null) {
			comparators = new EDataTypeEList<String>(String.class, this,
					BlockModelingMetamodelPackage.CONDITION_OPTION__COMPARATORS);
		}
		return comparators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Option> getHasOptions() {
		if (hasOptions == null) {
			hasOptions = new EObjectContainmentEList<Option>(Option.class, this,
					BlockModelingMetamodelPackage.CONDITION_OPTION__HAS_OPTIONS);
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
		case BlockModelingMetamodelPackage.CONDITION_OPTION__HAS_OPTIONS:
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
		case BlockModelingMetamodelPackage.CONDITION_OPTION__OPTION_TEXT_EL:
			return getOptionTextEL();
		case BlockModelingMetamodelPackage.CONDITION_OPTION__OPTION_TEXT_EN:
			return getOptionTextEN();
		case BlockModelingMetamodelPackage.CONDITION_OPTION__COMPARISON_TYPE:
			return getComparisonType();
		case BlockModelingMetamodelPackage.CONDITION_OPTION__COMPARATORS:
			return getComparators();
		case BlockModelingMetamodelPackage.CONDITION_OPTION__HAS_OPTIONS:
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
		case BlockModelingMetamodelPackage.CONDITION_OPTION__OPTION_TEXT_EL:
			setOptionTextEL((String) newValue);
			return;
		case BlockModelingMetamodelPackage.CONDITION_OPTION__OPTION_TEXT_EN:
			setOptionTextEN((String) newValue);
			return;
		case BlockModelingMetamodelPackage.CONDITION_OPTION__COMPARISON_TYPE:
			setComparisonType((ComparisonType) newValue);
			return;
		case BlockModelingMetamodelPackage.CONDITION_OPTION__COMPARATORS:
			getComparators().clear();
			getComparators().addAll((Collection<? extends String>) newValue);
			return;
		case BlockModelingMetamodelPackage.CONDITION_OPTION__HAS_OPTIONS:
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
		case BlockModelingMetamodelPackage.CONDITION_OPTION__OPTION_TEXT_EL:
			setOptionTextEL(OPTION_TEXT_EL_EDEFAULT);
			return;
		case BlockModelingMetamodelPackage.CONDITION_OPTION__OPTION_TEXT_EN:
			setOptionTextEN(OPTION_TEXT_EN_EDEFAULT);
			return;
		case BlockModelingMetamodelPackage.CONDITION_OPTION__COMPARISON_TYPE:
			setComparisonType(COMPARISON_TYPE_EDEFAULT);
			return;
		case BlockModelingMetamodelPackage.CONDITION_OPTION__COMPARATORS:
			getComparators().clear();
			return;
		case BlockModelingMetamodelPackage.CONDITION_OPTION__HAS_OPTIONS:
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
		case BlockModelingMetamodelPackage.CONDITION_OPTION__OPTION_TEXT_EL:
			return OPTION_TEXT_EL_EDEFAULT == null ? optionTextEL != null
					: !OPTION_TEXT_EL_EDEFAULT.equals(optionTextEL);
		case BlockModelingMetamodelPackage.CONDITION_OPTION__OPTION_TEXT_EN:
			return OPTION_TEXT_EN_EDEFAULT == null ? optionTextEN != null
					: !OPTION_TEXT_EN_EDEFAULT.equals(optionTextEN);
		case BlockModelingMetamodelPackage.CONDITION_OPTION__COMPARISON_TYPE:
			return comparisonType != COMPARISON_TYPE_EDEFAULT;
		case BlockModelingMetamodelPackage.CONDITION_OPTION__COMPARATORS:
			return comparators != null && !comparators.isEmpty();
		case BlockModelingMetamodelPackage.CONDITION_OPTION__HAS_OPTIONS:
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
		result.append(" (optionTextEL: ");
		result.append(optionTextEL);
		result.append(", optionTextEN: ");
		result.append(optionTextEN);
		result.append(", comparisonType: ");
		result.append(comparisonType);
		result.append(", comparators: ");
		result.append(comparators);
		result.append(')');
		return result.toString();
	}

} //ConditionOptionImpl
