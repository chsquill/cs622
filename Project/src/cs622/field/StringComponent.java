package cs622.field;

public class StringComponent extends Component {

	public StringComponent(String name) {
		super(name);
	}

	@Override
	public Class getType() {
		return String.class;
	}

}
