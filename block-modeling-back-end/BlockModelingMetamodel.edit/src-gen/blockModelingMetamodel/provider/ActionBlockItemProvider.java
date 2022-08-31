/**
 */
package blockModelingMetamodel.provider;

import blockModelingMetamodel.ActionBlock;
import blockModelingMetamodel.BlockModelingMetamodelFactory;
import blockModelingMetamodel.BlockModelingMetamodelPackage;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link blockModelingMetamodel.ActionBlock} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActionBlockItemProvider extends BlockItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionBlockItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addBlockTitleENPropertyDescriptor(object);
			addBlockTitleELPropertyDescriptor(object);
			addBlockImagePropertyDescriptor(object);
			addHasPopoverPropertyDescriptor(object);
			addPopoverIconPropertyDescriptor(object);
			addPopoverHelpTextELPropertyDescriptor(object);
			addPopoverHelpTextENPropertyDescriptor(object);
			addTitleBackroundColorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Block Title EN feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBlockTitleENPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ActionBlock_blockTitleEN_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ActionBlock_blockTitleEN_feature",
						"_UI_ActionBlock_type"),
				BlockModelingMetamodelPackage.Literals.ACTION_BLOCK__BLOCK_TITLE_EN, false, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Block Title EL feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBlockTitleELPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ActionBlock_blockTitleEL_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ActionBlock_blockTitleEL_feature",
						"_UI_ActionBlock_type"),
				BlockModelingMetamodelPackage.Literals.ACTION_BLOCK__BLOCK_TITLE_EL, false, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Block Image feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBlockImagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ActionBlock_blockImage_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ActionBlock_blockImage_feature",
						"_UI_ActionBlock_type"),
				BlockModelingMetamodelPackage.Literals.ACTION_BLOCK__BLOCK_IMAGE, false, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Has Popover feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasPopoverPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ActionBlock_hasPopover_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ActionBlock_hasPopover_feature",
						"_UI_ActionBlock_type"),
				BlockModelingMetamodelPackage.Literals.ACTION_BLOCK__HAS_POPOVER, false, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Popover Icon feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPopoverIconPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ActionBlock_popoverIcon_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ActionBlock_popoverIcon_feature",
						"_UI_ActionBlock_type"),
				BlockModelingMetamodelPackage.Literals.ACTION_BLOCK__POPOVER_ICON, false, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Popover Help Text EL feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPopoverHelpTextELPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ActionBlock_popoverHelpTextEL_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ActionBlock_popoverHelpTextEL_feature",
								"_UI_ActionBlock_type"),
						BlockModelingMetamodelPackage.Literals.ACTION_BLOCK__POPOVER_HELP_TEXT_EL, false, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Popover Help Text EN feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPopoverHelpTextENPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ActionBlock_popoverHelpTextEN_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ActionBlock_popoverHelpTextEN_feature",
								"_UI_ActionBlock_type"),
						BlockModelingMetamodelPackage.Literals.ACTION_BLOCK__POPOVER_HELP_TEXT_EN, false, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Title Backround Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitleBackroundColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ActionBlock_titleBackroundColor_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ActionBlock_titleBackroundColor_feature",
								"_UI_ActionBlock_type"),
						BlockModelingMetamodelPackage.Literals.ACTION_BLOCK__TITLE_BACKROUND_COLOR, false, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(BlockModelingMetamodelPackage.Literals.ACTION_BLOCK__HAS_INFO);
			childrenFeatures.add(BlockModelingMetamodelPackage.Literals.ACTION_BLOCK__HAS_INPUT);
			childrenFeatures.add(BlockModelingMetamodelPackage.Literals.ACTION_BLOCK__HAS_SETTINGS_POPOVER);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ActionBlock.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ActionBlock"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ActionBlock) object).getBlockNameEL();
		return label == null || label.length() == 0 ? getString("_UI_ActionBlock_type")
				: getString("_UI_ActionBlock_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ActionBlock.class)) {
		case BlockModelingMetamodelPackage.ACTION_BLOCK__BLOCK_TITLE_EN:
		case BlockModelingMetamodelPackage.ACTION_BLOCK__BLOCK_TITLE_EL:
		case BlockModelingMetamodelPackage.ACTION_BLOCK__BLOCK_IMAGE:
		case BlockModelingMetamodelPackage.ACTION_BLOCK__HAS_POPOVER:
		case BlockModelingMetamodelPackage.ACTION_BLOCK__POPOVER_ICON:
		case BlockModelingMetamodelPackage.ACTION_BLOCK__POPOVER_HELP_TEXT_EL:
		case BlockModelingMetamodelPackage.ACTION_BLOCK__POPOVER_HELP_TEXT_EN:
		case BlockModelingMetamodelPackage.ACTION_BLOCK__TITLE_BACKROUND_COLOR:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case BlockModelingMetamodelPackage.ACTION_BLOCK__HAS_INFO:
		case BlockModelingMetamodelPackage.ACTION_BLOCK__HAS_INPUT:
		case BlockModelingMetamodelPackage.ACTION_BLOCK__HAS_SETTINGS_POPOVER:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(BlockModelingMetamodelPackage.Literals.ACTION_BLOCK__HAS_INFO,
				BlockModelingMetamodelFactory.eINSTANCE.createInformation()));

		newChildDescriptors.add(createChildParameter(BlockModelingMetamodelPackage.Literals.ACTION_BLOCK__HAS_INPUT,
				BlockModelingMetamodelFactory.eINSTANCE.createSelectInputBlock()));

		newChildDescriptors.add(createChildParameter(BlockModelingMetamodelPackage.Literals.ACTION_BLOCK__HAS_INPUT,
				BlockModelingMetamodelFactory.eINSTANCE.createTextInputBlock()));

		newChildDescriptors.add(createChildParameter(BlockModelingMetamodelPackage.Literals.ACTION_BLOCK__HAS_INPUT,
				BlockModelingMetamodelFactory.eINSTANCE.createIntegerInputBlock()));

		newChildDescriptors.add(createChildParameter(BlockModelingMetamodelPackage.Literals.ACTION_BLOCK__HAS_INPUT,
				BlockModelingMetamodelFactory.eINSTANCE.createFloatInputBlock()));

		newChildDescriptors
				.add(createChildParameter(BlockModelingMetamodelPackage.Literals.ACTION_BLOCK__HAS_SETTINGS_POPOVER,
						BlockModelingMetamodelFactory.eINSTANCE.createSettingsPopover()));
	}

}
