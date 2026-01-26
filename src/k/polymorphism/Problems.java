package k.polymorphism;

//Methods are polymorphic. Fields are not.

public class Problems {

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
