package d.methodoverridding;
//Private method cannot be over ridden from the external calss
class A{
    /**
     * Displays a message indicating this method is from class A.
     * This method will be overridden in subclass B.
     */
    public void show(){
        System.out.println("In A Class");
    }
    
    /**
     * Displays a super message from class A.
     * This method will be called from subclass B using super keyword.
     */
    public void showSuper(){
        System.out.println("In SuperShow A Class");
    }
}

class B extends A{

    /**
     * Overrides the show method from parent class A.
     * Displays a message indicating this method is from class B.
     */
    public void show(){
        System.out.println("In B Class");
    }
    
    /**
     * Overrides showSuper method and calls the parent class version.
     * Demonstrates the use of super keyword to invoke parent method.
     */
    public void showSuper(){
        super.showSuper();
        System.out.println("In SuperShow B Class");
    }
    
}

public class MethodOverRidding
{
	/**
	 * Main method demonstrating method overriding.
	 * Shows how a subclass can override parent class methods.
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.showSuper();
	}
}

