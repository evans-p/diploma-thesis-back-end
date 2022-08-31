/**
 */
package blockModelingMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block App</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockModelingMetamodel.BlockApp#getHasBlock <em>Has Block</em>}</li>
 * </ul>
 *
 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getBlockApp()
 * @model
 * @generated
 */
public interface BlockApp extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Block</em>' containment reference.
	 * @see #setHasBlock(Block)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getBlockApp_HasBlock()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Block getHasBlock();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.BlockApp#getHasBlock <em>Has Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Block</em>' containment reference.
	 * @see #getHasBlock()
	 * @generated
	 */
	void setHasBlock(Block value);

} // BlockApp
