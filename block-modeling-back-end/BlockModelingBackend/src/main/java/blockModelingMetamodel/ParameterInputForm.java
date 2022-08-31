/**
 */
package blockModelingMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Input Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockModelingMetamodel.ParameterInputForm#getDefaultValueEL <em>Default Value EL</em>}</li>
 *   <li>{@link blockModelingMetamodel.ParameterInputForm#getDefaultValueEN <em>Default Value EN</em>}</li>
 *   <li>{@link blockModelingMetamodel.ParameterInputForm#getHasOptions <em>Has Options</em>}</li>
 * </ul>
 *
 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getParameterInputForm()
 * @model
 * @generated
 */
public interface ParameterInputForm extends Form {
	/**
	 * Returns the value of the '<em><b>Default Value EL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value EL</em>' attribute.
	 * @see #setDefaultValueEL(String)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getParameterInputForm_DefaultValueEL()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getDefaultValueEL();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.ParameterInputForm#getDefaultValueEL <em>Default Value EL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value EL</em>' attribute.
	 * @see #getDefaultValueEL()
	 * @generated
	 */
	void setDefaultValueEL(String value);

	/**
	 * Returns the value of the '<em><b>Default Value EN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value EN</em>' attribute.
	 * @see #setDefaultValueEN(String)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getParameterInputForm_DefaultValueEN()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getDefaultValueEN();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.ParameterInputForm#getDefaultValueEN <em>Default Value EN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value EN</em>' attribute.
	 * @see #getDefaultValueEN()
	 * @generated
	 */
	void setDefaultValueEN(String value);

	/**
	 * Returns the value of the '<em><b>Has Options</b></em>' containment reference list.
	 * The list contents are of type {@link blockModelingMetamodel.Option}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Options</em>' containment reference list.
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getParameterInputForm_HasOptions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Option> getHasOptions();

} // ParameterInputForm
