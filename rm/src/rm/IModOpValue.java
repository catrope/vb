package rm;

public class IModOpValue extends BinOpValue {

	public IModOpValue(Value a, Value b) {
		super(a, b);
	}

	@Override
	public ConcreteValue evaluate() {
		return new IntValue(a.evaluate().getIntValue() % b.evaluate().getIntValue());
	}

}
