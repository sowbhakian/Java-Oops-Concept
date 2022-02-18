// Anonymous Class with out Name

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
        
	}
}

