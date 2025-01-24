/* ===================== Methods and Variable Access Modifiers =====================
 * SUMARY
 * Inside the same package you can access all access modifiers except private
 * Outside the package only access the public access modifiers
 * 
 * 1. Public: you can access the method or variable everywhere
 * 2. protected: you can access the method or variable in the same package or 
 *    in the different package only inside a subclass
 * 3. default: You can access the method or variable only if in the same package
 * 4. private: you can access the method or variable only inside that specific class
 * 
 * Another way to look this is:
 * - Inside the same class you can access every access modifier
 * - Inside the same package you can access every access modifier except private
 * - Outside the package you can access only public access modifier or protected
 *   (inside a subclass)
 *
 * */
package package1;

public class Main1 {
	// OUTSIDE THE CLASS INSIDE THE SAME PACKAGE
	// Notice that all types of methods except protected methods can be used
	// outside of the class in the same package
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.publicMethod_Person();
		// p1.privateMethod_Person(); // this will cause a compilation error
		p1.protectedMethod_Person();
		p1.defaultMethod_Person();

	}

}
