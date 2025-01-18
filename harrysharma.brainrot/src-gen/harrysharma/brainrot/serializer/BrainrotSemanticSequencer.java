/*
 * generated by Xtext 2.37.0
 */
package harrysharma.brainrot.serializer;

import com.google.inject.Inject;
import harrysharma.brainrot.brainrot.BrainrotPackage;
import harrysharma.brainrot.brainrot.Greeting;
import harrysharma.brainrot.brainrot.Model;
import harrysharma.brainrot.services.BrainrotGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class BrainrotSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private BrainrotGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == BrainrotPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case BrainrotPackage.GREETING:
				sequence_Greeting(context, (Greeting) semanticObject); 
				return; 
			case BrainrotPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Greeting returns Greeting
	 *
	 * Constraint:
	 *     (greeting=TypeOfGreeting name=ID)
	 * </pre>
	 */
	protected void sequence_Greeting(ISerializationContext context, Greeting semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BrainrotPackage.Literals.GREETING__GREETING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrainrotPackage.Literals.GREETING__GREETING));
			if (transientValues.isValueTransient(semanticObject, BrainrotPackage.Literals.GREETING__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrainrotPackage.Literals.GREETING__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGreetingAccess().getGreetingTypeOfGreetingEnumRuleCall_0_0(), semanticObject.getGreeting());
		feeder.accept(grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     greetings+=Greeting+
	 * </pre>
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
