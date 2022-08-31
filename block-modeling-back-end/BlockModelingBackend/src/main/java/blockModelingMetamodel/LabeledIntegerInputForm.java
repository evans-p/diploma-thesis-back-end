/**
 */
package blockModelingMetamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Labeled Integer Input Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockModelingMetamodel.LabeledIntegerInputForm#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link blockModelingMetamodel.LabeledIntegerInputForm#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link blockModelingMetamodel.LabeledIntegerInputForm#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link blockModelingMetamodel.LabeledIntegerInputForm#isNoMaxValue <em>No Max Value</em>}</li>
 *   <li>{@link blockModelingMetamodel.LabeledIntegerInputForm#isNoMinValue <em>No Min Value</em>}</li>
 *   <li>{@link blockModelingMetamodel.LabeledIntegerInputForm#isNoDefaultValue <em>No Default Value</em>}</li>
 * </ul>
 *
 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getLabeledIntegerInputForm()
 * @model
 * @generated
 */
public interface LabeledIntegerInputForm extends LabeledInputForm {
	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(int)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getLabeledIntegerInputForm_DefaultValue()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	int getDefaultValue();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.LabeledIntegerInputForm#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(int value);

	/**
	 * Returns the value of the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value</em>' attribute.
	 * @see #setMinValue(int)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getLabeledIntegerInputForm_MinValue()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	int getMinValue();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.LabeledIntegerInputForm#getMinValue <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value</em>' attribute.
	 * @see #getMinValue()
	 * @generated
	 */
	void setMinValue(int value);

	/**
	 * Returns the value of the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value</em>' attribute.
	 * @see #setMaxValue(int)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getLabeledIntegerInputForm_MaxValue()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	int getMaxValue();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.LabeledIntegerInputForm#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value</em>' attribute.
	 * @see #getMaxValue()
	 * @generated
	 */
	void setMaxValue(int value);

	/**
	 * Returns the value of the '<em><b>No Max Value</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Max Value</em>' attribute.
	 * @see #setNoMaxValue(boolean)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getLabeledIntegerInputForm_NoMaxValue()
	 * @model default="true" unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isNoMaxValue();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.LabeledIntegerInputForm#isNoMaxValue <em>No Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Max Value</em>' attribute.
	 * @see #isNoMaxValue()
	 * @generated
	 */
	void setNoMaxValue(boolean value);

	/**
	 * Returns the value of the '<em><b>No Min Value</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Min Value</em>' attribute.
	 * @see #setNoMinValue(boolean)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getLabeledIntegerInputForm_NoMinValue()
	 * @model default="true" unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isNoMinValue();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.LabeledIntegerInputForm#isNoMinValue <em>No Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Min Value</em>' attribute.
	 * @see #isNoMinValue()
	 * @generated
	 */
	void setNoMinValue(boolean value);

	/**
	 * Returns the value of the '<em><b>No Default Value</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Default Value</em>' attribute.
	 * @see #setNoDefaultValue(boolean)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getLabeledIntegerInputForm_NoDefaultValue()
	 * @model default="true" unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isNoDefaultValue();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.LabeledIntegerInputForm#isNoDefaultValue <em>No Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Default Value</em>' attribute.
	 * @see #isNoDefaultValue()
	 * @generated
	 */
	void setNoDefaultValue(boolean value);

} // LabeledIntegerInputForm
