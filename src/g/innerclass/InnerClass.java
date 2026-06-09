package g.innerclass;
import java.util.*;

class Outer{ //outer.class
    
    int data;
    
    class Inner{ //outer$inner.class
        
        /**
         * Displays a message from the non-static inner class.
         * Demonstrates that non-static inner classes can access outer class members.
         */
        void display(){
            System.out.println("Inner Display1");
        }
    }

    static class Inner2{
        
        /**
         * Displays a message from the static inner class.
         * Demonstrates that static inner classes can be instantiated without an outer instance.
         */
        void display2(){
            System.out.println("Inner Display2");
        }
    }
    
}


public class InnerClass
{
	/**
	 * Main method demonstrating inner classes.
	 * Shows the difference between static and non-static inner classes.
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		Outer outerobj = new Outer();
		
// 		outer className outer ClassObj - With out STATIC    
		Outer.Inner innerobj = outerobj.new Inner();
		innerobj.display();
		
// 		With STATIC Class
		Outer.Inner2 objinner = new Outer.Inner2();
		objinner.display2();
		
		
	}
}




