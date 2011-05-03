package rm;

public class IModOpValue extends BinOpValue {

	public IModOpValue(Value a, Value b) {
		super(a, b);
	}

	@Override
	public ConcreteValue evaluate(Context context) {
		return new IntValue(a.evaluate(context).getIntValue() % b.evaluate(context).getIntValue());
	}

}
