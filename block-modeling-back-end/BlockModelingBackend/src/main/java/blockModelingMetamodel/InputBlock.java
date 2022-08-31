/**
 */
package blockModelingMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockModelingMetamodel.InputBlock#getImage <em>Image</em>}</li>
 *   <li>{@link blockModelingMetamodel.InputBlock#getInfoTextEN <em>Info Text EN</em>}</li>
 *   <li>{@link blockModelingMetamodel.InputBlock#getInfoTextEL <em>Info Text EL</em>}</li>
 *   <li>{@link blockModelingMetamodel.InputBlock#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link blockModelingMetamodel.InputBlock#getIconCursor <em>Icon Cursor</em>}</li>
 * </ul>
 *
 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getInputBlock()
 * @model abstract="true"
 * @generated
 */
public interface InputBlock extends EObject {
	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(String)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getInputBlock_Image()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getImage();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.InputBlock#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(String value);

	/**
	 * Returns the value of the '<em><b>Info Text EN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info Text EN</em>' attribute.
	 * @see #setInfoTextEN(String)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getInputBlock_InfoTextEN()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getInfoTextEN();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.InputBlock#getInfoTextEN <em>Info Text EN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info Text EN</em>' attribute.
	 * @see #getInfoTextEN()
	 * @generated
	 */
	void setInfoTextEN(String value);

	/**
	 * Returns the value of the '<em><b>Info Text EL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info Text EL</em>' attribute.
	 * @see #setInfoTextEL(String)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getInputBlock_InfoTextEL()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getInfoTextEL();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.InputBlock#getInfoTextEL <em>Info Text EL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info Text EL</em>' attribute.
	 * @see #getInfoTextEL()
	 * @generated
	 */
	void setInfoTextEL(String value);

	/**
	 * Returns the value of the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Name</em>' attribute.
	 * @see #setVariableName(String)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getInputBlock_VariableName()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getVariableName();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.InputBlock#getVariableName <em>Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Name</em>' attribute.
	 * @see #getVariableName()
	 * @generated
	 */
	void setVariableName(String value);

	/**
	 * Returns the value of the '<em><b>Icon Cursor</b></em>' attribute.
	 * The literals are from the enumeration {@link blockModelingMetamodel.Cursor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon Cursor</em>' attribute.
	 * @see blockModelingMetamodel.Cursor
	 * @see #setIconCursor(Cursor)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getInputBlock_IconCursor()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	Cursor getIconCursor();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.InputBlock#getIconCursor <em>Icon Cursor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon Cursor</em>' attribute.
	 * @see blockModelingMetamodel.Cursor
	 * @see #getIconCursor()
	 * @generated
	 */
	void setIconCursor(Cursor value);

} // InputBlock
