package cs622;

import cs622.document.Document;
import cs622.document.JsonDocument;
import cs622.generator.GopherJGenererator;

public class Main {

	public static void main(String[] args) {

		GopherJGenererator gen = new GopherJGenererator();

		Document doc = new JsonDocument();

		// TODO
		String json = "{\"firstName\" : \"Charles\"," + "\"lastName\" : \"Squillante\"," + "\"age\" : 50,"
				+ "\"hobbies\" : [\"School\", \"Hiking\", \"Astronomy\"], \"Pets\" : { \"name\" : \"Magnum\"}}";

		doc.parse(json);

		gen.generate(doc.getComponents());
	}

}
