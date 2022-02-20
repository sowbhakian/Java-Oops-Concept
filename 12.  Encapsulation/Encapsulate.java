// Encapsulation --> Binding of data with methods 
// only the Setter and Getter methods Can access Variabls

class Student{
    
    // Variabls Should be in private
    private String name;
    private int roll;
    
    public void setter(String name, int roll){
        this.name = name;
        this.roll = roll;
    }
    
    public String nameGetter(){
        return name;
    }
    public int rollGetter(){
        return roll;
    }
    
}

public class Encapsulate
{
	public static void main(String[] args) {
		
		Student obj = new Student();
		obj.setter("Sowbi",189);		        

		System.out.println(obj.nameGetter());
		System.out.println(obj.rollGetter());
        
	}
}


