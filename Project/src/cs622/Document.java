package cs622;

import java.io.File;
import java.net.URL;

public abstract class Document {

	abstract void parse(String input);

	public void readInput(String input) {
		parse(input);
	}

	public void readInput(File input) {
		// TODO read input from file
	}

	public void readInput(URL input) {
		// TODO read input from URL
	}

}
