package javaOperators;

import java.util.Scanner;

public class JOExercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the first number: ");
		int bit_1 = skanir();
		System.out.print("Enter the second number: ");
		int bit_2 = skanir();
		
		System.out.println("Result: "+bitwise(bit_1, bit_2));
	}
	
	@SuppressWarnings("resource")
	public static int skanir() {
		int input = new Scanner(System.in).nextInt();
		return input;
	}
	
	public static int bitwise(int b1, int b2) {
		int bitresult;

		bitresult = b1 & b2;
		
		return bitresult;
	}
}
