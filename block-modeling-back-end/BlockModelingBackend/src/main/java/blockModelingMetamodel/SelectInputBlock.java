/**
 */
package blockModelingMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Input Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockModelingMetamodel.SelectInputBlock#getHasOptions <em>Has Options</em>}</li>
 * </ul>
 *
 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getSelectInputBlock()
 * @model
 * @generated
 */
public interface SelectInputBlock extends InputBlock {
	/**
	 * Returns the value of the '<em><b>Has Options</b></em>' containment reference list.
	 * The list contents are of type {@link blockModelingMetamodel.Option}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Options</em>' containment reference list.
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getSelectInputBlock_HasOptions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Option> getHasOptions();

} // SelectInputBlock
