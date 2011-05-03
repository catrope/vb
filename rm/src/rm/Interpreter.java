package rm;

import rm.analysis.DepthFirstAdapter;
import rm.node.AAddSmplexpr;
import rm.node.AIntFactor;

public class Interpreter extends DepthFirstAdapter {
	public void outAIntFactor(AIntFactor node) {
		setOut(node, Integer.valueOf(node.getIntdenotation().getText()));
	}
	
	public void outAAddSmplexpr(AAddSmplexpr node) {
		Object left = getOut(node.getSmplexpr()), right = getOut(node.getTerm());
		//setOut(node, );
	}
}
