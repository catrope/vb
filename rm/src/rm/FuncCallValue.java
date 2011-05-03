package rm;

import java.util.LinkedList;

public class FuncCallValue extends Value {
	String name;
	LinkedList<Value> vars;
	
	public FuncCallValue(String name, LinkedList<Value> vars) {
		this.name = name;
		this.vars = vars;
	}
	
	@Override
	public ConcreteValue evaluate(Context context) {
		return context.getFuncDef(name).evaluate(context, vars);
	}
}
