/**
 */
package blockModelingMetamodel.impl;

import blockModelingMetamodel.Block;
import blockModelingMetamodel.BlockApp;
import blockModelingMetamodel.BlockModelingMetamodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block App</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link blockModelingMetamodel.impl.BlockAppImpl#getHasBlock <em>Has Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlockAppImpl extends MinimalEObjectImpl.Container implements BlockApp {
	/**
	 * The cached value of the '{@link #getHasBlock() <em>Has Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasBlock()
	 * @generated
	 * @ordered
	 */
	protected Block hasBlock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockAppImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockModelingMetamodelPackage.Literals.BLOCK_APP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getHasBlock() {
		return hasBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasBlock(Block newHasBlock, NotificationChain msgs) {
		Block oldHasBlock = hasBlock;
		hasBlock = newHasBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.BLOCK_APP__HAS_BLOCK, oldHasBlock, newHasBlock);
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
	public void setHasBlock(Block newHasBlock) {
		if (newHasBlock != hasBlock) {
			NotificationChain msgs = null;
			if (hasBlock != null)
				msgs = ((InternalEObject) hasBlock).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - BlockModelingMetamodelPackage.BLOCK_APP__HAS_BLOCK, null, msgs);
			if (newHasBlock != null)
				msgs = ((InternalEObject) newHasBlock).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BlockModelingMetamodelPackage.BLOCK_APP__HAS_BLOCK, null, msgs);
			msgs = basicSetHasBlock(newHasBlock, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockModelingMetamodelPackage.BLOCK_APP__HAS_BLOCK,
					newHasBlock, newHasBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BlockModelingMetamodelPackage.BLOCK_APP__HAS_BLOCK:
			return basicSetHasBlock(null, msgs);
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
		case BlockModelingMetamodelPackage.BLOCK_APP__HAS_BLOCK:
			return getHasBlock();
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
		case BlockModelingMetamodelPackage.BLOCK_APP__HAS_BLOCK:
			setHasBlock((Block) newValue);
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
		case BlockModelingMetamodelPackage.BLOCK_APP__HAS_BLOCK:
			setHasBlock((Block) null);
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
		case BlockModelingMetamodelPackage.BLOCK_APP__HAS_BLOCK:
			return hasBlock != null;
		}
		return super.eIsSet(featureID);
	}

} //BlockAppImpl
