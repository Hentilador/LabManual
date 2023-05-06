package javaLoopingOrArrays;

import java.util.Scanner;

public class JLAExercise1 {
	
	private static int[] eger = new int[10];
	
	public static void main(String[] args) {
		
		int sum=0;
		
		System.out.println("Enter 10 integers: ");
		for(int i=0;i<10;i++) {
			System.out.print("Integer "+(i+1)+": ");
			eger[i] = skanir();
		}
		System.out.print("Sum: ");
		for(int i=0;i<10;i++) {
			sum += eger[i];
		}
		System.out.println(sum);
		minmax();
		System.out.println("Minimum: "+eger[0]+"\nMaximum: "+eger[eger.length-1]);
		
	}
	
	@SuppressWarnings("resource")
	public static int skanir() {
		int input = new Scanner(System.in).nextInt();
		return input;
	}
	
	public static void minmax() {
		int n = eger.length;
		
        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (eger[j] < eger[min_idx])
                    min_idx = j;
 
            int temp = eger[min_idx];
            eger[min_idx] = eger[i];
            eger[i] = temp;
        }
	}
}
