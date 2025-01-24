package abstractClasses_interfaces;
// There's 2 important things you need to notice:
// 1. Dog is a subclass of Animal. Animal is a abstract class. Because of this Dog MUST 
// provide implementation details of ALL the methods defined under the super class Animal
//
//
// 2. Dog implement Walking (Dog is a Walking Animal). Because of this Dog MUST provide
// implementation details of ALL the methods defined under the Interface Walking
//
public class Dog extends Animal implements Walking {

	@Override
	public void startWalking() {
		System.out.println("Im a dog. Start walking");
	}

	@Override
	public void stopWalking() {
		System.out.println("Im a dog. Stop walking");
	}

	@Override
	public void born() {
		System.out.println("Im a dog. I'm alive now");
	}

	@Override
	public void reproduce() {
		System.out.println("Im a dog. I'm reproducing now");	
	}

	@Override
	public void die() {
		System.out.println("Im a dog. I'm dead now");
	}

}
