package rm;

public abstract class ConcreteValue extends Value {

	public abstract boolean hasIntValue();
	public abstract long getIntValue();
	public abstract double getDoubleValue();
	
	@Override
	public ConcreteValue evaluate(Context context) {
		// No-op
		return this;
	}
	
	public abstract String toString();
	
}
