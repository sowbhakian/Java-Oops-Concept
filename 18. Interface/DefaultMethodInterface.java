//Default Method in Interface
//Default + FunctionInterface too accepted
interface MethodDefault{
    public void abc();
    
    //can be Override
    //Any No. Default Methods
    default void defaultMethod(){
        System.out.println("In Default Method!");
    }
    
}   

class DefaultImp implements MethodDefault{
    public void abc(){
        System.out.println("In MethodDefault abc");
    }
    public void defaultMethod(){
        System.out.println("In DefaultImp Override Method ");
    }
}

public class DefaultMethodInterface {
    public static void main(String[] args) {
        
	   MethodDefault obj3 = new DefaultImp();
	   obj3.abc();
	   obj3.defaultMethod();
    }
}
