package javaOperators;
import java.lang.Math;
import java.text.DecimalFormat;
import java.util.Scanner;

public class JOExercise1 {
	public static void main(String[] args) {
		System.out.print("Enter radius: ");
		double rsq = Math.pow(skanir(),2);
		double area,circumference;
		
		area = rsq * Math.PI;
		circumference = 2 * Math.PI * rsq;
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("\nArea: " + df.format(area));
		System.out.println("Circumference: " + df.format(circumference));
	}
	
	@SuppressWarnings("resource")
	public static double skanir() {
		double input = new Scanner(System.in).nextDouble();
		return input;
	}
}
