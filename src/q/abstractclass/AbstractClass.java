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
    public abstract void sound();
    
    // abstract class can define a method 
    public void eat(){
        System.out.println("Eating");
    }
}

class Man extends Human{ //concrete
    
    // Declared abstract should be defined in concrete
    public void sound(){
        System.out.println("Sound");
    }
}

public class AbstractClass {
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
