package r.interfaceClass;
// Has Only obe method, So Lambda Expression accept

//A functional interface is an interface with exactly one abstract method, 
//enabling lambda expressions and method references in Java.

interface FunctionInterfaces{
    public void function();
//    public void function2();
}

//abstract class FunctionInterfacesAbs implements  FunctionInterfaces{
//	 public void function() {
//		 System.out.println("FunctionInterfacesAbs");
//	}
//}

public abstract class FunctionInterface {
    public static void main(String[] args) {

         //Function Interface  Lambda Expression
         FunctionInterfaces obj2 = ()-> System.out.println("Lambda Expression");
         obj2.function();
         
         //For an Abstract we cannot create the Lambda Expression
         //FunctionInterfacesAbs obj2 = ()-> System.out.println("Lambda Expression");
         
     }
}
