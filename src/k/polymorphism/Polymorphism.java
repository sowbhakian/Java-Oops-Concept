package k.polymorphism;
// Polymorphism - The ability to change its property
// Dynamic Method Dispatch  follows Run Time polymorphism (method Overriding)

class A{
    /**
     * Displays a message from class A.
     * This method will be overridden in subclasses to demonstrate polymorphism.
     */
    public void show(){
        System.out.println("In show A");
    }
}

class B extends A{
    /**
     * Overrides the show method from class A.
     * Demonstrates runtime polymorphism.
     */
    public void show(){
        System.out.println("In Obj of B");
    }
    
    /**
     * A method specific to class B.
     * Cannot be called through a reference of type A.
     */
    public void errorTesting(){
        System.out.println("In Obj of B");
    }
    
}

class C extends A{
    /**
     * Overrides the show method from class A.
     * Demonstrates runtime polymorphism with a different implementation.
     */
    public void show(){
        System.out.println("In Obj of C");
    }
}

public class Polymorphism
{
	/**
	 * Main method demonstrating polymorphism and dynamic method dispatch.
	 * Shows how a parent class reference can point to different child class objects at runtime.
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
	    
	    A obj = new B(); // Linking done @ RUNTime so Run Time polymorphism
	    obj.show();
	    
//	     obj.errorTesting();
	    // IF we are using the Reference of the Class then 
	    // that class must have all method of its obj cls
	   
	   obj = new C(); //Dynamic Method Dispatch
	    obj.show();
	   
	}
}




