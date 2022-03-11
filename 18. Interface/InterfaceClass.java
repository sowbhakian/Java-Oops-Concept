// only the Method Declaration is done no method Definition is done -- except default
// implemented cls should have all method Definition of Interface
// No constructor in interface so no obj can be creted
// Interface accepts static, abstract, Variables

interface Writer{
    
    // every method inside the interface is public abstract
    // method cant be Defined only Declarated
    public void write();
    
    // Every Variables are Final inside Interface - that is constance
    int NUM=10;
    
}

class Pen implements Writer{
    public void write(){
        System.out.println("Pen Writer");
    }
}

class Pencil implements Writer{
    public void write(){
        //error
        // NUM = 99;
        System.out.println("Pencil Writer  "+NUM);
    }
}


public class InterfaceClass {

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
                 
     }

}
