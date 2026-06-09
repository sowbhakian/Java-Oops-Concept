package o.iInheritance;
// Single Level Inheritance  a, b->a, c->a

// IS - A relationship 
class A{
    /**
     * Adds two integers and prints the result.
     * @param i the first integer
     * @param j the second integer
     */
    public void add(int i, int j){
        System.out.println(i+j);
    }
}

class B extends A{
    /**
     * Subtracts two integers and prints the result.
     * Inherits the add method from class A.
     * @param i the first integer
     * @param j the second integer
     */
    public void sub(int i, int j){
        System.out.println(i-j);
    }
}

class C extends A{
    /**
     * Multiplies two integers and prints the result.
     * Inherits the add method from class A.
     * @param i the first integer
     * @param j the second integer
     */
    public void mul(int i, int j){
        System.out.println(i*j);
    }
}

public class SingleLevel
{
	/**
	 * Main method demonstrating single-level inheritance.
	 * Shows how subclasses inherit methods from a parent class.
	 * @param args command line arguments
	 */
	public static void main(String[] args) {

	   // HAS - A relationship
        B obj = new B();
        obj.add(1,1);
        obj.sub(1,1);
        
        C objc = new C();
        objc.mul(1,1);
	}
}

