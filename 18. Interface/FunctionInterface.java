// Has Only obe method, So Lambda Expression accept

interface FunctionInterfaces{
    public void function();
}

public abstract class FunctionInterface {
    public static void main(String[] args) {

         //Function Interface  Lambda Expression
         FunctionInterfaces obj2 = ()-> System.out.println("Lambda Expression");
         obj2.function();

     }
}
