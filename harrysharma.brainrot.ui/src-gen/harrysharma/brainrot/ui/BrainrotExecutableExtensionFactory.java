/*
 * generated by Xtext 2.37.0
 */
package harrysharma.brainrot.ui;

import com.google.inject.Injector;
import harrysharma.brainrot.ui.internal.BrainrotActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class BrainrotExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(BrainrotActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		BrainrotActivator activator = BrainrotActivator.getInstance();
		return activator != null ? activator.getInjector(BrainrotActivator.HARRYSHARMA_BRAINROT_BRAINROT) : null;
	}

}
