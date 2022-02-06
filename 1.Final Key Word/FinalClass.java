

// final class cant be Inheritable
final class ClassTest{
    public void show(){
        System.out.println("In Show");
    }
}

// ClassTest is Inherited - Error
// class ClassTest2 extends ClassTest{
// }



public class FinalClass
{
	public static void main(String[] args) {
        
        ClassTest obj1 = new ClassTest();
        obj1.show();
           
	}
}





