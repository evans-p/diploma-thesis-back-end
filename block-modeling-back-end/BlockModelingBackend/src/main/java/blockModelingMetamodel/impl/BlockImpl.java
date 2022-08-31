/**
 */
package blockModelingMetamodel.impl;

import blockModelingMetamodel.Block;
import blockModelingMetamodel.BlockModelingMetamodelPackage;

import blockModelingMetamodel.Category;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link blockModelingMetamodel.impl.BlockImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link blockModelingMetamodel.impl.BlockImpl#getBackroundColor <em>Backround Color</em>}</li>
 *   <li>{@link blockModelingMetamodel.impl.BlockImpl#getBlockNameEL <em>Block Name EL</em>}</li>
 *   <li>{@link blockModelingMetamodel.impl.BlockImpl#getBlockNameEN <em>Block Name EN</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BlockImpl extends MinimalEObjectImpl.Container implements Block {
	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final Category CATEGORY_EDEFAULT = Category.MOVEMENT;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected Category category = CATEGORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackroundColor() <em>Backround Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackroundColor()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKROUND_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackroundColor() <em>Backround Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackroundColor()
	 * @generated
	 * @ordered
	 */
	protected String backroundColor = BACKROUND_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlockNameEL() <em>Block Name EL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockNameEL()
	 * @generated
	 * @ordered
	 */
	protected static final String BLOCK_NAME_EL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlockNameEL() <em>Block Name EL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockNameEL()
	 * @generated
	 * @ordered
	 */
	protected String blockNameEL = BLOCK_NAME_EL_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlockNameEN() <em>Block Name EN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockNameEN()
	 * @generated
	 * @ordered
	 */
	protected static final String BLOCK_NAME_EN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlockNameEN() <em>Block Name EN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockNameEN()
	 * @generated
	 * @ordered
	 */
	protected String blockNameEN = BLOCK_NAME_EN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockModelingMetamodelPackage.Literals.BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(Category newCategory) {
		Category oldCategory = category;
		category = newCategory == null ? CATEGORY_EDEFAULT : newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockModelingMetamodelPackage.BLOCK__CATEGORY,
					oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBackroundColor() {
		return backroundColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackroundColor(String newBackroundColor) {
		String oldBackroundColor = backroundColor;
		backroundColor = newBackroundColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockModelingMetamodelPackage.BLOCK__BACKROUND_COLOR,
					oldBackroundColor, backroundColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBlockNameEL() {
		return blockNameEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlockNameEL(String newBlockNameEL) {
		String oldBlockNameEL = blockNameEL;
		blockNameEL = newBlockNameEL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockModelingMetamodelPackage.BLOCK__BLOCK_NAME_EL,
					oldBlockNameEL, blockNameEL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBlockNameEN() {
		return blockNameEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlockNameEN(String newBlockNameEN) {
		String oldBlockNameEN = blockNameEN;
		blockNameEN = newBlockNameEN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockModelingMetamodelPackage.BLOCK__BLOCK_NAME_EN,
					oldBlockNameEN, blockNameEN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BlockModelingMetamodelPackage.BLOCK__CATEGORY:
			return getCategory();
		case BlockModelingMetamodelPackage.BLOCK__BACKROUND_COLOR:
			return getBackroundColor();
		case BlockModelingMetamodelPackage.BLOCK__BLOCK_NAME_EL:
			return getBlockNameEL();
		case BlockModelingMetamodelPackage.BLOCK__BLOCK_NAME_EN:
			return getBlockNameEN();
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
		case BlockModelingMetamodelPackage.BLOCK__CATEGORY:
			setCategory((Category) newValue);
			return;
		case BlockModelingMetamodelPackage.BLOCK__BACKROUND_COLOR:
			setBackroundColor((String) newValue);
			return;
		case BlockModelingMetamodelPackage.BLOCK__BLOCK_NAME_EL:
			setBlockNameEL((String) newValue);
			return;
		case BlockModelingMetamodelPackage.BLOCK__BLOCK_NAME_EN:
			setBlockNameEN((String) newValue);
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
		case BlockModelingMetamodelPackage.BLOCK__CATEGORY:
			setCategory(CATEGORY_EDEFAULT);
			return;
		case BlockModelingMetamodelPackage.BLOCK__BACKROUND_COLOR:
			setBackroundColor(BACKROUND_COLOR_EDEFAULT);
			return;
		case BlockModelingMetamodelPackage.BLOCK__BLOCK_NAME_EL:
			setBlockNameEL(BLOCK_NAME_EL_EDEFAULT);
			return;
		case BlockModelingMetamodelPackage.BLOCK__BLOCK_NAME_EN:
			setBlockNameEN(BLOCK_NAME_EN_EDEFAULT);
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
		case BlockModelingMetamodelPackage.BLOCK__CATEGORY:
			return category != CATEGORY_EDEFAULT;
		case BlockModelingMetamodelPackage.BLOCK__BACKROUND_COLOR:
			return BACKROUND_COLOR_EDEFAULT == null ? backroundColor != null
					: !BACKROUND_COLOR_EDEFAULT.equals(backroundColor);
		case BlockModelingMetamodelPackage.BLOCK__BLOCK_NAME_EL:
			return BLOCK_NAME_EL_EDEFAULT == null ? blockNameEL != null : !BLOCK_NAME_EL_EDEFAULT.equals(blockNameEL);
		case BlockModelingMetamodelPackage.BLOCK__BLOCK_NAME_EN:
			return BLOCK_NAME_EN_EDEFAULT == null ? blockNameEN != null : !BLOCK_NAME_EN_EDEFAULT.equals(blockNameEN);
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
		result.append(" (category: ");
		result.append(category);
		result.append(", backroundColor: ");
		result.append(backroundColor);
		result.append(", blockNameEL: ");
		result.append(blockNameEL);
		result.append(", blockNameEN: ");
		result.append(blockNameEN);
		result.append(')');
		return result.toString();
	}

} //BlockImpl
