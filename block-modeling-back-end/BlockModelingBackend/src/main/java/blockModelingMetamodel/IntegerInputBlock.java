/**
 */
package blockModelingMetamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Input Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockModelingMetamodel.IntegerInputBlock#isNoMinValue <em>No Min Value</em>}</li>
 *   <li>{@link blockModelingMetamodel.IntegerInputBlock#isNoMaxValue <em>No Max Value</em>}</li>
 *   <li>{@link blockModelingMetamodel.IntegerInputBlock#isNoDefaultValue <em>No Default Value</em>}</li>
 *   <li>{@link blockModelingMetamodel.IntegerInputBlock#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link blockModelingMetamodel.IntegerInputBlock#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link blockModelingMetamodel.IntegerInputBlock#getMinValue <em>Min Value</em>}</li>
 * </ul>
 *
 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getIntegerInputBlock()
 * @model
 * @generated
 */
public interface IntegerInputBlock extends InputBlock {
	/**
	 * Returns the value of the '<em><b>No Min Value</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Min Value</em>' attribute.
	 * @see #setNoMinValue(boolean)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getIntegerInputBlock_NoMinValue()
	 * @model default="true" unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isNoMinValue();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.IntegerInputBlock#isNoMinValue <em>No Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Min Value</em>' attribute.
	 * @see #isNoMinValue()
	 * @generated
	 */
	void setNoMinValue(boolean value);

	/**
	 * Returns the value of the '<em><b>No Max Value</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Max Value</em>' attribute.
	 * @see #setNoMaxValue(boolean)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getIntegerInputBlock_NoMaxValue()
	 * @model default="true" unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isNoMaxValue();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.IntegerInputBlock#isNoMaxValue <em>No Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Max Value</em>' attribute.
	 * @see #isNoMaxValue()
	 * @generated
	 */
	void setNoMaxValue(boolean value);

	/**
	 * Returns the value of the '<em><b>No Default Value</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Default Value</em>' attribute.
	 * @see #setNoDefaultValue(boolean)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getIntegerInputBlock_NoDefaultValue()
	 * @model default="true" unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isNoDefaultValue();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.IntegerInputBlock#isNoDefaultValue <em>No Default Value</em>}' attribute.
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
	 * @see #setMinValue(int)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getIntegerInputBlock_MinValue()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	int getMinValue();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.IntegerInputBlock#getMinValue <em>Min Value</em>}' attribute.
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
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getIntegerInputBlock_MaxValue()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	int getMaxValue();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.IntegerInputBlock#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value</em>' attribute.
	 * @see #getMaxValue()
	 * @generated
	 */
	void setMaxValue(int value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(int)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getIntegerInputBlock_DefaultValue()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	int getDefaultValue();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.IntegerInputBlock#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(int value);

} // IntegerInputBlock
