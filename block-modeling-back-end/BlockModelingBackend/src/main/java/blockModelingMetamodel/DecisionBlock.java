/**
 */
package blockModelingMetamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockModelingMetamodel.DecisionBlock#getBlockImage <em>Block Image</em>}</li>
 *   <li>{@link blockModelingMetamodel.DecisionBlock#getNumberOfColumns <em>Number Of Columns</em>}</li>
 *   <li>{@link blockModelingMetamodel.DecisionBlock#getBlockImageCursor <em>Block Image Cursor</em>}</li>
 *   <li>{@link blockModelingMetamodel.DecisionBlock#getHasSettingsPopover <em>Has Settings Popover</em>}</li>
 *   <li>{@link blockModelingMetamodel.DecisionBlock#getHasConfigurationPopover <em>Has Configuration Popover</em>}</li>
 * </ul>
 *
 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getDecisionBlock()
 * @model
 * @generated
 */
public interface DecisionBlock extends Block {
	/**
	 * Returns the value of the '<em><b>Block Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Image</em>' attribute.
	 * @see #setBlockImage(String)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getDecisionBlock_BlockImage()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getBlockImage();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.DecisionBlock#getBlockImage <em>Block Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Image</em>' attribute.
	 * @see #getBlockImage()
	 * @generated
	 */
	void setBlockImage(String value);

	/**
	 * Returns the value of the '<em><b>Number Of Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Columns</em>' attribute.
	 * @see #setNumberOfColumns(int)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getDecisionBlock_NumberOfColumns()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	int getNumberOfColumns();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.DecisionBlock#getNumberOfColumns <em>Number Of Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Columns</em>' attribute.
	 * @see #getNumberOfColumns()
	 * @generated
	 */
	void setNumberOfColumns(int value);

	/**
	 * Returns the value of the '<em><b>Block Image Cursor</b></em>' attribute.
	 * The literals are from the enumeration {@link blockModelingMetamodel.Cursor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Image Cursor</em>' attribute.
	 * @see blockModelingMetamodel.Cursor
	 * @see #setBlockImageCursor(Cursor)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getDecisionBlock_BlockImageCursor()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	Cursor getBlockImageCursor();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.DecisionBlock#getBlockImageCursor <em>Block Image Cursor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Image Cursor</em>' attribute.
	 * @see blockModelingMetamodel.Cursor
	 * @see #getBlockImageCursor()
	 * @generated
	 */
	void setBlockImageCursor(Cursor value);

	/**
	 * Returns the value of the '<em><b>Has Settings Popover</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Settings Popover</em>' containment reference.
	 * @see #setHasSettingsPopover(SettingsPopover)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getDecisionBlock_HasSettingsPopover()
	 * @model containment="true"
	 * @generated
	 */
	SettingsPopover getHasSettingsPopover();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.DecisionBlock#getHasSettingsPopover <em>Has Settings Popover</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Settings Popover</em>' containment reference.
	 * @see #getHasSettingsPopover()
	 * @generated
	 */
	void setHasSettingsPopover(SettingsPopover value);

	/**
	 * Returns the value of the '<em><b>Has Configuration Popover</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Configuration Popover</em>' containment reference.
	 * @see #setHasConfigurationPopover(ConfigurationPopover)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getDecisionBlock_HasConfigurationPopover()
	 * @model containment="true"
	 * @generated
	 */
	ConfigurationPopover getHasConfigurationPopover();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.DecisionBlock#getHasConfigurationPopover <em>Has Configuration Popover</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Configuration Popover</em>' containment reference.
	 * @see #getHasConfigurationPopover()
	 * @generated
	 */
	void setHasConfigurationPopover(ConfigurationPopover value);

} // DecisionBlock
