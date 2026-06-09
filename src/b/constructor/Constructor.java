package b.constructor;
// Heap memory object is created ==> by new key word
// Every class has a default constructor
// Constructor will return nothing
// Constructor will allocate number of memory required
// initilize the vale to variable

import java.util.*;
public class Constructor 
{
    //instance variable
    int num1;
    float num2;
    
    /**
     * Constructor that initializes num1 and num2.
     * Demonstrates the use of 'this' keyword to differentiate between
     * instance variables and local parameters with the same name.
     * @param num1 integer value to initialize the instance variable num1
     * @param num2 float value to initialize the instance variable num2
     */
    public Constructor(int num1, float num2){
        // lacal variable
        // this indicates the instance variable
        this.num1 = num1;
        this.num2 = num2;
        System.out.println(num1+" "+num2);
    }
    
    /**
     * Main method demonstrating constructor usage.
     * Creates an instance of Constructor and initializes it with values.
     * @param args command line arguments
     */
	public static void main(String[] args) {
       new Constructor(1,2.2f);
	}
}



