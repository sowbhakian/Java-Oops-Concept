package i.variablelengthargument;

// Varags - Accepts any Number of Params

//Easy object creation
	//List.of(1, 2, 3, 4);
	//Set.of("A", "B", "C");

//Cleaner than arrays
//Method Overload Replacement
//Performance <  Slight cost

//Rules:
//	Only One Varargs Parameter
//  Varargs Must Be Last
// Overloading + Varargs Can Be Dangerous - This can cause ambiguity.
	//void m(int a, int b)
	//void m(int... a)




class SampleClass{
    
    public static int method(int ... array){ // Occours as array 
        int sum=0;
        for(int ie : array){
            sum+=ie;
        }
        return sum;
    }
}

public class Varags
{
	public static void main(String[] args) {

        System.out.println(SampleClass.method(1,1,1,1));
        System.out.println(SampleClass.method(1,1,1,1,1,1,1,1));

	}
}


