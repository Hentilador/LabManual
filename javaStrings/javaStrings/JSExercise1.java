package javaStrings;
import java.util.*;

public class JSExercise1 {
	public static void main(String[] args) {
		System.out.print("Enter a strings: ");
		String str = skanir();
		String[] splits = str.split("\\s");
		int length = splits.length;
		for(int i=length-1;i>=0;i--) {
			System.out.print(splits[i]+" ");
		}
		
	}
	@SuppressWarnings("resource")
	public static String skanir() {
		String input = new Scanner(System.in).nextLine();
		return input;
	}
}
