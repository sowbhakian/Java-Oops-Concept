
public class StaticMethod{

    public static void method(){
        System.out.println("In Static Method!");
    }

    public static void main(String[] args) {
        // No obj is required if it is Static
        StaticMethod.method();

    }
}
