package r.interfaceClass;
//Default Method in Interface
//Default + FunctionInterface too accepted

interface MethodDefault{
    /**
     * Abstract method to be implemented by classes.
     */
    public void abc();
    
    //can be Override
    //Any No. Default Methods
    /**
     * Default method that provides a default implementation.
     * Can be overridden by implementing classes.
     */
    default void defaultMethods(){
        System.out.println("In Default Method!");
    }
    
}   

class DefaultImp implements MethodDefault{
    /**
     * Implementation of the abstract abc method.
     */
    public void abc(){
        System.out.println("In MethodDefault abc");
    }
    /**
     * Overrides the default method from the interface.
     * Demonstrates that default methods can be overridden.
     */
    public void defaultMethods(){
        System.out.println("In DefaultImp Override Method ");
    }
}

public class DefaultMethodInterface {
    /**
     * Main method demonstrating default methods in interfaces.
     * Shows how interfaces can provide default implementations since Java 8.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        
	   MethodDefault obj3 = new DefaultImp();
	   obj3.abc();
	   obj3.defaultMethods();
	   

		
    }
}
