/**
 */
package blockModelingMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Input Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockModelingMetamodel.ConditionInputForm#getHasOptions <em>Has Options</em>}</li>
 * </ul>
 *
 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getConditionInputForm()
 * @model
 * @generated
 */
public interface ConditionInputForm extends Form {
	/**
	 * Returns the value of the '<em><b>Has Options</b></em>' containment reference list.
	 * The list contents are of type {@link blockModelingMetamodel.ConditionOption}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Options</em>' containment reference list.
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getConditionInputForm_HasOptions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ConditionOption> getHasOptions();

} // ConditionInputForm
