package galbo_PA2_p2;

import java.io.IOException;

public class Application {

	public static void main(String[] args) throws IOException {
		DuplicateCounter myDuplicateCounter = new DuplicateCounter();
		myDuplicateCounter.count("problem2.txt");
		myDuplicateCounter.write("unique_word_counts.txt");

	}

}