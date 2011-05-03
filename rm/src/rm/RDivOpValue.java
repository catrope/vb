package rm;

public class RDivOpValue extends BinOpValue {

	public RDivOpValue(Value a, Value b) {
		super(a, b);
	}

	@Override
	public ConcreteValue evaluate() {
		return new DoubleValue(a.evaluate().getDoubleValue() / b.evaluate().getDoubleValue());
	}

}
