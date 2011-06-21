package rm;

public class DoubleValue extends ConcreteValue {
	private double v;
	
	public DoubleValue(double v) {
		this.v = v;
	}
	
	public boolean hasIntValue() { return false; }
	public long getIntValue() { return Math.round(v); }
	public double getDoubleValue() { return v; }

	@Override
	public String toString() {
		return Double.toString(getDoubleValue());
	}
	
}
