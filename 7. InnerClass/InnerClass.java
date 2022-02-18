import java.util.*;

class Outer{ //outer.class
    
    int data;
    
    class Inner{ //outer$inner.class
        
        void display(){
            System.out.println("Inner Display1");
        }
    }

    static class Inner2{
        
        void display2(){
            System.out.println("Inner Display2");
        }
    }
    
}


public class InnerClass
{
	public static void main(String[] args) {
		Outer outerobj = new Outer();
		
// 		outer className outer ClassObj - With out STATIC    
		Outer.Inner innerobj = outerobj.new Inner();
		innerobj.display();
		
// 		With STATIC Class
		Outer.Inner2 objinner = new Outer.Inner2();
		objinner.display2();
		
		
	}
}




