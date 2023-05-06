package javaStrings;

import java.util.*;

public class JSExercise2 {
	public static void main(String[] args) {
		String str1 = "sunday";
		String str2 = "saturday";
		str1 = 'a' + str1;
		str1 = str1.replace('s','t');
		str1 = 's' + str1; 
		str1 = str1.replace('n','r');
		System.out.println(str1+"\nI used 4 operations.");
		
		
	}
}
