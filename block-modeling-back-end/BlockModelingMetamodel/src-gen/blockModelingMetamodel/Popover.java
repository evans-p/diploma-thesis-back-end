/**
 */
package blockModelingMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Popover</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockModelingMetamodel.Popover#getPopoverTitleEL <em>Popover Title EL</em>}</li>
 *   <li>{@link blockModelingMetamodel.Popover#getPopoverTitleEN <em>Popover Title EN</em>}</li>
 * </ul>
 *
 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getPopover()
 * @model abstract="true"
 * @generated
 */
public interface Popover extends EObject {
	/**
	 * Returns the value of the '<em><b>Popover Title EL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Popover Title EL</em>' attribute.
	 * @see #setPopoverTitleEL(String)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getPopover_PopoverTitleEL()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getPopoverTitleEL();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.Popover#getPopoverTitleEL <em>Popover Title EL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Popover Title EL</em>' attribute.
	 * @see #getPopoverTitleEL()
	 * @generated
	 */
	void setPopoverTitleEL(String value);

	/**
	 * Returns the value of the '<em><b>Popover Title EN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Popover Title EN</em>' attribute.
	 * @see #setPopoverTitleEN(String)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getPopover_PopoverTitleEN()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getPopoverTitleEN();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.Popover#getPopoverTitleEN <em>Popover Title EN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Popover Title EN</em>' attribute.
	 * @see #getPopoverTitleEN()
	 * @generated
	 */
	void setPopoverTitleEN(String value);

} // Popover
