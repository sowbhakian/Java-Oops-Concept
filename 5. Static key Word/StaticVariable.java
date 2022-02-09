public class StaticVariable {

    int sum;
    static int CONST;
    
    public void sumnum(int sum){
        this.sum = sum+2;        
    }
    
	public static void main(String[] args) {
	    
        //Differs from obj to obj
	    System.out.println("Non-Static Variable:");
        StaticVariable obj = new StaticVariable();
	    obj.sum = 10;
        obj.sumnum(1);        
        System.out.println(obj.sum);
        
        StaticVariable obj2 = new StaticVariable();
	    obj2.sum = 20;
        obj.sumnum(2);
        System.out.println(obj2.sum);
        
        //Common to all
        System.out.println("Static Variable:");
        StaticVariable.CONST = 12;
        System.out.println(StaticVariable.CONST);
        
	}
}
