package rm;

import rm.analysis.DepthFirstAdapter;
import rm.node.*;

public class Interpreter extends DepthFirstAdapter {
	public void outAIntFactor(AIntFactor node) {
		setOut(node, new IntValue(Long.valueOf(node.getIntdenotation().getText())));
	}
	
	public void outARealFactor(ARealFactor node) {
		setOut(node, new DoubleValue(Double.valueOf(node.getRealdenotation().getText())));
	}
	
	public void outAAddSmplexpr(AAddSmplexpr node) {
		Value a = (Value)getOut(node.getSmplexpr());
		Value b = (Value)getOut(node.getTerm());
		Value v;
		if (node.getAddop() instanceof APlusAddop) {
			v = new PlusOpValue(a, b);
		} else if (node.getAddop() instanceof AMinusAddop) {
			v = new MinusOpValue(a, b);
		} else {
			v = null; // To shut Java up
			System.err.println("Invalid addop: " + node.getAddop().toString());
			System.exit(1);
		}
		setOut(node, v);
	}
}
