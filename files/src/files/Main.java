/* ===================== Listing files and directories ==========================
 * */
package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
	public static void main(String[] args) throws IOException {
		// The Paths.get() method returns an object of class Path that contains the current
		// path. Notice that the current path, denoted by a dot starts at the directory that
		// contains this project, not the directory that contains the source code
		Path currentPath = Paths.get(".");
		
		// The Files.lis() returns a stream back, We can iterate through to it with a forEach()
		// method. This listing is no recursive. The stream that Files.list() returns contains
		// the list of directories and files contained inside a given path
		System.out.println("==== Non recursive directory listing ======");
		Files
			.list(currentPath)
			.forEach(System.out::println);
		
		// The Files.walk() returns a stream back. The stream contains the list of directories
		// and files contained inside a given path. This operation is recursive meaning that will
		// show the contents of the directories inside the given directory until certain deep
		System.out.println("======== Recursive directory listing ======");
		Files
			.walk(currentPath, 3)
			.forEach(System.out::println);
		
		// The Files.find() will find files or directory inside a given path. You must pass the
		// path, the desired deep and a matcher function. In the following example we are printing
		// all files inside the current path, that ends with the .java extension, the deep of the
		// search is 4. The matcher function takes 2 arguments, the path and attributes. 
		System.out.println("======== Finding Files and directories ======");
		Files
			.find(currentPath, 4, (path, attributes) -> String.valueOf(path).endsWith(".java"))
			.forEach(System.out::println);
		
		System.out.println("======== Finding Only directories ======");
		Files
			.find(currentPath, 4, (path, attributes) -> attributes.isDirectory())
			.forEach(System.out::println);
	}
}
