
// Primitive dataType assigning into class dataType called Boxing
// Some frame works accepts only wrapper class 

import java.util.*;

public class Boxing
{
	public static void main(String[] args) {
    
        int i = 5; // Primitive dataType
        
		
        // Integer ii = new Integer(i); // Boxing or Wrapping
		// or
        Integer ii = Integer.valueOf(i); // Boxing or Wrapping
		
        System.out.println(ii.intValue()); // Unboxing or Unwrapping
    	
    	int j=10; 
    	Integer jj = j; // Auto Boxing or Wrapping
    	System.out.println(jj); // Auto Unboxing or Unwrapping
        
	}
}


