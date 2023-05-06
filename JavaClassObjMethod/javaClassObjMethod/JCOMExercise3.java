package javaClassObjMethod;

import java.util.Scanner;

public class JCOMExercise3 {
	private String name;
	private int grade;
	
	public static void main(String[] args) {
		JCOMExercise3 StudentA = new JCOMExercise3();
		JCOMExercise3 StudentB = new JCOMExercise3();
		StudentA.name = "Angelo";
		StudentA.grade = 78;
		StudentB.name = "Kyle";
		StudentB.grade = 98;
		
		System.out.print("Choose a student to get their grade: ");
		int key = skanir();
		switch(key) {
		case 1:
			System.out.println("Name: "+StudentA.name);
			System.out.println("Grade: "+getLetterGrade(StudentA.grade));
			break;
		case 2:
			System.out.println("Name: "+StudentB.name);
			System.out.println("Grade: "+getLetterGrade(StudentB.grade));
			break;
		}
	}
	
@SuppressWarnings("resource")
public static int skanir() {
	int input = new Scanner(System.in).nextInt();
	return input;
}

public static char getLetterGrade(int b) {
	char a=0;
	
	if(b>=90) {
		a = 'A';
	}
	else if(b>=80) {
		a = 'B';
	}
	else if(b>=70) {
		a = 'C';
	}
	else if(b>=60) {
		a = 'D';
	}
	else if(b<60) {
		a = 'F';
	}
	return a;
}
}