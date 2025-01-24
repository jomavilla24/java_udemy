/* ====================== Reading Content from a File =================== 
 * */
package Files_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		System.out.println("========== Reading All lines at once =========");
		// The Files.readAllLines(pathToFile) reads all the content of the file and returns
		// a list that contains the the lines. Each element of that list is a line. Notice
		// that even thought we have written this code in windows we can pass the path as 
		// we were in Linux with slashes instead of back slashes 
		Path filePath = Paths.get("./resources/data.txt");
		
		List<String> lines = Files.readAllLines(filePath);
		
		lines.forEach(System.out::println);
		
		System.out.println("========== Reading One line at a time =========");
		// The problem with Files.readAllLines(pathToFile) is that it reads the whole content
		// of the file at once and put it in memory. This is fine for short files, but with
		// larger files this could be a problem. The Files.lines() returns a stream back, this
		// method will read a line of the file every time we need it and does not put the whole
		// content of the file in memory
		Files.lines(filePath)
			.map(line -> line.toUpperCase())
			.forEach(System.out::println);

	}

}
