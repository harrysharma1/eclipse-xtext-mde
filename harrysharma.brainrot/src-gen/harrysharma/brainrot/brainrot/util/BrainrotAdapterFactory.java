/**
 * generated by Xtext 2.37.0
 */
package harrysharma.brainrot.brainrot.util;

import harrysharma.brainrot.brainrot.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see harrysharma.brainrot.brainrot.BrainrotPackage
 * @generated
 */
public class BrainrotAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static BrainrotPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BrainrotAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = BrainrotPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BrainrotSwitch<Adapter> modelSwitch =
    new BrainrotSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseSkibidi(Skibidi object)
      {
        return createSkibidiAdapter();
      }
      @Override
      public Adapter caseSigma(Sigma object)
      {
        return createSigmaAdapter();
      }
      @Override
      public Adapter caseRizzler(Rizzler object)
      {
        return createRizzlerAdapter();
      }
      @Override
      public Adapter caseToilet(Toilet object)
      {
        return createToiletAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link harrysharma.brainrot.brainrot.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see harrysharma.brainrot.brainrot.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link harrysharma.brainrot.brainrot.Skibidi <em>Skibidi</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see harrysharma.brainrot.brainrot.Skibidi
   * @generated
   */
  public Adapter createSkibidiAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link harrysharma.brainrot.brainrot.Sigma <em>Sigma</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see harrysharma.brainrot.brainrot.Sigma
   * @generated
   */
  public Adapter createSigmaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link harrysharma.brainrot.brainrot.Rizzler <em>Rizzler</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see harrysharma.brainrot.brainrot.Rizzler
   * @generated
   */
  public Adapter createRizzlerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link harrysharma.brainrot.brainrot.Toilet <em>Toilet</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see harrysharma.brainrot.brainrot.Toilet
   * @generated
   */
  public Adapter createToiletAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //BrainrotAdapterFactory
