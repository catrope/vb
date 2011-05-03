package rm;

import java.util.Iterator;
import java.util.LinkedList;

public class FuncDef {
	LinkedList<String> varlist;
	Value val;
	
	public FuncDef(LinkedList<String> varlist, Value val) {
		this.varlist = varlist;
		this.val = val;
	}
	
	public ConcreteValue evaluate(Context context, LinkedList<Value> vars) {
		if (vars != null) {
			Context newContext = null;
			try {
				newContext = (Context) context.clone();
			} catch (CloneNotSupportedException e) {
				e.printStackTrace(); System.exit(-1);
			}
			
			if (varlist.size() != vars.size()) {
				System.err.println("Invalid function call!"); System.exit(-1);
			}
			
			Iterator<String> varNames = varlist.iterator();
			Iterator<Value> varValues = vars.iterator();
			for(int i=0; i<varlist.size(); i++) {
				newContext.putFuncDef(varNames.next(), new FuncDef(null, varValues.next()));
			}
			
			return val.evaluate(newContext);
		} else {
			return val.evaluate(context);
		}
	}
}
