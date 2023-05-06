package com.example.file;

import java.util.*;


public class FileUtils {
	public void readFile(Scanner file) {
		while (file.hasNextLine()) {
		   System.out.println(file.nextLine());
		}
	}
}
