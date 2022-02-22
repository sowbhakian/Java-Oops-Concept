import java.util.*;

 class Method{
    int data;
    Method(int data){
        this.data = data;
    }
    
    //class Name as return type
    public static Method createObj(int data){
        Method obj  = new Method(data);
        return obj;
    }
    
    
    public void displayDataObj(Method obj){
        System.out.println(obj.data);
    }
}


public class PassReturnObject
{
	public static void main(String[] args) {
    
        
        //prints the value in obj100
        Method obj100 = new Method(100);
        obj100.displayDataObj(obj100);
        
        
        // createObj and return
        Method obj200 = Method.createObj(200);
        obj200.displayDataObj(obj200);
        
        
	}
}

