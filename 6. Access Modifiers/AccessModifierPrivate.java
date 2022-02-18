
class SampleClass{
    private static int data = 10;
    public static int showValue(){
        return data;
    }
}

// Error
// class SampleTest1{
//     public static void printClass(){
//         System.out.println(SampleClass.data);
//     }
// }

// Error
// class SampleTest2 extends SampleClass{    
//     public static void printClass(){
//         System.out.println(SampleClass.data);
//     }
// }

public class AccessModifierPrivate {
    public static void main(String[] args) {

        //error
        // SampleTest1.printClass();
        // SampleTest2.printClass();        

        System.out.println(SampleClass.showValue());

    }
}





