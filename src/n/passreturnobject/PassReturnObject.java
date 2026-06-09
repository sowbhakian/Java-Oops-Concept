package n.passreturnobject;
import java.util.*;

 class Method{
    int data;
    /**
     * Constructor to initialize the data field.
     * @param data the integer value to store
     */
    Method(int data){
        this.data = data;
    }
    
    //class Name as return type
    /**
     * Factory method that creates and returns a Method object.
     * Demonstrates returning an object from a method.
     * @param data the integer value for the new Method object
     * @return a new Method object initialized with the given data
     */
    public static Method createObj(int data){
        Method obj  = new Method(data);
        return obj;
    }
    
    
    /**
     * Displays the data value from a Method object.
     * Demonstrates passing an object as a parameter.
     * @param obj the Method object whose data will be displayed
     */
    public void displayDataObj(Method obj){
        System.out.println(obj.data);
    }
}


public class PassReturnObject
{
	/**
	 * Main method demonstrating passing and returning objects.
	 * Shows how objects can be passed as parameters and returned from methods.
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
    
        
        //prints the value in obj100
        Method obj100 = new Method(100);
        obj100.displayDataObj(obj100);
        
        
        // createObj and return
        Method obj200 = Method.createObj(200);
        obj200.displayDataObj(obj200);
        
        
	}
}

