/**
 */
package blockModelingMetamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Category</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getCategory()
 * @model
 * @generated
 */
public enum Category implements Enumerator {
	/**
	 * The '<em><b>MOVEMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOVEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	MOVEMENT(0, "MOVEMENT", "MOVEMENT"),

	/**
	 * The '<em><b>DETECTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DETECTION_VALUE
	 * @generated
	 * @ordered
	 */
	DETECTION(1, "DETECTION", "DETECTION"),

	/**
	 * The '<em><b>SOUND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOUND_VALUE
	 * @generated
	 * @ordered
	 */
	SOUND(2, "SOUND", "SOUND"),

	/**
	 * The '<em><b>TOOLS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOOLS_VALUE
	 * @generated
	 * @ordered
	 */
	TOOLS(3, "TOOLS", "TOOLS"),

	/**
	 * The '<em><b>VARIOUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARIOUS_VALUE
	 * @generated
	 * @ordered
	 */
	VARIOUS(4, "VARIOUS", "VARIOUS");

	/**
	 * The '<em><b>MOVEMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOVEMENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOVEMENT_VALUE = 0;

	/**
	 * The '<em><b>DETECTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DETECTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DETECTION_VALUE = 1;

	/**
	 * The '<em><b>SOUND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOUND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SOUND_VALUE = 2;

	/**
	 * The '<em><b>TOOLS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOOLS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TOOLS_VALUE = 3;

	/**
	 * The '<em><b>VARIOUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARIOUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VARIOUS_VALUE = 4;

	/**
	 * An array of all the '<em><b>Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Category[] VALUES_ARRAY = new Category[] { MOVEMENT, DETECTION, SOUND, TOOLS, VARIOUS, };

	/**
	 * A public read-only list of all the '<em><b>Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Category> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Category</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Category get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Category result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Category</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Category getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Category result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Category</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Category get(int value) {
		switch (value) {
		case MOVEMENT_VALUE:
			return MOVEMENT;
		case DETECTION_VALUE:
			return DETECTION;
		case SOUND_VALUE:
			return SOUND;
		case TOOLS_VALUE:
			return TOOLS;
		case VARIOUS_VALUE:
			return VARIOUS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Category(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //Category
