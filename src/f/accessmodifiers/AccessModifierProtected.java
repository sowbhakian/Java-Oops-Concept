package f.accessmodifiers;
// error Occurs when Different Package Access WithOut Inherting!

 class SampleClass{
    protected static int data = 10;
}

//Inherited class can access
class SampleTest extends SampleClass{    
    /**
     * Prints the protected data variable from the parent class.
     * Demonstrates that protected members can be accessed by subclasses.
     */
    public static void printClass(){
        System.out.println(SampleClass.data);
    }
}

// Same Package class can access
class SampleTest2{
    /**
     * Prints the protected data variable from SampleClass.
     * Demonstrates that protected members can be accessed within the same package.
     */
    public static void printClass(){
        System.out.println(SampleClass.data);
    }
}

public class AccessModifierProtected {
    /**
     * Main method demonstrating protected access modifier.
     * Shows that protected members can be accessed by subclasses and within the same package.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        SampleTest.printClass();
        SampleTest2.printClass();
    }
}
