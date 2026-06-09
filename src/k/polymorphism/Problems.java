package k.polymorphism;

//Methods are polymorphic. Fields are not.

/*
 * Golden Rule
 * 	Field access depends on the reference type.
 * 	Method calls depend on the actual object type.
 * 
 * This is why Java developers generally avoid declaring a field in a subclass with the 
 * same name as a field in the parent class—it causes field hiding, which is often confusing.
 * 
*/
public class Problems {

	/**
	 * Main method demonstrating field hiding in inheritance.
	 * Shows the difference between field access and method polymorphism.
	 * @param args command line arguments
	 */
	public static void main(String[] args) {

		AAA a = new AAA();
		System.out.println(a.a);
		
		BBB b = new BBB();
		System.out.println(b.a);
		
		AAA aa = new BBB();
		System.out.println(aa.a);
		
		
		
	}

}

class AAA{
	int a=10;
}

class BBB extends AAA{
	int a=20;
}
