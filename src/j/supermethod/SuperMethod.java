package j.supermethod;
//Super Method
//static void test() {
//System.out.println(super.a); //  compile-time error
//}
//super requires an object context
//Static methods do not have this
//No object --> no parent reference

class A{
    
    /**
     * Default constructor for class A.
     * This constructor is called when the subclass is instantiated.
     */
    public A(){
        System.out.println("In Default Constructor A ");    
    }
    
    /**
     * Parameterized constructor for class A.
     * @param i an integer parameter
     */
    public A(int i){
        System.out.println("In Parametrised Constructor A");    
    }
    
}

class B extends A{
	//By default Super Method is called here when - Inhertied!!!
    
    /**
     * Default constructor for class B.
     * Implicitly calls the default constructor of the parent class A.
     */
    public B(){
        System.out.println("In Default Constructor B "); 
    }
    
    /**
     * Parameterized constructor for class B.
     * Can explicitly call a parent constructor using super().
     * @param i an integer parameter
     */
    public B(int i){
//        super(5);
        System.out.println("In Parametrised Constructor B");    
    }
    
}

public class SuperMethod
{
	/**
	 * Main method demonstrating the super keyword.
	 * Shows how parent class constructors are called when creating subclass instances.
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
	
//	    new B();
	    new B(2);
	    
	}
}

