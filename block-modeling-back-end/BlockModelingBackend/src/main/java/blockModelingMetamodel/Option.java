/**
 */
package blockModelingMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockModelingMetamodel.Option#getOptionTextEL <em>Option Text EL</em>}</li>
 *   <li>{@link blockModelingMetamodel.Option#getOptionTextEN <em>Option Text EN</em>}</li>
 * </ul>
 *
 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getOption()
 * @model
 * @generated
 */
public interface Option extends EObject {
	/**
	 * Returns the value of the '<em><b>Option Text EL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option Text EL</em>' attribute.
	 * @see #setOptionTextEL(String)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getOption_OptionTextEL()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getOptionTextEL();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.Option#getOptionTextEL <em>Option Text EL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option Text EL</em>' attribute.
	 * @see #getOptionTextEL()
	 * @generated
	 */
	void setOptionTextEL(String value);

	/**
	 * Returns the value of the '<em><b>Option Text EN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option Text EN</em>' attribute.
	 * @see #setOptionTextEN(String)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getOption_OptionTextEN()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getOptionTextEN();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.Option#getOptionTextEN <em>Option Text EN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option Text EN</em>' attribute.
	 * @see #getOptionTextEN()
	 * @generated
	 */
	void setOptionTextEN(String value);

} // Option
