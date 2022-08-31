/**
 */
package blockModelingMetamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see blockModelingMetamodel.BlockModelingMetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface BlockModelingMetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "blockModelingMetamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/blockModelingMetamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "blockModelingMetamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BlockModelingMetamodelPackage eINSTANCE = blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link blockModelingMetamodel.impl.BlockAppImpl <em>Block App</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockModelingMetamodel.impl.BlockAppImpl
	 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getBlockApp()
	 * @generated
	 */
	int BLOCK_APP = 0;

	/**
	 * The feature id for the '<em><b>Has Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_APP__HAS_BLOCK = 0;

	/**
	 * The number of structural features of the '<em>Block App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_APP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Block App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_APP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link blockModelingMetamodel.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockModelingMetamodel.impl.BlockImpl
	 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 1;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__CATEGORY = 0;

	/**
	 * The feature id for the '<em><b>Backround Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__BACKROUND_COLOR = 1;

	/**
	 * The feature id for the '<em><b>Block Name EL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__BLOCK_NAME_EL = 2;

	/**
	 * The feature id for the '<em><b>Block Name EN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__BLOCK_NAME_EN = 3;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link blockModelingMetamodel.impl.ReferenceBlockImpl <em>Reference Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockModelingMetamodel.impl.ReferenceBlockImpl
	 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getReferenceBlock()
	 * @generated
	 */
	int REFERENCE_BLOCK = 2;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_BLOCK__CATEGORY = BLOCK__CATEGORY;

	/**
	 * The feature id for the '<em><b>Backround Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_BLOCK__BACKROUND_COLOR = BLOCK__BACKROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Block Name EL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_BLOCK__BLOCK_NAME_EL = BLOCK__BLOCK_NAME_EL;

	/**
	 * The feature id for the '<em><b>Block Name EN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_BLOCK__BLOCK_NAME_EN = BLOCK__BLOCK_NAME_EN;

	/**
	 * The feature id for the '<em><b>Block Title EL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_BLOCK__BLOCK_TITLE_EL = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Block Title EN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_BLOCK__BLOCK_TITLE_EN = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Block Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_BLOCK__BLOCK_IMAGE = BLOCK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Image Backround Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_BLOCK__IMAGE_BACKROUND_SHAPE = BLOCK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Has Next Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_BLOCK__HAS_NEXT_BLOCK = BLOCK_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Image Cursor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_BLOCK__IMAGE_CURSOR = BLOCK_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Image Backround Shape Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_BLOCK__IMAGE_BACKROUND_SHAPE_COLOR = BLOCK_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Has Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_BLOCK__HAS_INFO = BLOCK_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Reference Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_BLOCK_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Reference Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_BLOCK_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link blockModelingMetamodel.impl.InformationImpl <em>Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockModelingMetamodel.impl.InformationImpl
	 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getInformation()
	 * @generated
	 */
	int INFORMATION = 3;

	/**
	 * The feature id for the '<em><b>Information Text EL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__INFORMATION_TEXT_EL = 0;

	/**
	 * The feature id for the '<em><b>Information Text EN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__INFORMATION_TEXT_EN = 1;

	/**
	 * The feature id for the '<em><b>Cursor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__CURSOR = 2;

	/**
	 * The number of structural features of the '<em>Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link blockModelingMetamodel.impl.DecisionBlockImpl <em>Decision Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockModelingMetamodel.impl.DecisionBlockImpl
	 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getDecisionBlock()
	 * @generated
	 */
	int DECISION_BLOCK = 4;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_BLOCK__CATEGORY = BLOCK__CATEGORY;

	/**
	 * The feature id for the '<em><b>Backround Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_BLOCK__BACKROUND_COLOR = BLOCK__BACKROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Block Name EL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_BLOCK__BLOCK_NAME_EL = BLOCK__BLOCK_NAME_EL;

	/**
	 * The feature id for the '<em><b>Block Name EN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_BLOCK__BLOCK_NAME_EN = BLOCK__BLOCK_NAME_EN;

	/**
	 * The feature id for the '<em><b>Block Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_BLOCK__BLOCK_IMAGE = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Number Of Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_BLOCK__NUMBER_OF_COLUMNS = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Block Image Cursor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_BLOCK__BLOCK_IMAGE_CURSOR = BLOCK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Has Settings Popover</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_BLOCK__HAS_SETTINGS_POPOVER = BLOCK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Has Configuration Popover</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_BLOCK__HAS_CONFIGURATION_POPOVER = BLOCK_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Decision Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_BLOCK_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Decision Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_BLOCK_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link blockModelingMetamodel.impl.ActionBlockImpl <em>Action Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockModelingMetamodel.impl.ActionBlockImpl
	 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getActionBlock()
	 * @generated
	 */
	int ACTION_BLOCK = 5;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BLOCK__CATEGORY = BLOCK__CATEGORY;

	/**
	 * The feature id for the '<em><b>Backround Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BLOCK__BACKROUND_COLOR = BLOCK__BACKROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Block Name EL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BLOCK__BLOCK_NAME_EL = BLOCK__BLOCK_NAME_EL;

	/**
	 * The feature id for the '<em><b>Block Name EN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BLOCK__BLOCK_NAME_EN = BLOCK__BLOCK_NAME_EN;

	/**
	 * The feature id for the '<em><b>Block Title EN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BLOCK__BLOCK_TITLE_EN = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Block Title EL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BLOCK__BLOCK_TITLE_EL = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Block Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BLOCK__BLOCK_IMAGE = BLOCK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Has Popover</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BLOCK__HAS_POPOVER = BLOCK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Popover Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BLOCK__POPOVER_ICON = BLOCK_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Popover Help Text EL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BLOCK__POPOVER_HELP_TEXT_EL = BLOCK_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Popover Help Text EN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BLOCK__POPOVER_HELP_TEXT_EN = BLOCK_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Title Backround Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BLOCK__TITLE_BACKROUND_COLOR = BLOCK_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Has Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BLOCK__HAS_INFO = BLOCK_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Has Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BLOCK__HAS_INPUT = BLOCK_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Has Settings Popover</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BLOCK__HAS_SETTINGS_POPOVER = BLOCK_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Action Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BLOCK_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Action Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BLOCK_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link blockModelingMetamodel.impl.InputBlockImpl <em>Input Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockModelingMetamodel.impl.InputBlockImpl
	 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getInputBlock()
	 * @generated
	 */
	int INPUT_BLOCK = 6;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BLOCK__IMAGE = 0;

	/**
	 * The feature id for the '<em><b>Info Text EN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BLOCK__INFO_TEXT_EN = 1;

	/**
	 * The feature id for the '<em><b>Info Text EL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BLOCK__INFO_TEXT_EL = 2;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BLOCK__VARIABLE_NAME = 3;

	/**
	 * The feature id for the '<em><b>Icon Cursor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BLOCK__ICON_CURSOR = 4;

	/**
	 * The number of structural features of the '<em>Input Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BLOCK_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Input Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link blockModelingMetamodel.impl.SelectInputBlockImpl <em>Select Input Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockModelingMetamodel.impl.SelectInputBlockImpl
	 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getSelectInputBlock()
	 * @generated
	 */
	int SELECT_INPUT_BLOCK = 7;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_INPUT_BLOCK__IMAGE = INPUT_BLOCK__IMAGE;

	/**
	 * The feature id for the '<em><b>Info Text EN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_INPUT_BLOCK__INFO_TEXT_EN = INPUT_BLOCK__INFO_TEXT_EN;

	/**
	 * The feature id for the '<em><b>Info Text EL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_INPUT_BLOCK__INFO_TEXT_EL = INPUT_BLOCK__INFO_TEXT_EL;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_INPUT_BLOCK__VARIABLE_NAME = INPUT_BLOCK__VARIABLE_NAME;

	/**
	 * The feature id for the '<em><b>Icon Cursor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_INPUT_BLOCK__ICON_CURSOR = INPUT_BLOCK__ICON_CURSOR;

	/**
	 * The feature id for the '<em><b>Has Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_INPUT_BLOCK__HAS_OPTIONS = INPUT_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Select Input Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_INPUT_BLOCK_FEATURE_COUNT = INPUT_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Select Input Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_INPUT_BLOCK_OPERATION_COUNT = INPUT_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link blockModelingMetamodel.impl.TextInputBlockImpl <em>Text Input Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockModelingMetamodel.impl.TextInputBlockImpl
	 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getTextInputBlock()
	 * @generated
	 */
	int TEXT_INPUT_BLOCK = 8;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_BLOCK__IMAGE = INPUT_BLOCK__IMAGE;

	/**
	 * The feature id for the '<em><b>Info Text EN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_BLOCK__INFO_TEXT_EN = INPUT_BLOCK__INFO_TEXT_EN;

	/**
	 * The feature id for the '<em><b>Info Text EL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_BLOCK__INFO_TEXT_EL = INPUT_BLOCK__INFO_TEXT_EL;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_BLOCK__VARIABLE_NAME = INPUT_BLOCK__VARIABLE_NAME;

	/**
	 * The feature id for the '<em><b>Icon Cursor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_BLOCK__ICON_CURSOR = INPUT_BLOCK__ICON_CURSOR;

	/**
	 * The feature id for the '<em><b>Default Value EL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_BLOCK__DEFAULT_VALUE_EL = INPUT_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Value EN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_BLOCK__DEFAULT_VALUE_EN = INPUT_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Text Input Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_BLOCK_FEATURE_COUNT = INPUT_BLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Text Input Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_BLOCK_OPERATION_COUNT = INPUT_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link blockModelingMetamodel.impl.IntegerInputBlockImpl <em>Integer Input Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockModelingMetamodel.impl.IntegerInputBlockImpl
	 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getIntegerInputBlock()
	 * @generated
	 */
	int INTEGER_INPUT_BLOCK = 9;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_INPUT_BLOCK__IMAGE = INPUT_BLOCK__IMAGE;

	/**
	 * The feature id for the '<em><b>Info Text EN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_INPUT_BLOCK__INFO_TEXT_EN = INPUT_BLOCK__INFO_TEXT_EN;

	/**
	 * The feature id for the '<em><b>Info Text EL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_INPUT_BLOCK__INFO_TEXT_EL = INPUT_BLOCK__INFO_TEXT_EL;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_INPUT_BLOCK__VARIABLE_NAME = INPUT_BLOCK__VARIABLE_NAME;

	/**
	 * The feature id for the '<em><b>Icon Cursor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_INPUT_BLOCK__ICON_CURSOR = INPUT_BLOCK__ICON_CURSOR;

	/**
	 * The feature id for the '<em><b>No Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_INPUT_BLOCK__NO_MIN_VALUE = INPUT_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>No Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_INPUT_BLOCK__NO_MAX_VALUE = INPUT_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>No Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_INPUT_BLOCK__NO_DEFAULT_VALUE = INPUT_BLOCK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_INPUT_BLOCK__DEFAULT_VALUE = INPUT_BLOCK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_INPUT_BLOCK__MAX_VALUE = INPUT_BLOCK_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_INPUT_BLOCK__MIN_VALUE = INPUT_BLOCK_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Integer Input Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_INPUT_BLOCK_FEATURE_COUNT = INPUT_BLOCK_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Integer Input Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_INPUT_BLOCK_OPERATION_COUNT = INPUT_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link blockModelingMetamodel.impl.FloatInputBlockImpl <em>Float Input Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockModelingMetamodel.impl.FloatInputBlockImpl
	 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getFloatInputBlock()
	 * @generated
	 */
	int FLOAT_INPUT_BLOCK = 10;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_INPUT_BLOCK__IMAGE = INPUT_BLOCK__IMAGE;

	/**
	 * The feature id for the '<em><b>Info Text EN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_INPUT_BLOCK__INFO_TEXT_EN = INPUT_BLOCK__INFO_TEXT_EN;

	/**
	 * The feature id for the '<em><b>Info Text EL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_INPUT_BLOCK__INFO_TEXT_EL = INPUT_BLOCK__INFO_TEXT_EL;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_INPUT_BLOCK__VARIABLE_NAME = INPUT_BLOCK__VARIABLE_NAME;

	/**
	 * The feature id for the '<em><b>Icon Cursor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_INPUT_BLOCK__ICON_CURSOR = INPUT_BLOCK__ICON_CURSOR;

	/**
	 * The feature id for the '<em><b>No Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_INPUT_BLOCK__NO_MAX_VALUE = INPUT_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>No Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_INPUT_BLOCK__NO_MIN_VALUE = INPUT_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>No Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_INPUT_BLOCK__NO_DEFAULT_VALUE = INPUT_BLOCK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_INPUT_BLOCK__MAX_VALUE = INPUT_BLOCK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_INPUT_BLOCK__DEFAULT_VALUE = INPUT_BLOCK_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_INPUT_BLOCK__MIN_VALUE = INPUT_BLOCK_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Float Input Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_INPUT_BLOCK_FEATURE_COUNT = INPUT_BLOCK_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Float Input Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_INPUT_BLOCK_OPERATION_COUNT = INPUT_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link blockModelingMetamodel.impl.PopoverImpl <em>Popover</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockModelingMetamodel.impl.PopoverImpl
	 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getPopover()
	 * @generated
	 */
	int POPOVER = 11;

	/**
	 * The feature id for the '<em><b>Popover Title EL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPOVER__POPOVER_TITLE_EL = 0;

	/**
	 * The feature id for the '<em><b>Popover Title EN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPOVER__POPOVER_TITLE_EN = 1;

	/**
	 * The number of structural features of the '<em>Popover</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPOVER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Popover</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPOVER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link blockModelingMetamodel.impl.ConfigurationPopoverImpl <em>Configuration Popover</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockModelingMetamodel.impl.ConfigurationPopoverImpl
	 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getConfigurationPopover()
	 * @generated
	 */
	int CONFIGURATION_POPOVER = 12;

	/**
	 * The feature id for the '<em><b>Popover Title EL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_POPOVER__POPOVER_TITLE_EL = POPOVER__POPOVER_TITLE_EL;

	/**
	 * The feature id for the '<em><b>Popover Title EN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_POPOVER__POPOVER_TITLE_EN = POPOVER__POPOVER_TITLE_EN;

	/**
	 * The feature id for the '<em><b>Has Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_POPOVER__HAS_INPUT = POPOVER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Configuration Popover</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_POPOVER_FEATURE_COUNT = POPOVER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Configuration Popover</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_POPOVER_OPERATION_COUNT = POPOVER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link blockModelingMetamodel.impl.SettingsPopoverImpl <em>Settings Popover</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockModelingMetamodel.impl.SettingsPopoverImpl
	 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getSettingsPopover()
	 * @generated
	 */
	int SETTINGS_POPOVER = 13;

	/**
	 * The feature id for the '<em><b>Popover Title EL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS_POPOVER__POPOVER_TITLE_EL = POPOVER__POPOVER_TITLE_EL;

	/**
	 * The feature id for the '<em><b>Popover Title EN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS_POPOVER__POPOVER_TITLE_EN = POPOVER__POPOVER_TITLE_EN;

	/**
	 * The feature id for the '<em><b>Has Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS_POPOVER__HAS_FORM = POPOVER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Settings Popover</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS_POPOVER_FEATURE_COUNT = POPOVER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Settings Popover</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS_POPOVER_OPERATION_COUNT = POPOVER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link blockModelingMetamodel.impl.FormImpl <em>Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockModelingMetamodel.impl.FormImpl
	 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getForm()
	 * @generated
	 */
	int FORM = 14;

	/**
	 * The number of structural features of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link blockModelingMetamodel.impl.PhrasesInputFormImpl <em>Phrases Input Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockModelingMetamodel.impl.PhrasesInputFormImpl
	 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getPhrasesInputForm()
	 * @generated
	 */
	int PHRASES_INPUT_FORM = 15;

	/**
	 * The feature id for the '<em><b>Placeholder EL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHRASES_INPUT_FORM__PLACEHOLDER_EL = FORM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Placeholder EN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHRASES_INPUT_FORM__PLACEHOLDER_EN = FORM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Phrases Input Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHRASES_INPUT_FORM_FEATURE_COUNT = FORM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Phrases Input Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHRASES_INPUT_FORM_OPERATION_COUNT = FORM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link blockModelingMetamodel.impl.LabeledInputFormImpl <em>Labeled Input Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockModelingMetamodel.impl.LabeledInputFormImpl
	 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getLabeledInputForm()
	 * @generated
	 */
	int LABELED_INPUT_FORM = 16;

	/**
	 * The feature id for the '<em><b>Variable Name EL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_INPUT_FORM__VARIABLE_NAME_EL = FORM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable Name EN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_INPUT_FORM__VARIABLE_NAME_EN = FORM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Labeled Input Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_INPUT_FORM_FEATURE_COUNT = FORM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Labeled Input Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_INPUT_FORM_OPERATION_COUNT = FORM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link blockModelingMetamodel.impl.LabeledTextInputFormImpl <em>Labeled Text Input Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockModelingMetamodel.impl.LabeledTextInputFormImpl
	 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getLabeledTextInputForm()
	 * @generated
	 */
	int LABELED_TEXT_INPUT_FORM = 17;

	/**
	 * The feature id for the '<em><b>Variable Name EL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_TEXT_INPUT_FORM__VARIABLE_NAME_EL = LABELED_INPUT_FORM__VARIABLE_NAME_EL;

	/**
	 * The feature id for the '<em><b>Variable Name EN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_TEXT_INPUT_FORM__VARIABLE_NAME_EN = LABELED_INPUT_FORM__VARIABLE_NAME_EN;

	/**
	 * The feature id for the '<em><b>Default Value EN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_TEXT_INPUT_FORM__DEFAULT_VALUE_EN = LABELED_INPUT_FORM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Value EL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_TEXT_INPUT_FORM__DEFAULT_VALUE_EL = LABELED_INPUT_FORM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Labeled Text Input Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_TEXT_INPUT_FORM_FEATURE_COUNT = LABELED_INPUT_FORM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Labeled Text Input Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_TEXT_INPUT_FORM_OPERATION_COUNT = LABELED_INPUT_FORM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link blockModelingMetamodel.impl.LabeledIntegerInputFormImpl <em>Labeled Integer Input Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockModelingMetamodel.impl.LabeledIntegerInputFormImpl
	 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getLabeledIntegerInputForm()
	 * @generated
	 */
	int LABELED_INTEGER_INPUT_FORM = 18;

	/**
	 * The feature id for the '<em><b>Variable Name EL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_INTEGER_INPUT_FORM__VARIABLE_NAME_EL = LABELED_INPUT_FORM__VARIABLE_NAME_EL;

	/**
	 * The feature id for the '<em><b>Variable Name EN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_INTEGER_INPUT_FORM__VARIABLE_NAME_EN = LABELED_INPUT_FORM__VARIABLE_NAME_EN;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_INTEGER_INPUT_FORM__DEFAULT_VALUE = LABELED_INPUT_FORM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_INTEGER_INPUT_FORM__MIN_VALUE = LABELED_INPUT_FORM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_INTEGER_INPUT_FORM__MAX_VALUE = LABELED_INPUT_FORM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>No Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_INTEGER_INPUT_FORM__NO_MAX_VALUE = LABELED_INPUT_FORM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>No Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_INTEGER_INPUT_FORM__NO_MIN_VALUE = LABELED_INPUT_FORM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>No Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_INTEGER_INPUT_FORM__NO_DEFAULT_VALUE = LABELED_INPUT_FORM_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Labeled Integer Input Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_INTEGER_INPUT_FORM_FEATURE_COUNT = LABELED_INPUT_FORM_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Labeled Integer Input Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_INTEGER_INPUT_FORM_OPERATION_COUNT = LABELED_INPUT_FORM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link blockModelingMetamodel.impl.LabeledFloatInputFormImpl <em>Labeled Float Input Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockModelingMetamodel.impl.LabeledFloatInputFormImpl
	 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getLabeledFloatInputForm()
	 * @generated
	 */
	int LABELED_FLOAT_INPUT_FORM = 19;

	/**
	 * The feature id for the '<em><b>Variable Name EL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_FLOAT_INPUT_FORM__VARIABLE_NAME_EL = LABELED_INPUT_FORM__VARIABLE_NAME_EL;

	/**
	 * The feature id for the '<em><b>Variable Name EN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_FLOAT_INPUT_FORM__VARIABLE_NAME_EN = LABELED_INPUT_FORM__VARIABLE_NAME_EN;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_FLOAT_INPUT_FORM__MIN_VALUE = LABELED_INPUT_FORM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_FLOAT_INPUT_FORM__DEFAULT_VALUE = LABELED_INPUT_FORM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_FLOAT_INPUT_FORM__MAX_VALUE = LABELED_INPUT_FORM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>No Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_FLOAT_INPUT_FORM__NO_MAX_VALUE = LABELED_INPUT_FORM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>No Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_FLOAT_INPUT_FORM__NO_MIN_VALUE = LABELED_INPUT_FORM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>No Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_FLOAT_INPUT_FORM__NO_DEFAULT_VALUE = LABELED_INPUT_FORM_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Labeled Float Input Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_FLOAT_INPUT_FORM_FEATURE_COUNT = LABELED_INPUT_FORM_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Labeled Float Input Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_FLOAT_INPUT_FORM_OPERATION_COUNT = LABELED_INPUT_FORM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link blockModelingMetamodel.impl.ParameterInputFormImpl <em>Parameter Input Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockModelingMetamodel.impl.ParameterInputFormImpl
	 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getParameterInputForm()
	 * @generated
	 */
	int PARAMETER_INPUT_FORM = 20;

	/**
	 * The feature id for the '<em><b>Default Value EL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_INPUT_FORM__DEFAULT_VALUE_EL = FORM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Value EN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_INPUT_FORM__DEFAULT_VALUE_EN = FORM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_INPUT_FORM__HAS_OPTIONS = FORM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Parameter Input Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_INPUT_FORM_FEATURE_COUNT = FORM_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Parameter Input Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_INPUT_FORM_OPERATION_COUNT = FORM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link blockModelingMetamodel.impl.ConditionInputFormImpl <em>Condition Input Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockModelingMetamodel.impl.ConditionInputFormImpl
	 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getConditionInputForm()
	 * @generated
	 */
	int CONDITION_INPUT_FORM = 21;

	/**
	 * The feature id for the '<em><b>Has Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_INPUT_FORM__HAS_OPTIONS = FORM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Condition Input Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_INPUT_FORM_FEATURE_COUNT = FORM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Condition Input Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_INPUT_FORM_OPERATION_COUNT = FORM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link blockModelingMetamodel.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockModelingMetamodel.impl.OptionImpl
	 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getOption()
	 * @generated
	 */
	int OPTION = 22;

	/**
	 * The feature id for the '<em><b>Option Text EL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__OPTION_TEXT_EL = 0;

	/**
	 * The feature id for the '<em><b>Option Text EN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__OPTION_TEXT_EN = 1;

	/**
	 * The number of structural features of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link blockModelingMetamodel.impl.ConditionOptionImpl <em>Condition Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockModelingMetamodel.impl.ConditionOptionImpl
	 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getConditionOption()
	 * @generated
	 */
	int CONDITION_OPTION = 23;

	/**
	 * The feature id for the '<em><b>Option Text EL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPTION__OPTION_TEXT_EL = 0;

	/**
	 * The feature id for the '<em><b>Option Text EN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPTION__OPTION_TEXT_EN = 1;

	/**
	 * The feature id for the '<em><b>Comparison Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPTION__COMPARISON_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Comparators</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPTION__COMPARATORS = 3;

	/**
	 * The feature id for the '<em><b>Has Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPTION__HAS_OPTIONS = 4;

	/**
	 * The number of structural features of the '<em>Condition Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPTION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Condition Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link blockModelingMetamodel.Category <em>Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockModelingMetamodel.Category
	 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 24;

	/**
	 * The meta object id for the '{@link blockModelingMetamodel.Cursor <em>Cursor</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockModelingMetamodel.Cursor
	 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getCursor()
	 * @generated
	 */
	int CURSOR = 25;

	/**
	 * The meta object id for the '{@link blockModelingMetamodel.ImageBackgroundShape <em>Image Background Shape</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockModelingMetamodel.ImageBackgroundShape
	 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getImageBackgroundShape()
	 * @generated
	 */
	int IMAGE_BACKGROUND_SHAPE = 26;

	/**
	 * The meta object id for the '{@link blockModelingMetamodel.ComparisonType <em>Comparison Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockModelingMetamodel.ComparisonType
	 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getComparisonType()
	 * @generated
	 */
	int COMPARISON_TYPE = 27;

	/**
	 * Returns the meta object for class '{@link blockModelingMetamodel.BlockApp <em>Block App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block App</em>'.
	 * @see blockModelingMetamodel.BlockApp
	 * @generated
	 */
	EClass getBlockApp();

	/**
	 * Returns the meta object for the containment reference '{@link blockModelingMetamodel.BlockApp#getHasBlock <em>Has Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Block</em>'.
	 * @see blockModelingMetamodel.BlockApp#getHasBlock()
	 * @see #getBlockApp()
	 * @generated
	 */
	EReference getBlockApp_HasBlock();

	/**
	 * Returns the meta object for class '{@link blockModelingMetamodel.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see blockModelingMetamodel.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.Block#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see blockModelingMetamodel.Block#getCategory()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_Category();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.Block#getBackroundColor <em>Backround Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Backround Color</em>'.
	 * @see blockModelingMetamodel.Block#getBackroundColor()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_BackroundColor();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.Block#getBlockNameEL <em>Block Name EL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block Name EL</em>'.
	 * @see blockModelingMetamodel.Block#getBlockNameEL()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_BlockNameEL();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.Block#getBlockNameEN <em>Block Name EN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block Name EN</em>'.
	 * @see blockModelingMetamodel.Block#getBlockNameEN()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_BlockNameEN();

	/**
	 * Returns the meta object for class '{@link blockModelingMetamodel.ReferenceBlock <em>Reference Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Block</em>'.
	 * @see blockModelingMetamodel.ReferenceBlock
	 * @generated
	 */
	EClass getReferenceBlock();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.ReferenceBlock#getBlockTitleEL <em>Block Title EL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block Title EL</em>'.
	 * @see blockModelingMetamodel.ReferenceBlock#getBlockTitleEL()
	 * @see #getReferenceBlock()
	 * @generated
	 */
	EAttribute getReferenceBlock_BlockTitleEL();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.ReferenceBlock#getBlockTitleEN <em>Block Title EN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block Title EN</em>'.
	 * @see blockModelingMetamodel.ReferenceBlock#getBlockTitleEN()
	 * @see #getReferenceBlock()
	 * @generated
	 */
	EAttribute getReferenceBlock_BlockTitleEN();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.ReferenceBlock#getBlockImage <em>Block Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block Image</em>'.
	 * @see blockModelingMetamodel.ReferenceBlock#getBlockImage()
	 * @see #getReferenceBlock()
	 * @generated
	 */
	EAttribute getReferenceBlock_BlockImage();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.ReferenceBlock#getImageBackroundShape <em>Image Backround Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Backround Shape</em>'.
	 * @see blockModelingMetamodel.ReferenceBlock#getImageBackroundShape()
	 * @see #getReferenceBlock()
	 * @generated
	 */
	EAttribute getReferenceBlock_ImageBackroundShape();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.ReferenceBlock#isHasNextBlock <em>Has Next Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Next Block</em>'.
	 * @see blockModelingMetamodel.ReferenceBlock#isHasNextBlock()
	 * @see #getReferenceBlock()
	 * @generated
	 */
	EAttribute getReferenceBlock_HasNextBlock();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.ReferenceBlock#getImageCursor <em>Image Cursor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Cursor</em>'.
	 * @see blockModelingMetamodel.ReferenceBlock#getImageCursor()
	 * @see #getReferenceBlock()
	 * @generated
	 */
	EAttribute getReferenceBlock_ImageCursor();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.ReferenceBlock#getImageBackroundShapeColor <em>Image Backround Shape Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Backround Shape Color</em>'.
	 * @see blockModelingMetamodel.ReferenceBlock#getImageBackroundShapeColor()
	 * @see #getReferenceBlock()
	 * @generated
	 */
	EAttribute getReferenceBlock_ImageBackroundShapeColor();

	/**
	 * Returns the meta object for the containment reference '{@link blockModelingMetamodel.ReferenceBlock#getHasInfo <em>Has Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Info</em>'.
	 * @see blockModelingMetamodel.ReferenceBlock#getHasInfo()
	 * @see #getReferenceBlock()
	 * @generated
	 */
	EReference getReferenceBlock_HasInfo();

	/**
	 * Returns the meta object for class '{@link blockModelingMetamodel.Information <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information</em>'.
	 * @see blockModelingMetamodel.Information
	 * @generated
	 */
	EClass getInformation();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.Information#getInformationTextEL <em>Information Text EL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Information Text EL</em>'.
	 * @see blockModelingMetamodel.Information#getInformationTextEL()
	 * @see #getInformation()
	 * @generated
	 */
	EAttribute getInformation_InformationTextEL();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.Information#getInformationTextEN <em>Information Text EN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Information Text EN</em>'.
	 * @see blockModelingMetamodel.Information#getInformationTextEN()
	 * @see #getInformation()
	 * @generated
	 */
	EAttribute getInformation_InformationTextEN();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.Information#getCursor <em>Cursor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cursor</em>'.
	 * @see blockModelingMetamodel.Information#getCursor()
	 * @see #getInformation()
	 * @generated
	 */
	EAttribute getInformation_Cursor();

	/**
	 * Returns the meta object for class '{@link blockModelingMetamodel.DecisionBlock <em>Decision Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Block</em>'.
	 * @see blockModelingMetamodel.DecisionBlock
	 * @generated
	 */
	EClass getDecisionBlock();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.DecisionBlock#getBlockImage <em>Block Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block Image</em>'.
	 * @see blockModelingMetamodel.DecisionBlock#getBlockImage()
	 * @see #getDecisionBlock()
	 * @generated
	 */
	EAttribute getDecisionBlock_BlockImage();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.DecisionBlock#getNumberOfColumns <em>Number Of Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Columns</em>'.
	 * @see blockModelingMetamodel.DecisionBlock#getNumberOfColumns()
	 * @see #getDecisionBlock()
	 * @generated
	 */
	EAttribute getDecisionBlock_NumberOfColumns();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.DecisionBlock#getBlockImageCursor <em>Block Image Cursor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block Image Cursor</em>'.
	 * @see blockModelingMetamodel.DecisionBlock#getBlockImageCursor()
	 * @see #getDecisionBlock()
	 * @generated
	 */
	EAttribute getDecisionBlock_BlockImageCursor();

	/**
	 * Returns the meta object for the containment reference '{@link blockModelingMetamodel.DecisionBlock#getHasSettingsPopover <em>Has Settings Popover</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Settings Popover</em>'.
	 * @see blockModelingMetamodel.DecisionBlock#getHasSettingsPopover()
	 * @see #getDecisionBlock()
	 * @generated
	 */
	EReference getDecisionBlock_HasSettingsPopover();

	/**
	 * Returns the meta object for the containment reference '{@link blockModelingMetamodel.DecisionBlock#getHasConfigurationPopover <em>Has Configuration Popover</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Configuration Popover</em>'.
	 * @see blockModelingMetamodel.DecisionBlock#getHasConfigurationPopover()
	 * @see #getDecisionBlock()
	 * @generated
	 */
	EReference getDecisionBlock_HasConfigurationPopover();

	/**
	 * Returns the meta object for class '{@link blockModelingMetamodel.ActionBlock <em>Action Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Block</em>'.
	 * @see blockModelingMetamodel.ActionBlock
	 * @generated
	 */
	EClass getActionBlock();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.ActionBlock#getBlockTitleEN <em>Block Title EN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block Title EN</em>'.
	 * @see blockModelingMetamodel.ActionBlock#getBlockTitleEN()
	 * @see #getActionBlock()
	 * @generated
	 */
	EAttribute getActionBlock_BlockTitleEN();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.ActionBlock#getBlockTitleEL <em>Block Title EL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block Title EL</em>'.
	 * @see blockModelingMetamodel.ActionBlock#getBlockTitleEL()
	 * @see #getActionBlock()
	 * @generated
	 */
	EAttribute getActionBlock_BlockTitleEL();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.ActionBlock#getBlockImage <em>Block Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block Image</em>'.
	 * @see blockModelingMetamodel.ActionBlock#getBlockImage()
	 * @see #getActionBlock()
	 * @generated
	 */
	EAttribute getActionBlock_BlockImage();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.ActionBlock#isHasPopover <em>Has Popover</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Popover</em>'.
	 * @see blockModelingMetamodel.ActionBlock#isHasPopover()
	 * @see #getActionBlock()
	 * @generated
	 */
	EAttribute getActionBlock_HasPopover();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.ActionBlock#getPopoverIcon <em>Popover Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Popover Icon</em>'.
	 * @see blockModelingMetamodel.ActionBlock#getPopoverIcon()
	 * @see #getActionBlock()
	 * @generated
	 */
	EAttribute getActionBlock_PopoverIcon();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.ActionBlock#getPopoverHelpTextEL <em>Popover Help Text EL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Popover Help Text EL</em>'.
	 * @see blockModelingMetamodel.ActionBlock#getPopoverHelpTextEL()
	 * @see #getActionBlock()
	 * @generated
	 */
	EAttribute getActionBlock_PopoverHelpTextEL();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.ActionBlock#getPopoverHelpTextEN <em>Popover Help Text EN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Popover Help Text EN</em>'.
	 * @see blockModelingMetamodel.ActionBlock#getPopoverHelpTextEN()
	 * @see #getActionBlock()
	 * @generated
	 */
	EAttribute getActionBlock_PopoverHelpTextEN();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.ActionBlock#getTitleBackroundColor <em>Title Backround Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title Backround Color</em>'.
	 * @see blockModelingMetamodel.ActionBlock#getTitleBackroundColor()
	 * @see #getActionBlock()
	 * @generated
	 */
	EAttribute getActionBlock_TitleBackroundColor();

	/**
	 * Returns the meta object for the containment reference '{@link blockModelingMetamodel.ActionBlock#getHasInfo <em>Has Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Info</em>'.
	 * @see blockModelingMetamodel.ActionBlock#getHasInfo()
	 * @see #getActionBlock()
	 * @generated
	 */
	EReference getActionBlock_HasInfo();

	/**
	 * Returns the meta object for the containment reference list '{@link blockModelingMetamodel.ActionBlock#getHasInput <em>Has Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Input</em>'.
	 * @see blockModelingMetamodel.ActionBlock#getHasInput()
	 * @see #getActionBlock()
	 * @generated
	 */
	EReference getActionBlock_HasInput();

	/**
	 * Returns the meta object for the containment reference '{@link blockModelingMetamodel.ActionBlock#getHasSettingsPopover <em>Has Settings Popover</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Settings Popover</em>'.
	 * @see blockModelingMetamodel.ActionBlock#getHasSettingsPopover()
	 * @see #getActionBlock()
	 * @generated
	 */
	EReference getActionBlock_HasSettingsPopover();

	/**
	 * Returns the meta object for class '{@link blockModelingMetamodel.InputBlock <em>Input Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Block</em>'.
	 * @see blockModelingMetamodel.InputBlock
	 * @generated
	 */
	EClass getInputBlock();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.InputBlock#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see blockModelingMetamodel.InputBlock#getImage()
	 * @see #getInputBlock()
	 * @generated
	 */
	EAttribute getInputBlock_Image();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.InputBlock#getInfoTextEN <em>Info Text EN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Info Text EN</em>'.
	 * @see blockModelingMetamodel.InputBlock#getInfoTextEN()
	 * @see #getInputBlock()
	 * @generated
	 */
	EAttribute getInputBlock_InfoTextEN();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.InputBlock#getInfoTextEL <em>Info Text EL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Info Text EL</em>'.
	 * @see blockModelingMetamodel.InputBlock#getInfoTextEL()
	 * @see #getInputBlock()
	 * @generated
	 */
	EAttribute getInputBlock_InfoTextEL();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.InputBlock#getVariableName <em>Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Name</em>'.
	 * @see blockModelingMetamodel.InputBlock#getVariableName()
	 * @see #getInputBlock()
	 * @generated
	 */
	EAttribute getInputBlock_VariableName();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.InputBlock#getIconCursor <em>Icon Cursor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon Cursor</em>'.
	 * @see blockModelingMetamodel.InputBlock#getIconCursor()
	 * @see #getInputBlock()
	 * @generated
	 */
	EAttribute getInputBlock_IconCursor();

	/**
	 * Returns the meta object for class '{@link blockModelingMetamodel.SelectInputBlock <em>Select Input Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select Input Block</em>'.
	 * @see blockModelingMetamodel.SelectInputBlock
	 * @generated
	 */
	EClass getSelectInputBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link blockModelingMetamodel.SelectInputBlock#getHasOptions <em>Has Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Options</em>'.
	 * @see blockModelingMetamodel.SelectInputBlock#getHasOptions()
	 * @see #getSelectInputBlock()
	 * @generated
	 */
	EReference getSelectInputBlock_HasOptions();

	/**
	 * Returns the meta object for class '{@link blockModelingMetamodel.TextInputBlock <em>Text Input Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Input Block</em>'.
	 * @see blockModelingMetamodel.TextInputBlock
	 * @generated
	 */
	EClass getTextInputBlock();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.TextInputBlock#getDefaultValueEL <em>Default Value EL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value EL</em>'.
	 * @see blockModelingMetamodel.TextInputBlock#getDefaultValueEL()
	 * @see #getTextInputBlock()
	 * @generated
	 */
	EAttribute getTextInputBlock_DefaultValueEL();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.TextInputBlock#getDefaultValueEN <em>Default Value EN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value EN</em>'.
	 * @see blockModelingMetamodel.TextInputBlock#getDefaultValueEN()
	 * @see #getTextInputBlock()
	 * @generated
	 */
	EAttribute getTextInputBlock_DefaultValueEN();

	/**
	 * Returns the meta object for class '{@link blockModelingMetamodel.IntegerInputBlock <em>Integer Input Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Input Block</em>'.
	 * @see blockModelingMetamodel.IntegerInputBlock
	 * @generated
	 */
	EClass getIntegerInputBlock();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.IntegerInputBlock#isNoMinValue <em>No Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Min Value</em>'.
	 * @see blockModelingMetamodel.IntegerInputBlock#isNoMinValue()
	 * @see #getIntegerInputBlock()
	 * @generated
	 */
	EAttribute getIntegerInputBlock_NoMinValue();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.IntegerInputBlock#isNoMaxValue <em>No Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Max Value</em>'.
	 * @see blockModelingMetamodel.IntegerInputBlock#isNoMaxValue()
	 * @see #getIntegerInputBlock()
	 * @generated
	 */
	EAttribute getIntegerInputBlock_NoMaxValue();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.IntegerInputBlock#isNoDefaultValue <em>No Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Default Value</em>'.
	 * @see blockModelingMetamodel.IntegerInputBlock#isNoDefaultValue()
	 * @see #getIntegerInputBlock()
	 * @generated
	 */
	EAttribute getIntegerInputBlock_NoDefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.IntegerInputBlock#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see blockModelingMetamodel.IntegerInputBlock#getMinValue()
	 * @see #getIntegerInputBlock()
	 * @generated
	 */
	EAttribute getIntegerInputBlock_MinValue();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.IntegerInputBlock#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see blockModelingMetamodel.IntegerInputBlock#getMaxValue()
	 * @see #getIntegerInputBlock()
	 * @generated
	 */
	EAttribute getIntegerInputBlock_MaxValue();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.IntegerInputBlock#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see blockModelingMetamodel.IntegerInputBlock#getDefaultValue()
	 * @see #getIntegerInputBlock()
	 * @generated
	 */
	EAttribute getIntegerInputBlock_DefaultValue();

	/**
	 * Returns the meta object for class '{@link blockModelingMetamodel.FloatInputBlock <em>Float Input Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Input Block</em>'.
	 * @see blockModelingMetamodel.FloatInputBlock
	 * @generated
	 */
	EClass getFloatInputBlock();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.FloatInputBlock#isNoMaxValue <em>No Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Max Value</em>'.
	 * @see blockModelingMetamodel.FloatInputBlock#isNoMaxValue()
	 * @see #getFloatInputBlock()
	 * @generated
	 */
	EAttribute getFloatInputBlock_NoMaxValue();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.FloatInputBlock#isNoMinValue <em>No Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Min Value</em>'.
	 * @see blockModelingMetamodel.FloatInputBlock#isNoMinValue()
	 * @see #getFloatInputBlock()
	 * @generated
	 */
	EAttribute getFloatInputBlock_NoMinValue();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.FloatInputBlock#isNoDefaultValue <em>No Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Default Value</em>'.
	 * @see blockModelingMetamodel.FloatInputBlock#isNoDefaultValue()
	 * @see #getFloatInputBlock()
	 * @generated
	 */
	EAttribute getFloatInputBlock_NoDefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.FloatInputBlock#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see blockModelingMetamodel.FloatInputBlock#getMinValue()
	 * @see #getFloatInputBlock()
	 * @generated
	 */
	EAttribute getFloatInputBlock_MinValue();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.FloatInputBlock#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see blockModelingMetamodel.FloatInputBlock#getMaxValue()
	 * @see #getFloatInputBlock()
	 * @generated
	 */
	EAttribute getFloatInputBlock_MaxValue();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.FloatInputBlock#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see blockModelingMetamodel.FloatInputBlock#getDefaultValue()
	 * @see #getFloatInputBlock()
	 * @generated
	 */
	EAttribute getFloatInputBlock_DefaultValue();

	/**
	 * Returns the meta object for class '{@link blockModelingMetamodel.Popover <em>Popover</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Popover</em>'.
	 * @see blockModelingMetamodel.Popover
	 * @generated
	 */
	EClass getPopover();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.Popover#getPopoverTitleEL <em>Popover Title EL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Popover Title EL</em>'.
	 * @see blockModelingMetamodel.Popover#getPopoverTitleEL()
	 * @see #getPopover()
	 * @generated
	 */
	EAttribute getPopover_PopoverTitleEL();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.Popover#getPopoverTitleEN <em>Popover Title EN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Popover Title EN</em>'.
	 * @see blockModelingMetamodel.Popover#getPopoverTitleEN()
	 * @see #getPopover()
	 * @generated
	 */
	EAttribute getPopover_PopoverTitleEN();

	/**
	 * Returns the meta object for class '{@link blockModelingMetamodel.ConfigurationPopover <em>Configuration Popover</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Popover</em>'.
	 * @see blockModelingMetamodel.ConfigurationPopover
	 * @generated
	 */
	EClass getConfigurationPopover();

	/**
	 * Returns the meta object for the containment reference list '{@link blockModelingMetamodel.ConfigurationPopover#getHasInput <em>Has Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Input</em>'.
	 * @see blockModelingMetamodel.ConfigurationPopover#getHasInput()
	 * @see #getConfigurationPopover()
	 * @generated
	 */
	EReference getConfigurationPopover_HasInput();

	/**
	 * Returns the meta object for class '{@link blockModelingMetamodel.SettingsPopover <em>Settings Popover</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Settings Popover</em>'.
	 * @see blockModelingMetamodel.SettingsPopover
	 * @generated
	 */
	EClass getSettingsPopover();

	/**
	 * Returns the meta object for the containment reference '{@link blockModelingMetamodel.SettingsPopover#getHasForm <em>Has Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Form</em>'.
	 * @see blockModelingMetamodel.SettingsPopover#getHasForm()
	 * @see #getSettingsPopover()
	 * @generated
	 */
	EReference getSettingsPopover_HasForm();

	/**
	 * Returns the meta object for class '{@link blockModelingMetamodel.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form</em>'.
	 * @see blockModelingMetamodel.Form
	 * @generated
	 */
	EClass getForm();

	/**
	 * Returns the meta object for class '{@link blockModelingMetamodel.PhrasesInputForm <em>Phrases Input Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phrases Input Form</em>'.
	 * @see blockModelingMetamodel.PhrasesInputForm
	 * @generated
	 */
	EClass getPhrasesInputForm();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.PhrasesInputForm#getPlaceholderEL <em>Placeholder EL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder EL</em>'.
	 * @see blockModelingMetamodel.PhrasesInputForm#getPlaceholderEL()
	 * @see #getPhrasesInputForm()
	 * @generated
	 */
	EAttribute getPhrasesInputForm_PlaceholderEL();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.PhrasesInputForm#getPlaceholderEN <em>Placeholder EN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder EN</em>'.
	 * @see blockModelingMetamodel.PhrasesInputForm#getPlaceholderEN()
	 * @see #getPhrasesInputForm()
	 * @generated
	 */
	EAttribute getPhrasesInputForm_PlaceholderEN();

	/**
	 * Returns the meta object for class '{@link blockModelingMetamodel.LabeledInputForm <em>Labeled Input Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Labeled Input Form</em>'.
	 * @see blockModelingMetamodel.LabeledInputForm
	 * @generated
	 */
	EClass getLabeledInputForm();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.LabeledInputForm#getVariableNameEL <em>Variable Name EL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Name EL</em>'.
	 * @see blockModelingMetamodel.LabeledInputForm#getVariableNameEL()
	 * @see #getLabeledInputForm()
	 * @generated
	 */
	EAttribute getLabeledInputForm_VariableNameEL();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.LabeledInputForm#getVariableNameEN <em>Variable Name EN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Name EN</em>'.
	 * @see blockModelingMetamodel.LabeledInputForm#getVariableNameEN()
	 * @see #getLabeledInputForm()
	 * @generated
	 */
	EAttribute getLabeledInputForm_VariableNameEN();

	/**
	 * Returns the meta object for class '{@link blockModelingMetamodel.LabeledTextInputForm <em>Labeled Text Input Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Labeled Text Input Form</em>'.
	 * @see blockModelingMetamodel.LabeledTextInputForm
	 * @generated
	 */
	EClass getLabeledTextInputForm();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.LabeledTextInputForm#getDefaultValueEN <em>Default Value EN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value EN</em>'.
	 * @see blockModelingMetamodel.LabeledTextInputForm#getDefaultValueEN()
	 * @see #getLabeledTextInputForm()
	 * @generated
	 */
	EAttribute getLabeledTextInputForm_DefaultValueEN();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.LabeledTextInputForm#getDefaultValueEL <em>Default Value EL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value EL</em>'.
	 * @see blockModelingMetamodel.LabeledTextInputForm#getDefaultValueEL()
	 * @see #getLabeledTextInputForm()
	 * @generated
	 */
	EAttribute getLabeledTextInputForm_DefaultValueEL();

	/**
	 * Returns the meta object for class '{@link blockModelingMetamodel.LabeledIntegerInputForm <em>Labeled Integer Input Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Labeled Integer Input Form</em>'.
	 * @see blockModelingMetamodel.LabeledIntegerInputForm
	 * @generated
	 */
	EClass getLabeledIntegerInputForm();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.LabeledIntegerInputForm#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see blockModelingMetamodel.LabeledIntegerInputForm#getDefaultValue()
	 * @see #getLabeledIntegerInputForm()
	 * @generated
	 */
	EAttribute getLabeledIntegerInputForm_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.LabeledIntegerInputForm#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see blockModelingMetamodel.LabeledIntegerInputForm#getMinValue()
	 * @see #getLabeledIntegerInputForm()
	 * @generated
	 */
	EAttribute getLabeledIntegerInputForm_MinValue();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.LabeledIntegerInputForm#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see blockModelingMetamodel.LabeledIntegerInputForm#getMaxValue()
	 * @see #getLabeledIntegerInputForm()
	 * @generated
	 */
	EAttribute getLabeledIntegerInputForm_MaxValue();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.LabeledIntegerInputForm#isNoMaxValue <em>No Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Max Value</em>'.
	 * @see blockModelingMetamodel.LabeledIntegerInputForm#isNoMaxValue()
	 * @see #getLabeledIntegerInputForm()
	 * @generated
	 */
	EAttribute getLabeledIntegerInputForm_NoMaxValue();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.LabeledIntegerInputForm#isNoMinValue <em>No Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Min Value</em>'.
	 * @see blockModelingMetamodel.LabeledIntegerInputForm#isNoMinValue()
	 * @see #getLabeledIntegerInputForm()
	 * @generated
	 */
	EAttribute getLabeledIntegerInputForm_NoMinValue();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.LabeledIntegerInputForm#isNoDefaultValue <em>No Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Default Value</em>'.
	 * @see blockModelingMetamodel.LabeledIntegerInputForm#isNoDefaultValue()
	 * @see #getLabeledIntegerInputForm()
	 * @generated
	 */
	EAttribute getLabeledIntegerInputForm_NoDefaultValue();

	/**
	 * Returns the meta object for class '{@link blockModelingMetamodel.LabeledFloatInputForm <em>Labeled Float Input Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Labeled Float Input Form</em>'.
	 * @see blockModelingMetamodel.LabeledFloatInputForm
	 * @generated
	 */
	EClass getLabeledFloatInputForm();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.LabeledFloatInputForm#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see blockModelingMetamodel.LabeledFloatInputForm#getMinValue()
	 * @see #getLabeledFloatInputForm()
	 * @generated
	 */
	EAttribute getLabeledFloatInputForm_MinValue();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.LabeledFloatInputForm#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see blockModelingMetamodel.LabeledFloatInputForm#getDefaultValue()
	 * @see #getLabeledFloatInputForm()
	 * @generated
	 */
	EAttribute getLabeledFloatInputForm_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.LabeledFloatInputForm#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see blockModelingMetamodel.LabeledFloatInputForm#getMaxValue()
	 * @see #getLabeledFloatInputForm()
	 * @generated
	 */
	EAttribute getLabeledFloatInputForm_MaxValue();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.LabeledFloatInputForm#isNoMaxValue <em>No Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Max Value</em>'.
	 * @see blockModelingMetamodel.LabeledFloatInputForm#isNoMaxValue()
	 * @see #getLabeledFloatInputForm()
	 * @generated
	 */
	EAttribute getLabeledFloatInputForm_NoMaxValue();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.LabeledFloatInputForm#isNoMinValue <em>No Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Min Value</em>'.
	 * @see blockModelingMetamodel.LabeledFloatInputForm#isNoMinValue()
	 * @see #getLabeledFloatInputForm()
	 * @generated
	 */
	EAttribute getLabeledFloatInputForm_NoMinValue();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.LabeledFloatInputForm#isNoDefaultValue <em>No Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Default Value</em>'.
	 * @see blockModelingMetamodel.LabeledFloatInputForm#isNoDefaultValue()
	 * @see #getLabeledFloatInputForm()
	 * @generated
	 */
	EAttribute getLabeledFloatInputForm_NoDefaultValue();

	/**
	 * Returns the meta object for class '{@link blockModelingMetamodel.ParameterInputForm <em>Parameter Input Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Input Form</em>'.
	 * @see blockModelingMetamodel.ParameterInputForm
	 * @generated
	 */
	EClass getParameterInputForm();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.ParameterInputForm#getDefaultValueEL <em>Default Value EL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value EL</em>'.
	 * @see blockModelingMetamodel.ParameterInputForm#getDefaultValueEL()
	 * @see #getParameterInputForm()
	 * @generated
	 */
	EAttribute getParameterInputForm_DefaultValueEL();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.ParameterInputForm#getDefaultValueEN <em>Default Value EN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value EN</em>'.
	 * @see blockModelingMetamodel.ParameterInputForm#getDefaultValueEN()
	 * @see #getParameterInputForm()
	 * @generated
	 */
	EAttribute getParameterInputForm_DefaultValueEN();

	/**
	 * Returns the meta object for the containment reference list '{@link blockModelingMetamodel.ParameterInputForm#getHasOptions <em>Has Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Options</em>'.
	 * @see blockModelingMetamodel.ParameterInputForm#getHasOptions()
	 * @see #getParameterInputForm()
	 * @generated
	 */
	EReference getParameterInputForm_HasOptions();

	/**
	 * Returns the meta object for class '{@link blockModelingMetamodel.ConditionInputForm <em>Condition Input Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Input Form</em>'.
	 * @see blockModelingMetamodel.ConditionInputForm
	 * @generated
	 */
	EClass getConditionInputForm();

	/**
	 * Returns the meta object for the containment reference list '{@link blockModelingMetamodel.ConditionInputForm#getHasOptions <em>Has Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Options</em>'.
	 * @see blockModelingMetamodel.ConditionInputForm#getHasOptions()
	 * @see #getConditionInputForm()
	 * @generated
	 */
	EReference getConditionInputForm_HasOptions();

	/**
	 * Returns the meta object for class '{@link blockModelingMetamodel.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option</em>'.
	 * @see blockModelingMetamodel.Option
	 * @generated
	 */
	EClass getOption();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.Option#getOptionTextEL <em>Option Text EL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Option Text EL</em>'.
	 * @see blockModelingMetamodel.Option#getOptionTextEL()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_OptionTextEL();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.Option#getOptionTextEN <em>Option Text EN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Option Text EN</em>'.
	 * @see blockModelingMetamodel.Option#getOptionTextEN()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_OptionTextEN();

	/**
	 * Returns the meta object for class '{@link blockModelingMetamodel.ConditionOption <em>Condition Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Option</em>'.
	 * @see blockModelingMetamodel.ConditionOption
	 * @generated
	 */
	EClass getConditionOption();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.ConditionOption#getOptionTextEL <em>Option Text EL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Option Text EL</em>'.
	 * @see blockModelingMetamodel.ConditionOption#getOptionTextEL()
	 * @see #getConditionOption()
	 * @generated
	 */
	EAttribute getConditionOption_OptionTextEL();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.ConditionOption#getOptionTextEN <em>Option Text EN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Option Text EN</em>'.
	 * @see blockModelingMetamodel.ConditionOption#getOptionTextEN()
	 * @see #getConditionOption()
	 * @generated
	 */
	EAttribute getConditionOption_OptionTextEN();

	/**
	 * Returns the meta object for the attribute '{@link blockModelingMetamodel.ConditionOption#getComparisonType <em>Comparison Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparison Type</em>'.
	 * @see blockModelingMetamodel.ConditionOption#getComparisonType()
	 * @see #getConditionOption()
	 * @generated
	 */
	EAttribute getConditionOption_ComparisonType();

	/**
	 * Returns the meta object for the attribute list '{@link blockModelingMetamodel.ConditionOption#getComparators <em>Comparators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Comparators</em>'.
	 * @see blockModelingMetamodel.ConditionOption#getComparators()
	 * @see #getConditionOption()
	 * @generated
	 */
	EAttribute getConditionOption_Comparators();

	/**
	 * Returns the meta object for the containment reference list '{@link blockModelingMetamodel.ConditionOption#getHasOptions <em>Has Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Options</em>'.
	 * @see blockModelingMetamodel.ConditionOption#getHasOptions()
	 * @see #getConditionOption()
	 * @generated
	 */
	EReference getConditionOption_HasOptions();

	/**
	 * Returns the meta object for enum '{@link blockModelingMetamodel.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Category</em>'.
	 * @see blockModelingMetamodel.Category
	 * @generated
	 */
	EEnum getCategory();

	/**
	 * Returns the meta object for enum '{@link blockModelingMetamodel.Cursor <em>Cursor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cursor</em>'.
	 * @see blockModelingMetamodel.Cursor
	 * @generated
	 */
	EEnum getCursor();

	/**
	 * Returns the meta object for enum '{@link blockModelingMetamodel.ImageBackgroundShape <em>Image Background Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Image Background Shape</em>'.
	 * @see blockModelingMetamodel.ImageBackgroundShape
	 * @generated
	 */
	EEnum getImageBackgroundShape();

	/**
	 * Returns the meta object for enum '{@link blockModelingMetamodel.ComparisonType <em>Comparison Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comparison Type</em>'.
	 * @see blockModelingMetamodel.ComparisonType
	 * @generated
	 */
	EEnum getComparisonType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BlockModelingMetamodelFactory getBlockModelingMetamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link blockModelingMetamodel.impl.BlockAppImpl <em>Block App</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockModelingMetamodel.impl.BlockAppImpl
		 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getBlockApp()
		 * @generated
		 */
		EClass BLOCK_APP = eINSTANCE.getBlockApp();

		/**
		 * The meta object literal for the '<em><b>Has Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_APP__HAS_BLOCK = eINSTANCE.getBlockApp_HasBlock();

		/**
		 * The meta object literal for the '{@link blockModelingMetamodel.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockModelingMetamodel.impl.BlockImpl
		 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__CATEGORY = eINSTANCE.getBlock_Category();

		/**
		 * The meta object literal for the '<em><b>Backround Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__BACKROUND_COLOR = eINSTANCE.getBlock_BackroundColor();

		/**
		 * The meta object literal for the '<em><b>Block Name EL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__BLOCK_NAME_EL = eINSTANCE.getBlock_BlockNameEL();

		/**
		 * The meta object literal for the '<em><b>Block Name EN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__BLOCK_NAME_EN = eINSTANCE.getBlock_BlockNameEN();

		/**
		 * The meta object literal for the '{@link blockModelingMetamodel.impl.ReferenceBlockImpl <em>Reference Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockModelingMetamodel.impl.ReferenceBlockImpl
		 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getReferenceBlock()
		 * @generated
		 */
		EClass REFERENCE_BLOCK = eINSTANCE.getReferenceBlock();

		/**
		 * The meta object literal for the '<em><b>Block Title EL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_BLOCK__BLOCK_TITLE_EL = eINSTANCE.getReferenceBlock_BlockTitleEL();

		/**
		 * The meta object literal for the '<em><b>Block Title EN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_BLOCK__BLOCK_TITLE_EN = eINSTANCE.getReferenceBlock_BlockTitleEN();

		/**
		 * The meta object literal for the '<em><b>Block Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_BLOCK__BLOCK_IMAGE = eINSTANCE.getReferenceBlock_BlockImage();

		/**
		 * The meta object literal for the '<em><b>Image Backround Shape</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_BLOCK__IMAGE_BACKROUND_SHAPE = eINSTANCE.getReferenceBlock_ImageBackroundShape();

		/**
		 * The meta object literal for the '<em><b>Has Next Block</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_BLOCK__HAS_NEXT_BLOCK = eINSTANCE.getReferenceBlock_HasNextBlock();

		/**
		 * The meta object literal for the '<em><b>Image Cursor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_BLOCK__IMAGE_CURSOR = eINSTANCE.getReferenceBlock_ImageCursor();

		/**
		 * The meta object literal for the '<em><b>Image Backround Shape Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_BLOCK__IMAGE_BACKROUND_SHAPE_COLOR = eINSTANCE
				.getReferenceBlock_ImageBackroundShapeColor();

		/**
		 * The meta object literal for the '<em><b>Has Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_BLOCK__HAS_INFO = eINSTANCE.getReferenceBlock_HasInfo();

		/**
		 * The meta object literal for the '{@link blockModelingMetamodel.impl.InformationImpl <em>Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockModelingMetamodel.impl.InformationImpl
		 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getInformation()
		 * @generated
		 */
		EClass INFORMATION = eINSTANCE.getInformation();

		/**
		 * The meta object literal for the '<em><b>Information Text EL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION__INFORMATION_TEXT_EL = eINSTANCE.getInformation_InformationTextEL();

		/**
		 * The meta object literal for the '<em><b>Information Text EN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION__INFORMATION_TEXT_EN = eINSTANCE.getInformation_InformationTextEN();

		/**
		 * The meta object literal for the '<em><b>Cursor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION__CURSOR = eINSTANCE.getInformation_Cursor();

		/**
		 * The meta object literal for the '{@link blockModelingMetamodel.impl.DecisionBlockImpl <em>Decision Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockModelingMetamodel.impl.DecisionBlockImpl
		 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getDecisionBlock()
		 * @generated
		 */
		EClass DECISION_BLOCK = eINSTANCE.getDecisionBlock();

		/**
		 * The meta object literal for the '<em><b>Block Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION_BLOCK__BLOCK_IMAGE = eINSTANCE.getDecisionBlock_BlockImage();

		/**
		 * The meta object literal for the '<em><b>Number Of Columns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION_BLOCK__NUMBER_OF_COLUMNS = eINSTANCE.getDecisionBlock_NumberOfColumns();

		/**
		 * The meta object literal for the '<em><b>Block Image Cursor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION_BLOCK__BLOCK_IMAGE_CURSOR = eINSTANCE.getDecisionBlock_BlockImageCursor();

		/**
		 * The meta object literal for the '<em><b>Has Settings Popover</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION_BLOCK__HAS_SETTINGS_POPOVER = eINSTANCE.getDecisionBlock_HasSettingsPopover();

		/**
		 * The meta object literal for the '<em><b>Has Configuration Popover</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION_BLOCK__HAS_CONFIGURATION_POPOVER = eINSTANCE.getDecisionBlock_HasConfigurationPopover();

		/**
		 * The meta object literal for the '{@link blockModelingMetamodel.impl.ActionBlockImpl <em>Action Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockModelingMetamodel.impl.ActionBlockImpl
		 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getActionBlock()
		 * @generated
		 */
		EClass ACTION_BLOCK = eINSTANCE.getActionBlock();

		/**
		 * The meta object literal for the '<em><b>Block Title EN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_BLOCK__BLOCK_TITLE_EN = eINSTANCE.getActionBlock_BlockTitleEN();

		/**
		 * The meta object literal for the '<em><b>Block Title EL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_BLOCK__BLOCK_TITLE_EL = eINSTANCE.getActionBlock_BlockTitleEL();

		/**
		 * The meta object literal for the '<em><b>Block Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_BLOCK__BLOCK_IMAGE = eINSTANCE.getActionBlock_BlockImage();

		/**
		 * The meta object literal for the '<em><b>Has Popover</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_BLOCK__HAS_POPOVER = eINSTANCE.getActionBlock_HasPopover();

		/**
		 * The meta object literal for the '<em><b>Popover Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_BLOCK__POPOVER_ICON = eINSTANCE.getActionBlock_PopoverIcon();

		/**
		 * The meta object literal for the '<em><b>Popover Help Text EL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_BLOCK__POPOVER_HELP_TEXT_EL = eINSTANCE.getActionBlock_PopoverHelpTextEL();

		/**
		 * The meta object literal for the '<em><b>Popover Help Text EN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_BLOCK__POPOVER_HELP_TEXT_EN = eINSTANCE.getActionBlock_PopoverHelpTextEN();

		/**
		 * The meta object literal for the '<em><b>Title Backround Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_BLOCK__TITLE_BACKROUND_COLOR = eINSTANCE.getActionBlock_TitleBackroundColor();

		/**
		 * The meta object literal for the '<em><b>Has Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_BLOCK__HAS_INFO = eINSTANCE.getActionBlock_HasInfo();

		/**
		 * The meta object literal for the '<em><b>Has Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_BLOCK__HAS_INPUT = eINSTANCE.getActionBlock_HasInput();

		/**
		 * The meta object literal for the '<em><b>Has Settings Popover</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_BLOCK__HAS_SETTINGS_POPOVER = eINSTANCE.getActionBlock_HasSettingsPopover();

		/**
		 * The meta object literal for the '{@link blockModelingMetamodel.impl.InputBlockImpl <em>Input Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockModelingMetamodel.impl.InputBlockImpl
		 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getInputBlock()
		 * @generated
		 */
		EClass INPUT_BLOCK = eINSTANCE.getInputBlock();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_BLOCK__IMAGE = eINSTANCE.getInputBlock_Image();

		/**
		 * The meta object literal for the '<em><b>Info Text EN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_BLOCK__INFO_TEXT_EN = eINSTANCE.getInputBlock_InfoTextEN();

		/**
		 * The meta object literal for the '<em><b>Info Text EL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_BLOCK__INFO_TEXT_EL = eINSTANCE.getInputBlock_InfoTextEL();

		/**
		 * The meta object literal for the '<em><b>Variable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_BLOCK__VARIABLE_NAME = eINSTANCE.getInputBlock_VariableName();

		/**
		 * The meta object literal for the '<em><b>Icon Cursor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_BLOCK__ICON_CURSOR = eINSTANCE.getInputBlock_IconCursor();

		/**
		 * The meta object literal for the '{@link blockModelingMetamodel.impl.SelectInputBlockImpl <em>Select Input Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockModelingMetamodel.impl.SelectInputBlockImpl
		 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getSelectInputBlock()
		 * @generated
		 */
		EClass SELECT_INPUT_BLOCK = eINSTANCE.getSelectInputBlock();

		/**
		 * The meta object literal for the '<em><b>Has Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT_INPUT_BLOCK__HAS_OPTIONS = eINSTANCE.getSelectInputBlock_HasOptions();

		/**
		 * The meta object literal for the '{@link blockModelingMetamodel.impl.TextInputBlockImpl <em>Text Input Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockModelingMetamodel.impl.TextInputBlockImpl
		 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getTextInputBlock()
		 * @generated
		 */
		EClass TEXT_INPUT_BLOCK = eINSTANCE.getTextInputBlock();

		/**
		 * The meta object literal for the '<em><b>Default Value EL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_INPUT_BLOCK__DEFAULT_VALUE_EL = eINSTANCE.getTextInputBlock_DefaultValueEL();

		/**
		 * The meta object literal for the '<em><b>Default Value EN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_INPUT_BLOCK__DEFAULT_VALUE_EN = eINSTANCE.getTextInputBlock_DefaultValueEN();

		/**
		 * The meta object literal for the '{@link blockModelingMetamodel.impl.IntegerInputBlockImpl <em>Integer Input Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockModelingMetamodel.impl.IntegerInputBlockImpl
		 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getIntegerInputBlock()
		 * @generated
		 */
		EClass INTEGER_INPUT_BLOCK = eINSTANCE.getIntegerInputBlock();

		/**
		 * The meta object literal for the '<em><b>No Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_INPUT_BLOCK__NO_MIN_VALUE = eINSTANCE.getIntegerInputBlock_NoMinValue();

		/**
		 * The meta object literal for the '<em><b>No Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_INPUT_BLOCK__NO_MAX_VALUE = eINSTANCE.getIntegerInputBlock_NoMaxValue();

		/**
		 * The meta object literal for the '<em><b>No Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_INPUT_BLOCK__NO_DEFAULT_VALUE = eINSTANCE.getIntegerInputBlock_NoDefaultValue();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_INPUT_BLOCK__MIN_VALUE = eINSTANCE.getIntegerInputBlock_MinValue();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_INPUT_BLOCK__MAX_VALUE = eINSTANCE.getIntegerInputBlock_MaxValue();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_INPUT_BLOCK__DEFAULT_VALUE = eINSTANCE.getIntegerInputBlock_DefaultValue();

		/**
		 * The meta object literal for the '{@link blockModelingMetamodel.impl.FloatInputBlockImpl <em>Float Input Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockModelingMetamodel.impl.FloatInputBlockImpl
		 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getFloatInputBlock()
		 * @generated
		 */
		EClass FLOAT_INPUT_BLOCK = eINSTANCE.getFloatInputBlock();

		/**
		 * The meta object literal for the '<em><b>No Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT_INPUT_BLOCK__NO_MAX_VALUE = eINSTANCE.getFloatInputBlock_NoMaxValue();

		/**
		 * The meta object literal for the '<em><b>No Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT_INPUT_BLOCK__NO_MIN_VALUE = eINSTANCE.getFloatInputBlock_NoMinValue();

		/**
		 * The meta object literal for the '<em><b>No Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT_INPUT_BLOCK__NO_DEFAULT_VALUE = eINSTANCE.getFloatInputBlock_NoDefaultValue();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT_INPUT_BLOCK__MIN_VALUE = eINSTANCE.getFloatInputBlock_MinValue();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT_INPUT_BLOCK__MAX_VALUE = eINSTANCE.getFloatInputBlock_MaxValue();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT_INPUT_BLOCK__DEFAULT_VALUE = eINSTANCE.getFloatInputBlock_DefaultValue();

		/**
		 * The meta object literal for the '{@link blockModelingMetamodel.impl.PopoverImpl <em>Popover</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockModelingMetamodel.impl.PopoverImpl
		 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getPopover()
		 * @generated
		 */
		EClass POPOVER = eINSTANCE.getPopover();

		/**
		 * The meta object literal for the '<em><b>Popover Title EL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POPOVER__POPOVER_TITLE_EL = eINSTANCE.getPopover_PopoverTitleEL();

		/**
		 * The meta object literal for the '<em><b>Popover Title EN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POPOVER__POPOVER_TITLE_EN = eINSTANCE.getPopover_PopoverTitleEN();

		/**
		 * The meta object literal for the '{@link blockModelingMetamodel.impl.ConfigurationPopoverImpl <em>Configuration Popover</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockModelingMetamodel.impl.ConfigurationPopoverImpl
		 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getConfigurationPopover()
		 * @generated
		 */
		EClass CONFIGURATION_POPOVER = eINSTANCE.getConfigurationPopover();

		/**
		 * The meta object literal for the '<em><b>Has Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_POPOVER__HAS_INPUT = eINSTANCE.getConfigurationPopover_HasInput();

		/**
		 * The meta object literal for the '{@link blockModelingMetamodel.impl.SettingsPopoverImpl <em>Settings Popover</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockModelingMetamodel.impl.SettingsPopoverImpl
		 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getSettingsPopover()
		 * @generated
		 */
		EClass SETTINGS_POPOVER = eINSTANCE.getSettingsPopover();

		/**
		 * The meta object literal for the '<em><b>Has Form</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETTINGS_POPOVER__HAS_FORM = eINSTANCE.getSettingsPopover_HasForm();

		/**
		 * The meta object literal for the '{@link blockModelingMetamodel.impl.FormImpl <em>Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockModelingMetamodel.impl.FormImpl
		 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getForm()
		 * @generated
		 */
		EClass FORM = eINSTANCE.getForm();

		/**
		 * The meta object literal for the '{@link blockModelingMetamodel.impl.PhrasesInputFormImpl <em>Phrases Input Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockModelingMetamodel.impl.PhrasesInputFormImpl
		 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getPhrasesInputForm()
		 * @generated
		 */
		EClass PHRASES_INPUT_FORM = eINSTANCE.getPhrasesInputForm();

		/**
		 * The meta object literal for the '<em><b>Placeholder EL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHRASES_INPUT_FORM__PLACEHOLDER_EL = eINSTANCE.getPhrasesInputForm_PlaceholderEL();

		/**
		 * The meta object literal for the '<em><b>Placeholder EN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHRASES_INPUT_FORM__PLACEHOLDER_EN = eINSTANCE.getPhrasesInputForm_PlaceholderEN();

		/**
		 * The meta object literal for the '{@link blockModelingMetamodel.impl.LabeledInputFormImpl <em>Labeled Input Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockModelingMetamodel.impl.LabeledInputFormImpl
		 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getLabeledInputForm()
		 * @generated
		 */
		EClass LABELED_INPUT_FORM = eINSTANCE.getLabeledInputForm();

		/**
		 * The meta object literal for the '<em><b>Variable Name EL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABELED_INPUT_FORM__VARIABLE_NAME_EL = eINSTANCE.getLabeledInputForm_VariableNameEL();

		/**
		 * The meta object literal for the '<em><b>Variable Name EN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABELED_INPUT_FORM__VARIABLE_NAME_EN = eINSTANCE.getLabeledInputForm_VariableNameEN();

		/**
		 * The meta object literal for the '{@link blockModelingMetamodel.impl.LabeledTextInputFormImpl <em>Labeled Text Input Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockModelingMetamodel.impl.LabeledTextInputFormImpl
		 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getLabeledTextInputForm()
		 * @generated
		 */
		EClass LABELED_TEXT_INPUT_FORM = eINSTANCE.getLabeledTextInputForm();

		/**
		 * The meta object literal for the '<em><b>Default Value EN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABELED_TEXT_INPUT_FORM__DEFAULT_VALUE_EN = eINSTANCE.getLabeledTextInputForm_DefaultValueEN();

		/**
		 * The meta object literal for the '<em><b>Default Value EL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABELED_TEXT_INPUT_FORM__DEFAULT_VALUE_EL = eINSTANCE.getLabeledTextInputForm_DefaultValueEL();

		/**
		 * The meta object literal for the '{@link blockModelingMetamodel.impl.LabeledIntegerInputFormImpl <em>Labeled Integer Input Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockModelingMetamodel.impl.LabeledIntegerInputFormImpl
		 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getLabeledIntegerInputForm()
		 * @generated
		 */
		EClass LABELED_INTEGER_INPUT_FORM = eINSTANCE.getLabeledIntegerInputForm();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABELED_INTEGER_INPUT_FORM__DEFAULT_VALUE = eINSTANCE.getLabeledIntegerInputForm_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABELED_INTEGER_INPUT_FORM__MIN_VALUE = eINSTANCE.getLabeledIntegerInputForm_MinValue();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABELED_INTEGER_INPUT_FORM__MAX_VALUE = eINSTANCE.getLabeledIntegerInputForm_MaxValue();

		/**
		 * The meta object literal for the '<em><b>No Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABELED_INTEGER_INPUT_FORM__NO_MAX_VALUE = eINSTANCE.getLabeledIntegerInputForm_NoMaxValue();

		/**
		 * The meta object literal for the '<em><b>No Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABELED_INTEGER_INPUT_FORM__NO_MIN_VALUE = eINSTANCE.getLabeledIntegerInputForm_NoMinValue();

		/**
		 * The meta object literal for the '<em><b>No Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABELED_INTEGER_INPUT_FORM__NO_DEFAULT_VALUE = eINSTANCE.getLabeledIntegerInputForm_NoDefaultValue();

		/**
		 * The meta object literal for the '{@link blockModelingMetamodel.impl.LabeledFloatInputFormImpl <em>Labeled Float Input Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockModelingMetamodel.impl.LabeledFloatInputFormImpl
		 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getLabeledFloatInputForm()
		 * @generated
		 */
		EClass LABELED_FLOAT_INPUT_FORM = eINSTANCE.getLabeledFloatInputForm();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABELED_FLOAT_INPUT_FORM__MIN_VALUE = eINSTANCE.getLabeledFloatInputForm_MinValue();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABELED_FLOAT_INPUT_FORM__DEFAULT_VALUE = eINSTANCE.getLabeledFloatInputForm_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABELED_FLOAT_INPUT_FORM__MAX_VALUE = eINSTANCE.getLabeledFloatInputForm_MaxValue();

		/**
		 * The meta object literal for the '<em><b>No Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABELED_FLOAT_INPUT_FORM__NO_MAX_VALUE = eINSTANCE.getLabeledFloatInputForm_NoMaxValue();

		/**
		 * The meta object literal for the '<em><b>No Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABELED_FLOAT_INPUT_FORM__NO_MIN_VALUE = eINSTANCE.getLabeledFloatInputForm_NoMinValue();

		/**
		 * The meta object literal for the '<em><b>No Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABELED_FLOAT_INPUT_FORM__NO_DEFAULT_VALUE = eINSTANCE.getLabeledFloatInputForm_NoDefaultValue();

		/**
		 * The meta object literal for the '{@link blockModelingMetamodel.impl.ParameterInputFormImpl <em>Parameter Input Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockModelingMetamodel.impl.ParameterInputFormImpl
		 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getParameterInputForm()
		 * @generated
		 */
		EClass PARAMETER_INPUT_FORM = eINSTANCE.getParameterInputForm();

		/**
		 * The meta object literal for the '<em><b>Default Value EL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_INPUT_FORM__DEFAULT_VALUE_EL = eINSTANCE.getParameterInputForm_DefaultValueEL();

		/**
		 * The meta object literal for the '<em><b>Default Value EN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_INPUT_FORM__DEFAULT_VALUE_EN = eINSTANCE.getParameterInputForm_DefaultValueEN();

		/**
		 * The meta object literal for the '<em><b>Has Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_INPUT_FORM__HAS_OPTIONS = eINSTANCE.getParameterInputForm_HasOptions();

		/**
		 * The meta object literal for the '{@link blockModelingMetamodel.impl.ConditionInputFormImpl <em>Condition Input Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockModelingMetamodel.impl.ConditionInputFormImpl
		 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getConditionInputForm()
		 * @generated
		 */
		EClass CONDITION_INPUT_FORM = eINSTANCE.getConditionInputForm();

		/**
		 * The meta object literal for the '<em><b>Has Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_INPUT_FORM__HAS_OPTIONS = eINSTANCE.getConditionInputForm_HasOptions();

		/**
		 * The meta object literal for the '{@link blockModelingMetamodel.impl.OptionImpl <em>Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockModelingMetamodel.impl.OptionImpl
		 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getOption()
		 * @generated
		 */
		EClass OPTION = eINSTANCE.getOption();

		/**
		 * The meta object literal for the '<em><b>Option Text EL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__OPTION_TEXT_EL = eINSTANCE.getOption_OptionTextEL();

		/**
		 * The meta object literal for the '<em><b>Option Text EN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__OPTION_TEXT_EN = eINSTANCE.getOption_OptionTextEN();

		/**
		 * The meta object literal for the '{@link blockModelingMetamodel.impl.ConditionOptionImpl <em>Condition Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockModelingMetamodel.impl.ConditionOptionImpl
		 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getConditionOption()
		 * @generated
		 */
		EClass CONDITION_OPTION = eINSTANCE.getConditionOption();

		/**
		 * The meta object literal for the '<em><b>Option Text EL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_OPTION__OPTION_TEXT_EL = eINSTANCE.getConditionOption_OptionTextEL();

		/**
		 * The meta object literal for the '<em><b>Option Text EN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_OPTION__OPTION_TEXT_EN = eINSTANCE.getConditionOption_OptionTextEN();

		/**
		 * The meta object literal for the '<em><b>Comparison Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_OPTION__COMPARISON_TYPE = eINSTANCE.getConditionOption_ComparisonType();

		/**
		 * The meta object literal for the '<em><b>Comparators</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_OPTION__COMPARATORS = eINSTANCE.getConditionOption_Comparators();

		/**
		 * The meta object literal for the '<em><b>Has Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_OPTION__HAS_OPTIONS = eINSTANCE.getConditionOption_HasOptions();

		/**
		 * The meta object literal for the '{@link blockModelingMetamodel.Category <em>Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockModelingMetamodel.Category
		 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getCategory()
		 * @generated
		 */
		EEnum CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '{@link blockModelingMetamodel.Cursor <em>Cursor</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockModelingMetamodel.Cursor
		 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getCursor()
		 * @generated
		 */
		EEnum CURSOR = eINSTANCE.getCursor();

		/**
		 * The meta object literal for the '{@link blockModelingMetamodel.ImageBackgroundShape <em>Image Background Shape</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockModelingMetamodel.ImageBackgroundShape
		 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getImageBackgroundShape()
		 * @generated
		 */
		EEnum IMAGE_BACKGROUND_SHAPE = eINSTANCE.getImageBackgroundShape();

		/**
		 * The meta object literal for the '{@link blockModelingMetamodel.ComparisonType <em>Comparison Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockModelingMetamodel.ComparisonType
		 * @see blockModelingMetamodel.impl.BlockModelingMetamodelPackageImpl#getComparisonType()
		 * @generated
		 */
		EEnum COMPARISON_TYPE = eINSTANCE.getComparisonType();

	}

} //BlockModelingMetamodelPackage
