package com.example.geometry;

import java.util.Scanner;
import java.text.DecimalFormat;

public class GetAreaAndCircumference {
	public static void main(String[] args) {
		System.out.print("Enter the radius: ");
		Double radii = skanir();
		Circle comp = new Circle();
		DecimalFormat df = new DecimalFormat("0.0000");
		System.out.print("Radius: "+radii+"\nArea: "+df.format(comp.area(radii))+"\nCircumference: "+df.format(comp.circumference(radii)));
	}
	
	@SuppressWarnings("resource")
	public static Double skanir() {
		Double input = new Scanner(System.in).nextDouble();
		return input;
	}
	
}
