// Heap memory obj is created ==> by new key word
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
    public Constructor(int num1, float num2){
        // lacal variable
        // this indicates the instance variable
        this.num1 = num1;
        this.num2 = num2;
        System.out.println(num1+" "+num2);
    }
    
	public static void main(String[] args) {
       new Constructor(1,2.2f);
	}
}



