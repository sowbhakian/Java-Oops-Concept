package a.finalkeyword;


// final method cant be Override
class ClassTest1{
    /**
     * Displays a message to the console.
     * This method is marked as final and cannot be overridden by subclasses.
     */
    public final void show(){
        System.out.println("Show in 1");
    }
}

// Override Final Method
class ClassTest2 extends ClassTest1{
    //error
    // public void show(){
    //     System.out.println("Show in 2");
    // }
}



public class FinalMethod
{
	/**
	 * Main method demonstrating the use of final methods.
	 * Shows that final methods cannot be overridden in subclasses.
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
        
        ClassTest obj = new ClassTest();
        obj.show();
           
	}
}






