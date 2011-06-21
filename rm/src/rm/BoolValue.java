package rm;

public class BoolValue extends ConcreteValue {
	private boolean v;
	
	public BoolValue(boolean v) {
		this.v = v;
	}
	
	@Override
	public double getDoubleValue() {
		return v ? 1.0 : 0.0;
	}

	@Override
	public long getIntValue() {
		return v ? 1 : 0;
	}

	@Override
	public boolean hasIntValue() {
		return true;
	}

	@Override
	public String toString() {
		return v ? "true" : "false";
	}

}
