/*
 * generated by Xtext 2.37.0
 */
package harrysharma.brainrot.parser.antlr;

import com.google.inject.Inject;
import harrysharma.brainrot.parser.antlr.internal.InternalBrainrotParser;
import harrysharma.brainrot.services.BrainrotGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class BrainrotParser extends AbstractAntlrParser {

	@Inject
	private BrainrotGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalBrainrotParser createParser(XtextTokenStream stream) {
		return new InternalBrainrotParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public BrainrotGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(BrainrotGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
