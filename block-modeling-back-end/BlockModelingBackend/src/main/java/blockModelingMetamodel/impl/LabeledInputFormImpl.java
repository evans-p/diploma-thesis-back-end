/**
 */
package blockModelingMetamodel.impl;

import blockModelingMetamodel.BlockModelingMetamodelPackage;
import blockModelingMetamodel.LabeledInputForm;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Labeled Input Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link blockModelingMetamodel.impl.LabeledInputFormImpl#getVariableNameEL <em>Variable Name EL</em>}</li>
 *   <li>{@link blockModelingMetamodel.impl.LabeledInputFormImpl#getVariableNameEN <em>Variable Name EN</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class LabeledInputFormImpl extends FormImpl implements LabeledInputForm {
	/**
	 * The default value of the '{@link #getVariableNameEL() <em>Variable Name EL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableNameEL()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIABLE_NAME_EL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVariableNameEL() <em>Variable Name EL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableNameEL()
	 * @generated
	 * @ordered
	 */
	protected String variableNameEL = VARIABLE_NAME_EL_EDEFAULT;

	/**
	 * The default value of the '{@link #getVariableNameEN() <em>Variable Name EN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableNameEN()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIABLE_NAME_EN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVariableNameEN() <em>Variable Name EN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableNameEN()
	 * @generated
	 * @ordered
	 */
	protected String variableNameEN = VARIABLE_NAME_EN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabeledInputFormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockModelingMetamodelPackage.Literals.LABELED_INPUT_FORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVariableNameEL() {
		return variableNameEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableNameEL(String newVariableNameEL) {
		String oldVariableNameEL = variableNameEL;
		variableNameEL = newVariableNameEL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.LABELED_INPUT_FORM__VARIABLE_NAME_EL, oldVariableNameEL,
					variableNameEL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVariableNameEN() {
		return variableNameEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableNameEN(String newVariableNameEN) {
		String oldVariableNameEN = variableNameEN;
		variableNameEN = newVariableNameEN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.LABELED_INPUT_FORM__VARIABLE_NAME_EN, oldVariableNameEN,
					variableNameEN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BlockModelingMetamodelPackage.LABELED_INPUT_FORM__VARIABLE_NAME_EL:
			return getVariableNameEL();
		case BlockModelingMetamodelPackage.LABELED_INPUT_FORM__VARIABLE_NAME_EN:
			return getVariableNameEN();
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
		case BlockModelingMetamodelPackage.LABELED_INPUT_FORM__VARIABLE_NAME_EL:
			setVariableNameEL((String) newValue);
			return;
		case BlockModelingMetamodelPackage.LABELED_INPUT_FORM__VARIABLE_NAME_EN:
			setVariableNameEN((String) newValue);
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
		case BlockModelingMetamodelPackage.LABELED_INPUT_FORM__VARIABLE_NAME_EL:
			setVariableNameEL(VARIABLE_NAME_EL_EDEFAULT);
			return;
		case BlockModelingMetamodelPackage.LABELED_INPUT_FORM__VARIABLE_NAME_EN:
			setVariableNameEN(VARIABLE_NAME_EN_EDEFAULT);
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
		case BlockModelingMetamodelPackage.LABELED_INPUT_FORM__VARIABLE_NAME_EL:
			return VARIABLE_NAME_EL_EDEFAULT == null ? variableNameEL != null
					: !VARIABLE_NAME_EL_EDEFAULT.equals(variableNameEL);
		case BlockModelingMetamodelPackage.LABELED_INPUT_FORM__VARIABLE_NAME_EN:
			return VARIABLE_NAME_EN_EDEFAULT == null ? variableNameEN != null
					: !VARIABLE_NAME_EN_EDEFAULT.equals(variableNameEN);
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
		result.append(" (variableNameEL: ");
		result.append(variableNameEL);
		result.append(", variableNameEN: ");
		result.append(variableNameEN);
		result.append(')');
		return result.toString();
	}

} //LabeledInputFormImpl
