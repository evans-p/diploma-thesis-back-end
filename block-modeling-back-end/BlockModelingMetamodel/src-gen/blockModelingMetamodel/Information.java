/**
 */
package blockModelingMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockModelingMetamodel.Information#getInformationTextEL <em>Information Text EL</em>}</li>
 *   <li>{@link blockModelingMetamodel.Information#getInformationTextEN <em>Information Text EN</em>}</li>
 *   <li>{@link blockModelingMetamodel.Information#getCursor <em>Cursor</em>}</li>
 * </ul>
 *
 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getInformation()
 * @model
 * @generated
 */
public interface Information extends EObject {
	/**
	 * Returns the value of the '<em><b>Information Text EL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information Text EL</em>' attribute.
	 * @see #setInformationTextEL(String)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getInformation_InformationTextEL()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getInformationTextEL();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.Information#getInformationTextEL <em>Information Text EL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Information Text EL</em>' attribute.
	 * @see #getInformationTextEL()
	 * @generated
	 */
	void setInformationTextEL(String value);

	/**
	 * Returns the value of the '<em><b>Information Text EN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information Text EN</em>' attribute.
	 * @see #setInformationTextEN(String)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getInformation_InformationTextEN()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getInformationTextEN();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.Information#getInformationTextEN <em>Information Text EN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Information Text EN</em>' attribute.
	 * @see #getInformationTextEN()
	 * @generated
	 */
	void setInformationTextEN(String value);

	/**
	 * Returns the value of the '<em><b>Cursor</b></em>' attribute.
	 * The literals are from the enumeration {@link blockModelingMetamodel.Cursor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cursor</em>' attribute.
	 * @see blockModelingMetamodel.Cursor
	 * @see #setCursor(Cursor)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getInformation_Cursor()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	Cursor getCursor();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.Information#getCursor <em>Cursor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cursor</em>' attribute.
	 * @see blockModelingMetamodel.Cursor
	 * @see #getCursor()
	 * @generated
	 */
	void setCursor(Cursor value);

} // Information
