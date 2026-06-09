package q.abstractclass;
// No obj is Created for abstract class 

// Number is abstract class 
// Integer extends Number
// No use of object in Number class, so Declared as abstract

//instance variable
//Can store state
//Can manage lifecycle
//Can define constructors

abstract class Human{
    
    // if a method is abstract then class should be abstract!
    /**
     * Abstract method to be implemented by concrete subclasses.
     * Each human type will have its own sound implementation.
     */
    public abstract void sound();
    
    // abstract class can define a method 
    /**
     * Concrete method that can be used by all subclasses.
     * Demonstrates that abstract classes can have both abstract and concrete methods.
     */
    public void eat(){
        System.out.println("Eating");
    }
}

class Man extends Human{ //concrete
    
    // Declared abstract should be defined in concrete
    /**
     * Implementation of the abstract sound method.
     * Concrete classes must implement all abstract methods from parent.
     */
    public void sound(){
        System.out.println("Sound");
    }
}

public class AbstractClass {
	/**
	 * Main method demonstrating abstract classes.
	 * Shows how abstract classes define contracts that concrete classes must implement.
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
	        
	   Human obj = new Man();
	   obj.sound();
	   obj.eat();
	   
	   //Anonymous
	   	 Human obj2 = new Human(){
	   	 public void sound(){
	   	     System.out.println("sound!!");
	   	 }
	   };
	   obj2.sound();

    }
}
