package rm;

import java.util.LinkedList;

import rm.analysis.DepthFirstAdapter;
import rm.node.*;

public class Interpreter extends DepthFirstAdapter {
	Context globalContext = new Context();
	FuncDef globalSin = new SinFuncDef(), globalCos = new CosFuncDef(), globalTan = new TanFuncDef();
	FuncDef globalExp = new ExpFuncDef(), globalLog = new LogFuncDef(), globalPow = new PowFuncDef();
	
	public Interpreter() {
		globalContext.putFuncDef("sin", globalSin);
		globalContext.putFuncDef("cos", globalCos);
		globalContext.putFuncDef("tan", globalTan);
		globalContext.putFuncDef("exp", globalExp);
		globalContext.putFuncDef("log", globalLog);
		globalContext.putFuncDef("pow", globalPow);
	}
	
	public void outALetDef(ALetDef node) {
		LinkedList<String> names = new LinkedList<String>();
		PParlst parlst = node.getParlst();
		if (parlst instanceof ANonemptyParlst) {
			PPars pars = ((ANonemptyParlst)parlst).getPars();
			while (pars instanceof AMultiPars) {
				names.addFirst(((AMultiPars)pars).getIdent().getText());
				pars = ((AMultiPars)pars).getPars();
			}
			names.addFirst(((ASinglePars)pars).getIdent().getText());
		}
		globalContext.putFuncDef(node.getIdent().getText(), new ProgramFuncDef(names, (Value)getOut(node.getExpr())));
	}
	
	public void outAExprComp(AExprComp node) {
		System.out.println(((Value)getOut(node.getExpr())).evaluate(globalContext));
	}
	
	public void outAIfthenExpr(AIfthenExpr node) {
		Value cond = (Value)getOut(node.getRelexpr());
		Value thenVal = (Value)getOut(node.getThen());
		Value elseVal = (Value)getOut(node.getElse());
		setOut(node, new IfThenValue(cond, thenVal, elseVal));
	}
	
	public void outARelExpr(ARelExpr node) {
		setOut(node, getOut(node.getRelexpr()));
	}
	
	public void outASimpleRelexpr(ASimpleRelexpr node) {
		setOut(node, getOut(node.getSmplexpr()));
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
	
	public void outATermSmplexpr(ATermSmplexpr node) {
		setOut(node, getOut(node.getTerm()));
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
	
	public void outAFactorTerm(AFactorTerm node) {
		setOut(node, getOut(node.getAddopfactor()));
	}
	
	public void outAMulTerm(AMulTerm node) {
		Value a = (Value)getOut(node.getTerm());
		Value b = (Value)getOut(node.getAddopfactor());
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
	
	public void outAFactorAddopfactor(AFactorAddopfactor node) {
		setOut(node, getOut(node.getFactor()));
	}
	
	public void outAAddopAddopfactor(AAddopAddopfactor node) {
		if (node.getAddop() instanceof AMinusAddop)
			setOut(node, new MinusOpValue( new IntValue(0), (Value)getOut(node.getFactor())));
		else
			setOut(node, getOut(node.getFactor()));
	}
	
	public void outAExprFactor(AExprFactor node) {
		setOut(node, getOut(node.getExpr()));
	}
	
	public void outAIntFactor(AIntFactor node) {
		setOut(node, new IntValue(Long.valueOf(node.getIntdenotation().getText())));
	}
	
	public void outARealFactor(ARealFactor node) {
		setOut(node, new DoubleValue(Double.valueOf(node.getRealdenotation().getText())));
	}
	
	public void outABoolFactor(ABoolFactor node) {
		setOut(node, new BoolValue(Boolean.valueOf(node.getBooldenotation().getText())));
	}
	
	public void outACharFactor(ACharFactor node) {
		setOut(node, new CharValue(node.getChardenotation().getText().charAt(1)));
	}
	
	public void outACallFactor(ACallFactor node) {
		LinkedList<Value> vals = new LinkedList<Value>();
		PArglst arglst = node.getArglst();
		if (arglst instanceof ANonemptyArglst) {
			PArgs args = ((ANonemptyArglst)arglst).getArgs();
			while (args instanceof AMultiArgs) {
				vals.addFirst((Value)getOut(((AMultiArgs)args).getExpr()));
				args = ((AMultiArgs)args).getArgs();
			}
			vals.addFirst((Value)getOut(((ASingleArgs)args).getExpr()));
		}
		setOut(node, new FuncCallValue(node.getIdent().getText(), vals));
	}
}
