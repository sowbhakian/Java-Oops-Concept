// Varags - Accepts any Number of Params

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


