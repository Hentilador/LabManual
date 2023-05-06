package javaClassObjMethod;

import java.util.Scanner;

public class JCOMExercise2 {
	public static void main(String[] args) {
		int[] egers= new int[2];
		System.out.println("Enter two integers: ");
		for(int i=0;i<2;i++) {
			egers[i]=skanir();
		}
		double[] dubol= new double[2];
		for(int i=0;i<2;i++) {
			dubol[i] = (int)(egers[i]);
		}
		System.out.print("1. Add\n2. Subtract\n3. Multiply\n4. Divide\nWhat operation will you use: ");
		int key = skanir();
		switch(key) {
			case 1:
				System.out.println("Sum: "+add(egers[0],egers[1]));
				break;
			case 2:
				System.out.println("Difference: "+sub(egers[0],egers[1]));
				break;
			case 3:
				System.out.println("Product: "+mult(egers[0],egers[1]));
				break;
			case 4:
				System.out.println("Quotient: "+div(egers[0],egers[1]));
				break;
			case 5:
				System.out.println("Double Quotient: "+ddiv(dubol[0],dubol[1]));
				break;
		}
		
		
		
	}
	
	static int add(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	static int sub(int a, int b) {
		int diff = a - b;
		return diff;
	}
	
	static int mult(int a, int b) {
		int prod = a * b;
		return prod;
	}
	
	static int div(int a, int b) {
		int quot = a / b;
		return quot;
	}
	
	static double ddiv(double a, double b) {
		double quot = a / b;
		return quot;
	}
	
	@SuppressWarnings("resource")
	public static int skanir() {
		int input = new Scanner(System.in).nextInt();
		return input;
	}

}
