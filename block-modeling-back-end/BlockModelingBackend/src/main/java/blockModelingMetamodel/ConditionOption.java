/**
 */
package blockModelingMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockModelingMetamodel.ConditionOption#getOptionTextEL <em>Option Text EL</em>}</li>
 *   <li>{@link blockModelingMetamodel.ConditionOption#getOptionTextEN <em>Option Text EN</em>}</li>
 *   <li>{@link blockModelingMetamodel.ConditionOption#getComparisonType <em>Comparison Type</em>}</li>
 *   <li>{@link blockModelingMetamodel.ConditionOption#getComparators <em>Comparators</em>}</li>
 *   <li>{@link blockModelingMetamodel.ConditionOption#getHasOptions <em>Has Options</em>}</li>
 * </ul>
 *
 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getConditionOption()
 * @model
 * @generated
 */
public interface ConditionOption extends EObject {
	/**
	 * Returns the value of the '<em><b>Option Text EL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option Text EL</em>' attribute.
	 * @see #setOptionTextEL(String)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getConditionOption_OptionTextEL()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getOptionTextEL();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.ConditionOption#getOptionTextEL <em>Option Text EL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option Text EL</em>' attribute.
	 * @see #getOptionTextEL()
	 * @generated
	 */
	void setOptionTextEL(String value);

	/**
	 * Returns the value of the '<em><b>Option Text EN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option Text EN</em>' attribute.
	 * @see #setOptionTextEN(String)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getConditionOption_OptionTextEN()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getOptionTextEN();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.ConditionOption#getOptionTextEN <em>Option Text EN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option Text EN</em>' attribute.
	 * @see #getOptionTextEN()
	 * @generated
	 */
	void setOptionTextEN(String value);

	/**
	 * Returns the value of the '<em><b>Comparison Type</b></em>' attribute.
	 * The literals are from the enumeration {@link blockModelingMetamodel.ComparisonType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison Type</em>' attribute.
	 * @see blockModelingMetamodel.ComparisonType
	 * @see #setComparisonType(ComparisonType)
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getConditionOption_ComparisonType()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	ComparisonType getComparisonType();

	/**
	 * Sets the value of the '{@link blockModelingMetamodel.ConditionOption#getComparisonType <em>Comparison Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparison Type</em>' attribute.
	 * @see blockModelingMetamodel.ComparisonType
	 * @see #getComparisonType()
	 * @generated
	 */
	void setComparisonType(ComparisonType value);

	/**
	 * Returns the value of the '<em><b>Comparators</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparators</em>' attribute list.
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getConditionOption_Comparators()
	 * @model unique="false" upper="6" ordered="false"
	 * @generated
	 */
	EList<String> getComparators();

	/**
	 * Returns the value of the '<em><b>Has Options</b></em>' containment reference list.
	 * The list contents are of type {@link blockModelingMetamodel.Option}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Options</em>' containment reference list.
	 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getConditionOption_HasOptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Option> getHasOptions();

} // ConditionOption
