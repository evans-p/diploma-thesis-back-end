/**
 */
package blockModelingMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockModelingMetamodel.ActionBlock#getBlockTitleEN <em>Block Title EN</em>}</li>
 *   <li>{@link blockModelingMetamodel.ActionBlock#getBlockTitleEL <em>Block Title EL</em>}</li>
 *   <li>{@link blockModelingMetamodel.ActionBlock#getBlockImage <em>Block Image</em>}</li>
 *   <li>{@link blockModelingMetamodel.ActionBlock#isHasPopover <em>Has Popover</em>}</li>
 *   <li>{@link blockModelingMetamodel.ActionBlock#getPopoverIcon <em>Popover Icon</em>}</li>
 *   <li>{@link blockModelingMetamodel.ActionBlock#getPopoverHelpTextEL <em>Popover Help Text EL</em>}</li>
 *   <li>{@link blockModelingMetamodel.ActionBlock#getPopoverHelpTextEN <em>Popover Help Text EN</em>}</li>
 *   <li>{@link blockModelingMetamodel.ActionBlock#getTitleBackroundColor <em>Title Backround Color</em>}</li>
 *   <li>{@link blockModelingMetamodel.ActionBlock#getHasInfo <em>Has Info</em>}</li>
 *   <li>{@link blockModelingMetamodel.ActionBlock#getHasInput <em>Has Input</em>}</li>
 *   <li>{@link blockModelingMetamodel.ActionBlock#getHasSettingsPopover <em>Has Settings Popover</em>}</li>
 * </ul>
 *
 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getActionBlock()
 * @model
 * @generated
 */
public interface ActionBlock extends Block {
	/**
	 * Returns the value of the '<em><b>Block Title EN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Title EN</em>' attribute.
	 * @see #setBlockTitleEN(String)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getActionBlock_BlockTitleEN()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getBlockTitleEN();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.ActionBlock#getBlockTitleEN <em>Block Title EN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Title EN</em>' attribute.
	 * @see #getBlockTitleEN()
	 * @generated
	 */
	void setBlockTitleEN(String value);

	/**
	 * Returns the value of the '<em><b>Block Title EL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Title EL</em>' attribute.
	 * @see #setBlockTitleEL(String)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getActionBlock_BlockTitleEL()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getBlockTitleEL();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.ActionBlock#getBlockTitleEL <em>Block Title EL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Title EL</em>' attribute.
	 * @see #getBlockTitleEL()
	 * @generated
	 */
	void setBlockTitleEL(String value);

	/**
	 * Returns the value of the '<em><b>Block Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Image</em>' attribute.
	 * @see #setBlockImage(String)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getActionBlock_BlockImage()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getBlockImage();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.ActionBlock#getBlockImage <em>Block Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Image</em>' attribute.
	 * @see #getBlockImage()
	 * @generated
	 */
	void setBlockImage(String value);

	/**
	 * Returns the value of the '<em><b>Has Popover</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Popover</em>' attribute.
	 * @see #setHasPopover(boolean)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getActionBlock_HasPopover()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isHasPopover();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.ActionBlock#isHasPopover <em>Has Popover</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Popover</em>' attribute.
	 * @see #isHasPopover()
	 * @generated
	 */
	void setHasPopover(boolean value);

	/**
	 * Returns the value of the '<em><b>Popover Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Popover Icon</em>' attribute.
	 * @see #setPopoverIcon(String)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getActionBlock_PopoverIcon()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getPopoverIcon();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.ActionBlock#getPopoverIcon <em>Popover Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Popover Icon</em>' attribute.
	 * @see #getPopoverIcon()
	 * @generated
	 */
	void setPopoverIcon(String value);

	/**
	 * Returns the value of the '<em><b>Popover Help Text EL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Popover Help Text EL</em>' attribute.
	 * @see #setPopoverHelpTextEL(String)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getActionBlock_PopoverHelpTextEL()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getPopoverHelpTextEL();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.ActionBlock#getPopoverHelpTextEL <em>Popover Help Text EL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Popover Help Text EL</em>' attribute.
	 * @see #getPopoverHelpTextEL()
	 * @generated
	 */
	void setPopoverHelpTextEL(String value);

	/**
	 * Returns the value of the '<em><b>Popover Help Text EN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Popover Help Text EN</em>' attribute.
	 * @see #setPopoverHelpTextEN(String)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getActionBlock_PopoverHelpTextEN()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getPopoverHelpTextEN();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.ActionBlock#getPopoverHelpTextEN <em>Popover Help Text EN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Popover Help Text EN</em>' attribute.
	 * @see #getPopoverHelpTextEN()
	 * @generated
	 */
	void setPopoverHelpTextEN(String value);

	/**
	 * Returns the value of the '<em><b>Title Backround Color</b></em>' attribute.
	 * The default value is <code>"#975e11"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title Backround Color</em>' attribute.
	 * @see #setTitleBackroundColor(String)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getActionBlock_TitleBackroundColor()
	 * @model default="#975e11" unique="false" ordered="false"
	 * @generated
	 */
	String getTitleBackroundColor();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.ActionBlock#getTitleBackroundColor <em>Title Backround Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title Backround Color</em>' attribute.
	 * @see #getTitleBackroundColor()
	 * @generated
	 */
	void setTitleBackroundColor(String value);

	/**
	 * Returns the value of the '<em><b>Has Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Info</em>' containment reference.
	 * @see #setHasInfo(Information)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getActionBlock_HasInfo()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Information getHasInfo();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.ActionBlock#getHasInfo <em>Has Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Info</em>' containment reference.
	 * @see #getHasInfo()
	 * @generated
	 */
	void setHasInfo(Information value);

	/**
	 * Returns the value of the '<em><b>Has Input</b></em>' containment reference list.
	 * The list contents are of type {@link blockModelingMetamodel.InputBlock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Input</em>' containment reference list.
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getActionBlock_HasInput()
	 * @model containment="true"
	 * @generated
	 */
	EList<InputBlock> getHasInput();

	/**
	 * Returns the value of the '<em><b>Has Settings Popover</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Settings Popover</em>' containment reference.
	 * @see #setHasSettingsPopover(SettingsPopover)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getActionBlock_HasSettingsPopover()
	 * @model containment="true"
	 * @generated
	 */
	SettingsPopover getHasSettingsPopover();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.ActionBlock#getHasSettingsPopover <em>Has Settings Popover</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Settings Popover</em>' containment reference.
	 * @see #getHasSettingsPopover()
	 * @generated
	 */
	void setHasSettingsPopover(SettingsPopover value);

} // ActionBlock
