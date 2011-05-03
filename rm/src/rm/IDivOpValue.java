package rm;

public class IDivOpValue extends BinOpValue {

	public IDivOpValue(Value a, Value b) {
		super(a, b);
	}

	@Override
	public ConcreteValue evaluate() {
		return new IntValue(a.evaluate().getIntValue() / b.evaluate().getIntValue());
	}

}
