
class A{
    public void show(){
        System.out.println("In A Class");
    }
    
    public void showSuper(){
        System.out.println("In SuperShow A Class");
    }
}

class B extends A{

    public void show(){
        System.out.println("In B Class");
    }
    
    public void showSuper(){
        super.showSuper();
        System.out.println("In SuperShow B Class");
    }
    
}

public class MethodOverRidding
{
	public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.showSuper();
	}
}

