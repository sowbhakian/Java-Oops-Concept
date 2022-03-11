public class ExceptionsSample {
    
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
	
    // From here it throwa Exception to function Call
	public static void ExceptionMethod() throws Exception{
	    int k = 1/0;
	}
	
	
}
