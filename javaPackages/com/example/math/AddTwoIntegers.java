package com.example.math;

import java.util.Scanner;

public class AddTwoIntegers {
	public static void main(String[] args) {
		int num_a=0,num_b=0;
		MathUtils obj = new MathUtils();
		
		for(int i=0;i==0;i+=0) {
			System.out.print("Enter first number: ");
			num_a = skanir();
			System.out.print("\nEnter the second number: ");
			num_b = skanir();
			
			System.out.println("Sum: "+obj.add(num_a, num_b));
			
			cls();
		}

	}
	
	public static int skanir() {
		int input = new Scanner(System.in).nextInt();
		return input;
	}
	
	public static void cls() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.print("\033[H\033[2J");  
		System.out.flush();
	}
}
