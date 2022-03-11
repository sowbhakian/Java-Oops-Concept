// No obj is Created for abstract class 

// Number is abstract class 
// Integer extends Number
// No use of obj in Number class, so Declared as abstract


abstract class Human{
    
    // if a method is abs then cls should be abs!
    public abstract void sound();
    
    // abstract class can define a method 
    public void eat(){
        System.out.println("Eating");
    }
}

class Man extends Human{ //concrete
    
    // Declared Abs should be defined in concrete
    public void sound(){
        System.out.println("Sound");
    }
}

public class abstractClass {
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
