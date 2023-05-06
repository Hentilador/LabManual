package javaClassObjMethod;

import java.lang.*;
import java.util.Scanner;

//JCOMExercise1
public class JCOMExercise1 {
	
	private static String name;
	private static int age;
	private static String address;
	
	public static void main(String[] args) {
		setName();
		setAge();
		setAddress();
		
		System.out.println(getName()+"\n"+getAge()+"\n"+getAddress());
		
	}
	
	public static void setName(){
		System.out.print("Enter your name: ");
		name = strskanir();
	}
	
	public static String getName() {
		return name;
	}
	
	public static void setAge() {
		System.out.print("Enter your age: ");
		age = intskanir();
	}
	
	public static int getAge() {
		return age;
	}
	
	public static void setAddress() {
		System.out.print("Enter your address: ");
		address = strskanir();
	}
	
	public static String getAddress() {
		return address;
	}
	
	@SuppressWarnings("resource")
	public static int intskanir() {
		int input = new Scanner(System.in).nextInt();
		return input;
	}
	
	@SuppressWarnings("resource")
	public static String strskanir() {
		String input = new Scanner(System.in).nextLine();
		return input;
	}
	
}
