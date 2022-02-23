// multi Level Inheritance or Hierarchy Inheritance  a, b->a, c->b
// Mutiple Inheritance is not supported in java
// Super cls -> Sub Cls

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

class C extends B{
    public void mul(int i, int j){
        System.out.println(i*j);
    }
}

public class MultiLevel
{
	public static void main(String[] args) {
	   // HAS - A relationship
        C obj = new C();
        obj.add(1,2);
        obj.sub(1,3);
        obj.mul(1,3);
	}
}




