package e.statickeyword;

public class StaticMethod{

    /**
     * A static method that prints a message.
     * Can be called without creating an instance of the class.
     */
    public static void method(){
        System.out.println("In Static Method!");
    }

    /**
     * Main method demonstrating static method invocation.
     * Shows that static methods can be called using class name without object instantiation.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // No obj is required if it is Static
        StaticMethod.method();

    }
}
