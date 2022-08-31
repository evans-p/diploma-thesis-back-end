/**
 */
package blockModelingMetamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockModelingMetamodel.ReferenceBlock#getBlockTitleEL <em>Block Title EL</em>}</li>
 *   <li>{@link blockModelingMetamodel.ReferenceBlock#getBlockTitleEN <em>Block Title EN</em>}</li>
 *   <li>{@link blockModelingMetamodel.ReferenceBlock#getBlockImage <em>Block Image</em>}</li>
 *   <li>{@link blockModelingMetamodel.ReferenceBlock#getImageBackroundShape <em>Image Backround Shape</em>}</li>
 *   <li>{@link blockModelingMetamodel.ReferenceBlock#isHasNextBlock <em>Has Next Block</em>}</li>
 *   <li>{@link blockModelingMetamodel.ReferenceBlock#getImageCursor <em>Image Cursor</em>}</li>
 *   <li>{@link blockModelingMetamodel.ReferenceBlock#getImageBackroundShapeColor <em>Image Backround Shape Color</em>}</li>
 *   <li>{@link blockModelingMetamodel.ReferenceBlock#getHasInfo <em>Has Info</em>}</li>
 * </ul>
 *
 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getReferenceBlock()
 * @model
 * @generated
 */
public interface ReferenceBlock extends Block {
	/**
	 * Returns the value of the '<em><b>Block Title EL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Title EL</em>' attribute.
	 * @see #setBlockTitleEL(String)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getReferenceBlock_BlockTitleEL()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getBlockTitleEL();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.ReferenceBlock#getBlockTitleEL <em>Block Title EL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Title EL</em>' attribute.
	 * @see #getBlockTitleEL()
	 * @generated
	 */
	void setBlockTitleEL(String value);

	/**
	 * Returns the value of the '<em><b>Block Title EN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Title EN</em>' attribute.
	 * @see #setBlockTitleEN(String)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getReferenceBlock_BlockTitleEN()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getBlockTitleEN();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.ReferenceBlock#getBlockTitleEN <em>Block Title EN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Title EN</em>' attribute.
	 * @see #getBlockTitleEN()
	 * @generated
	 */
	void setBlockTitleEN(String value);

	/**
	 * Returns the value of the '<em><b>Block Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Image</em>' attribute.
	 * @see #setBlockImage(String)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getReferenceBlock_BlockImage()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getBlockImage();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.ReferenceBlock#getBlockImage <em>Block Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Image</em>' attribute.
	 * @see #getBlockImage()
	 * @generated
	 */
	void setBlockImage(String value);

	/**
	 * Returns the value of the '<em><b>Image Backround Shape</b></em>' attribute.
	 * The literals are from the enumeration {@link blockModelingMetamodel.ImageBackgroundShape}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Backround Shape</em>' attribute.
	 * @see blockModelingMetamodel.ImageBackgroundShape
	 * @see #setImageBackroundShape(ImageBackgroundShape)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getReferenceBlock_ImageBackroundShape()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	ImageBackgroundShape getImageBackroundShape();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.ReferenceBlock#getImageBackroundShape <em>Image Backround Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Backround Shape</em>' attribute.
	 * @see blockModelingMetamodel.ImageBackgroundShape
	 * @see #getImageBackroundShape()
	 * @generated
	 */
	void setImageBackroundShape(ImageBackgroundShape value);

	/**
	 * Returns the value of the '<em><b>Has Next Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Next Block</em>' attribute.
	 * @see #setHasNextBlock(boolean)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getReferenceBlock_HasNextBlock()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isHasNextBlock();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.ReferenceBlock#isHasNextBlock <em>Has Next Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Next Block</em>' attribute.
	 * @see #isHasNextBlock()
	 * @generated
	 */
	void setHasNextBlock(boolean value);

	/**
	 * Returns the value of the '<em><b>Image Cursor</b></em>' attribute.
	 * The literals are from the enumeration {@link blockModelingMetamodel.Cursor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Cursor</em>' attribute.
	 * @see blockModelingMetamodel.Cursor
	 * @see #setImageCursor(Cursor)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getReferenceBlock_ImageCursor()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	Cursor getImageCursor();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.ReferenceBlock#getImageCursor <em>Image Cursor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Cursor</em>' attribute.
	 * @see blockModelingMetamodel.Cursor
	 * @see #getImageCursor()
	 * @generated
	 */
	void setImageCursor(Cursor value);

	/**
	 * Returns the value of the '<em><b>Image Backround Shape Color</b></em>' attribute.
	 * The default value is <code>"#FFFFFF"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Backround Shape Color</em>' attribute.
	 * @see #setImageBackroundShapeColor(String)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getReferenceBlock_ImageBackroundShapeColor()
	 * @model default="#FFFFFF" unique="false" ordered="false"
	 * @generated
	 */
	String getImageBackroundShapeColor();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.ReferenceBlock#getImageBackroundShapeColor <em>Image Backround Shape Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Backround Shape Color</em>' attribute.
	 * @see #getImageBackroundShapeColor()
	 * @generated
	 */
	void setImageBackroundShapeColor(String value);

	/**
	 * Returns the value of the '<em><b>Has Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Info</em>' containment reference.
	 * @see #setHasInfo(Information)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getReferenceBlock_HasInfo()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Information getHasInfo();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.ReferenceBlock#getHasInfo <em>Has Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Info</em>' containment reference.
	 * @see #getHasInfo()
	 * @generated
	 */
	void setHasInfo(Information value);

} // ReferenceBlock
