package javaAbstraction;

import java.text.DecimalFormat;
import java.util.Scanner;

public class JAExercise2 {
	public static void main(String[] args) {
		Shape solvec = new Circle();
		Shape solver = new Rectangle();
		DecimalFormat df = new DecimalFormat("0.0000");
		
		System.out.print("1. Circle\n2. Rectangle\n:");
		int key = skanir();
		switch(key) {
			case 1:
				System.out.println("Area: "+df.format(solvec.getArea()));
				break;
			case 2:
				System.out.println("Area: "+df.format(solver.getArea()));
				break;
		}
	}
	@SuppressWarnings("resource")
	public static int skanir() {
		int input = new Scanner(System.in).nextInt();
		return input;
	}
}

abstract class Shape {
	public abstract double getArea();
}

class Circle extends Shape{
	public double getArea() {
		System.out.print("Enter radius: ");
		double radii = skanir();
		double area=0;
		
		area = Math.PI * (Math.pow(radii, 2));
		
		return area;
	}
	
	@SuppressWarnings("resource")
	public static int skanir() {
		int input = new Scanner(System.in).nextInt();
		return input;
	}
	
}

class Rectangle extends Shape{
	public double getArea() {
		System.out.print("Enter Length: ");
		double length = skanir();
		System.out.print("Enter Width: ");
		double area=0;
		double width = skanir();
		area = length * width;
		
		return area;
	}
	@SuppressWarnings("resource")
	public static int skanir() {
		int input = new Scanner(System.in).nextInt();
		return input;
	}
}