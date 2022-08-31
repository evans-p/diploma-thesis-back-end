/**
 */
package blockModelingMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockModelingMetamodel.Block#getCategory <em>Category</em>}</li>
 *   <li>{@link blockModelingMetamodel.Block#getBackroundColor <em>Backround Color</em>}</li>
 *   <li>{@link blockModelingMetamodel.Block#getBlockNameEL <em>Block Name EL</em>}</li>
 *   <li>{@link blockModelingMetamodel.Block#getBlockNameEN <em>Block Name EN</em>}</li>
 * </ul>
 *
 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getBlock()
 * @model abstract="true"
 * @generated
 */
public interface Block extends EObject {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The literals are from the enumeration {@link blockModelingMetamodel.Category}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see blockModelingMetamodel.Category
	 * @see #setCategory(Category)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getBlock_Category()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	Category getCategory();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.Block#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see blockModelingMetamodel.Category
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(Category value);

	/**
	 * Returns the value of the '<em><b>Backround Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Backround Color</em>' attribute.
	 * @see #setBackroundColor(String)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getBlock_BackroundColor()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getBackroundColor();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.Block#getBackroundColor <em>Backround Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Backround Color</em>' attribute.
	 * @see #getBackroundColor()
	 * @generated
	 */
	void setBackroundColor(String value);

	/**
	 * Returns the value of the '<em><b>Block Name EL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Name EL</em>' attribute.
	 * @see #setBlockNameEL(String)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getBlock_BlockNameEL()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getBlockNameEL();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.Block#getBlockNameEL <em>Block Name EL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Name EL</em>' attribute.
	 * @see #getBlockNameEL()
	 * @generated
	 */
	void setBlockNameEL(String value);

	/**
	 * Returns the value of the '<em><b>Block Name EN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Name EN</em>' attribute.
	 * @see #setBlockNameEN(String)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getBlock_BlockNameEN()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getBlockNameEN();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.Block#getBlockNameEN <em>Block Name EN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Name EN</em>' attribute.
	 * @see #getBlockNameEN()
	 * @generated
	 */
	void setBlockNameEN(String value);

} // Block
