/* ======================== Import Packages in JAVA ======================
 * It is not a good practice to import all classes of a package using the
 * "*" operator, for example the statement import java.lang.*; wont be
 * considered a good practice, instead we need to be specific about the 
 * classes we want to import from package
 * */
package javaTips_imports;

// import java.lang.*; // Imported by default, you do not need to explicitly import this package
// import java.lang.Integer; // Not needed, included in the java.lang.* 
// import java.lang.String; // Not needed, included in the java.lang.* 

// Static imports. By importing all the packages included in java.lang.System.*
// we don't need to write down System.out every time we need the println() 
// method, we only need to write out.println() to invoke the same method
import static java.lang.System.*;

/* Similarly, if we import the Collections.* package, we wont need to use
 * The Collection.sort() method if we need to sort a collection, instead we
 * can use only sort()
 * */
import static java.util.Collections.*;

import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		/* By default all project have the java.lang package imported. This is
		 * why you don't need the packages that contain the String class or 
		 * Integer class. These are included in the packages imported with the
		 * statement import java.lang.*;
		 * */
		String str = "Hello world";
		Integer number = 10;
		List<String> animals = new ArrayList<>( List.of("zebra", "cat", "dog") );
		
		// Since we statically imported the System.* packages, now we can invoke
		// the System.out.println() method like this
		out.println(str);
		
		// Similarly, we have imported the Collections.* package, now if
		// we want to call the Collections.sort() method we can do it
		// like this
		sort(animals);
		
		out.println(animals);

	}

}
