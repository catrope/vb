package rm;

import rm.analysis.DepthFirstAdapter;
import rm.node.AIntFactor;

public class Interpreter extends DepthFirstAdapter {
	public void outAIntFactor(AIntFactor node) {
		setOut(node, Integer.valueOf(node.getIntdenotation().getText()));
	}

}
