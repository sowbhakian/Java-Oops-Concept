public class methodOverLoading {
    public static void method(int i){
        System.out.println(i);
    }
    public static void method(double i){
        System.out.println(i);
    }
    public static void method(int i, int j){
        System.out.println(i+" "+j);
    }
    public static void method(double i, double j){
        System.out.println(i+" "+j);
    }
    
	public static void main(String[] args) {
    
        method(1);
        method(1.3f);
        method(1,2);
        method(1.2f,3.4f); 
        
	}
}
