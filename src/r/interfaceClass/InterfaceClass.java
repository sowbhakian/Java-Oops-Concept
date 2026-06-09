package r.interfaceClass;
// only the Method Declaration is done no method Definition is done -- except default
// implemented cls should have all method Definition of Interface
// No constructor in interface so no obj can be creted
// Interface accepts static, abstract, Variables

//implicitly public static final
//Cannot have instance fields
//Cannot store object state
//All fields are constants

interface Writer{
    
    // every method inside the interface is public abstract
    // method cant be Defined only Declarated
    /**
     * Method to be implemented by classes that can write.
     * This is an abstract method that must be defined by implementing classes.
     */
    public void write();
    
    // Every Variables are Final inside Interface - that is constance
    int NUM=10;
    
}

class Pen implements Writer{
    /**
     * Implementation of the write method for a Pen.
     * Demonstrates interface implementation.
     */
    public void write(){
        System.out.println("Pen Writer");
    }
}

class Pencil implements Writer{
    /**
     * Implementation of the write method for a Pencil.
     * Also demonstrates accessing interface constants.
     */
    public void write(){
        //error
        // NUM = 99;
        System.out.println("Pencil Writer  "+NUM);
    }
}


public class InterfaceClass {

    /**
     * Main method demonstrating interface usage.
     * Shows how interfaces define contracts that classes must implement.
     * @param args command line arguments
     */
    public static void main(String[] args) {
	    
        //Only reference of interface can be created not obj
        //interface - class
         Writer objPen = new Pen();
         Writer objPencil = new Pencil();
         
         objPen.write();
         objPencil.write();
         
         
         //Obj of Interface using anonymous function
        // interface - interface
         Writer obj = new Writer(){
             public void write(){
                 System.out.println("In Anonymous function");
             }
         };
         obj.write();
         
         //Functional interface with Lambda function
         obj = ()->{
        	 System.out.println("In Anonymous function");
         };
                 
     }

}
