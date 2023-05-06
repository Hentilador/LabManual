package javaOperators;

import java.util.*;

public class JOExercise5 {

	public static void main(String[] args) {
		System.out.print("Enter a string of characters: ");
		int length = skanir().length();
		System.out.println("Length of string: "+ length);
	}
	
	@SuppressWarnings("resource")
	public static String skanir() {
		String input = new Scanner(System.in).next();
		return input;
	}
}
