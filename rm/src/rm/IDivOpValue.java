package rm;

public class IDivOpValue extends BinOpValue {

	public IDivOpValue(Value a, Value b) {
		super(a, b);
	}

	@Override
	public ConcreteValue evaluate(Context context) {
		return new IntValue(a.evaluate(context).getIntValue() / b.evaluate(context).getIntValue());
	}

}
