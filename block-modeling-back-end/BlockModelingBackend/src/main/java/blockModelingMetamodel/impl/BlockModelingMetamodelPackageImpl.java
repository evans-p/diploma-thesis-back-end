/**
 */
package blockModelingMetamodel.impl;

import blockModelingMetamodel.ActionBlock;
import blockModelingMetamodel.Block;
import blockModelingMetamodel.BlockApp;
import blockModelingMetamodel.BlockModelingMetamodelFactory;
import blockModelingMetamodel.BlockModelingMetamodelPackage;
import blockModelingMetamodel.Category;
import blockModelingMetamodel.ComparisonType;
import blockModelingMetamodel.ConditionInputForm;
import blockModelingMetamodel.ConditionOption;
import blockModelingMetamodel.ConfigurationPopover;
import blockModelingMetamodel.Cursor;
import blockModelingMetamodel.DecisionBlock;
import blockModelingMetamodel.FloatInputBlock;
import blockModelingMetamodel.Form;
import blockModelingMetamodel.ImageBackgroundShape;
import blockModelingMetamodel.Information;
import blockModelingMetamodel.InputBlock;
import blockModelingMetamodel.IntegerInputBlock;
import blockModelingMetamodel.LabeledFloatInputForm;
import blockModelingMetamodel.LabeledInputForm;
import blockModelingMetamodel.LabeledIntegerInputForm;
import blockModelingMetamodel.LabeledTextInputForm;
import blockModelingMetamodel.Option;
import blockModelingMetamodel.ParameterInputForm;
import blockModelingMetamodel.PhrasesInputForm;
import blockModelingMetamodel.Popover;
import blockModelingMetamodel.ReferenceBlock;
import blockModelingMetamodel.SelectInputBlock;
import blockModelingMetamodel.SettingsPopover;
import blockModelingMetamodel.TextInputBlock;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BlockModelingMetamodelPackageImpl extends EPackageImpl implements BlockModelingMetamodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockAppEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectInputBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textInputBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerInputBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatInputBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass popoverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationPopoverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass settingsPopoverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phrasesInputFormEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labeledInputFormEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labeledTextInputFormEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labeledIntegerInputFormEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labeledFloatInputFormEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterInputFormEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionInputFormEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum categoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cursorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum imageBackgroundShapeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum comparisonTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BlockModelingMetamodelPackageImpl() {
		super(eNS_URI, BlockModelingMetamodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link BlockModelingMetamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BlockModelingMetamodelPackage init() {
		if (isInited)
			return (BlockModelingMetamodelPackage) EPackage.Registry.INSTANCE
					.getEPackage(BlockModelingMetamodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBlockModelingMetamodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BlockModelingMetamodelPackageImpl theBlockModelingMetamodelPackage = registeredBlockModelingMetamodelPackage instanceof BlockModelingMetamodelPackageImpl
				? (BlockModelingMetamodelPackageImpl) registeredBlockModelingMetamodelPackage
				: new BlockModelingMetamodelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theBlockModelingMetamodelPackage.createPackageContents();

		// Initialize created meta-data
		theBlockModelingMetamodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBlockModelingMetamodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BlockModelingMetamodelPackage.eNS_URI, theBlockModelingMetamodelPackage);
		return theBlockModelingMetamodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlockApp() {
		return blockAppEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlockApp_HasBlock() {
		return (EReference) blockAppEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlock_Category() {
		return (EAttribute) blockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlock_BackroundColor() {
		return (EAttribute) blockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlock_BlockNameEL() {
		return (EAttribute) blockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlock_BlockNameEN() {
		return (EAttribute) blockEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceBlock() {
		return referenceBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceBlock_BlockTitleEL() {
		return (EAttribute) referenceBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceBlock_BlockTitleEN() {
		return (EAttribute) referenceBlockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceBlock_BlockImage() {
		return (EAttribute) referenceBlockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceBlock_ImageBackroundShape() {
		return (EAttribute) referenceBlockEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceBlock_HasNextBlock() {
		return (EAttribute) referenceBlockEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceBlock_ImageCursor() {
		return (EAttribute) referenceBlockEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceBlock_ImageBackroundShapeColor() {
		return (EAttribute) referenceBlockEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceBlock_HasInfo() {
		return (EReference) referenceBlockEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformation() {
		return informationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInformation_InformationTextEL() {
		return (EAttribute) informationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInformation_InformationTextEN() {
		return (EAttribute) informationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInformation_Cursor() {
		return (EAttribute) informationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecisionBlock() {
		return decisionBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecisionBlock_BlockImage() {
		return (EAttribute) decisionBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecisionBlock_NumberOfColumns() {
		return (EAttribute) decisionBlockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecisionBlock_BlockImageCursor() {
		return (EAttribute) decisionBlockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecisionBlock_HasSettingsPopover() {
		return (EReference) decisionBlockEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecisionBlock_HasConfigurationPopover() {
		return (EReference) decisionBlockEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionBlock() {
		return actionBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionBlock_BlockTitleEN() {
		return (EAttribute) actionBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionBlock_BlockTitleEL() {
		return (EAttribute) actionBlockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionBlock_BlockImage() {
		return (EAttribute) actionBlockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionBlock_HasPopover() {
		return (EAttribute) actionBlockEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionBlock_PopoverIcon() {
		return (EAttribute) actionBlockEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionBlock_PopoverHelpTextEL() {
		return (EAttribute) actionBlockEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionBlock_PopoverHelpTextEN() {
		return (EAttribute) actionBlockEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionBlock_TitleBackroundColor() {
		return (EAttribute) actionBlockEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionBlock_HasInfo() {
		return (EReference) actionBlockEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionBlock_HasInput() {
		return (EReference) actionBlockEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionBlock_HasSettingsPopover() {
		return (EReference) actionBlockEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputBlock() {
		return inputBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputBlock_Image() {
		return (EAttribute) inputBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputBlock_InfoTextEN() {
		return (EAttribute) inputBlockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputBlock_InfoTextEL() {
		return (EAttribute) inputBlockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputBlock_VariableName() {
		return (EAttribute) inputBlockEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputBlock_IconCursor() {
		return (EAttribute) inputBlockEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectInputBlock() {
		return selectInputBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectInputBlock_HasOptions() {
		return (EReference) selectInputBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextInputBlock() {
		return textInputBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextInputBlock_DefaultValueEL() {
		return (EAttribute) textInputBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextInputBlock_DefaultValueEN() {
		return (EAttribute) textInputBlockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerInputBlock() {
		return integerInputBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerInputBlock_NoMinValue() {
		return (EAttribute) integerInputBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerInputBlock_NoMaxValue() {
		return (EAttribute) integerInputBlockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerInputBlock_NoDefaultValue() {
		return (EAttribute) integerInputBlockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerInputBlock_MinValue() {
		return (EAttribute) integerInputBlockEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerInputBlock_MaxValue() {
		return (EAttribute) integerInputBlockEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerInputBlock_DefaultValue() {
		return (EAttribute) integerInputBlockEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloatInputBlock() {
		return floatInputBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatInputBlock_NoMaxValue() {
		return (EAttribute) floatInputBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatInputBlock_NoMinValue() {
		return (EAttribute) floatInputBlockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatInputBlock_NoDefaultValue() {
		return (EAttribute) floatInputBlockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatInputBlock_MinValue() {
		return (EAttribute) floatInputBlockEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatInputBlock_MaxValue() {
		return (EAttribute) floatInputBlockEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatInputBlock_DefaultValue() {
		return (EAttribute) floatInputBlockEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPopover() {
		return popoverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPopover_PopoverTitleEL() {
		return (EAttribute) popoverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPopover_PopoverTitleEN() {
		return (EAttribute) popoverEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationPopover() {
		return configurationPopoverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationPopover_HasInput() {
		return (EReference) configurationPopoverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSettingsPopover() {
		return settingsPopoverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSettingsPopover_HasForm() {
		return (EReference) settingsPopoverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForm() {
		return formEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhrasesInputForm() {
		return phrasesInputFormEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhrasesInputForm_PlaceholderEL() {
		return (EAttribute) phrasesInputFormEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhrasesInputForm_PlaceholderEN() {
		return (EAttribute) phrasesInputFormEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabeledInputForm() {
		return labeledInputFormEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabeledInputForm_VariableNameEL() {
		return (EAttribute) labeledInputFormEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabeledInputForm_VariableNameEN() {
		return (EAttribute) labeledInputFormEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabeledTextInputForm() {
		return labeledTextInputFormEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabeledTextInputForm_DefaultValueEN() {
		return (EAttribute) labeledTextInputFormEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabeledTextInputForm_DefaultValueEL() {
		return (EAttribute) labeledTextInputFormEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabeledIntegerInputForm() {
		return labeledIntegerInputFormEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabeledIntegerInputForm_DefaultValue() {
		return (EAttribute) labeledIntegerInputFormEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabeledIntegerInputForm_MinValue() {
		return (EAttribute) labeledIntegerInputFormEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabeledIntegerInputForm_MaxValue() {
		return (EAttribute) labeledIntegerInputFormEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabeledIntegerInputForm_NoMaxValue() {
		return (EAttribute) labeledIntegerInputFormEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabeledIntegerInputForm_NoMinValue() {
		return (EAttribute) labeledIntegerInputFormEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabeledIntegerInputForm_NoDefaultValue() {
		return (EAttribute) labeledIntegerInputFormEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabeledFloatInputForm() {
		return labeledFloatInputFormEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabeledFloatInputForm_MinValue() {
		return (EAttribute) labeledFloatInputFormEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabeledFloatInputForm_DefaultValue() {
		return (EAttribute) labeledFloatInputFormEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabeledFloatInputForm_MaxValue() {
		return (EAttribute) labeledFloatInputFormEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabeledFloatInputForm_NoMaxValue() {
		return (EAttribute) labeledFloatInputFormEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabeledFloatInputForm_NoMinValue() {
		return (EAttribute) labeledFloatInputFormEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabeledFloatInputForm_NoDefaultValue() {
		return (EAttribute) labeledFloatInputFormEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterInputForm() {
		return parameterInputFormEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterInputForm_DefaultValueEL() {
		return (EAttribute) parameterInputFormEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterInputForm_DefaultValueEN() {
		return (EAttribute) parameterInputFormEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterInputForm_HasOptions() {
		return (EReference) parameterInputFormEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionInputForm() {
		return conditionInputFormEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionInputForm_HasOptions() {
		return (EReference) conditionInputFormEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOption() {
		return optionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOption_OptionTextEL() {
		return (EAttribute) optionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOption_OptionTextEN() {
		return (EAttribute) optionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionOption() {
		return conditionOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionOption_OptionTextEL() {
		return (EAttribute) conditionOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionOption_OptionTextEN() {
		return (EAttribute) conditionOptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionOption_ComparisonType() {
		return (EAttribute) conditionOptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionOption_Comparators() {
		return (EAttribute) conditionOptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionOption_HasOptions() {
		return (EReference) conditionOptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCategory() {
		return categoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCursor() {
		return cursorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getImageBackgroundShape() {
		return imageBackgroundShapeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComparisonType() {
		return comparisonTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockModelingMetamodelFactory getBlockModelingMetamodelFactory() {
		return (BlockModelingMetamodelFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		blockAppEClass = createEClass(BLOCK_APP);
		createEReference(blockAppEClass, BLOCK_APP__HAS_BLOCK);

		blockEClass = createEClass(BLOCK);
		createEAttribute(blockEClass, BLOCK__CATEGORY);
		createEAttribute(blockEClass, BLOCK__BACKROUND_COLOR);
		createEAttribute(blockEClass, BLOCK__BLOCK_NAME_EL);
		createEAttribute(blockEClass, BLOCK__BLOCK_NAME_EN);

		referenceBlockEClass = createEClass(REFERENCE_BLOCK);
		createEAttribute(referenceBlockEClass, REFERENCE_BLOCK__BLOCK_TITLE_EL);
		createEAttribute(referenceBlockEClass, REFERENCE_BLOCK__BLOCK_TITLE_EN);
		createEAttribute(referenceBlockEClass, REFERENCE_BLOCK__BLOCK_IMAGE);
		createEAttribute(referenceBlockEClass, REFERENCE_BLOCK__IMAGE_BACKROUND_SHAPE);
		createEAttribute(referenceBlockEClass, REFERENCE_BLOCK__HAS_NEXT_BLOCK);
		createEAttribute(referenceBlockEClass, REFERENCE_BLOCK__IMAGE_CURSOR);
		createEAttribute(referenceBlockEClass, REFERENCE_BLOCK__IMAGE_BACKROUND_SHAPE_COLOR);
		createEReference(referenceBlockEClass, REFERENCE_BLOCK__HAS_INFO);

		informationEClass = createEClass(INFORMATION);
		createEAttribute(informationEClass, INFORMATION__INFORMATION_TEXT_EL);
		createEAttribute(informationEClass, INFORMATION__INFORMATION_TEXT_EN);
		createEAttribute(informationEClass, INFORMATION__CURSOR);

		decisionBlockEClass = createEClass(DECISION_BLOCK);
		createEAttribute(decisionBlockEClass, DECISION_BLOCK__BLOCK_IMAGE);
		createEAttribute(decisionBlockEClass, DECISION_BLOCK__NUMBER_OF_COLUMNS);
		createEAttribute(decisionBlockEClass, DECISION_BLOCK__BLOCK_IMAGE_CURSOR);
		createEReference(decisionBlockEClass, DECISION_BLOCK__HAS_SETTINGS_POPOVER);
		createEReference(decisionBlockEClass, DECISION_BLOCK__HAS_CONFIGURATION_POPOVER);

		actionBlockEClass = createEClass(ACTION_BLOCK);
		createEAttribute(actionBlockEClass, ACTION_BLOCK__BLOCK_TITLE_EN);
		createEAttribute(actionBlockEClass, ACTION_BLOCK__BLOCK_TITLE_EL);
		createEAttribute(actionBlockEClass, ACTION_BLOCK__BLOCK_IMAGE);
		createEAttribute(actionBlockEClass, ACTION_BLOCK__HAS_POPOVER);
		createEAttribute(actionBlockEClass, ACTION_BLOCK__POPOVER_ICON);
		createEAttribute(actionBlockEClass, ACTION_BLOCK__POPOVER_HELP_TEXT_EL);
		createEAttribute(actionBlockEClass, ACTION_BLOCK__POPOVER_HELP_TEXT_EN);
		createEAttribute(actionBlockEClass, ACTION_BLOCK__TITLE_BACKROUND_COLOR);
		createEReference(actionBlockEClass, ACTION_BLOCK__HAS_INFO);
		createEReference(actionBlockEClass, ACTION_BLOCK__HAS_INPUT);
		createEReference(actionBlockEClass, ACTION_BLOCK__HAS_SETTINGS_POPOVER);

		inputBlockEClass = createEClass(INPUT_BLOCK);
		createEAttribute(inputBlockEClass, INPUT_BLOCK__IMAGE);
		createEAttribute(inputBlockEClass, INPUT_BLOCK__INFO_TEXT_EN);
		createEAttribute(inputBlockEClass, INPUT_BLOCK__INFO_TEXT_EL);
		createEAttribute(inputBlockEClass, INPUT_BLOCK__VARIABLE_NAME);
		createEAttribute(inputBlockEClass, INPUT_BLOCK__ICON_CURSOR);

		selectInputBlockEClass = createEClass(SELECT_INPUT_BLOCK);
		createEReference(selectInputBlockEClass, SELECT_INPUT_BLOCK__HAS_OPTIONS);

		textInputBlockEClass = createEClass(TEXT_INPUT_BLOCK);
		createEAttribute(textInputBlockEClass, TEXT_INPUT_BLOCK__DEFAULT_VALUE_EL);
		createEAttribute(textInputBlockEClass, TEXT_INPUT_BLOCK__DEFAULT_VALUE_EN);

		integerInputBlockEClass = createEClass(INTEGER_INPUT_BLOCK);
		createEAttribute(integerInputBlockEClass, INTEGER_INPUT_BLOCK__NO_MIN_VALUE);
		createEAttribute(integerInputBlockEClass, INTEGER_INPUT_BLOCK__NO_MAX_VALUE);
		createEAttribute(integerInputBlockEClass, INTEGER_INPUT_BLOCK__NO_DEFAULT_VALUE);
		createEAttribute(integerInputBlockEClass, INTEGER_INPUT_BLOCK__DEFAULT_VALUE);
		createEAttribute(integerInputBlockEClass, INTEGER_INPUT_BLOCK__MAX_VALUE);
		createEAttribute(integerInputBlockEClass, INTEGER_INPUT_BLOCK__MIN_VALUE);

		floatInputBlockEClass = createEClass(FLOAT_INPUT_BLOCK);
		createEAttribute(floatInputBlockEClass, FLOAT_INPUT_BLOCK__NO_MAX_VALUE);
		createEAttribute(floatInputBlockEClass, FLOAT_INPUT_BLOCK__NO_MIN_VALUE);
		createEAttribute(floatInputBlockEClass, FLOAT_INPUT_BLOCK__NO_DEFAULT_VALUE);
		createEAttribute(floatInputBlockEClass, FLOAT_INPUT_BLOCK__MAX_VALUE);
		createEAttribute(floatInputBlockEClass, FLOAT_INPUT_BLOCK__DEFAULT_VALUE);
		createEAttribute(floatInputBlockEClass, FLOAT_INPUT_BLOCK__MIN_VALUE);

		popoverEClass = createEClass(POPOVER);
		createEAttribute(popoverEClass, POPOVER__POPOVER_TITLE_EL);
		createEAttribute(popoverEClass, POPOVER__POPOVER_TITLE_EN);

		configurationPopoverEClass = createEClass(CONFIGURATION_POPOVER);
		createEReference(configurationPopoverEClass, CONFIGURATION_POPOVER__HAS_INPUT);

		settingsPopoverEClass = createEClass(SETTINGS_POPOVER);
		createEReference(settingsPopoverEClass, SETTINGS_POPOVER__HAS_FORM);

		formEClass = createEClass(FORM);

		phrasesInputFormEClass = createEClass(PHRASES_INPUT_FORM);
		createEAttribute(phrasesInputFormEClass, PHRASES_INPUT_FORM__PLACEHOLDER_EL);
		createEAttribute(phrasesInputFormEClass, PHRASES_INPUT_FORM__PLACEHOLDER_EN);

		labeledInputFormEClass = createEClass(LABELED_INPUT_FORM);
		createEAttribute(labeledInputFormEClass, LABELED_INPUT_FORM__VARIABLE_NAME_EL);
		createEAttribute(labeledInputFormEClass, LABELED_INPUT_FORM__VARIABLE_NAME_EN);

		labeledTextInputFormEClass = createEClass(LABELED_TEXT_INPUT_FORM);
		createEAttribute(labeledTextInputFormEClass, LABELED_TEXT_INPUT_FORM__DEFAULT_VALUE_EN);
		createEAttribute(labeledTextInputFormEClass, LABELED_TEXT_INPUT_FORM__DEFAULT_VALUE_EL);

		labeledIntegerInputFormEClass = createEClass(LABELED_INTEGER_INPUT_FORM);
		createEAttribute(labeledIntegerInputFormEClass, LABELED_INTEGER_INPUT_FORM__DEFAULT_VALUE);
		createEAttribute(labeledIntegerInputFormEClass, LABELED_INTEGER_INPUT_FORM__MIN_VALUE);
		createEAttribute(labeledIntegerInputFormEClass, LABELED_INTEGER_INPUT_FORM__MAX_VALUE);
		createEAttribute(labeledIntegerInputFormEClass, LABELED_INTEGER_INPUT_FORM__NO_MAX_VALUE);
		createEAttribute(labeledIntegerInputFormEClass, LABELED_INTEGER_INPUT_FORM__NO_MIN_VALUE);
		createEAttribute(labeledIntegerInputFormEClass, LABELED_INTEGER_INPUT_FORM__NO_DEFAULT_VALUE);

		labeledFloatInputFormEClass = createEClass(LABELED_FLOAT_INPUT_FORM);
		createEAttribute(labeledFloatInputFormEClass, LABELED_FLOAT_INPUT_FORM__MIN_VALUE);
		createEAttribute(labeledFloatInputFormEClass, LABELED_FLOAT_INPUT_FORM__DEFAULT_VALUE);
		createEAttribute(labeledFloatInputFormEClass, LABELED_FLOAT_INPUT_FORM__MAX_VALUE);
		createEAttribute(labeledFloatInputFormEClass, LABELED_FLOAT_INPUT_FORM__NO_MAX_VALUE);
		createEAttribute(labeledFloatInputFormEClass, LABELED_FLOAT_INPUT_FORM__NO_MIN_VALUE);
		createEAttribute(labeledFloatInputFormEClass, LABELED_FLOAT_INPUT_FORM__NO_DEFAULT_VALUE);

		parameterInputFormEClass = createEClass(PARAMETER_INPUT_FORM);
		createEAttribute(parameterInputFormEClass, PARAMETER_INPUT_FORM__DEFAULT_VALUE_EL);
		createEAttribute(parameterInputFormEClass, PARAMETER_INPUT_FORM__DEFAULT_VALUE_EN);
		createEReference(parameterInputFormEClass, PARAMETER_INPUT_FORM__HAS_OPTIONS);

		conditionInputFormEClass = createEClass(CONDITION_INPUT_FORM);
		createEReference(conditionInputFormEClass, CONDITION_INPUT_FORM__HAS_OPTIONS);

		optionEClass = createEClass(OPTION);
		createEAttribute(optionEClass, OPTION__OPTION_TEXT_EL);
		createEAttribute(optionEClass, OPTION__OPTION_TEXT_EN);

		conditionOptionEClass = createEClass(CONDITION_OPTION);
		createEAttribute(conditionOptionEClass, CONDITION_OPTION__OPTION_TEXT_EL);
		createEAttribute(conditionOptionEClass, CONDITION_OPTION__OPTION_TEXT_EN);
		createEAttribute(conditionOptionEClass, CONDITION_OPTION__COMPARISON_TYPE);
		createEAttribute(conditionOptionEClass, CONDITION_OPTION__COMPARATORS);
		createEReference(conditionOptionEClass, CONDITION_OPTION__HAS_OPTIONS);

		// Create enums
		categoryEEnum = createEEnum(CATEGORY);
		cursorEEnum = createEEnum(CURSOR);
		imageBackgroundShapeEEnum = createEEnum(IMAGE_BACKGROUND_SHAPE);
		comparisonTypeEEnum = createEEnum(COMPARISON_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		referenceBlockEClass.getESuperTypes().add(this.getBlock());
		decisionBlockEClass.getESuperTypes().add(this.getBlock());
		actionBlockEClass.getESuperTypes().add(this.getBlock());
		selectInputBlockEClass.getESuperTypes().add(this.getInputBlock());
		textInputBlockEClass.getESuperTypes().add(this.getInputBlock());
		integerInputBlockEClass.getESuperTypes().add(this.getInputBlock());
		floatInputBlockEClass.getESuperTypes().add(this.getInputBlock());
		configurationPopoverEClass.getESuperTypes().add(this.getPopover());
		settingsPopoverEClass.getESuperTypes().add(this.getPopover());
		phrasesInputFormEClass.getESuperTypes().add(this.getForm());
		labeledInputFormEClass.getESuperTypes().add(this.getForm());
		labeledTextInputFormEClass.getESuperTypes().add(this.getLabeledInputForm());
		labeledIntegerInputFormEClass.getESuperTypes().add(this.getLabeledInputForm());
		labeledFloatInputFormEClass.getESuperTypes().add(this.getLabeledInputForm());
		parameterInputFormEClass.getESuperTypes().add(this.getForm());
		conditionInputFormEClass.getESuperTypes().add(this.getForm());

		// Initialize classes, features, and operations; add parameters
		initEClass(blockAppEClass, BlockApp.class, "BlockApp", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlockApp_HasBlock(), this.getBlock(), null, "hasBlock", null, 1, 1, BlockApp.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockEClass, Block.class, "Block", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBlock_Category(), this.getCategory(), "category", null, 1, 1, Block.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBlock_BackroundColor(), ecorePackage.getEString(), "backroundColor", null, 1, 1, Block.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getBlock_BlockNameEL(), ecorePackage.getEString(), "blockNameEL", null, 1, 1, Block.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getBlock_BlockNameEN(), ecorePackage.getEString(), "blockNameEN", null, 1, 1, Block.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(referenceBlockEClass, ReferenceBlock.class, "ReferenceBlock", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReferenceBlock_BlockTitleEL(), ecorePackage.getEString(), "blockTitleEL", null, 1, 1,
				ReferenceBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReferenceBlock_BlockTitleEN(), ecorePackage.getEString(), "blockTitleEN", null, 1, 1,
				ReferenceBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReferenceBlock_BlockImage(), ecorePackage.getEString(), "blockImage", null, 1, 1,
				ReferenceBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReferenceBlock_ImageBackroundShape(), this.getImageBackgroundShape(), "imageBackroundShape",
				null, 1, 1, ReferenceBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				!IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReferenceBlock_HasNextBlock(), ecorePackage.getEBoolean(), "hasNextBlock", null, 1, 1,
				ReferenceBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReferenceBlock_ImageCursor(), this.getCursor(), "imageCursor", null, 0, 1,
				ReferenceBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReferenceBlock_ImageBackroundShapeColor(), ecorePackage.getEString(),
				"imageBackroundShapeColor", "#FFFFFF", 0, 1, ReferenceBlock.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReferenceBlock_HasInfo(), this.getInformation(), null, "hasInfo", null, 1, 1,
				ReferenceBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(informationEClass, Information.class, "Information", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInformation_InformationTextEL(), ecorePackage.getEString(), "informationTextEL", null, 1, 1,
				Information.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInformation_InformationTextEN(), ecorePackage.getEString(), "informationTextEN", null, 1, 1,
				Information.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInformation_Cursor(), this.getCursor(), "cursor", null, 0, 1, Information.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(decisionBlockEClass, DecisionBlock.class, "DecisionBlock", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDecisionBlock_BlockImage(), ecorePackage.getEString(), "blockImage", null, 1, 1,
				DecisionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDecisionBlock_NumberOfColumns(), ecorePackage.getEInt(), "numberOfColumns", null, 1, 1,
				DecisionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDecisionBlock_BlockImageCursor(), this.getCursor(), "blockImageCursor", null, 0, 1,
				DecisionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getDecisionBlock_HasSettingsPopover(), this.getSettingsPopover(), null, "hasSettingsPopover",
				null, 0, 1, DecisionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecisionBlock_HasConfigurationPopover(), this.getConfigurationPopover(), null,
				"hasConfigurationPopover", null, 0, 1, DecisionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionBlockEClass, ActionBlock.class, "ActionBlock", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionBlock_BlockTitleEN(), ecorePackage.getEString(), "blockTitleEN", null, 1, 1,
				ActionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getActionBlock_BlockTitleEL(), ecorePackage.getEString(), "blockTitleEL", null, 1, 1,
				ActionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getActionBlock_BlockImage(), ecorePackage.getEString(), "blockImage", null, 1, 1,
				ActionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getActionBlock_HasPopover(), ecorePackage.getEBoolean(), "hasPopover", null, 1, 1,
				ActionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getActionBlock_PopoverIcon(), ecorePackage.getEString(), "popoverIcon", null, 0, 1,
				ActionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getActionBlock_PopoverHelpTextEL(), ecorePackage.getEString(), "popoverHelpTextEL", null, 0, 1,
				ActionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getActionBlock_PopoverHelpTextEN(), ecorePackage.getEString(), "popoverHelpTextEN", null, 0, 1,
				ActionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getActionBlock_TitleBackroundColor(), ecorePackage.getEString(), "titleBackroundColor",
				"#975e11", 0, 1, ActionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				!IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActionBlock_HasInfo(), this.getInformation(), null, "hasInfo", null, 1, 1, ActionBlock.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionBlock_HasInput(), this.getInputBlock(), null, "hasInput", null, 0, -1,
				ActionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionBlock_HasSettingsPopover(), this.getSettingsPopover(), null, "hasSettingsPopover", null,
				0, 1, ActionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputBlockEClass, InputBlock.class, "InputBlock", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputBlock_Image(), ecorePackage.getEString(), "image", null, 1, 1, InputBlock.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getInputBlock_InfoTextEN(), ecorePackage.getEString(), "infoTextEN", null, 1, 1,
				InputBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInputBlock_InfoTextEL(), ecorePackage.getEString(), "infoTextEL", null, 1, 1,
				InputBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInputBlock_VariableName(), ecorePackage.getEString(), "variableName", null, 1, 1,
				InputBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInputBlock_IconCursor(), this.getCursor(), "iconCursor", null, 0, 1, InputBlock.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(selectInputBlockEClass, SelectInputBlock.class, "SelectInputBlock", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSelectInputBlock_HasOptions(), this.getOption(), null, "hasOptions", null, 1, -1,
				SelectInputBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textInputBlockEClass, TextInputBlock.class, "TextInputBlock", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextInputBlock_DefaultValueEL(), ecorePackage.getEString(), "defaultValueEL", null, 0, 1,
				TextInputBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTextInputBlock_DefaultValueEN(), ecorePackage.getEString(), "defaultValueEN", null, 0, 1,
				TextInputBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		initEClass(integerInputBlockEClass, IntegerInputBlock.class, "IntegerInputBlock", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerInputBlock_NoMinValue(), ecorePackage.getEBoolean(), "noMinValue", "true", 1, 1,
				IntegerInputBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIntegerInputBlock_NoMaxValue(), ecorePackage.getEBoolean(), "noMaxValue", "true", 1, 1,
				IntegerInputBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIntegerInputBlock_NoDefaultValue(), ecorePackage.getEBoolean(), "noDefaultValue", "true", 1,
				1, IntegerInputBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				!IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIntegerInputBlock_DefaultValue(), ecorePackage.getEInt(), "defaultValue", null, 0, 1,
				IntegerInputBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIntegerInputBlock_MaxValue(), ecorePackage.getEInt(), "maxValue", null, 0, 1,
				IntegerInputBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIntegerInputBlock_MinValue(), ecorePackage.getEInt(), "minValue", null, 0, 1,
				IntegerInputBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		initEClass(floatInputBlockEClass, FloatInputBlock.class, "FloatInputBlock", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFloatInputBlock_NoMaxValue(), ecorePackage.getEBoolean(), "noMaxValue", "true", 1, 1,
				FloatInputBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFloatInputBlock_NoMinValue(), ecorePackage.getEBoolean(), "noMinValue", "true", 1, 1,
				FloatInputBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFloatInputBlock_NoDefaultValue(), ecorePackage.getEBoolean(), "noDefaultValue", "true", 1, 1,
				FloatInputBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFloatInputBlock_MaxValue(), ecorePackage.getEFloat(), "maxValue", null, 0, 1,
				FloatInputBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFloatInputBlock_DefaultValue(), ecorePackage.getEFloat(), "defaultValue", null, 0, 1,
				FloatInputBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFloatInputBlock_MinValue(), ecorePackage.getEFloat(), "minValue", null, 0, 1,
				FloatInputBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		initEClass(popoverEClass, Popover.class, "Popover", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPopover_PopoverTitleEL(), ecorePackage.getEString(), "popoverTitleEL", null, 1, 1,
				Popover.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPopover_PopoverTitleEN(), ecorePackage.getEString(), "popoverTitleEN", null, 1, 1,
				Popover.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		initEClass(configurationPopoverEClass, ConfigurationPopover.class, "ConfigurationPopover", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigurationPopover_HasInput(), this.getInputBlock(), null, "hasInput", null, 1, -1,
				ConfigurationPopover.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(settingsPopoverEClass, SettingsPopover.class, "SettingsPopover", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSettingsPopover_HasForm(), this.getForm(), null, "hasForm", null, 1, 1, SettingsPopover.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formEClass, Form.class, "Form", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(phrasesInputFormEClass, PhrasesInputForm.class, "PhrasesInputForm", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhrasesInputForm_PlaceholderEL(), ecorePackage.getEString(), "placeholderEL", null, 0, 1,
				PhrasesInputForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPhrasesInputForm_PlaceholderEN(), ecorePackage.getEString(), "placeholderEN", null, 0, 1,
				PhrasesInputForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		initEClass(labeledInputFormEClass, LabeledInputForm.class, "LabeledInputForm", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabeledInputForm_VariableNameEL(), ecorePackage.getEString(), "variableNameEL", null, 1, 1,
				LabeledInputForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLabeledInputForm_VariableNameEN(), ecorePackage.getEString(), "variableNameEN", null, 1, 1,
				LabeledInputForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);

		initEClass(labeledTextInputFormEClass, LabeledTextInputForm.class, "LabeledTextInputForm", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabeledTextInputForm_DefaultValueEN(), ecorePackage.getEString(), "defaultValueEN", null, 0,
				1, LabeledTextInputForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				!IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLabeledTextInputForm_DefaultValueEL(), ecorePackage.getEString(), "defaultValueEL", null, 0,
				1, LabeledTextInputForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				!IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(labeledIntegerInputFormEClass, LabeledIntegerInputForm.class, "LabeledIntegerInputForm",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabeledIntegerInputForm_DefaultValue(), ecorePackage.getEInt(), "defaultValue", null, 0, 1,
				LabeledIntegerInputForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				!IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLabeledIntegerInputForm_MinValue(), ecorePackage.getEInt(), "minValue", null, 0, 1,
				LabeledIntegerInputForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				!IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLabeledIntegerInputForm_MaxValue(), ecorePackage.getEInt(), "maxValue", null, 0, 1,
				LabeledIntegerInputForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				!IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLabeledIntegerInputForm_NoMaxValue(), ecorePackage.getEBoolean(), "noMaxValue", "true", 1, 1,
				LabeledIntegerInputForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				!IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLabeledIntegerInputForm_NoMinValue(), ecorePackage.getEBoolean(), "noMinValue", "true", 1, 1,
				LabeledIntegerInputForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				!IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLabeledIntegerInputForm_NoDefaultValue(), ecorePackage.getEBoolean(), "noDefaultValue",
				"true", 1, 1, LabeledIntegerInputForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(labeledFloatInputFormEClass, LabeledFloatInputForm.class, "LabeledFloatInputForm", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabeledFloatInputForm_MinValue(), ecorePackage.getEFloat(), "minValue", null, 0, 1,
				LabeledFloatInputForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				!IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLabeledFloatInputForm_DefaultValue(), ecorePackage.getEFloat(), "defaultValue", null, 0, 1,
				LabeledFloatInputForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				!IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLabeledFloatInputForm_MaxValue(), ecorePackage.getEFloat(), "maxValue", null, 0, 1,
				LabeledFloatInputForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				!IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLabeledFloatInputForm_NoMaxValue(), ecorePackage.getEBoolean(), "noMaxValue", "true", 1, 1,
				LabeledFloatInputForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				!IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLabeledFloatInputForm_NoMinValue(), ecorePackage.getEBoolean(), "noMinValue", "true", 1, 1,
				LabeledFloatInputForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				!IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLabeledFloatInputForm_NoDefaultValue(), ecorePackage.getEBoolean(), "noDefaultValue", "true",
				1, 1, LabeledFloatInputForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				!IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(parameterInputFormEClass, ParameterInputForm.class, "ParameterInputForm", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterInputForm_DefaultValueEL(), ecorePackage.getEString(), "defaultValueEL", null, 0, 1,
				ParameterInputForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				!IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getParameterInputForm_DefaultValueEN(), ecorePackage.getEString(), "defaultValueEN", null, 0, 1,
				ParameterInputForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				!IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getParameterInputForm_HasOptions(), this.getOption(), null, "hasOptions", null, 1, -1,
				ParameterInputForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionInputFormEClass, ConditionInputForm.class, "ConditionInputForm", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionInputForm_HasOptions(), this.getConditionOption(), null, "hasOptions", null, 1, -1,
				ConditionInputForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionEClass, Option.class, "Option", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOption_OptionTextEL(), ecorePackage.getEString(), "optionTextEL", null, 1, 1, Option.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getOption_OptionTextEN(), ecorePackage.getEString(), "optionTextEN", null, 1, 1, Option.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(conditionOptionEClass, ConditionOption.class, "ConditionOption", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConditionOption_OptionTextEL(), ecorePackage.getEString(), "optionTextEL", null, 1, 1,
				ConditionOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConditionOption_OptionTextEN(), ecorePackage.getEString(), "optionTextEN", null, 1, 1,
				ConditionOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConditionOption_ComparisonType(), this.getComparisonType(), "comparisonType", null, 1, 1,
				ConditionOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConditionOption_Comparators(), ecorePackage.getEString(), "comparators", null, 0, 6,
				ConditionOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getConditionOption_HasOptions(), this.getOption(), null, "hasOptions", null, 0, -1,
				ConditionOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(categoryEEnum, Category.class, "Category");
		addEEnumLiteral(categoryEEnum, Category.MOVEMENT);
		addEEnumLiteral(categoryEEnum, Category.DETECTION);
		addEEnumLiteral(categoryEEnum, Category.SOUND);
		addEEnumLiteral(categoryEEnum, Category.TOOLS);
		addEEnumLiteral(categoryEEnum, Category.VARIOUS);

		initEEnum(cursorEEnum, Cursor.class, "Cursor");
		addEEnumLiteral(cursorEEnum, Cursor.DEFAULT);
		addEEnumLiteral(cursorEEnum, Cursor.HELP);
		addEEnumLiteral(cursorEEnum, Cursor.POINTER);

		initEEnum(imageBackgroundShapeEEnum, ImageBackgroundShape.class, "ImageBackgroundShape");
		addEEnumLiteral(imageBackgroundShapeEEnum, ImageBackgroundShape.CIRCLE);
		addEEnumLiteral(imageBackgroundShapeEEnum, ImageBackgroundShape.SQUARE);
		addEEnumLiteral(imageBackgroundShapeEEnum, ImageBackgroundShape.HEXAGON);
		addEEnumLiteral(imageBackgroundShapeEEnum, ImageBackgroundShape.OCTAGON);

		initEEnum(comparisonTypeEEnum, ComparisonType.class, "ComparisonType");
		addEEnumLiteral(comparisonTypeEEnum, ComparisonType.NONE);
		addEEnumLiteral(comparisonTypeEEnum, ComparisonType.SELECT);
		addEEnumLiteral(comparisonTypeEEnum, ComparisonType.INPUT);

		// Create resource
		createResource(eNS_URI);
	}

} //BlockModelingMetamodelPackageImpl
