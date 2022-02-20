// Polymorphism - The ability to change its property
// Dynamic Method Dispatch  follows Run Time polymorphism (method Overriding)

class A{
    public void show(){
        System.out.println("In show A");
    }
}

class B extends A{
    public void show(){
        System.out.println("In Obj of B");
    }
    
    public void errorTesting(){
        System.out.println("In Obj of B");
    }
    
}

class C extends A{
    public void show(){
        System.out.println("In Obj of C");
    }
}

public class Polymorphism
{
	public static void main(String[] args) {
	    
	    A obj = new B(); // Linking done @ RUNTime so Run Time polymorphism
	    obj.show();
	    
	    // obj.errorTesting();
	    // IF we are using the Referance of the Class then 
	    // that class must have all method of its obj cls
	   
	   obj = new C(); //Dynamic Method Dispatch
	    obj.show();
	   
	}
}




