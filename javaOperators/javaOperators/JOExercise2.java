package javaOperators;

import java.text.DecimalFormat;
import java.util.Scanner;

public class JOExercise2 {
	public static void main(String[] args) {
		System.out.print("Enter Fahrenheit: ");
		double fahr = skanir();
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("Celsius: " + df.format(Fahr2Cels(fahr)));
	}
	
	public static double Fahr2Cels(double fahr) {
		double cels = (fahr - 32) * 5 / 9;
		return cels;
	}
	
	@SuppressWarnings("resource")
	public static double skanir() {
		double input = new Scanner(System.in).nextDouble();
		return input;
	}
}
