package s.exceptionsClass;
public class ExceptionsSample {
    
	/**
	 * Main method demonstrating exception handling.
	 * Shows the use of try-catch-finally blocks and exception propagation.
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
	    try{
	        int i=1;
	        int j=10;
	        int k = i/j;
	        int a[] = new int[1];
	       // a[3] = 5;
	        ExceptionMethod();
	    }
	   // Exception is the Super Class of all Exception
	   //Exception is the object
	    catch(Exception e){
	        System.out.println("Error: "+e);
	    }
	    finally{
	        System.out.println("end Of the Try");
	    }
	}
	
    // From here it throws Exception to function Call
	/**
	 * A method that throws an exception.
	 * Demonstrates exception propagation using the throws keyword.
	 * @throws Exception if division by zero occurs
	 */
	public static void ExceptionMethod() throws Exception{
	    int k = 1/0;
	}
	
	
}
