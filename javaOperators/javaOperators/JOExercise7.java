package javaOperators;

import java.util.Scanner;

public class JOExercise7 {

	public static void main(String[] args) {
		
	System.out.print("Enter an integer: ");
	int eger = skanir();

	//System.out.println(eger); for checking
	eger <<= 2;
	System.out.println("Result: "+eger);

	}
	
	@SuppressWarnings("resource")
	public static int skanir() {
		int input = new Scanner(System.in).nextInt();
		return input;
	}
	
}
