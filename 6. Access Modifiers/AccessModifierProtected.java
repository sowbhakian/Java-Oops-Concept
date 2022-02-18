// error Occurs when Different Package Access WithOut Inherting!

 class SampleClass{
    protected static int data = 10;
}

//Inherited class can access
class SampleTest extends SampleClass{    
    public static void printClass(){
        System.out.println(SampleClass.data);
    }
}

// Same Package class can access
class SampleTest2{
    public static void printClass(){
        System.out.println(SampleClass.data);
    }
}

public class AccessModifierProtected {
    public static void main(String[] args) {
        SampleTest.printClass();
        SampleTest2.printClass();
    }
}
