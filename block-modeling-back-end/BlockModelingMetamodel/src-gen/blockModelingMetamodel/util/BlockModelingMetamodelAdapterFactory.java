/**
 */
package blockModelingMetamodel.util;

import blockModelingMetamodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see blockModelingMetamodel.BlockModelingMetamodelPackage
 * @generated
 */
public class BlockModelingMetamodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BlockModelingMetamodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockModelingMetamodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BlockModelingMetamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockModelingMetamodelSwitch<Adapter> modelSwitch = new BlockModelingMetamodelSwitch<Adapter>() {
		@Override
		public Adapter caseBlockApp(BlockApp object) {
			return createBlockAppAdapter();
		}

		@Override
		public Adapter caseBlock(Block object) {
			return createBlockAdapter();
		}

		@Override
		public Adapter caseReferenceBlock(ReferenceBlock object) {
			return createReferenceBlockAdapter();
		}

		@Override
		public Adapter caseInformation(Information object) {
			return createInformationAdapter();
		}

		@Override
		public Adapter caseDecisionBlock(DecisionBlock object) {
			return createDecisionBlockAdapter();
		}

		@Override
		public Adapter caseActionBlock(ActionBlock object) {
			return createActionBlockAdapter();
		}

		@Override
		public Adapter caseInputBlock(InputBlock object) {
			return createInputBlockAdapter();
		}

		@Override
		public Adapter caseSelectInputBlock(SelectInputBlock object) {
			return createSelectInputBlockAdapter();
		}

		@Override
		public Adapter caseTextInputBlock(TextInputBlock object) {
			return createTextInputBlockAdapter();
		}

		@Override
		public Adapter caseIntegerInputBlock(IntegerInputBlock object) {
			return createIntegerInputBlockAdapter();
		}

		@Override
		public Adapter caseFloatInputBlock(FloatInputBlock object) {
			return createFloatInputBlockAdapter();
		}

		@Override
		public Adapter casePopover(Popover object) {
			return createPopoverAdapter();
		}

		@Override
		public Adapter caseConfigurationPopover(ConfigurationPopover object) {
			return createConfigurationPopoverAdapter();
		}

		@Override
		public Adapter caseSettingsPopover(SettingsPopover object) {
			return createSettingsPopoverAdapter();
		}

		@Override
		public Adapter caseForm(Form object) {
			return createFormAdapter();
		}

		@Override
		public Adapter casePhrasesInputForm(PhrasesInputForm object) {
			return createPhrasesInputFormAdapter();
		}

		@Override
		public Adapter caseLabeledInputForm(LabeledInputForm object) {
			return createLabeledInputFormAdapter();
		}

		@Override
		public Adapter caseLabeledTextInputForm(LabeledTextInputForm object) {
			return createLabeledTextInputFormAdapter();
		}

		@Override
		public Adapter caseLabeledIntegerInputForm(LabeledIntegerInputForm object) {
			return createLabeledIntegerInputFormAdapter();
		}

		@Override
		public Adapter caseLabeledFloatInputForm(LabeledFloatInputForm object) {
			return createLabeledFloatInputFormAdapter();
		}

		@Override
		public Adapter caseParameterInputForm(ParameterInputForm object) {
			return createParameterInputFormAdapter();
		}

		@Override
		public Adapter caseConditionInputForm(ConditionInputForm object) {
			return createConditionInputFormAdapter();
		}

		@Override
		public Adapter caseOption(Option object) {
			return createOptionAdapter();
		}

		@Override
		public Adapter caseConditionOption(ConditionOption object) {
			return createConditionOptionAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockModelingMetamodel.BlockApp <em>Block App</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockModelingMetamodel.BlockApp
	 * @generated
	 */
	public Adapter createBlockAppAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockModelingMetamodel.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockModelingMetamodel.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockModelingMetamodel.ReferenceBlock <em>Reference Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockModelingMetamodel.ReferenceBlock
	 * @generated
	 */
	public Adapter createReferenceBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockModelingMetamodel.Information <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockModelingMetamodel.Information
	 * @generated
	 */
	public Adapter createInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockModelingMetamodel.DecisionBlock <em>Decision Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockModelingMetamodel.DecisionBlock
	 * @generated
	 */
	public Adapter createDecisionBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockModelingMetamodel.ActionBlock <em>Action Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockModelingMetamodel.ActionBlock
	 * @generated
	 */
	public Adapter createActionBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockModelingMetamodel.InputBlock <em>Input Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockModelingMetamodel.InputBlock
	 * @generated
	 */
	public Adapter createInputBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockModelingMetamodel.SelectInputBlock <em>Select Input Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockModelingMetamodel.SelectInputBlock
	 * @generated
	 */
	public Adapter createSelectInputBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockModelingMetamodel.TextInputBlock <em>Text Input Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockModelingMetamodel.TextInputBlock
	 * @generated
	 */
	public Adapter createTextInputBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockModelingMetamodel.IntegerInputBlock <em>Integer Input Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockModelingMetamodel.IntegerInputBlock
	 * @generated
	 */
	public Adapter createIntegerInputBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockModelingMetamodel.FloatInputBlock <em>Float Input Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockModelingMetamodel.FloatInputBlock
	 * @generated
	 */
	public Adapter createFloatInputBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockModelingMetamodel.Popover <em>Popover</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockModelingMetamodel.Popover
	 * @generated
	 */
	public Adapter createPopoverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockModelingMetamodel.ConfigurationPopover <em>Configuration Popover</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockModelingMetamodel.ConfigurationPopover
	 * @generated
	 */
	public Adapter createConfigurationPopoverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockModelingMetamodel.SettingsPopover <em>Settings Popover</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockModelingMetamodel.SettingsPopover
	 * @generated
	 */
	public Adapter createSettingsPopoverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockModelingMetamodel.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockModelingMetamodel.Form
	 * @generated
	 */
	public Adapter createFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockModelingMetamodel.PhrasesInputForm <em>Phrases Input Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockModelingMetamodel.PhrasesInputForm
	 * @generated
	 */
	public Adapter createPhrasesInputFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockModelingMetamodel.LabeledInputForm <em>Labeled Input Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockModelingMetamodel.LabeledInputForm
	 * @generated
	 */
	public Adapter createLabeledInputFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockModelingMetamodel.LabeledTextInputForm <em>Labeled Text Input Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockModelingMetamodel.LabeledTextInputForm
	 * @generated
	 */
	public Adapter createLabeledTextInputFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockModelingMetamodel.LabeledIntegerInputForm <em>Labeled Integer Input Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockModelingMetamodel.LabeledIntegerInputForm
	 * @generated
	 */
	public Adapter createLabeledIntegerInputFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockModelingMetamodel.LabeledFloatInputForm <em>Labeled Float Input Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockModelingMetamodel.LabeledFloatInputForm
	 * @generated
	 */
	public Adapter createLabeledFloatInputFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockModelingMetamodel.ParameterInputForm <em>Parameter Input Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockModelingMetamodel.ParameterInputForm
	 * @generated
	 */
	public Adapter createParameterInputFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockModelingMetamodel.ConditionInputForm <em>Condition Input Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockModelingMetamodel.ConditionInputForm
	 * @generated
	 */
	public Adapter createConditionInputFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockModelingMetamodel.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockModelingMetamodel.Option
	 * @generated
	 */
	public Adapter createOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockModelingMetamodel.ConditionOption <em>Condition Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockModelingMetamodel.ConditionOption
	 * @generated
	 */
	public Adapter createConditionOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BlockModelingMetamodelAdapterFactory
