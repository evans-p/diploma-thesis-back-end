/**
 */
package blockModelingMetamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Settings Popover</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockModelingMetamodel.SettingsPopover#getHasForm <em>Has Form</em>}</li>
 * </ul>
 *
 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getSettingsPopover()
 * @model
 * @generated
 */
public interface SettingsPopover extends Popover {
	/**
	 * Returns the value of the '<em><b>Has Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Form</em>' containment reference.
	 * @see #setHasForm(Form)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getSettingsPopover_HasForm()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Form getHasForm();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.SettingsPopover#getHasForm <em>Has Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Form</em>' containment reference.
	 * @see #getHasForm()
	 * @generated
	 */
	void setHasForm(Form value);

} // SettingsPopover
