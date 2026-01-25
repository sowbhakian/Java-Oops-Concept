package o.iInheritance;
// multi Level Inheritance or Hierarchy Inheritance  a, b->a, c->b
// Mutiple Inheritance is not supported in java
// Super cls -> Sub Cls

// IS - A relationship 

class AAA{
    public void add(int i, int j){
        System.out.println(i+j);
    }
}

class BBB extends AAA{
    public void sub(int i, int j){
        System.out.println(i-j);
    }
}

class CCC extends BBB{
    public void mul(int i, int j){
        System.out.println(i*j);
    }
}

public class MultiLevel
{
	public static void main(String[] args) {
	   // HAS - A relationship
        CCC obj = new CCC();
        obj.add(1,2);
        obj.sub(1,3);
        obj.mul(1,3);
	}
}




