package rm;

public class IntValue extends ConcreteValue {
	private long v;
	
	public IntValue(long v) {
		this.v = v;
	}
	
	public boolean hasIntValue() { return true; }
	public long getIntValue() { return v; }
	public double getDoubleValue() { return v; }
}
