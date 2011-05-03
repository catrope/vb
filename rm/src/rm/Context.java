package rm;

import java.util.HashMap;
public class Context implements Cloneable {
	private HashMap<String, FuncDef> map = new HashMap<String, FuncDef>();
	
	@SuppressWarnings("unchecked")
	public Object clone() throws CloneNotSupportedException {
		Context newContext = (Context) super.clone();
		newContext.map = (HashMap<String, FuncDef>) map.clone();
		return newContext;
	}
	
	public FuncDef getFuncDef(String name) {
		return map.get(name);
	}
	
	public void putFuncDef(String name, FuncDef def) {
		map.put(name, def);
	}
}
