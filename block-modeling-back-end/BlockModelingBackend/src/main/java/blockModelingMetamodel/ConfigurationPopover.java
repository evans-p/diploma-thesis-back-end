/**
 */
package blockModelingMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Popover</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockModelingMetamodel.ConfigurationPopover#getHasInput <em>Has Input</em>}</li>
 * </ul>
 *
 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getConfigurationPopover()
 * @model
 * @generated
 */
public interface ConfigurationPopover extends Popover {
	/**
	 * Returns the value of the '<em><b>Has Input</b></em>' containment reference list.
	 * The list contents are of type {@link blockModelingMetamodel.InputBlock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Input</em>' containment reference list.
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getConfigurationPopover_HasInput()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<InputBlock> getHasInput();

} // ConfigurationPopover
