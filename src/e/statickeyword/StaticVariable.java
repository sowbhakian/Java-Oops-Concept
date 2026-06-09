package e.statickeyword;
public class StaticVariable {

    int sum;
    static int CONST;
    
    /**
     * Adds 2 to the given sum and stores it in the instance variable.
     * Demonstrates that instance methods work with instance variables.
     * @param sum the value to add 2 to
     */
    public void sumnum(int sum){
        this.sum = sum+2;        
    }
    
	/**
	 * Main method demonstrating the difference between static and instance variables.
	 * Shows that instance variables differ for each object while static variables are shared.
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
	    
        //Differs from obj to obj
	    System.out.println("Non-Static Variable:");
        StaticVariable obj = new StaticVariable();
	    obj.sum = 10;
        obj.sumnum(1);        
        System.out.println(obj.sum);
        
        StaticVariable obj2 = new StaticVariable();
	    obj2.sum = 20;
        obj.sumnum(2); //1st option is used here
        System.out.println(obj2.sum);
        
        //Common to all
        System.out.println("Static Variable:");
        StaticVariable.CONST = 12;
        System.out.println(StaticVariable.CONST);
        
	}
}
