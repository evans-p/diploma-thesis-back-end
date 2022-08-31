/**
 */
package blockModelingMetamodel.impl;

import blockModelingMetamodel.BlockModelingMetamodelPackage;
import blockModelingMetamodel.PhrasesInputForm;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Phrases Input Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link blockModelingMetamodel.impl.PhrasesInputFormImpl#getPlaceholderEL <em>Placeholder EL</em>}</li>
 *   <li>{@link blockModelingMetamodel.impl.PhrasesInputFormImpl#getPlaceholderEN <em>Placeholder EN</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhrasesInputFormImpl extends FormImpl implements PhrasesInputForm {
	/**
	 * The default value of the '{@link #getPlaceholderEL() <em>Placeholder EL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceholderEL()
	 * @generated
	 * @ordered
	 */
	protected static final String PLACEHOLDER_EL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlaceholderEL() <em>Placeholder EL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceholderEL()
	 * @generated
	 * @ordered
	 */
	protected String placeholderEL = PLACEHOLDER_EL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlaceholderEN() <em>Placeholder EN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceholderEN()
	 * @generated
	 * @ordered
	 */
	protected static final String PLACEHOLDER_EN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlaceholderEN() <em>Placeholder EN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceholderEN()
	 * @generated
	 * @ordered
	 */
	protected String placeholderEN = PLACEHOLDER_EN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhrasesInputFormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockModelingMetamodelPackage.Literals.PHRASES_INPUT_FORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlaceholderEL() {
		return placeholderEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlaceholderEL(String newPlaceholderEL) {
		String oldPlaceholderEL = placeholderEL;
		placeholderEL = newPlaceholderEL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.PHRASES_INPUT_FORM__PLACEHOLDER_EL, oldPlaceholderEL, placeholderEL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlaceholderEN() {
		return placeholderEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlaceholderEN(String newPlaceholderEN) {
		String oldPlaceholderEN = placeholderEN;
		placeholderEN = newPlaceholderEN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.PHRASES_INPUT_FORM__PLACEHOLDER_EN, oldPlaceholderEN, placeholderEN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BlockModelingMetamodelPackage.PHRASES_INPUT_FORM__PLACEHOLDER_EL:
			return getPlaceholderEL();
		case BlockModelingMetamodelPackage.PHRASES_INPUT_FORM__PLACEHOLDER_EN:
			return getPlaceholderEN();
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
		case BlockModelingMetamodelPackage.PHRASES_INPUT_FORM__PLACEHOLDER_EL:
			setPlaceholderEL((String) newValue);
			return;
		case BlockModelingMetamodelPackage.PHRASES_INPUT_FORM__PLACEHOLDER_EN:
			setPlaceholderEN((String) newValue);
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
		case BlockModelingMetamodelPackage.PHRASES_INPUT_FORM__PLACEHOLDER_EL:
			setPlaceholderEL(PLACEHOLDER_EL_EDEFAULT);
			return;
		case BlockModelingMetamodelPackage.PHRASES_INPUT_FORM__PLACEHOLDER_EN:
			setPlaceholderEN(PLACEHOLDER_EN_EDEFAULT);
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
		case BlockModelingMetamodelPackage.PHRASES_INPUT_FORM__PLACEHOLDER_EL:
			return PLACEHOLDER_EL_EDEFAULT == null ? placeholderEL != null
					: !PLACEHOLDER_EL_EDEFAULT.equals(placeholderEL);
		case BlockModelingMetamodelPackage.PHRASES_INPUT_FORM__PLACEHOLDER_EN:
			return PLACEHOLDER_EN_EDEFAULT == null ? placeholderEN != null
					: !PLACEHOLDER_EN_EDEFAULT.equals(placeholderEN);
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
		result.append(" (placeholderEL: ");
		result.append(placeholderEL);
		result.append(", placeholderEN: ");
		result.append(placeholderEN);
		result.append(')');
		return result.toString();
	}

} //PhrasesInputFormImpl
