/**
 */
package blockModelingMetamodel.impl;

import blockModelingMetamodel.BlockModelingMetamodelPackage;
import blockModelingMetamodel.Form;
import blockModelingMetamodel.SettingsPopover;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Settings Popover</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link blockModelingMetamodel.impl.SettingsPopoverImpl#getHasForm <em>Has Form</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SettingsPopoverImpl extends PopoverImpl implements SettingsPopover {
	/**
	 * The cached value of the '{@link #getHasForm() <em>Has Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasForm()
	 * @generated
	 * @ordered
	 */
	protected Form hasForm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SettingsPopoverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockModelingMetamodelPackage.Literals.SETTINGS_POPOVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Form getHasForm() {
		return hasForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasForm(Form newHasForm, NotificationChain msgs) {
		Form oldHasForm = hasForm;
		hasForm = newHasForm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.SETTINGS_POPOVER__HAS_FORM, oldHasForm, newHasForm);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasForm(Form newHasForm) {
		if (newHasForm != hasForm) {
			NotificationChain msgs = null;
			if (hasForm != null)
				msgs = ((InternalEObject) hasForm).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - BlockModelingMetamodelPackage.SETTINGS_POPOVER__HAS_FORM, null, msgs);
			if (newHasForm != null)
				msgs = ((InternalEObject) newHasForm).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BlockModelingMetamodelPackage.SETTINGS_POPOVER__HAS_FORM, null, msgs);
			msgs = basicSetHasForm(newHasForm, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.SETTINGS_POPOVER__HAS_FORM, newHasForm, newHasForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BlockModelingMetamodelPackage.SETTINGS_POPOVER__HAS_FORM:
			return basicSetHasForm(null, msgs);
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
		case BlockModelingMetamodelPackage.SETTINGS_POPOVER__HAS_FORM:
			return getHasForm();
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
		case BlockModelingMetamodelPackage.SETTINGS_POPOVER__HAS_FORM:
			setHasForm((Form) newValue);
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
		case BlockModelingMetamodelPackage.SETTINGS_POPOVER__HAS_FORM:
			setHasForm((Form) null);
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
		case BlockModelingMetamodelPackage.SETTINGS_POPOVER__HAS_FORM:
			return hasForm != null;
		}
		return super.eIsSet(featureID);
	}

} //SettingsPopoverImpl
