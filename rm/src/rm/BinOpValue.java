package rm;

public abstract class BinOpValue extends Value {

	protected Value a, b;
	public BinOpValue(Value a, Value b) {
		this.a = a;
		this.b = b;
	}
}
