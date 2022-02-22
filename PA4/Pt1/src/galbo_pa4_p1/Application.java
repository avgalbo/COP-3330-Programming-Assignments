package galbo_pa4_p1;

import java.io.IOException;

public class Application {

	public static void main(String[] args) throws IOException {
		DuplicateRemover myDuplicateRemover = new DuplicateRemover();
		myDuplicateRemover.remove("problem1.txt");
		myDuplicateRemover.write("uniquewords.txt");
	}

}
