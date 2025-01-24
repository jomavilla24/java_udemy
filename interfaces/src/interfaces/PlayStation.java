package interfaces;

public class PlayStation implements GameConsole{

	// It is up to the classes that implement the interface to define
	// the method details
	public void up() {
		System.out.println("Go up");	
	}

	public void down() {
		System.out.println("Go down");
	}

	public void left() {
		System.out.println("Go left");
	}

	public void ritgh() {
		System.out.println("Go rigth");
	}

}
