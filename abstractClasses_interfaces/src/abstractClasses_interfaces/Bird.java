package abstractClasses_interfaces;
// There's 2 important things you need to notice:
//1. Bird is a subclass of Animal. Animal is a abstract class. Because of this Bird MUST 
// provide implementation details of ALL the methods defined under the super class Animal
//
//
//2. Bird implements Walking and Flying (Bird is a Walking and Flying Animal). Because of 
// this Bird MUST provide implementation details of ALL the methods defined under the Interface 
// Walking and Interface Flying
//
public class Bird extends Animal implements Walking, Flying {

	@Override
	public void startFlying() {
		System.out.println("Im a Bird. Start flying");
	}

	@Override
	public void stopFlying() {
		System.out.println("Im a Bird. Stop flying");
	}

	@Override
	public void startWalking() {
		System.out.println("Im a Bird. Start walking");
	}

	@Override
	public void stopWalking() {
		System.out.println("Im a Bird. Stop walking");
	}

	@Override
	public void born() {
		System.out.println("Im a Bird. I'm alive now");
	}

	@Override
	public void reproduce() {
		System.out.println("Im a Bird. I'm reproducing now");	
	}

	@Override
	public void die() {
		System.out.println("Im a Bird. I'm dead now");
	}

}
