package cs622.document;

import java.util.ArrayList;

import org.json.JSONObject;

import cs622.Generatable;
import cs622.field.ArrayComponent;
import cs622.field.Component;
import cs622.field.DoubleComponent;
import cs622.field.IntegerComponent;
import cs622.field.LongComponent;
import cs622.field.StringComponent;

public class JsonDocument extends Document implements Generatable {

	@Override
	public void parse(String json) {

		ArrayList<Component> comps = new ArrayList<>();

		System.out.println(json);

		try {

			JSONObject o = new JSONObject(json);

			String[] names = JSONObject.getNames(o);

			for (String string : names) {

				Object ob = o.get(string);

				System.out.println(ob.getClass());

				switch (ob.getClass().getTypeName()) {

				case "java.lang.String":
					comps.add(new StringComponent(string));
					break;
				case "java.lang.Double":
					comps.add(new DoubleComponent(string));
					break;
				case "java.lang.Integer":
					comps.add(new IntegerComponent(string));
					break;
				case "java.lang.Long":
					comps.add(new LongComponent(string));
					break;
				case "org.json.JSONArray":
					comps.add(new ArrayComponent(string));
					break;
				default:
					break;
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		setComponents(comps.toArray(new Component[comps.size()]));

	}

	@Override
	public void generate(Component[] components) {
		// TODO Auto-generated method stub

	}

}
