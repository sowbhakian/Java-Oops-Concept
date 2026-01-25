package h.anonymousclass;
// Anonymous Class with out Name
//Reduce class explosion
//Localize behavior close to usage
//Enable inline polymorphism
//Custom behavior
//No need to pollute codebase with tiny classes
//Logic is small
//Logic is used once
//You need polymorphism
//You want behavior close to usage
//You need to override multiple methods
//OuterClass$1.class, Has its own bytecode, Has synthetic name

//Anonymous classes exist to enable localized, one-time polymorphic behavior without polluting the 
//codebase with unnecessary named classes.

class A{
    public void show(){
        System.out.println("In Show");
    }
}

class B extends A{
    public void show(){
        System.out.println("WithOut AnonymousClass");
    }
}


public class AnonymousClass
{
	public static void main(String[] args) {

        // WithOut AnonymousClass - OverRidding Method Show
        A obj = new B();
        obj.show();
        
        // With AnonymousClass - OverRidding Method Show
        A obj2 = new A(){
            public void show(){
                System.out.println("With AnonymousClass");
            }
        };
        obj2.show();
        
        
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running");
            }
        }).start();

        
        
	}
}

