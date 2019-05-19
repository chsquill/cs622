package cs622;

import org.junit.jupiter.api.Test;

import cs622.document.Document;
import cs622.document.JsonDocument;
import cs622.generator.GopherJGenerator;

class GopherJGeneratorTest {

	@Test
	void test() {

		GopherJGenerator gen = new GopherJGenerator();

		Document doc = new JsonDocument();

		// TODO hard coded
		String json = "{\"firstName\" : \"Charles\"," + "\"lastName\" : \"Squillante\"," + "\"age\" : 50,"
				+ "\"hobbies\" : [\"School\", \"Hiking\", \"Astronomy\"]}";

		doc.parse(json);

		gen.generate(doc.getComponents());
	}

}
