package com.example.string;
import java.util.*;

public class ReverseString {
	public static void main(String[] args) {
		StringUtils obj = new StringUtils();
		System.out.print("Enter a strings: ");
		String str = skanir();
		obj.reverse(str);
		
	}
	public static String skanir() {
		String input = new Scanner(System.in).next();
		return input;
	}
}
