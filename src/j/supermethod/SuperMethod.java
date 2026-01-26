package j.supermethod;
//Super Method
//static void test() {
//System.out.println(super.a); //  compile-time error
//}
//super requires an object context
//Static methods do not have this
//No object --> no parent reference

class A{
    
    public A(){
        System.out.println("In Default Constructor A ");    
    }
    
    public A(int i){
        System.out.println("In Parametrised Constructor A");    
    }
    
}

class B extends A{
	//By default Super Method is called here when - Inhertied!!!
    
    public B(){
        System.out.println("In Default Constructor B "); 
    }
    
    public B(int i){
//        super(5);
        System.out.println("In Parametrised Constructor B");    
    }
    
}

public class SuperMethod
{
	public static void main(String[] args) {
	
//	    new B();
	    new B(2);
	    
	}
}

