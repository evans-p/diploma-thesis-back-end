/**
 */
package blockModelingMetamodel.provider;

import blockModelingMetamodel.BlockModelingMetamodelPackage;
import blockModelingMetamodel.FloatInputBlock;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link blockModelingMetamodel.FloatInputBlock} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FloatInputBlockItemProvider extends InputBlockItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatInputBlockItemProvider(AdapterFactory adapterFactory) {
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

			addNoMaxValuePropertyDescriptor(object);
			addNoMinValuePropertyDescriptor(object);
			addNoDefaultValuePropertyDescriptor(object);
			addMaxValuePropertyDescriptor(object);
			addDefaultValuePropertyDescriptor(object);
			addMinValuePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
						getResourceLocator(), getString("_UI_FloatInputBlock_noMaxValue_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_FloatInputBlock_noMaxValue_feature",
								"_UI_FloatInputBlock_type"),
						BlockModelingMetamodelPackage.Literals.FLOAT_INPUT_BLOCK__NO_MAX_VALUE, false, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_FloatInputBlock_noMinValue_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_FloatInputBlock_noMinValue_feature",
								"_UI_FloatInputBlock_type"),
						BlockModelingMetamodelPackage.Literals.FLOAT_INPUT_BLOCK__NO_MIN_VALUE, false, false, false,
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
						getResourceLocator(), getString("_UI_FloatInputBlock_noDefaultValue_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_FloatInputBlock_noDefaultValue_feature",
								"_UI_FloatInputBlock_type"),
						BlockModelingMetamodelPackage.Literals.FLOAT_INPUT_BLOCK__NO_DEFAULT_VALUE, false, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_FloatInputBlock_maxValue_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_FloatInputBlock_maxValue_feature",
								"_UI_FloatInputBlock_type"),
						BlockModelingMetamodelPackage.Literals.FLOAT_INPUT_BLOCK__MAX_VALUE, false, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_FloatInputBlock_defaultValue_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_FloatInputBlock_defaultValue_feature",
								"_UI_FloatInputBlock_type"),
						BlockModelingMetamodelPackage.Literals.FLOAT_INPUT_BLOCK__DEFAULT_VALUE, false, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_FloatInputBlock_minValue_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_FloatInputBlock_minValue_feature",
								"_UI_FloatInputBlock_type"),
						BlockModelingMetamodelPackage.Literals.FLOAT_INPUT_BLOCK__MIN_VALUE, false, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns FloatInputBlock.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FloatInputBlock"));
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
		String label = ((FloatInputBlock) object).getVariableName();
		return label == null || label.length() == 0 ? getString("_UI_FloatInputBlock_type")
				: getString("_UI_FloatInputBlock_type") + " " + label;
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

		switch (notification.getFeatureID(FloatInputBlock.class)) {
		case BlockModelingMetamodelPackage.FLOAT_INPUT_BLOCK__NO_MAX_VALUE:
		case BlockModelingMetamodelPackage.FLOAT_INPUT_BLOCK__NO_MIN_VALUE:
		case BlockModelingMetamodelPackage.FLOAT_INPUT_BLOCK__NO_DEFAULT_VALUE:
		case BlockModelingMetamodelPackage.FLOAT_INPUT_BLOCK__MAX_VALUE:
		case BlockModelingMetamodelPackage.FLOAT_INPUT_BLOCK__DEFAULT_VALUE:
		case BlockModelingMetamodelPackage.FLOAT_INPUT_BLOCK__MIN_VALUE:
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
