/**
 */
package blockModelingMetamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Float Input Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockModelingMetamodel.FloatInputBlock#isNoMaxValue <em>No Max Value</em>}</li>
 *   <li>{@link blockModelingMetamodel.FloatInputBlock#isNoMinValue <em>No Min Value</em>}</li>
 *   <li>{@link blockModelingMetamodel.FloatInputBlock#isNoDefaultValue <em>No Default Value</em>}</li>
 *   <li>{@link blockModelingMetamodel.FloatInputBlock#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link blockModelingMetamodel.FloatInputBlock#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link blockModelingMetamodel.FloatInputBlock#getMinValue <em>Min Value</em>}</li>
 * </ul>
 *
 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getFloatInputBlock()
 * @model
 * @generated
 */
public interface FloatInputBlock extends InputBlock {
	/**
	 * Returns the value of the '<em><b>No Max Value</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Max Value</em>' attribute.
	 * @see #setNoMaxValue(boolean)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getFloatInputBlock_NoMaxValue()
	 * @model default="true" unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isNoMaxValue();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.FloatInputBlock#isNoMaxValue <em>No Max Value</em>}' attribute.
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
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getFloatInputBlock_NoMinValue()
	 * @model default="true" unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isNoMinValue();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.FloatInputBlock#isNoMinValue <em>No Min Value</em>}' attribute.
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
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getFloatInputBlock_NoDefaultValue()
	 * @model default="true" unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isNoDefaultValue();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.FloatInputBlock#isNoDefaultValue <em>No Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Default Value</em>' attribute.
	 * @see #isNoDefaultValue()
	 * @generated
	 */
	void setNoDefaultValue(boolean value);

	/**
	 * Returns the value of the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value</em>' attribute.
	 * @see #setMinValue(float)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getFloatInputBlock_MinValue()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	float getMinValue();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.FloatInputBlock#getMinValue <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value</em>' attribute.
	 * @see #getMinValue()
	 * @generated
	 */
	void setMinValue(float value);

	/**
	 * Returns the value of the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value</em>' attribute.
	 * @see #setMaxValue(float)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getFloatInputBlock_MaxValue()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	float getMaxValue();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.FloatInputBlock#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value</em>' attribute.
	 * @see #getMaxValue()
	 * @generated
	 */
	void setMaxValue(float value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(float)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getFloatInputBlock_DefaultValue()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	float getDefaultValue();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.FloatInputBlock#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(float value);

} // FloatInputBlock
