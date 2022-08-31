/**
 */
package blockModelingMetamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Input Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockModelingMetamodel.TextInputBlock#getDefaultValueEL <em>Default Value EL</em>}</li>
 *   <li>{@link blockModelingMetamodel.TextInputBlock#getDefaultValueEN <em>Default Value EN</em>}</li>
 * </ul>
 *
 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getTextInputBlock()
 * @model
 * @generated
 */
public interface TextInputBlock extends InputBlock {
	/**
	 * Returns the value of the '<em><b>Default Value EL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value EL</em>' attribute.
	 * @see #setDefaultValueEL(String)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getTextInputBlock_DefaultValueEL()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getDefaultValueEL();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.TextInputBlock#getDefaultValueEL <em>Default Value EL</em>}' attribute.
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
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getTextInputBlock_DefaultValueEN()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getDefaultValueEN();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.TextInputBlock#getDefaultValueEN <em>Default Value EN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value EN</em>' attribute.
	 * @see #getDefaultValueEN()
	 * @generated
	 */
	void setDefaultValueEN(String value);

} // TextInputBlock
