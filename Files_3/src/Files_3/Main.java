// ============================ Writing to a File ==============================
package Files_3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		// This is the path of the file we want to write
		Path filePath = Paths.get("./resources/data.txt");
		
		// This will be the content we want to write to the file
		List<String> lines = List.of("New Line 1", "New Line 2", "New Line 3", "New Line 4");
		
		// We can write the the lines to the file
		Files.write(filePath, lines);

	}

}
