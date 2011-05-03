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
	
	public void outATermSmplexpr(ATermSmplexpr node) {
		setOut(node, getOut(node.getTerm()));
	}
	
	public void outAExprFactor(AExprFactor node) {
		setOut(node, getOut(node.getExpr()));
	}
	
	public void outAFactorTerm(AFactorTerm node) {
		setOut(node, getOut(node.getFactor()));
	}
	
	public void outAMulTerm(AMulTerm node) {
		Value a = (Value)getOut(node.getTerm());
		Value b = (Value)getOut(node.getFactor());
		Value v;
		if (node.getMulop() instanceof ATimesMulop) {
			v = new TimesOpValue(a, b);
		} else if (node.getMulop() instanceof AIdivMulop) {
			v = new IDivOpValue(a, b);
		} else if (node.getMulop() instanceof AImodMulop) {
			v = new IModOpValue(a, b);
		} else if (node.getMulop() instanceof ARdivMulop) {
			v = new RDivOpValue(a, b);
		} else {
			v = null; // To shut Java up
			System.err.println("Invalid mulop: " + node.getMulop().toString());
			System.exit(1);
		}
		setOut(node, v);
	}
	
	public void outARelRelexpr(ARelRelexpr node) {
		Value a = (Value)getOut(node.getLeft());
		Value b = (Value)getOut(node.getRight());
		Value v;
		if (node.getRelop() instanceof AEqualRelop) {
			v = new EqualOpValue(a, b);
		} else if (node.getRelop() instanceof ANoteqRelop) {
			v = new NotEqualOpValue(a, b);
		} else if (node.getRelop() instanceof ALessRelop) {
			v = new LessOpValue(a, b);
		} else if (node.getRelop() instanceof ALseqRelop) {
			v = new LessEqualOpValue(a, b);
		} else if (node.getRelop() instanceof AGreqRelop) {
			v = new GreaterEqualOpValue(a, b);
		} else if (node.getRelop() instanceof AGrtrRelop) {
			v = new GreaterOpValue(a, b);
		} else {
			v = null; // To shut Java up
			System.err.println("Invalid relop: " + node.getRelop().toString());	
		}
		setOut(node, v);
	}
}
