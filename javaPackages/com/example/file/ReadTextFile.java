package com.example.file;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class ReadTextFile {

	public static void main(String[] args) throws FileNotFoundException {
		
		System.out.print("Enter path to text file: ");
		
		FileUtils fu = new FileUtils(); 
		fu.readFile(skanir());

	}

	@SuppressWarnings("resource")
	public static Scanner skanir() throws FileNotFoundException {
		String input = new Scanner(System.in).nextLine();
		Scanner file = new Scanner(new File(input)); 
		return file;
	}
	
}
