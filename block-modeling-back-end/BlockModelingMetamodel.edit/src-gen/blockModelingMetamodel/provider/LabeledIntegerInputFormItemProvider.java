/**
 */
package blockModelingMetamodel.provider;

import blockModelingMetamodel.BlockModelingMetamodelPackage;
import blockModelingMetamodel.LabeledIntegerInputForm;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link blockModelingMetamodel.LabeledIntegerInputForm} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LabeledIntegerInputFormItemProvider extends LabeledInputFormItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabeledIntegerInputFormItemProvider(AdapterFactory adapterFactory) {
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

			addDefaultValuePropertyDescriptor(object);
			addMinValuePropertyDescriptor(object);
			addMaxValuePropertyDescriptor(object);
			addNoMaxValuePropertyDescriptor(object);
			addNoMinValuePropertyDescriptor(object);
			addNoDefaultValuePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
						getResourceLocator(), getString("_UI_LabeledIntegerInputForm_defaultValue_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_LabeledIntegerInputForm_defaultValue_feature", "_UI_LabeledIntegerInputForm_type"),
						BlockModelingMetamodelPackage.Literals.LABELED_INTEGER_INPUT_FORM__DEFAULT_VALUE, false, false,
						false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_LabeledIntegerInputForm_minValue_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_LabeledIntegerInputForm_minValue_feature",
								"_UI_LabeledIntegerInputForm_type"),
						BlockModelingMetamodelPackage.Literals.LABELED_INTEGER_INPUT_FORM__MIN_VALUE, false, false,
						false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_LabeledIntegerInputForm_maxValue_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_LabeledIntegerInputForm_maxValue_feature",
								"_UI_LabeledIntegerInputForm_type"),
						BlockModelingMetamodelPackage.Literals.LABELED_INTEGER_INPUT_FORM__MAX_VALUE, false, false,
						false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_LabeledIntegerInputForm_noMaxValue_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_LabeledIntegerInputForm_noMaxValue_feature", "_UI_LabeledIntegerInputForm_type"),
						BlockModelingMetamodelPackage.Literals.LABELED_INTEGER_INPUT_FORM__NO_MAX_VALUE, false, false,
						false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_LabeledIntegerInputForm_noMinValue_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_LabeledIntegerInputForm_noMinValue_feature", "_UI_LabeledIntegerInputForm_type"),
						BlockModelingMetamodelPackage.Literals.LABELED_INTEGER_INPUT_FORM__NO_MIN_VALUE, false, false,
						false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the No Default Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNoDefaultValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_LabeledIntegerInputForm_noDefaultValue_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_LabeledIntegerInputForm_noDefaultValue_feature",
						"_UI_LabeledIntegerInputForm_type"),
				BlockModelingMetamodelPackage.Literals.LABELED_INTEGER_INPUT_FORM__NO_DEFAULT_VALUE, false, false,
				false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns LabeledIntegerInputForm.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LabeledIntegerInputForm"));
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
		String label = ((LabeledIntegerInputForm) object).getVariableNameEL();
		return label == null || label.length() == 0 ? getString("_UI_LabeledIntegerInputForm_type")
				: getString("_UI_LabeledIntegerInputForm_type") + " " + label;
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

		switch (notification.getFeatureID(LabeledIntegerInputForm.class)) {
		case BlockModelingMetamodelPackage.LABELED_INTEGER_INPUT_FORM__DEFAULT_VALUE:
		case BlockModelingMetamodelPackage.LABELED_INTEGER_INPUT_FORM__MIN_VALUE:
		case BlockModelingMetamodelPackage.LABELED_INTEGER_INPUT_FORM__MAX_VALUE:
		case BlockModelingMetamodelPackage.LABELED_INTEGER_INPUT_FORM__NO_MAX_VALUE:
		case BlockModelingMetamodelPackage.LABELED_INTEGER_INPUT_FORM__NO_MIN_VALUE:
		case BlockModelingMetamodelPackage.LABELED_INTEGER_INPUT_FORM__NO_DEFAULT_VALUE:
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
