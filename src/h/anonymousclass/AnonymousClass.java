package h.anonymousclass;
// Anonymous Class with out Name
//Reduce class explosion
//Localize behavior close to usage
//Enable inline polymorphism
//Custom behavior
//No need to pollute code-base with tiny classes
//Logic is small / used once
//You need polymorphism
//You want behavior close to usage
//You need to override multiple methods
//OuterClass$1.class, Has its own bytecode, Has synthetic name

//Anonymous classes exist to enable localized, one-time polymorphic behavior
//You can override a class without creating a new class
class A{
    /**
     * Displays a simple message.
     * This method will be overridden in subclasses and anonymous classes.
     */
    public void show(){
        System.out.println("In Show");
    }
}

class B extends A{
    /**
     * Overrides the show method from class A.
     * Demonstrates standard method overriding without anonymous classes.
     */
    public void show(){
        System.out.println("WithOut AnonymousClass");
    }
}


public class AnonymousClass
{
	/**
	 * Main method demonstrating anonymous classes.
	 * Shows how to override methods without creating named subclasses.
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		

        // WithOut AnonymousClass - OverRidding Method Show
        A obj = new B();
        obj.show();
        
        // With AnonymousClass - OverRidding Method Show
        A obj2 = new A(){
            public void show(){
                System.out.println("With AnonymousClass");
            }
        };
        obj2.show();
        
        
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running");
            }
        }).start();

        
        
	}
}

