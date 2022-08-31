/**
 */
package blockModelingMetamodel.provider;

import blockModelingMetamodel.BlockModelingMetamodelPackage;
import blockModelingMetamodel.IntegerInputBlock;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link blockModelingMetamodel.IntegerInputBlock} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IntegerInputBlockItemProvider extends InputBlockItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerInputBlockItemProvider(AdapterFactory adapterFactory) {
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

			addNoMinValuePropertyDescriptor(object);
			addNoMaxValuePropertyDescriptor(object);
			addNoDefaultValuePropertyDescriptor(object);
			addDefaultValuePropertyDescriptor(object);
			addMaxValuePropertyDescriptor(object);
			addMinValuePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the No Min Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNoMinValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_IntegerInputBlock_noMinValue_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_IntegerInputBlock_noMinValue_feature",
								"_UI_IntegerInputBlock_type"),
						BlockModelingMetamodelPackage.Literals.INTEGER_INPUT_BLOCK__NO_MIN_VALUE, false, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the No Max Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNoMaxValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_IntegerInputBlock_noMaxValue_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_IntegerInputBlock_noMaxValue_feature",
								"_UI_IntegerInputBlock_type"),
						BlockModelingMetamodelPackage.Literals.INTEGER_INPUT_BLOCK__NO_MAX_VALUE, false, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the No Default Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNoDefaultValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_IntegerInputBlock_noDefaultValue_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_IntegerInputBlock_noDefaultValue_feature",
								"_UI_IntegerInputBlock_type"),
						BlockModelingMetamodelPackage.Literals.INTEGER_INPUT_BLOCK__NO_DEFAULT_VALUE, false, false,
						false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Default Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_IntegerInputBlock_defaultValue_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_IntegerInputBlock_defaultValue_feature",
								"_UI_IntegerInputBlock_type"),
						BlockModelingMetamodelPackage.Literals.INTEGER_INPUT_BLOCK__DEFAULT_VALUE, false, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Max Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_IntegerInputBlock_maxValue_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_IntegerInputBlock_maxValue_feature",
								"_UI_IntegerInputBlock_type"),
						BlockModelingMetamodelPackage.Literals.INTEGER_INPUT_BLOCK__MAX_VALUE, false, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Min Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_IntegerInputBlock_minValue_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_IntegerInputBlock_minValue_feature",
								"_UI_IntegerInputBlock_type"),
						BlockModelingMetamodelPackage.Literals.INTEGER_INPUT_BLOCK__MIN_VALUE, false, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns IntegerInputBlock.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IntegerInputBlock"));
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
		String label = ((IntegerInputBlock) object).getVariableName();
		return label == null || label.length() == 0 ? getString("_UI_IntegerInputBlock_type")
				: getString("_UI_IntegerInputBlock_type") + " " + label;
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

		switch (notification.getFeatureID(IntegerInputBlock.class)) {
		case BlockModelingMetamodelPackage.INTEGER_INPUT_BLOCK__NO_MIN_VALUE:
		case BlockModelingMetamodelPackage.INTEGER_INPUT_BLOCK__NO_MAX_VALUE:
		case BlockModelingMetamodelPackage.INTEGER_INPUT_BLOCK__NO_DEFAULT_VALUE:
		case BlockModelingMetamodelPackage.INTEGER_INPUT_BLOCK__DEFAULT_VALUE:
		case BlockModelingMetamodelPackage.INTEGER_INPUT_BLOCK__MAX_VALUE:
		case BlockModelingMetamodelPackage.INTEGER_INPUT_BLOCK__MIN_VALUE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
