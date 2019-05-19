package cs622.field;

public class IntegerComponent extends Component {

	public IntegerComponent(String name) {
		super(name);
	}

	@Override
	public Class getType() {
		return Integer.class;
	}

}
