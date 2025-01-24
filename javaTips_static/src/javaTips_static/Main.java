/* ======================= Static variables and methods ====================
 * Static variables are variables or class' fields that are created with the
 * "static". Static class variable are variables that are shared between all 
 * instances (objects) of that class. Regular instance variables are 
 * initialized every time a new object of that class is created, in that 
 * sense static class variables are different because the value of that variable
 * is shared among all instances (object) of that class
 * 
 *  In the next example we have the Player class. In this class we created a 
 *  static class variable that keeps track of how many instances of that class
 *  (objects) have been created so far
 *  
 *  Static methods are methods that are created with the "static" keyword.
 *  This methods are also shared among all instances of that class. They can be
 *  invoked like this
 *  <Class-name>.<static-method-name>
 *  <object-name>.<static-method-name>
 *  
 *  How ever the second form of invocation is not recommended. 
 * */

package javaTips_static;

public class Main {

	public static void main(String[] args) {
		// Creating 2 objects of class Player
		Player p1 = new Player("Martin", 1);
		Player p2 = new Player("Jose", 2);
		
		// Now you can display the number of players created so far by using
		// a static method
		System.out.println(Player.getPlayerCount());
		
		// It is also possible to access a static method through a object, but
		// this is not recommended
		System.out.println(p1.getPlayerCount());
		System.out.println(Circle.PI);

	}

}
