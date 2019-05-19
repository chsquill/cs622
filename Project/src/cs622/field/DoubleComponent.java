package cs622.field;

public class DoubleComponent extends Component {

	public DoubleComponent(String name) {
		super(name);
	}

	@Override
	public Class getType() {
		return Double.class;
	}

}
