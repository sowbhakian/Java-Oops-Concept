package r.interfaceClass;

//Interfaces do not carry instance state
//They define contracts
//No diamond problem for state
//Java allows multiple inheritance of type, not implementation.	


interface PaymentType{
	/**
	 * Calculates interest for the payment.
	 */
	void interestCalculation();
	/**
	 * Calculates the base factor for the payment.
	 */
	void baseFactor();
	
	/**
	 * Default method for PaymentType.
	 */
	default void defautMethod() {
		System.out.println("PaymentType");
	}
}

interface ReducingRepaymentType {
	/**
	 * Calculates interest for reducing repayment.
	 */
	void interestCalculation();
	/**
	 * Default method for ReducingRepaymentType.
	 */
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
	
	/**
	 * Main method demonstrating interface inheritance.
	 * Shows how interfaces can extend multiple other interfaces.
	 * @param args command line arguments
	 */
	public static void main(String args[]) {
		InterfaceExtends InterfaceExtends = new InterfaceExtends();
		InterfaceExtends.defautMethod();
	}

	/**
	 * Implementation of the baseFactor method.
	 */
	@Override
	public void baseFactor() {
		
	}

	/**
	 * Implementation of the interestCalculation method.
	 */
	@Override
	public void interestCalculation() {
		
	}
}
