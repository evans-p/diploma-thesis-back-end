/**
 */
package blockModelingMetamodel.impl;

import blockModelingMetamodel.BlockModelingMetamodelPackage;
import blockModelingMetamodel.ConfigurationPopover;
import blockModelingMetamodel.InputBlock;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Popover</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link blockModelingMetamodel.impl.ConfigurationPopoverImpl#getHasInput <em>Has Input</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationPopoverImpl extends PopoverImpl implements ConfigurationPopover {
	/**
	 * The cached value of the '{@link #getHasInput() <em>Has Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasInput()
	 * @generated
	 * @ordered
	 */
	protected EList<InputBlock> hasInput;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationPopoverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockModelingMetamodelPackage.Literals.CONFIGURATION_POPOVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputBlock> getHasInput() {
		if (hasInput == null) {
			hasInput = new EObjectContainmentEList<InputBlock>(InputBlock.class, this,
					BlockModelingMetamodelPackage.CONFIGURATION_POPOVER__HAS_INPUT);
		}
		return hasInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BlockModelingMetamodelPackage.CONFIGURATION_POPOVER__HAS_INPUT:
			return ((InternalEList<?>) getHasInput()).basicRemove(otherEnd, msgs);
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
		case BlockModelingMetamodelPackage.CONFIGURATION_POPOVER__HAS_INPUT:
			return getHasInput();
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
		case BlockModelingMetamodelPackage.CONFIGURATION_POPOVER__HAS_INPUT:
			getHasInput().clear();
			getHasInput().addAll((Collection<? extends InputBlock>) newValue);
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
		case BlockModelingMetamodelPackage.CONFIGURATION_POPOVER__HAS_INPUT:
			getHasInput().clear();
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
		case BlockModelingMetamodelPackage.CONFIGURATION_POPOVER__HAS_INPUT:
			return hasInput != null && !hasInput.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationPopoverImpl
