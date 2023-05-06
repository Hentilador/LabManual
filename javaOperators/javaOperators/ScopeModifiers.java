package javaOperators;

public class ScopeModifiers {
	
	private int privateVar = 10;
	protected int protectedVar = 20;
	public int publicVar = 30;
	static int staticVar = 40;
	
	public static void main(String[] args) {
		int x = 5;
		int y = 7;
		{
			int z = 9;
			System.out.println("The value of z is: " + z);
		}
		System.out.println("The value of x is: " + x);
		System.out.println("The value of y is " + y);
		//creates a new object of ScopeModifiers class called scopeModifiers
		ScopeModifiers scopeModifiers = new ScopeModifiers();
		scopeModifiers.printVariables();
		//prints the value of the private integer privateVar
		System.out.println("The value of privateVar is " + scopeModifiers.privateVar);
		//prints the value of the protected integer protectedVar
		System.out.println("The value of protectedVar is " + scopeModifiers.protectedVar);
	}
	
		public void printVariables() {
		//prints the value of the private integer privateVar
		System.out.println("The value of privateVar is " + privateVar);
		//prints the value of the protected integer protectedVar
		System.out.println("The value of protectedVar is "+ protectedVar);
		//prints the value of the public integer publicVar
		System.out.println("The value of publicVar is " + publicVar);
		//prints the value of the static integer staticVar
		System.out.println("The value of staticVar is " + staticVar);
	}
}
