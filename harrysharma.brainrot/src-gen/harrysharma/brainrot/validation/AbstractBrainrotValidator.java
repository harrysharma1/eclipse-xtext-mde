/*
 * generated by Xtext 2.37.0
 */
package harrysharma.brainrot.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractBrainrotValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(harrysharma.brainrot.brainrot.BrainrotPackage.eINSTANCE);
		return result;
	}
}
