/**
 */
package blockModelingMetamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Image Background Shape</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see blockModelingMetamodel.BlockModelingMetamodelPackage#getImageBackgroundShape()
 * @model
 * @generated
 */
public enum ImageBackgroundShape implements Enumerator {
	/**
	 * The '<em><b>CIRCLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CIRCLE_VALUE
	 * @generated
	 * @ordered
	 */
	CIRCLE(0, "CIRCLE", "CIRCLE"),

	/**
	 * The '<em><b>SQUARE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SQUARE_VALUE
	 * @generated
	 * @ordered
	 */
	SQUARE(1, "SQUARE", "SQUARE"),

	/**
	 * The '<em><b>HEXAGON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEXAGON_VALUE
	 * @generated
	 * @ordered
	 */
	HEXAGON(2, "HEXAGON", "HEXAGON"),

	/**
	 * The '<em><b>OCTAGON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCTAGON_VALUE
	 * @generated
	 * @ordered
	 */
	OCTAGON(3, "OCTAGON", "OCTAGON");

	/**
	 * The '<em><b>CIRCLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CIRCLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CIRCLE_VALUE = 0;

	/**
	 * The '<em><b>SQUARE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SQUARE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SQUARE_VALUE = 1;

	/**
	 * The '<em><b>HEXAGON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEXAGON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HEXAGON_VALUE = 2;

	/**
	 * The '<em><b>OCTAGON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCTAGON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OCTAGON_VALUE = 3;

	/**
	 * An array of all the '<em><b>Image Background Shape</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ImageBackgroundShape[] VALUES_ARRAY = new ImageBackgroundShape[] { CIRCLE, SQUARE, HEXAGON,
			OCTAGON, };

	/**
	 * A public read-only list of all the '<em><b>Image Background Shape</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ImageBackgroundShape> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Image Background Shape</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImageBackgroundShape get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImageBackgroundShape result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Image Background Shape</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImageBackgroundShape getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImageBackgroundShape result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Image Background Shape</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImageBackgroundShape get(int value) {
		switch (value) {
		case CIRCLE_VALUE:
			return CIRCLE;
		case SQUARE_VALUE:
			return SQUARE;
		case HEXAGON_VALUE:
			return HEXAGON;
		case OCTAGON_VALUE:
			return OCTAGON;
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
	private ImageBackgroundShape(int value, String name, String literal) {
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

} //ImageBackgroundShape
