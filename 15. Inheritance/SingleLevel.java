// Single Level Inheritance  a, b->a, c->a

// IS - A relationship 
class A{
    public void add(int i, int j){
        System.out.println(i+j);
    }
}

class B extends A{
    public void sub(int i, int j){
        System.out.println(i-j);
    }
}

class C extends A{
    public void mul(int i, int j){
        System.out.println(i*j);
    }
}

public class SingleLevel
{
	public static void main(String[] args) {

	   // HAS - A relationship
        B obj = new B();
        obj.add(1,1);
        obj.sub(1,1);
        
        C objc = new C();
        objc.mul(1,1);
	}
}

