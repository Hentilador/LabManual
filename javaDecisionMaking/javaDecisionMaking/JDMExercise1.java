package javaDecisionMaking;

import java.util.Scanner;

public class JDMExercise1 {
	public static void main(String[] args) {
		System.out.print("Enter your name: ");
		String name = skanir();
		System.out.print("Enter your age: ");
		int age = intskanir();
		agecheck(age);
		
	}
	
	public static void agecheck(int age) {
		if(age < 18) {
			System.out.println("You have not met the criteria: Age");
		}
		else {
			System.out.println("You are eligible to vote, press any key to continue");
			//skanir as pause
			skanir();
		}
	}
	
	@SuppressWarnings("resource")
	public static String skanir() {
		String input = new Scanner(System.in).next();
		return input;
	}
	
	@SuppressWarnings("resource")
	public static int intskanir() {
		int input = new Scanner(System.in).nextInt();
		return input;
	}
	
}
