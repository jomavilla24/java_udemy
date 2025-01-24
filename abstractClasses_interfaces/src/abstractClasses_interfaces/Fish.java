package abstractClasses_interfaces;
// There's 2 important things you need to notice:
// 1. Fish is a subclass of Animal. Animal is a abstract class. Because of this, Fish MUST 
// provide implementation details of ALL the methods defined under the super class Animal
//
// 2. Fish implements Swimming only (Fish is a swimming Animal). Because of 
// this Fish MUST provide implementation details of ALL the methods defined under the Interface 
// Swimming
//

public class Fish extends Animal implements Swimming {

	@Override
	public void startSwimming() {
		System.out.println("Im a Fish. Start swimming");	
	}

	@Override
	public void stopSwimming() {
		System.out.println("Im a Fish. Stop swimming");
	}

	@Override
	public void born() {
		System.out.println("Im a Fish. I'm alive now");
	}

	@Override
	public void reproduce() {
		System.out.println("Im a Fish. I'm reproducing now");	
	}

	@Override
	public void die() {
		System.out.println("Im a Fish. I'm dead now");
	}

}
