package galbo_pa4_p1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class DuplicateRemover {

	private Set<String> uniqueWords;

	public void remove(String dataFile) throws FileNotFoundException {
		String word;
		uniqueWords = new HashSet<String>();
		Scanner s = new Scanner(new File(dataFile));

		while (s.hasNext()) {
			word = s.next();
			uniqueWords.add(word);
		}
		s.close();

	}

	public void write(String outputFile) throws IOException {
		File myFile;
		FileWriter myFileWriter = null;

		myFile = new File(outputFile);

		if (myFile.exists()) {
			myFileWriter = new FileWriter(myFile, true);
			Iterator myIterator = uniqueWords.iterator();

			while (myIterator.hasNext()) {
				String str = (String) myIterator.next();
				myFileWriter.write(str + "\n");
			}
			myFileWriter.close();
			System.out.println("Data written to outputFile");

		} else {
			myFile.createNewFile();
			myFileWriter = new FileWriter(myFile);
			Iterator myIterator = uniqueWords.iterator();

			while (myIterator.hasNext()) {
				String str = (String) myIterator.next();
				myFileWriter.write(str + "\n");
			}
			myFileWriter.close();
			System.out.println("Data written to outputFile");

		}
	}

}
