package o.iInheritance;
// multi Level Inheritance or Hierarchy Inheritance  a, b->a, c->b
// Mutiple Inheritance is not supported in java
// Super cls -> Sub Cls

// IS - A relationship 

class AAA{
    /**
     * Adds two integers and prints the result.
     * @param i the first integer
     * @param j the second integer
     */
    public void add(int i, int j){
        System.out.println(i+j);
    }
}

class BBB extends AAA{
    /**
     * Subtracts two integers and prints the result.
     * Inherits the add method from class AAA.
     * @param i the first integer
     * @param j the second integer
     */
    public void sub(int i, int j){
        System.out.println(i-j);
    }
}

class CCC extends BBB{
    /**
     * Multiplies two integers and prints the result.
     * Inherits add from AAA and sub from BBB through multi-level inheritance.
     * @param i the first integer
     * @param j the second integer
     */
    public void mul(int i, int j){
        System.out.println(i*j);
    }
}

public class MultiLevel
{
	/**
	 * Main method demonstrating multi-level inheritance.
	 * Shows how a class can inherit from a class that itself inherits from another class.
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
	   // HAS - A relationship
        CCC obj = new CCC();
        obj.add(1,2);
        obj.sub(1,3);
        obj.mul(1,3);
	}
}




