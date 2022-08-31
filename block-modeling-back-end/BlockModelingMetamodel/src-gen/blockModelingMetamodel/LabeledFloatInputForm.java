/**
 */
package blockModelingMetamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Labeled Float Input Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockModelingMetamodel.LabeledFloatInputForm#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link blockModelingMetamodel.LabeledFloatInputForm#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link blockModelingMetamodel.LabeledFloatInputForm#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link blockModelingMetamodel.LabeledFloatInputForm#isNoMaxValue <em>No Max Value</em>}</li>
 *   <li>{@link blockModelingMetamodel.LabeledFloatInputForm#isNoMinValue <em>No Min Value</em>}</li>
 *   <li>{@link blockModelingMetamodel.LabeledFloatInputForm#isNoDefaultValue <em>No Default Value</em>}</li>
 * </ul>
 *
 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getLabeledFloatInputForm()
 * @model
 * @generated
 */
public interface LabeledFloatInputForm extends LabeledInputForm {
	/**
	 * Returns the value of the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value</em>' attribute.
	 * @see #setMinValue(float)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getLabeledFloatInputForm_MinValue()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	float getMinValue();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.LabeledFloatInputForm#getMinValue <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value</em>' attribute.
	 * @see #getMinValue()
	 * @generated
	 */
	void setMinValue(float value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(float)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getLabeledFloatInputForm_DefaultValue()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	float getDefaultValue();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.LabeledFloatInputForm#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(float value);

	/**
	 * Returns the value of the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value</em>' attribute.
	 * @see #setMaxValue(float)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getLabeledFloatInputForm_MaxValue()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	float getMaxValue();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.LabeledFloatInputForm#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value</em>' attribute.
	 * @see #getMaxValue()
	 * @generated
	 */
	void setMaxValue(float value);

	/**
	 * Returns the value of the '<em><b>No Max Value</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Max Value</em>' attribute.
	 * @see #setNoMaxValue(boolean)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getLabeledFloatInputForm_NoMaxValue()
	 * @model default="true" unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isNoMaxValue();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.LabeledFloatInputForm#isNoMaxValue <em>No Max Value</em>}' attribute.
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
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getLabeledFloatInputForm_NoMinValue()
	 * @model default="true" unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isNoMinValue();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.LabeledFloatInputForm#isNoMinValue <em>No Min Value</em>}' attribute.
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
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getLabeledFloatInputForm_NoDefaultValue()
	 * @model default="true" unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isNoDefaultValue();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.LabeledFloatInputForm#isNoDefaultValue <em>No Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Default Value</em>' attribute.
	 * @see #isNoDefaultValue()
	 * @generated
	 */
	void setNoDefaultValue(boolean value);

} // LabeledFloatInputForm
