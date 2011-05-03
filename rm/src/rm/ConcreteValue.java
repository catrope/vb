package rm;

public abstract class ConcreteValue extends Value {

	public abstract boolean hasIntValue();
	public abstract long getIntValue();
	public abstract double getDoubleValue();
	
	@Override
	public ConcreteValue evaluate() {
		// No-op
		return this;
	}
	
	public String toString() {
		if (hasIntValue())
			return Long.toString(getIntValue());
		else
			return Double.toString(getDoubleValue());
	}

}
