/**
 */
package blockModelingMetamodel.util;

import blockModelingMetamodel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see blockModelingMetamodel.BlockModelingMetamodelPackage
 * @generated
 */
public class BlockModelingMetamodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BlockModelingMetamodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockModelingMetamodelSwitch() {
		if (modelPackage == null) {
			modelPackage = BlockModelingMetamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case BlockModelingMetamodelPackage.BLOCK_APP: {
			BlockApp blockApp = (BlockApp) theEObject;
			T result = caseBlockApp(blockApp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BlockModelingMetamodelPackage.BLOCK: {
			Block block = (Block) theEObject;
			T result = caseBlock(block);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BlockModelingMetamodelPackage.REFERENCE_BLOCK: {
			ReferenceBlock referenceBlock = (ReferenceBlock) theEObject;
			T result = caseReferenceBlock(referenceBlock);
			if (result == null)
				result = caseBlock(referenceBlock);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BlockModelingMetamodelPackage.INFORMATION: {
			Information information = (Information) theEObject;
			T result = caseInformation(information);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BlockModelingMetamodelPackage.DECISION_BLOCK: {
			DecisionBlock decisionBlock = (DecisionBlock) theEObject;
			T result = caseDecisionBlock(decisionBlock);
			if (result == null)
				result = caseBlock(decisionBlock);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BlockModelingMetamodelPackage.ACTION_BLOCK: {
			ActionBlock actionBlock = (ActionBlock) theEObject;
			T result = caseActionBlock(actionBlock);
			if (result == null)
				result = caseBlock(actionBlock);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BlockModelingMetamodelPackage.INPUT_BLOCK: {
			InputBlock inputBlock = (InputBlock) theEObject;
			T result = caseInputBlock(inputBlock);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BlockModelingMetamodelPackage.SELECT_INPUT_BLOCK: {
			SelectInputBlock selectInputBlock = (SelectInputBlock) theEObject;
			T result = caseSelectInputBlock(selectInputBlock);
			if (result == null)
				result = caseInputBlock(selectInputBlock);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BlockModelingMetamodelPackage.TEXT_INPUT_BLOCK: {
			TextInputBlock textInputBlock = (TextInputBlock) theEObject;
			T result = caseTextInputBlock(textInputBlock);
			if (result == null)
				result = caseInputBlock(textInputBlock);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BlockModelingMetamodelPackage.INTEGER_INPUT_BLOCK: {
			IntegerInputBlock integerInputBlock = (IntegerInputBlock) theEObject;
			T result = caseIntegerInputBlock(integerInputBlock);
			if (result == null)
				result = caseInputBlock(integerInputBlock);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BlockModelingMetamodelPackage.FLOAT_INPUT_BLOCK: {
			FloatInputBlock floatInputBlock = (FloatInputBlock) theEObject;
			T result = caseFloatInputBlock(floatInputBlock);
			if (result == null)
				result = caseInputBlock(floatInputBlock);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BlockModelingMetamodelPackage.POPOVER: {
			Popover popover = (Popover) theEObject;
			T result = casePopover(popover);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BlockModelingMetamodelPackage.CONFIGURATION_POPOVER: {
			ConfigurationPopover configurationPopover = (ConfigurationPopover) theEObject;
			T result = caseConfigurationPopover(configurationPopover);
			if (result == null)
				result = casePopover(configurationPopover);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BlockModelingMetamodelPackage.SETTINGS_POPOVER: {
			SettingsPopover settingsPopover = (SettingsPopover) theEObject;
			T result = caseSettingsPopover(settingsPopover);
			if (result == null)
				result = casePopover(settingsPopover);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BlockModelingMetamodelPackage.FORM: {
			Form form = (Form) theEObject;
			T result = caseForm(form);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BlockModelingMetamodelPackage.PHRASES_INPUT_FORM: {
			PhrasesInputForm phrasesInputForm = (PhrasesInputForm) theEObject;
			T result = casePhrasesInputForm(phrasesInputForm);
			if (result == null)
				result = caseForm(phrasesInputForm);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BlockModelingMetamodelPackage.LABELED_INPUT_FORM: {
			LabeledInputForm labeledInputForm = (LabeledInputForm) theEObject;
			T result = caseLabeledInputForm(labeledInputForm);
			if (result == null)
				result = caseForm(labeledInputForm);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BlockModelingMetamodelPackage.LABELED_TEXT_INPUT_FORM: {
			LabeledTextInputForm labeledTextInputForm = (LabeledTextInputForm) theEObject;
			T result = caseLabeledTextInputForm(labeledTextInputForm);
			if (result == null)
				result = caseLabeledInputForm(labeledTextInputForm);
			if (result == null)
				result = caseForm(labeledTextInputForm);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BlockModelingMetamodelPackage.LABELED_INTEGER_INPUT_FORM: {
			LabeledIntegerInputForm labeledIntegerInputForm = (LabeledIntegerInputForm) theEObject;
			T result = caseLabeledIntegerInputForm(labeledIntegerInputForm);
			if (result == null)
				result = caseLabeledInputForm(labeledIntegerInputForm);
			if (result == null)
				result = caseForm(labeledIntegerInputForm);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BlockModelingMetamodelPackage.LABELED_FLOAT_INPUT_FORM: {
			LabeledFloatInputForm labeledFloatInputForm = (LabeledFloatInputForm) theEObject;
			T result = caseLabeledFloatInputForm(labeledFloatInputForm);
			if (result == null)
				result = caseLabeledInputForm(labeledFloatInputForm);
			if (result == null)
				result = caseForm(labeledFloatInputForm);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BlockModelingMetamodelPackage.PARAMETER_INPUT_FORM: {
			ParameterInputForm parameterInputForm = (ParameterInputForm) theEObject;
			T result = caseParameterInputForm(parameterInputForm);
			if (result == null)
				result = caseForm(parameterInputForm);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BlockModelingMetamodelPackage.CONDITION_INPUT_FORM: {
			ConditionInputForm conditionInputForm = (ConditionInputForm) theEObject;
			T result = caseConditionInputForm(conditionInputForm);
			if (result == null)
				result = caseForm(conditionInputForm);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BlockModelingMetamodelPackage.OPTION: {
			Option option = (Option) theEObject;
			T result = caseOption(option);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BlockModelingMetamodelPackage.CONDITION_OPTION: {
			ConditionOption conditionOption = (ConditionOption) theEObject;
			T result = caseConditionOption(conditionOption);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block App</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block App</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockApp(BlockApp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceBlock(ReferenceBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformation(Information object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecisionBlock(DecisionBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionBlock(ActionBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputBlock(InputBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Select Input Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Select Input Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectInputBlock(SelectInputBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Input Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Input Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextInputBlock(TextInputBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Input Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Input Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerInputBlock(IntegerInputBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float Input Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float Input Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloatInputBlock(FloatInputBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Popover</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Popover</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePopover(Popover object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration Popover</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration Popover</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationPopover(ConfigurationPopover object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Settings Popover</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Settings Popover</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSettingsPopover(SettingsPopover object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForm(Form object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Phrases Input Form</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Phrases Input Form</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhrasesInputForm(PhrasesInputForm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Labeled Input Form</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Labeled Input Form</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabeledInputForm(LabeledInputForm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Labeled Text Input Form</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Labeled Text Input Form</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabeledTextInputForm(LabeledTextInputForm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Labeled Integer Input Form</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Labeled Integer Input Form</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabeledIntegerInputForm(LabeledIntegerInputForm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Labeled Float Input Form</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Labeled Float Input Form</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabeledFloatInputForm(LabeledFloatInputForm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Input Form</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Input Form</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterInputForm(ParameterInputForm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Input Form</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Input Form</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionInputForm(ConditionInputForm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOption(Option object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionOption(ConditionOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BlockModelingMetamodelSwitch
