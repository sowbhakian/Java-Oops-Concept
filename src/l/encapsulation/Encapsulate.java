package l.encapsulation;
// Encapsulation --> Binding of data with methods 
// only the Setter and Getter methods Can access Variabls

class Student{
    
    // Variabls Should be in private
    private String name;
    private int roll;
    
    /**
     * Sets the student's name and roll number.
     * Demonstrates encapsulation by controlling access to private fields.
     * @param name the student's name
     * @param roll the student's roll number
     */
    public void setter(String name, int roll){
        this.name = name;
        this.roll = roll;
    }
    
    /**
     * Gets the student's name.
     * @return the student's name
     */
    public String nameGetter(){
        return name;
    }
    /**
     * Gets the student's roll number.
     * @return the student's roll number
     */
    public int rollGetter(){
        return roll;
    }
    
}

public class Encapsulate
{
	/**
	 * Main method demonstrating encapsulation.
	 * Shows how data is accessed only through getter and setter methods.
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		
		Student obj = new Student();
		obj.setter("Sowbi",189);		        

		System.out.println(obj.nameGetter());
		System.out.println(obj.rollGetter());
        
	}
}


