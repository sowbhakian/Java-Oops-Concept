package f.accessmodifiers;

class SampleClasss{
    private static int data = 10;
    /**
     * Returns the value of the private data variable.
     * Demonstrates that private variables can only be accessed through public methods.
     * @return the value of the private data variable
     */
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
    /**
     * Main method demonstrating private access modifier.
     * Shows that private members cannot be accessed directly from outside the class.
     * @param args command line arguments
     */
    public static void main(String[] args) {

        //error
        // SampleTest1.printClass();
        // SampleTest2.printClass();        

        System.out.println(SampleClasss.showValue());

    }
}





