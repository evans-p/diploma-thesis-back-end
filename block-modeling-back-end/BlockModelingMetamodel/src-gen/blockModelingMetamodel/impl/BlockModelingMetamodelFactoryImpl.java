/**
 */
package blockModelingMetamodel.impl;

import blockModelingMetamodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BlockModelingMetamodelFactoryImpl extends EFactoryImpl implements BlockModelingMetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BlockModelingMetamodelFactory init() {
		try {
			BlockModelingMetamodelFactory theBlockModelingMetamodelFactory = (BlockModelingMetamodelFactory) EPackage.Registry.INSTANCE
					.getEFactory(BlockModelingMetamodelPackage.eNS_URI);
			if (theBlockModelingMetamodelFactory != null) {
				return theBlockModelingMetamodelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BlockModelingMetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockModelingMetamodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case BlockModelingMetamodelPackage.BLOCK_APP:
			return createBlockApp();
		case BlockModelingMetamodelPackage.REFERENCE_BLOCK:
			return createReferenceBlock();
		case BlockModelingMetamodelPackage.INFORMATION:
			return createInformation();
		case BlockModelingMetamodelPackage.DECISION_BLOCK:
			return createDecisionBlock();
		case BlockModelingMetamodelPackage.ACTION_BLOCK:
			return createActionBlock();
		case BlockModelingMetamodelPackage.SELECT_INPUT_BLOCK:
			return createSelectInputBlock();
		case BlockModelingMetamodelPackage.TEXT_INPUT_BLOCK:
			return createTextInputBlock();
		case BlockModelingMetamodelPackage.INTEGER_INPUT_BLOCK:
			return createIntegerInputBlock();
		case BlockModelingMetamodelPackage.FLOAT_INPUT_BLOCK:
			return createFloatInputBlock();
		case BlockModelingMetamodelPackage.CONFIGURATION_POPOVER:
			return createConfigurationPopover();
		case BlockModelingMetamodelPackage.SETTINGS_POPOVER:
			return createSettingsPopover();
		case BlockModelingMetamodelPackage.PHRASES_INPUT_FORM:
			return createPhrasesInputForm();
		case BlockModelingMetamodelPackage.LABELED_TEXT_INPUT_FORM:
			return createLabeledTextInputForm();
		case BlockModelingMetamodelPackage.LABELED_INTEGER_INPUT_FORM:
			return createLabeledIntegerInputForm();
		case BlockModelingMetamodelPackage.LABELED_FLOAT_INPUT_FORM:
			return createLabeledFloatInputForm();
		case BlockModelingMetamodelPackage.PARAMETER_INPUT_FORM:
			return createParameterInputForm();
		case BlockModelingMetamodelPackage.CONDITION_INPUT_FORM:
			return createConditionInputForm();
		case BlockModelingMetamodelPackage.OPTION:
			return createOption();
		case BlockModelingMetamodelPackage.CONDITION_OPTION:
			return createConditionOption();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case BlockModelingMetamodelPackage.CATEGORY:
			return createCategoryFromString(eDataType, initialValue);
		case BlockModelingMetamodelPackage.CURSOR:
			return createCursorFromString(eDataType, initialValue);
		case BlockModelingMetamodelPackage.IMAGE_BACKGROUND_SHAPE:
			return createImageBackgroundShapeFromString(eDataType, initialValue);
		case BlockModelingMetamodelPackage.COMPARISON_TYPE:
			return createComparisonTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case BlockModelingMetamodelPackage.CATEGORY:
			return convertCategoryToString(eDataType, instanceValue);
		case BlockModelingMetamodelPackage.CURSOR:
			return convertCursorToString(eDataType, instanceValue);
		case BlockModelingMetamodelPackage.IMAGE_BACKGROUND_SHAPE:
			return convertImageBackgroundShapeToString(eDataType, instanceValue);
		case BlockModelingMetamodelPackage.COMPARISON_TYPE:
			return convertComparisonTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockApp createBlockApp() {
		BlockAppImpl blockApp = new BlockAppImpl();
		return blockApp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceBlock createReferenceBlock() {
		ReferenceBlockImpl referenceBlock = new ReferenceBlockImpl();
		return referenceBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Information createInformation() {
		InformationImpl information = new InformationImpl();
		return information;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionBlock createDecisionBlock() {
		DecisionBlockImpl decisionBlock = new DecisionBlockImpl();
		return decisionBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionBlock createActionBlock() {
		ActionBlockImpl actionBlock = new ActionBlockImpl();
		return actionBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectInputBlock createSelectInputBlock() {
		SelectInputBlockImpl selectInputBlock = new SelectInputBlockImpl();
		return selectInputBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextInputBlock createTextInputBlock() {
		TextInputBlockImpl textInputBlock = new TextInputBlockImpl();
		return textInputBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerInputBlock createIntegerInputBlock() {
		IntegerInputBlockImpl integerInputBlock = new IntegerInputBlockImpl();
		return integerInputBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatInputBlock createFloatInputBlock() {
		FloatInputBlockImpl floatInputBlock = new FloatInputBlockImpl();
		return floatInputBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationPopover createConfigurationPopover() {
		ConfigurationPopoverImpl configurationPopover = new ConfigurationPopoverImpl();
		return configurationPopover;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SettingsPopover createSettingsPopover() {
		SettingsPopoverImpl settingsPopover = new SettingsPopoverImpl();
		return settingsPopover;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhrasesInputForm createPhrasesInputForm() {
		PhrasesInputFormImpl phrasesInputForm = new PhrasesInputFormImpl();
		return phrasesInputForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabeledTextInputForm createLabeledTextInputForm() {
		LabeledTextInputFormImpl labeledTextInputForm = new LabeledTextInputFormImpl();
		return labeledTextInputForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabeledIntegerInputForm createLabeledIntegerInputForm() {
		LabeledIntegerInputFormImpl labeledIntegerInputForm = new LabeledIntegerInputFormImpl();
		return labeledIntegerInputForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabeledFloatInputForm createLabeledFloatInputForm() {
		LabeledFloatInputFormImpl labeledFloatInputForm = new LabeledFloatInputFormImpl();
		return labeledFloatInputForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterInputForm createParameterInputForm() {
		ParameterInputFormImpl parameterInputForm = new ParameterInputFormImpl();
		return parameterInputForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionInputForm createConditionInputForm() {
		ConditionInputFormImpl conditionInputForm = new ConditionInputFormImpl();
		return conditionInputForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Option createOption() {
		OptionImpl option = new OptionImpl();
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionOption createConditionOption() {
		ConditionOptionImpl conditionOption = new ConditionOptionImpl();
		return conditionOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category createCategoryFromString(EDataType eDataType, String initialValue) {
		Category result = Category.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cursor createCursorFromString(EDataType eDataType, String initialValue) {
		Cursor result = Cursor.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCursorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageBackgroundShape createImageBackgroundShapeFromString(EDataType eDataType, String initialValue) {
		ImageBackgroundShape result = ImageBackgroundShape.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImageBackgroundShapeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonType createComparisonTypeFromString(EDataType eDataType, String initialValue) {
		ComparisonType result = ComparisonType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComparisonTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockModelingMetamodelPackage getBlockModelingMetamodelPackage() {
		return (BlockModelingMetamodelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BlockModelingMetamodelPackage getPackage() {
		return BlockModelingMetamodelPackage.eINSTANCE;
	}

} //BlockModelingMetamodelFactoryImpl
