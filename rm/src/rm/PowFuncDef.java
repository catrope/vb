package rm;

import java.util.LinkedList;

public class PowFuncDef extends FuncDef {

	@Override
	public ConcreteValue evaluate(Context context, LinkedList<Value> vars) {
		if (vars.size() != 2) { System.err.println("Invalid function call!"); System.exit(-1); }
		
		return new DoubleValue(Math.pow(vars.getFirst().evaluate(context).getDoubleValue(),
				vars.getLast().evaluate(context).getDoubleValue()));
	}

}
