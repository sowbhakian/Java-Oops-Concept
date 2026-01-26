package a.finalkeyword;

import java.sql.Date;

//final protects the reference, not the object’s internal state.

//Cant Re-Assign the value
class ClassTest11{
    
    final int DAY1 = 10; // Must be in caps bcos Const
    final int DAY2;// Not assigned

    final Date date;
    final String str;
    
    ClassTest11(){
        DAY2 = 12; // Can be assigned one Time
        date = new Date(0);
        str = "newStr1";
    }
    
}


public class FinalVariable
{
	public static void main(String args[]) {
        
		ClassTest11 obj = new ClassTest11();
//        System.out.println(obj.DAY1);
//        System.out.println(obj.DAY2);              
           
//        System.out.println("Date 1 : " + obj.date);
//		obj.date.setDate(3);
//        System.out.println("Date 1 : " + obj.date);
		
//		System.out.println("String 1 : " + obj.str);
//		obj.str = obj.str.concat("");
//		System.out.println("String 1 : " + obj.str);
        
	}
}





