/**
 */
package blockModelingMetamodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see blockModelingMetamodel.BlockModelingMetamodelPackage
 * @generated
 */
public interface BlockModelingMetamodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BlockModelingMetamodelFactory eINSTANCE = blockModelingMetamodel.impl.BlockModelingMetamodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Block App</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block App</em>'.
	 * @generated
	 */
	BlockApp createBlockApp();

	/**
	 * Returns a new object of class '<em>Reference Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Block</em>'.
	 * @generated
	 */
	ReferenceBlock createReferenceBlock();

	/**
	 * Returns a new object of class '<em>Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Information</em>'.
	 * @generated
	 */
	Information createInformation();

	/**
	 * Returns a new object of class '<em>Decision Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decision Block</em>'.
	 * @generated
	 */
	DecisionBlock createDecisionBlock();

	/**
	 * Returns a new object of class '<em>Action Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Block</em>'.
	 * @generated
	 */
	ActionBlock createActionBlock();

	/**
	 * Returns a new object of class '<em>Select Input Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Select Input Block</em>'.
	 * @generated
	 */
	SelectInputBlock createSelectInputBlock();

	/**
	 * Returns a new object of class '<em>Text Input Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Input Block</em>'.
	 * @generated
	 */
	TextInputBlock createTextInputBlock();

	/**
	 * Returns a new object of class '<em>Integer Input Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Input Block</em>'.
	 * @generated
	 */
	IntegerInputBlock createIntegerInputBlock();

	/**
	 * Returns a new object of class '<em>Float Input Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Float Input Block</em>'.
	 * @generated
	 */
	FloatInputBlock createFloatInputBlock();

	/**
	 * Returns a new object of class '<em>Configuration Popover</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration Popover</em>'.
	 * @generated
	 */
	ConfigurationPopover createConfigurationPopover();

	/**
	 * Returns a new object of class '<em>Settings Popover</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Settings Popover</em>'.
	 * @generated
	 */
	SettingsPopover createSettingsPopover();

	/**
	 * Returns a new object of class '<em>Phrases Input Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Phrases Input Form</em>'.
	 * @generated
	 */
	PhrasesInputForm createPhrasesInputForm();

	/**
	 * Returns a new object of class '<em>Labeled Text Input Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Labeled Text Input Form</em>'.
	 * @generated
	 */
	LabeledTextInputForm createLabeledTextInputForm();

	/**
	 * Returns a new object of class '<em>Labeled Integer Input Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Labeled Integer Input Form</em>'.
	 * @generated
	 */
	LabeledIntegerInputForm createLabeledIntegerInputForm();

	/**
	 * Returns a new object of class '<em>Labeled Float Input Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Labeled Float Input Form</em>'.
	 * @generated
	 */
	LabeledFloatInputForm createLabeledFloatInputForm();

	/**
	 * Returns a new object of class '<em>Parameter Input Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Input Form</em>'.
	 * @generated
	 */
	ParameterInputForm createParameterInputForm();

	/**
	 * Returns a new object of class '<em>Condition Input Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition Input Form</em>'.
	 * @generated
	 */
	ConditionInputForm createConditionInputForm();

	/**
	 * Returns a new object of class '<em>Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Option</em>'.
	 * @generated
	 */
	Option createOption();

	/**
	 * Returns a new object of class '<em>Condition Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition Option</em>'.
	 * @generated
	 */
	ConditionOption createConditionOption();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BlockModelingMetamodelPackage getBlockModelingMetamodelPackage();

} //BlockModelingMetamodelFactory
