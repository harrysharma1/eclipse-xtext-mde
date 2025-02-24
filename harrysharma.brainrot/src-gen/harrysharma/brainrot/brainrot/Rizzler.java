/**
 * generated by Xtext 2.37.0
 */
package harrysharma.brainrot.brainrot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rizzler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link harrysharma.brainrot.brainrot.Rizzler#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link harrysharma.brainrot.brainrot.Rizzler#getToilets <em>Toilets</em>}</li>
 * </ul>
 *
 * @see harrysharma.brainrot.brainrot.BrainrotPackage#getRizzler()
 * @model
 * @generated
 */
public interface Rizzler extends Skibidi
{
  /**
   * Returns the value of the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' reference.
   * @see #setSuperType(Rizzler)
   * @see harrysharma.brainrot.brainrot.BrainrotPackage#getRizzler_SuperType()
   * @model
   * @generated
   */
  Rizzler getSuperType();

  /**
   * Sets the value of the '{@link harrysharma.brainrot.brainrot.Rizzler#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(Rizzler value);

  /**
   * Returns the value of the '<em><b>Toilets</b></em>' containment reference list.
   * The list contents are of type {@link harrysharma.brainrot.brainrot.Toilet}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Toilets</em>' containment reference list.
   * @see harrysharma.brainrot.brainrot.BrainrotPackage#getRizzler_Toilets()
   * @model containment="true"
   * @generated
   */
  EList<Toilet> getToilets();

} // Rizzler
