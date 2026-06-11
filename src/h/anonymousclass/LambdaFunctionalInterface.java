package h.anonymousclass;

public class LambdaFunctionalInterface{

	public static void main(String args[]) {
		
		//Labda
		AdditionNumber additionNumber = (a,b)-> {
			return a - b;
		};
		additionNumber.addNumbers(1, 5);
		
		
		//Function Interface
		CustomNumber result2 = new CustomNumber() {
			public int addNumbers(int a, int b) {
				return a * b;
			}
		};
		result2.addNumbers(10, 20);
		
	}
}



interface AdditionNumber {
	public int addNumbers(int a, int b);
}


class CustomNumber implements AdditionNumber{
	public int addNumbers(int a, int b) {
		return a + b;
	}
}