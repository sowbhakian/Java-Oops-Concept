package a.finalkeyword;


// final class cant be Inheritable
final class ClassTest{
    /**
     * Displays a message to the console.
     * Demonstrates that methods in a final class can still be called normally.
     */
    public void show(){
        System.out.println("In Show");
    }
}

// ClassTest is Inherited - Error
// class ClassTest2 extends ClassTest{
// }



public class FinalClass
{
	/**
	 * Main method demonstrating the use of final classes.
	 * Shows that final classes cannot be inherited but can be instantiated and used.
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
        
        ClassTest obj1 = new ClassTest();
        obj1.show();
           
	}
}





