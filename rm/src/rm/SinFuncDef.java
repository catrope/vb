package rm;

import java.util.LinkedList;

public class SinFuncDef extends FuncDef {

	@Override
	public ConcreteValue evaluate(Context context, LinkedList<Value> vars) {
		if (vars.size() != 1) { System.err.println("Invalid function call!"); System.exit(-1); }
		
		return new DoubleValue(Math.sin(vars.getFirst().evaluate(context).getDoubleValue()));
	}

}
