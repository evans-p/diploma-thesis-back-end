/**
 */
package blockModelingMetamodel.impl;

import blockModelingMetamodel.ActionBlock;
import blockModelingMetamodel.BlockModelingMetamodelPackage;
import blockModelingMetamodel.Information;
import blockModelingMetamodel.InputBlock;
import blockModelingMetamodel.SettingsPopover;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link blockModelingMetamodel.impl.ActionBlockImpl#getBlockTitleEN <em>Block Title EN</em>}</li>
 *   <li>{@link blockModelingMetamodel.impl.ActionBlockImpl#getBlockTitleEL <em>Block Title EL</em>}</li>
 *   <li>{@link blockModelingMetamodel.impl.ActionBlockImpl#getBlockImage <em>Block Image</em>}</li>
 *   <li>{@link blockModelingMetamodel.impl.ActionBlockImpl#isHasPopover <em>Has Popover</em>}</li>
 *   <li>{@link blockModelingMetamodel.impl.ActionBlockImpl#getPopoverIcon <em>Popover Icon</em>}</li>
 *   <li>{@link blockModelingMetamodel.impl.ActionBlockImpl#getPopoverHelpTextEL <em>Popover Help Text EL</em>}</li>
 *   <li>{@link blockModelingMetamodel.impl.ActionBlockImpl#getPopoverHelpTextEN <em>Popover Help Text EN</em>}</li>
 *   <li>{@link blockModelingMetamodel.impl.ActionBlockImpl#getTitleBackroundColor <em>Title Backround Color</em>}</li>
 *   <li>{@link blockModelingMetamodel.impl.ActionBlockImpl#getHasInfo <em>Has Info</em>}</li>
 *   <li>{@link blockModelingMetamodel.impl.ActionBlockImpl#getHasInput <em>Has Input</em>}</li>
 *   <li>{@link blockModelingMetamodel.impl.ActionBlockImpl#getHasSettingsPopover <em>Has Settings Popover</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionBlockImpl extends BlockImpl implements ActionBlock {
	/**
	 * The default value of the '{@link #getBlockTitleEN() <em>Block Title EN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockTitleEN()
	 * @generated
	 * @ordered
	 */
	protected static final String BLOCK_TITLE_EN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlockTitleEN() <em>Block Title EN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockTitleEN()
	 * @generated
	 * @ordered
	 */
	protected String blockTitleEN = BLOCK_TITLE_EN_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlockTitleEL() <em>Block Title EL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockTitleEL()
	 * @generated
	 * @ordered
	 */
	protected static final String BLOCK_TITLE_EL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlockTitleEL() <em>Block Title EL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockTitleEL()
	 * @generated
	 * @ordered
	 */
	protected String blockTitleEL = BLOCK_TITLE_EL_EDEFAULT;

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
	 * The default value of the '{@link #isHasPopover() <em>Has Popover</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasPopover()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_POPOVER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasPopover() <em>Has Popover</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasPopover()
	 * @generated
	 * @ordered
	 */
	protected boolean hasPopover = HAS_POPOVER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPopoverIcon() <em>Popover Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopoverIcon()
	 * @generated
	 * @ordered
	 */
	protected static final String POPOVER_ICON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPopoverIcon() <em>Popover Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopoverIcon()
	 * @generated
	 * @ordered
	 */
	protected String popoverIcon = POPOVER_ICON_EDEFAULT;

	/**
	 * The default value of the '{@link #getPopoverHelpTextEL() <em>Popover Help Text EL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopoverHelpTextEL()
	 * @generated
	 * @ordered
	 */
	protected static final String POPOVER_HELP_TEXT_EL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPopoverHelpTextEL() <em>Popover Help Text EL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopoverHelpTextEL()
	 * @generated
	 * @ordered
	 */
	protected String popoverHelpTextEL = POPOVER_HELP_TEXT_EL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPopoverHelpTextEN() <em>Popover Help Text EN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopoverHelpTextEN()
	 * @generated
	 * @ordered
	 */
	protected static final String POPOVER_HELP_TEXT_EN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPopoverHelpTextEN() <em>Popover Help Text EN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopoverHelpTextEN()
	 * @generated
	 * @ordered
	 */
	protected String popoverHelpTextEN = POPOVER_HELP_TEXT_EN_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitleBackroundColor() <em>Title Backround Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleBackroundColor()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_BACKROUND_COLOR_EDEFAULT = "#975e11";

	/**
	 * The cached value of the '{@link #getTitleBackroundColor() <em>Title Backround Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleBackroundColor()
	 * @generated
	 * @ordered
	 */
	protected String titleBackroundColor = TITLE_BACKROUND_COLOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasInfo() <em>Has Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasInfo()
	 * @generated
	 * @ordered
	 */
	protected Information hasInfo;

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
	 * The cached value of the '{@link #getHasSettingsPopover() <em>Has Settings Popover</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasSettingsPopover()
	 * @generated
	 * @ordered
	 */
	protected SettingsPopover hasSettingsPopover;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockModelingMetamodelPackage.Literals.ACTION_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBlockTitleEN() {
		return blockTitleEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlockTitleEN(String newBlockTitleEN) {
		String oldBlockTitleEN = blockTitleEN;
		blockTitleEN = newBlockTitleEN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.ACTION_BLOCK__BLOCK_TITLE_EN, oldBlockTitleEN, blockTitleEN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBlockTitleEL() {
		return blockTitleEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlockTitleEL(String newBlockTitleEL) {
		String oldBlockTitleEL = blockTitleEL;
		blockTitleEL = newBlockTitleEL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.ACTION_BLOCK__BLOCK_TITLE_EL, oldBlockTitleEL, blockTitleEL));
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
					BlockModelingMetamodelPackage.ACTION_BLOCK__BLOCK_IMAGE, oldBlockImage, blockImage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasPopover() {
		return hasPopover;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasPopover(boolean newHasPopover) {
		boolean oldHasPopover = hasPopover;
		hasPopover = newHasPopover;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.ACTION_BLOCK__HAS_POPOVER, oldHasPopover, hasPopover));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPopoverIcon() {
		return popoverIcon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPopoverIcon(String newPopoverIcon) {
		String oldPopoverIcon = popoverIcon;
		popoverIcon = newPopoverIcon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.ACTION_BLOCK__POPOVER_ICON, oldPopoverIcon, popoverIcon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPopoverHelpTextEL() {
		return popoverHelpTextEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPopoverHelpTextEL(String newPopoverHelpTextEL) {
		String oldPopoverHelpTextEL = popoverHelpTextEL;
		popoverHelpTextEL = newPopoverHelpTextEL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.ACTION_BLOCK__POPOVER_HELP_TEXT_EL, oldPopoverHelpTextEL,
					popoverHelpTextEL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPopoverHelpTextEN() {
		return popoverHelpTextEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPopoverHelpTextEN(String newPopoverHelpTextEN) {
		String oldPopoverHelpTextEN = popoverHelpTextEN;
		popoverHelpTextEN = newPopoverHelpTextEN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.ACTION_BLOCK__POPOVER_HELP_TEXT_EN, oldPopoverHelpTextEN,
					popoverHelpTextEN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitleBackroundColor() {
		return titleBackroundColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitleBackroundColor(String newTitleBackroundColor) {
		String oldTitleBackroundColor = titleBackroundColor;
		titleBackroundColor = newTitleBackroundColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.ACTION_BLOCK__TITLE_BACKROUND_COLOR, oldTitleBackroundColor,
					titleBackroundColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Information getHasInfo() {
		return hasInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasInfo(Information newHasInfo, NotificationChain msgs) {
		Information oldHasInfo = hasInfo;
		hasInfo = newHasInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.ACTION_BLOCK__HAS_INFO, oldHasInfo, newHasInfo);
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
	public void setHasInfo(Information newHasInfo) {
		if (newHasInfo != hasInfo) {
			NotificationChain msgs = null;
			if (hasInfo != null)
				msgs = ((InternalEObject) hasInfo).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - BlockModelingMetamodelPackage.ACTION_BLOCK__HAS_INFO, null, msgs);
			if (newHasInfo != null)
				msgs = ((InternalEObject) newHasInfo).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BlockModelingMetamodelPackage.ACTION_BLOCK__HAS_INFO, null, msgs);
			msgs = basicSetHasInfo(newHasInfo, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockModelingMetamodelPackage.ACTION_BLOCK__HAS_INFO,
					newHasInfo, newHasInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputBlock> getHasInput() {
		if (hasInput == null) {
			hasInput = new EObjectContainmentEList<InputBlock>(InputBlock.class, this,
					BlockModelingMetamodelPackage.ACTION_BLOCK__HAS_INPUT);
		}
		return hasInput;
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
					BlockModelingMetamodelPackage.ACTION_BLOCK__HAS_SETTINGS_POPOVER, oldHasSettingsPopover,
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
						EOPPOSITE_FEATURE_BASE - BlockModelingMetamodelPackage.ACTION_BLOCK__HAS_SETTINGS_POPOVER, null,
						msgs);
			if (newHasSettingsPopover != null)
				msgs = ((InternalEObject) newHasSettingsPopover).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BlockModelingMetamodelPackage.ACTION_BLOCK__HAS_SETTINGS_POPOVER, null,
						msgs);
			msgs = basicSetHasSettingsPopover(newHasSettingsPopover, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BlockModelingMetamodelPackage.ACTION_BLOCK__HAS_SETTINGS_POPOVER, newHasSettingsPopover,
					newHasSettingsPopover));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BlockModelingMetamodelPackage.ACTION_BLOCK__HAS_INFO:
			return basicSetHasInfo(null, msgs);
		case BlockModelingMetamodelPackage.ACTION_BLOCK__HAS_INPUT:
			return ((InternalEList<?>) getHasInput()).basicRemove(otherEnd, msgs);
		case BlockModelingMetamodelPackage.ACTION_BLOCK__HAS_SETTINGS_POPOVER:
			return basicSetHasSettingsPopover(null, msgs);
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
		case BlockModelingMetamodelPackage.ACTION_BLOCK__BLOCK_TITLE_EN:
			return getBlockTitleEN();
		case BlockModelingMetamodelPackage.ACTION_BLOCK__BLOCK_TITLE_EL:
			return getBlockTitleEL();
		case BlockModelingMetamodelPackage.ACTION_BLOCK__BLOCK_IMAGE:
			return getBlockImage();
		case BlockModelingMetamodelPackage.ACTION_BLOCK__HAS_POPOVER:
			return isHasPopover();
		case BlockModelingMetamodelPackage.ACTION_BLOCK__POPOVER_ICON:
			return getPopoverIcon();
		case BlockModelingMetamodelPackage.ACTION_BLOCK__POPOVER_HELP_TEXT_EL:
			return getPopoverHelpTextEL();
		case BlockModelingMetamodelPackage.ACTION_BLOCK__POPOVER_HELP_TEXT_EN:
			return getPopoverHelpTextEN();
		case BlockModelingMetamodelPackage.ACTION_BLOCK__TITLE_BACKROUND_COLOR:
			return getTitleBackroundColor();
		case BlockModelingMetamodelPackage.ACTION_BLOCK__HAS_INFO:
			return getHasInfo();
		case BlockModelingMetamodelPackage.ACTION_BLOCK__HAS_INPUT:
			return getHasInput();
		case BlockModelingMetamodelPackage.ACTION_BLOCK__HAS_SETTINGS_POPOVER:
			return getHasSettingsPopover();
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
		case BlockModelingMetamodelPackage.ACTION_BLOCK__BLOCK_TITLE_EN:
			setBlockTitleEN((String) newValue);
			return;
		case BlockModelingMetamodelPackage.ACTION_BLOCK__BLOCK_TITLE_EL:
			setBlockTitleEL((String) newValue);
			return;
		case BlockModelingMetamodelPackage.ACTION_BLOCK__BLOCK_IMAGE:
			setBlockImage((String) newValue);
			return;
		case BlockModelingMetamodelPackage.ACTION_BLOCK__HAS_POPOVER:
			setHasPopover((Boolean) newValue);
			return;
		case BlockModelingMetamodelPackage.ACTION_BLOCK__POPOVER_ICON:
			setPopoverIcon((String) newValue);
			return;
		case BlockModelingMetamodelPackage.ACTION_BLOCK__POPOVER_HELP_TEXT_EL:
			setPopoverHelpTextEL((String) newValue);
			return;
		case BlockModelingMetamodelPackage.ACTION_BLOCK__POPOVER_HELP_TEXT_EN:
			setPopoverHelpTextEN((String) newValue);
			return;
		case BlockModelingMetamodelPackage.ACTION_BLOCK__TITLE_BACKROUND_COLOR:
			setTitleBackroundColor((String) newValue);
			return;
		case BlockModelingMetamodelPackage.ACTION_BLOCK__HAS_INFO:
			setHasInfo((Information) newValue);
			return;
		case BlockModelingMetamodelPackage.ACTION_BLOCK__HAS_INPUT:
			getHasInput().clear();
			getHasInput().addAll((Collection<? extends InputBlock>) newValue);
			return;
		case BlockModelingMetamodelPackage.ACTION_BLOCK__HAS_SETTINGS_POPOVER:
			setHasSettingsPopover((SettingsPopover) newValue);
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
		case BlockModelingMetamodelPackage.ACTION_BLOCK__BLOCK_TITLE_EN:
			setBlockTitleEN(BLOCK_TITLE_EN_EDEFAULT);
			return;
		case BlockModelingMetamodelPackage.ACTION_BLOCK__BLOCK_TITLE_EL:
			setBlockTitleEL(BLOCK_TITLE_EL_EDEFAULT);
			return;
		case BlockModelingMetamodelPackage.ACTION_BLOCK__BLOCK_IMAGE:
			setBlockImage(BLOCK_IMAGE_EDEFAULT);
			return;
		case BlockModelingMetamodelPackage.ACTION_BLOCK__HAS_POPOVER:
			setHasPopover(HAS_POPOVER_EDEFAULT);
			return;
		case BlockModelingMetamodelPackage.ACTION_BLOCK__POPOVER_ICON:
			setPopoverIcon(POPOVER_ICON_EDEFAULT);
			return;
		case BlockModelingMetamodelPackage.ACTION_BLOCK__POPOVER_HELP_TEXT_EL:
			setPopoverHelpTextEL(POPOVER_HELP_TEXT_EL_EDEFAULT);
			return;
		case BlockModelingMetamodelPackage.ACTION_BLOCK__POPOVER_HELP_TEXT_EN:
			setPopoverHelpTextEN(POPOVER_HELP_TEXT_EN_EDEFAULT);
			return;
		case BlockModelingMetamodelPackage.ACTION_BLOCK__TITLE_BACKROUND_COLOR:
			setTitleBackroundColor(TITLE_BACKROUND_COLOR_EDEFAULT);
			return;
		case BlockModelingMetamodelPackage.ACTION_BLOCK__HAS_INFO:
			setHasInfo((Information) null);
			return;
		case BlockModelingMetamodelPackage.ACTION_BLOCK__HAS_INPUT:
			getHasInput().clear();
			return;
		case BlockModelingMetamodelPackage.ACTION_BLOCK__HAS_SETTINGS_POPOVER:
			setHasSettingsPopover((SettingsPopover) null);
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
		case BlockModelingMetamodelPackage.ACTION_BLOCK__BLOCK_TITLE_EN:
			return BLOCK_TITLE_EN_EDEFAULT == null ? blockTitleEN != null
					: !BLOCK_TITLE_EN_EDEFAULT.equals(blockTitleEN);
		case BlockModelingMetamodelPackage.ACTION_BLOCK__BLOCK_TITLE_EL:
			return BLOCK_TITLE_EL_EDEFAULT == null ? blockTitleEL != null
					: !BLOCK_TITLE_EL_EDEFAULT.equals(blockTitleEL);
		case BlockModelingMetamodelPackage.ACTION_BLOCK__BLOCK_IMAGE:
			return BLOCK_IMAGE_EDEFAULT == null ? blockImage != null : !BLOCK_IMAGE_EDEFAULT.equals(blockImage);
		case BlockModelingMetamodelPackage.ACTION_BLOCK__HAS_POPOVER:
			return hasPopover != HAS_POPOVER_EDEFAULT;
		case BlockModelingMetamodelPackage.ACTION_BLOCK__POPOVER_ICON:
			return POPOVER_ICON_EDEFAULT == null ? popoverIcon != null : !POPOVER_ICON_EDEFAULT.equals(popoverIcon);
		case BlockModelingMetamodelPackage.ACTION_BLOCK__POPOVER_HELP_TEXT_EL:
			return POPOVER_HELP_TEXT_EL_EDEFAULT == null ? popoverHelpTextEL != null
					: !POPOVER_HELP_TEXT_EL_EDEFAULT.equals(popoverHelpTextEL);
		case BlockModelingMetamodelPackage.ACTION_BLOCK__POPOVER_HELP_TEXT_EN:
			return POPOVER_HELP_TEXT_EN_EDEFAULT == null ? popoverHelpTextEN != null
					: !POPOVER_HELP_TEXT_EN_EDEFAULT.equals(popoverHelpTextEN);
		case BlockModelingMetamodelPackage.ACTION_BLOCK__TITLE_BACKROUND_COLOR:
			return TITLE_BACKROUND_COLOR_EDEFAULT == null ? titleBackroundColor != null
					: !TITLE_BACKROUND_COLOR_EDEFAULT.equals(titleBackroundColor);
		case BlockModelingMetamodelPackage.ACTION_BLOCK__HAS_INFO:
			return hasInfo != null;
		case BlockModelingMetamodelPackage.ACTION_BLOCK__HAS_INPUT:
			return hasInput != null && !hasInput.isEmpty();
		case BlockModelingMetamodelPackage.ACTION_BLOCK__HAS_SETTINGS_POPOVER:
			return hasSettingsPopover != null;
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
		result.append(" (blockTitleEN: ");
		result.append(blockTitleEN);
		result.append(", blockTitleEL: ");
		result.append(blockTitleEL);
		result.append(", blockImage: ");
		result.append(blockImage);
		result.append(", hasPopover: ");
		result.append(hasPopover);
		result.append(", popoverIcon: ");
		result.append(popoverIcon);
		result.append(", popoverHelpTextEL: ");
		result.append(popoverHelpTextEL);
		result.append(", popoverHelpTextEN: ");
		result.append(popoverHelpTextEN);
		result.append(", titleBackroundColor: ");
		result.append(titleBackroundColor);
		result.append(')');
		return result.toString();
	}

} //ActionBlockImpl
