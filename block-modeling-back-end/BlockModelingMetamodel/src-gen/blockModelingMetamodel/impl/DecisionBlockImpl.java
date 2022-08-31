/**
 */
package blockModelingMetamodel.impl;

import blockModelingMetamodel.BlockModelingMetamodelPackage;
import blockModelingMetamodel.ConfigurationPopover;
import blockModelingMetamodel.Cursor;
import blockModelingMetamodel.DecisionBlock;
import blockModelingMetamodel.SettingsPopover;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link blockModelingMetamodel.impl.DecisionBlockImpl#getBlockImage <em>Block Image</em>}</li>
 *   <li>{@link blockModelingMetamodel.impl.DecisionBlockImpl#getNumberOfColumns <em>Number Of Columns</em>}</li>
 *   <li>{@link blockModelingMetamodel.impl.DecisionBlockImpl#getBlockImageCursor <em>Block Image Cursor</em>}</li>
 *   <li>{@link blockModelingMetamodel.impl.DecisionBlockImpl#getHasSettingsPopover <em>Has Settings Popover</em>}</li>
 *   <li>{@link blockModelingMetamodel.impl.DecisionBlockImpl#getHasConfigurationPopover <em>Has Configuration Popover</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DecisionBlockImpl extends BlockImpl implements DecisionBlock {
	/**
	 * The default value of the '{@link #getBlockImage() <em>Block Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockImage()
	 * @generated
	 * @ordered
	 */
	protected static final String BLOCK_IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlockImage() <em>Block Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockImage()
	 * @generated
	 * @ordered
	 */
	protected String blockImage = BLOCK_IMAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfColumns() <em>Number Of Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfColumns()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_COLUMNS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfColumns() <em>Number Of Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfColumns()
	 * @generated
	 * @ordered
	 */
	protected int numberOfColumns = NUMBER_OF_COLUMNS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlockImageCursor() <em>Block Image Cursor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockImageCursor()
	 * @generated
	 * @ordered
	 */
	protected static final Cursor BLOCK_IMAGE_CURSOR_EDEFAULT = Cursor.DEFAULT;

	/**
	 * The cached value of the '{@link #getBlockImageCursor() <em>Block Image Cursor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockImageCursor()
	 * @generated
	 * @ordered
	 */
	protected Cursor blockImageCursor = BLOCK_IMAGE_CURSOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasSettingsPopover() <em>Has Settings Popover</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasSettingsPopover()
	 * @generated
	 * @ordered
	 */
	protected SettingsPopover hasSettingsPopover;

	/**
	 * The cached value of the '{@link #getHasConfigurationPopover() <em>Has Configuration Popover</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasConfigurationPopover()
	 * @generated
	 * @ordered
	 */
	protected ConfigurationPopover hasConfigurationPopover;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockModelingMetamodelPackage.Literals.DECISION_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBlockImage() {
		return blockImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlockImage(String newBlockImage) {
		String oldBlockImage = blockImage;
		blockImage = newBlockImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.DECISION_BLOCK__BLOCK_IMAGE, oldBlockImage, blockImage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfColumns() {
		return numberOfColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfColumns(int newNumberOfColumns) {
		int oldNumberOfColumns = numberOfColumns;
		numberOfColumns = newNumberOfColumns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.DECISION_BLOCK__NUMBER_OF_COLUMNS, oldNumberOfColumns,
					numberOfColumns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cursor getBlockImageCursor() {
		return blockImageCursor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlockImageCursor(Cursor newBlockImageCursor) {
		Cursor oldBlockImageCursor = blockImageCursor;
		blockImageCursor = newBlockImageCursor == null ? BLOCK_IMAGE_CURSOR_EDEFAULT : newBlockImageCursor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.DECISION_BLOCK__BLOCK_IMAGE_CURSOR, oldBlockImageCursor,
					blockImageCursor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SettingsPopover getHasSettingsPopover() {
		return hasSettingsPopover;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasSettingsPopover(SettingsPopover newHasSettingsPopover, NotificationChain msgs) {
		SettingsPopover oldHasSettingsPopover = hasSettingsPopover;
		hasSettingsPopover = newHasSettingsPopover;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.DECISION_BLOCK__HAS_SETTINGS_POPOVER, oldHasSettingsPopover,
					newHasSettingsPopover);
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
	public void setHasSettingsPopover(SettingsPopover newHasSettingsPopover) {
		if (newHasSettingsPopover != hasSettingsPopover) {
			NotificationChain msgs = null;
			if (hasSettingsPopover != null)
				msgs = ((InternalEObject) hasSettingsPopover).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - BlockModelingMetamodelPackage.DECISION_BLOCK__HAS_SETTINGS_POPOVER,
						null, msgs);
			if (newHasSettingsPopover != null)
				msgs = ((InternalEObject) newHasSettingsPopover).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BlockModelingMetamodelPackage.DECISION_BLOCK__HAS_SETTINGS_POPOVER,
						null, msgs);
			msgs = basicSetHasSettingsPopover(newHasSettingsPopover, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.DECISION_BLOCK__HAS_SETTINGS_POPOVER, newHasSettingsPopover,
					newHasSettingsPopover));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationPopover getHasConfigurationPopover() {
		return hasConfigurationPopover;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasConfigurationPopover(ConfigurationPopover newHasConfigurationPopover,
			NotificationChain msgs) {
		ConfigurationPopover oldHasConfigurationPopover = hasConfigurationPopover;
		hasConfigurationPopover = newHasConfigurationPopover;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.DECISION_BLOCK__HAS_CONFIGURATION_POPOVER, oldHasConfigurationPopover,
					newHasConfigurationPopover);
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
	public void setHasConfigurationPopover(ConfigurationPopover newHasConfigurationPopover) {
		if (newHasConfigurationPopover != hasConfigurationPopover) {
			NotificationChain msgs = null;
			if (hasConfigurationPopover != null)
				msgs = ((InternalEObject) hasConfigurationPopover).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- BlockModelingMetamodelPackage.DECISION_BLOCK__HAS_CONFIGURATION_POPOVER, null, msgs);
			if (newHasConfigurationPopover != null)
				msgs = ((InternalEObject) newHasConfigurationPopover).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- BlockModelingMetamodelPackage.DECISION_BLOCK__HAS_CONFIGURATION_POPOVER, null, msgs);
			msgs = basicSetHasConfigurationPopover(newHasConfigurationPopover, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.DECISION_BLOCK__HAS_CONFIGURATION_POPOVER, newHasConfigurationPopover,
					newHasConfigurationPopover));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BlockModelingMetamodelPackage.DECISION_BLOCK__HAS_SETTINGS_POPOVER:
			return basicSetHasSettingsPopover(null, msgs);
		case BlockModelingMetamodelPackage.DECISION_BLOCK__HAS_CONFIGURATION_POPOVER:
			return basicSetHasConfigurationPopover(null, msgs);
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
		case BlockModelingMetamodelPackage.DECISION_BLOCK__BLOCK_IMAGE:
			return getBlockImage();
		case BlockModelingMetamodelPackage.DECISION_BLOCK__NUMBER_OF_COLUMNS:
			return getNumberOfColumns();
		case BlockModelingMetamodelPackage.DECISION_BLOCK__BLOCK_IMAGE_CURSOR:
			return getBlockImageCursor();
		case BlockModelingMetamodelPackage.DECISION_BLOCK__HAS_SETTINGS_POPOVER:
			return getHasSettingsPopover();
		case BlockModelingMetamodelPackage.DECISION_BLOCK__HAS_CONFIGURATION_POPOVER:
			return getHasConfigurationPopover();
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
		case BlockModelingMetamodelPackage.DECISION_BLOCK__BLOCK_IMAGE:
			setBlockImage((String) newValue);
			return;
		case BlockModelingMetamodelPackage.DECISION_BLOCK__NUMBER_OF_COLUMNS:
			setNumberOfColumns((Integer) newValue);
			return;
		case BlockModelingMetamodelPackage.DECISION_BLOCK__BLOCK_IMAGE_CURSOR:
			setBlockImageCursor((Cursor) newValue);
			return;
		case BlockModelingMetamodelPackage.DECISION_BLOCK__HAS_SETTINGS_POPOVER:
			setHasSettingsPopover((SettingsPopover) newValue);
			return;
		case BlockModelingMetamodelPackage.DECISION_BLOCK__HAS_CONFIGURATION_POPOVER:
			setHasConfigurationPopover((ConfigurationPopover) newValue);
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
		case BlockModelingMetamodelPackage.DECISION_BLOCK__BLOCK_IMAGE:
			setBlockImage(BLOCK_IMAGE_EDEFAULT);
			return;
		case BlockModelingMetamodelPackage.DECISION_BLOCK__NUMBER_OF_COLUMNS:
			setNumberOfColumns(NUMBER_OF_COLUMNS_EDEFAULT);
			return;
		case BlockModelingMetamodelPackage.DECISION_BLOCK__BLOCK_IMAGE_CURSOR:
			setBlockImageCursor(BLOCK_IMAGE_CURSOR_EDEFAULT);
			return;
		case BlockModelingMetamodelPackage.DECISION_BLOCK__HAS_SETTINGS_POPOVER:
			setHasSettingsPopover((SettingsPopover) null);
			return;
		case BlockModelingMetamodelPackage.DECISION_BLOCK__HAS_CONFIGURATION_POPOVER:
			setHasConfigurationPopover((ConfigurationPopover) null);
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
		case BlockModelingMetamodelPackage.DECISION_BLOCK__BLOCK_IMAGE:
			return BLOCK_IMAGE_EDEFAULT == null ? blockImage != null : !BLOCK_IMAGE_EDEFAULT.equals(blockImage);
		case BlockModelingMetamodelPackage.DECISION_BLOCK__NUMBER_OF_COLUMNS:
			return numberOfColumns != NUMBER_OF_COLUMNS_EDEFAULT;
		case BlockModelingMetamodelPackage.DECISION_BLOCK__BLOCK_IMAGE_CURSOR:
			return blockImageCursor != BLOCK_IMAGE_CURSOR_EDEFAULT;
		case BlockModelingMetamodelPackage.DECISION_BLOCK__HAS_SETTINGS_POPOVER:
			return hasSettingsPopover != null;
		case BlockModelingMetamodelPackage.DECISION_BLOCK__HAS_CONFIGURATION_POPOVER:
			return hasConfigurationPopover != null;
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
		result.append(" (blockImage: ");
		result.append(blockImage);
		result.append(", numberOfColumns: ");
		result.append(numberOfColumns);
		result.append(", blockImageCursor: ");
		result.append(blockImageCursor);
		result.append(')');
		return result.toString();
	}

} //DecisionBlockImpl
