

// final method cant be Override
class ClassTest{
    public final void show(){
        System.out.println("Show in 1");
    }
}

// Override Final Method
class ClassTest2 extends ClassTest{
    //error
    // public void show(){
    //     System.out.println("Show in 2");
    // }
}



public class FinalMethod
{
	public static void main(String[] args) {
        
        ClassTest obj = new ClassTest();
        obj.show();
           
	}
}






