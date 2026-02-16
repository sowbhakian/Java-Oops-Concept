package r.interfaceClass;

//Interfaces do not carry instance state
//They define contracts
//No diamond problem for state
//Java allows multiple inheritance of type, not implementation.	


interface PaymentType{
	void interestCalculation();
	void baseFactor();
	
	default void defautMethod() {
		System.out.println("PaymentType");
	}
}

interface ReducingRepaymentType {
	void interestCalculation();
	default void defautMethod() {
		System.out.println("ReducingRepaymentType");
	}
}

interface accountType extends PaymentType,ReducingRepaymentType{ //An interface can extend one or more interfaces.
	void interestCalculation();

	@Override
	default void defautMethod() {
		ReducingRepaymentType.super.defautMethod();
	} 
	
}

public class InterfaceExtends implements accountType{
	
	public static void main(String args[]) {
		InterfaceExtends InterfaceExtends = new InterfaceExtends();
		InterfaceExtends.defautMethod();
	}

	@Override
	public void baseFactor() {
		
	}

	@Override
	public void interestCalculation() {
		
	}
}
