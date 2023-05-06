package javaStrings;


public class MakeThisProgWork {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "world";
		String str3 = str1 + str2;
		System.out.println(str3);
		if (str3.compareTo("Helloworld") == 0) {
			System.out.println("The strings are equal");
		}
		else {
			System.out.println("The strings are not equal");
		}
		
		String str4 = "Java";
		String str5 = "Programming";
		String str6 = str4.concat(str5);
		String str7 = str6.substring(0,5);
		
		System.out.println("The length of str6 is " + str6.length());
		System.out.println("The character at index 3 of str6 is " + str6.charAt(3));
		System.out.println("The substring of str6 from index 4 to 9 is "+ str6.substring(4,9));
		System.out.println("The index of the first occurrence of 'm' in str6 is " + str6.indexOf('m'));
		System.out.println("The string str7 is " + str7);
	}
}
