package c.methodoverloading;

public class MethodOverRidingParentChild {
	/**
	 * Main method demonstrating parent-child relationships and type casting.
	 * Shows how objects can be cast between parent and child types.
	 * @param args command line arguments
	 */
	public static void main(String args[]) {
		Parent child2 = new Child2("asd");
		Child1 child = (Child1) child2;
		
		Parent child1 = new Child11("asd");
		Child1 child11 = (Child1)child1;
		
	}
}


class Parent{
	String name;
	/**
	 * Constructor to initialize the parent with a name.
	 * @param name the name to assign to this parent
	 */
	Parent(String name){
		this.name = name;
	}
}

class Child1 extends Parent{
	/**
	 * Constructor to initialize Child1 with a name.
	 * Calls the parent constructor using super.
	 * @param name the name to assign to this child
	 */
	Child1(String name) {
		super(name);
	}
}

class Child11 extends Child1{
	/**
	 * Constructor to initialize Child11 with a name.
	 * Demonstrates multi-level inheritance by calling parent constructor.
	 * @param name the name to assign to this child
	 */
	Child11(String name) {
		super(name);
	}
}


class Child2 extends Parent{
	/**
	 * Constructor to initialize Child2 with a name.
	 * Calls the parent constructor using super.
	 * @param name the name to assign to this child
	 */
	Child2(String name) {
		super(name);
	}
}