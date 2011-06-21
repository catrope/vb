package rm;

public abstract class BinCmpValue extends BinOpValue {

	public BinCmpValue(Value a, Value b) {
		super(a, b);
	}

	@Override
	public abstract BoolValue evaluate(Context context);
}
