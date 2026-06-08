package c.methodoverloading;

public class MethodOverRidingParentChild {
	public static void main(String args[]) {
		Parent child2 = new Child2("asd");
		Child1 child = (Child1) child2;
		
		Parent child1 = new Child11("asd");
		Child1 child11 = (Child1)child1;
		
	}
}


class Parent{
	String name;
	Parent(String name){
		this.name = name;
	}
}

class Child1 extends Parent{
	Child1(String name) {
		super(name);
	}
}

class Child11 extends Child1{
	Child11(String name) {
		super(name);
	}
}


class Child2 extends Parent{
	Child2(String name) {
		super(name);
	}
}