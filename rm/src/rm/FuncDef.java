package rm;

import java.util.LinkedList;

public abstract class FuncDef {
	public abstract ConcreteValue evaluate(Context context, LinkedList<Value> vars);
}
