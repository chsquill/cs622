package cs622.field;

import java.util.ArrayList;

public class ArrayComponent extends Component {

	public ArrayComponent(String name) {
		super(name);
	}

	@Override
	public Class getType() {
		return ArrayList.class;
	}

}
