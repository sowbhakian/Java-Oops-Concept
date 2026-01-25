package a.finalkeyword;
//Cant Re-Assign the value
class ClassTest11{
    
    final int DAY1 = 10; // Must be in caps bcos Const
    
    final int DAY2;// Not assigned
    ClassTest11(){
        DAY2 = 12; // Can be assigned one Time
    }
}


public class FinalVariable
{
	public static void main(String args[]) {
        
		ClassTest11 obj = new ClassTest11();
        System.out.println(obj.DAY1);
        System.out.println(obj.DAY2);              
           
	}
}





