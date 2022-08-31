/**
 */
package blockModelingMetamodel.provider;

import blockModelingMetamodel.BlockModelingMetamodelFactory;
import blockModelingMetamodel.BlockModelingMetamodelPackage;
import blockModelingMetamodel.ReferenceBlock;

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
 * This is the item provider adapter for a {@link blockModelingMetamodel.ReferenceBlock} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ReferenceBlockItemProvider extends BlockItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceBlockItemProvider(AdapterFactory adapterFactory) {
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

			addBlockTitleELPropertyDescriptor(object);
			addBlockTitleENPropertyDescriptor(object);
			addBlockImagePropertyDescriptor(object);
			addImageBackroundShapePropertyDescriptor(object);
			addHasNextBlockPropertyDescriptor(object);
			addImageCursorPropertyDescriptor(object);
			addImageBackroundShapeColorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Block Title EL feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBlockTitleELPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ReferenceBlock_blockTitleEL_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ReferenceBlock_blockTitleEL_feature",
								"_UI_ReferenceBlock_type"),
						BlockModelingMetamodelPackage.Literals.REFERENCE_BLOCK__BLOCK_TITLE_EL, false, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Block Title EN feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBlockTitleENPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ReferenceBlock_blockTitleEN_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ReferenceBlock_blockTitleEN_feature",
								"_UI_ReferenceBlock_type"),
						BlockModelingMetamodelPackage.Literals.REFERENCE_BLOCK__BLOCK_TITLE_EN, false, false, false,
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
				getString("_UI_ReferenceBlock_blockImage_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ReferenceBlock_blockImage_feature",
						"_UI_ReferenceBlock_type"),
				BlockModelingMetamodelPackage.Literals.REFERENCE_BLOCK__BLOCK_IMAGE, false, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Image Backround Shape feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImageBackroundShapePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ReferenceBlock_imageBackroundShape_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_ReferenceBlock_imageBackroundShape_feature", "_UI_ReferenceBlock_type"),
						BlockModelingMetamodelPackage.Literals.REFERENCE_BLOCK__IMAGE_BACKROUND_SHAPE, false, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Has Next Block feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHasNextBlockPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ReferenceBlock_hasNextBlock_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ReferenceBlock_hasNextBlock_feature",
								"_UI_ReferenceBlock_type"),
						BlockModelingMetamodelPackage.Literals.REFERENCE_BLOCK__HAS_NEXT_BLOCK, false, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Image Cursor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImageCursorPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ReferenceBlock_imageCursor_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ReferenceBlock_imageCursor_feature",
								"_UI_ReferenceBlock_type"),
						BlockModelingMetamodelPackage.Literals.REFERENCE_BLOCK__IMAGE_CURSOR, false, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Image Backround Shape Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImageBackroundShapeColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ReferenceBlock_imageBackroundShapeColor_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_ReferenceBlock_imageBackroundShapeColor_feature", "_UI_ReferenceBlock_type"),
						BlockModelingMetamodelPackage.Literals.REFERENCE_BLOCK__IMAGE_BACKROUND_SHAPE_COLOR, false,
						false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(BlockModelingMetamodelPackage.Literals.REFERENCE_BLOCK__HAS_INFO);
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
	 * This returns ReferenceBlock.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ReferenceBlock"));
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
		String label = ((ReferenceBlock) object).getBlockNameEL();
		return label == null || label.length() == 0 ? getString("_UI_ReferenceBlock_type")
				: getString("_UI_ReferenceBlock_type") + " " + label;
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

		switch (notification.getFeatureID(ReferenceBlock.class)) {
		case BlockModelingMetamodelPackage.REFERENCE_BLOCK__BLOCK_TITLE_EL:
		case BlockModelingMetamodelPackage.REFERENCE_BLOCK__BLOCK_TITLE_EN:
		case BlockModelingMetamodelPackage.REFERENCE_BLOCK__BLOCK_IMAGE:
		case BlockModelingMetamodelPackage.REFERENCE_BLOCK__IMAGE_BACKROUND_SHAPE:
		case BlockModelingMetamodelPackage.REFERENCE_BLOCK__HAS_NEXT_BLOCK:
		case BlockModelingMetamodelPackage.REFERENCE_BLOCK__IMAGE_CURSOR:
		case BlockModelingMetamodelPackage.REFERENCE_BLOCK__IMAGE_BACKROUND_SHAPE_COLOR:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case BlockModelingMetamodelPackage.REFERENCE_BLOCK__HAS_INFO:
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

		newChildDescriptors.add(createChildParameter(BlockModelingMetamodelPackage.Literals.REFERENCE_BLOCK__HAS_INFO,
				BlockModelingMetamodelFactory.eINSTANCE.createInformation()));
	}

}
