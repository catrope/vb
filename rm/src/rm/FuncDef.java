package rm;

import java.util.Iterator;
import java.util.LinkedList;

public class FuncDef {
	LinkedList<String> varlist;
	Value val;
	Context evalContext;
	ConcreteValue mem;
	
	public FuncDef(LinkedList<String> varlist, Value val, Context evalContext) {
		this.varlist = varlist;
		this.val = val;
		this.evalContext = evalContext;
		this.mem = null;
	}
	
	public FuncDef(LinkedList<String> varlist, Value val) {
		this(varlist, val, null);
	}
	
	public Context getContext(Context defaultContext) {
		return evalContext != null ? evalContext : defaultContext;
	}
	
	public ConcreteValue evaluate(Context context, LinkedList<Value> vars) {		
		Context myContext = getContext(context);
		if (vars.size() > 0) {
			Context newContext = null;
			try {
				newContext = (Context) myContext.clone();
			} catch (CloneNotSupportedException e) {
				e.printStackTrace(); System.exit(-1);
			}
			
			if (varlist.size() != vars.size()) {
				System.err.println("Invalid function call!"); System.exit(-1);
			}
			
			Iterator<String> varNames = varlist.iterator();
			Iterator<Value> varValues = vars.iterator();
			for(int i=0; i<varlist.size(); i++) {
				newContext.putFuncDef(varNames.next(), new FuncDef(new LinkedList<String>(), varValues.next(), myContext));
			}
			
			return val.evaluate(newContext);
		} else {
			if (mem == null) mem = val.evaluate(myContext);
			return mem;
		}
	}
}
