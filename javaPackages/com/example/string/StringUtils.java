package com.example.string;

public class StringUtils {
	public void reverse(String str) {
		char ch;
		String str2="";
		for (int i=0; i<str.length(); i++)
	      {
	        ch = str.charAt(i);
	        str2= ch+str2; //adds each character in front of the existing string
	      }
	      System.out.println("\nReversed word: "+ str2);
	}
}
