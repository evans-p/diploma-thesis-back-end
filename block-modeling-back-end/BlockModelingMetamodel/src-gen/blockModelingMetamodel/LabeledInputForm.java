/**
 */
package blockModelingMetamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Labeled Input Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockModelingMetamodel.LabeledInputForm#getVariableNameEL <em>Variable Name EL</em>}</li>
 *   <li>{@link blockModelingMetamodel.LabeledInputForm#getVariableNameEN <em>Variable Name EN</em>}</li>
 * </ul>
 *
 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getLabeledInputForm()
 * @model abstract="true"
 * @generated
 */
public interface LabeledInputForm extends Form {
	/**
	 * Returns the value of the '<em><b>Variable Name EL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Name EL</em>' attribute.
	 * @see #setVariableNameEL(String)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getLabeledInputForm_VariableNameEL()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getVariableNameEL();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.LabeledInputForm#getVariableNameEL <em>Variable Name EL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Name EL</em>' attribute.
	 * @see #getVariableNameEL()
	 * @generated
	 */
	void setVariableNameEL(String value);

	/**
	 * Returns the value of the '<em><b>Variable Name EN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Name EN</em>' attribute.
	 * @see #setVariableNameEN(String)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getLabeledInputForm_VariableNameEN()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getVariableNameEN();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.LabeledInputForm#getVariableNameEN <em>Variable Name EN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Name EN</em>' attribute.
	 * @see #getVariableNameEN()
	 * @generated
	 */
	void setVariableNameEN(String value);

} // LabeledInputForm
