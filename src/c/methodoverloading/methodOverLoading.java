package c.methodoverloading;
public class methodOverLoading {
    /**
     * Prints an integer value.
     * This is an overloaded version that accepts an int parameter.
     * @param i the integer value to print
     */
    public static void method(int i){
        System.out.println(i);
    }
    /**
     * Prints a double value.
     * This is an overloaded version that accepts a double parameter.
     * @param i the double value to print
     */
    public static void method(double i){
        System.out.println(i);
    }
    /**
     * Prints two integer values.
     * This is an overloaded version that accepts two int parameters.
     * @param i the first integer value
     * @param j the second integer value
     */
    public static void method(int i, int j){
        System.out.println(i+" "+j);
    }
    /**
     * Prints two double values.
     * This is an overloaded version that accepts two double parameters.
     * @param i the first double value
     * @param j the second double value
     */
    public static void method(double i, double j){
        System.out.println(i+" "+j);
    }
    
    /**
     * Main method demonstrating method overloading.
     * Shows how methods with the same name can have different parameter lists.
     * @param args command line arguments
     */
	public static void main(String[] args) {
    
        method(1);
        method(1.3f);
        method(1,2);
        method(1.2f,3.4f); 
        
	}
}
