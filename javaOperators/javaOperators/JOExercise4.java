package javaOperators;

import java.util.Scanner;

public class JOExercise4 {

	public static void main(String[] args) {
		int[] num = {0,0,0};
		
		System.out.println("Enter three numbers: ");
		for(int i=0;i<3;i++) {
			num[i] = skanir();
		}
		
		int n = num.length;
		 
        // One by one move boundary of unsorted subnumay
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted numay
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (num[j] < num[min_idx])
                    min_idx = j;
 
            // Swap the found minimum element with the first
            // element
            int temp = num[min_idx];
            num[min_idx] = num[i];
            num[i] = temp;
        }
        printArray(num);
		}
	
	@SuppressWarnings("resource")
	public static int skanir() {
		int input = new Scanner(System.in).nextInt();
		return input;
	}
	
	static void printArray(int num[]) {
        System.out.print("Minimum: "+num[0]+" "+"Maximum: "+num[2]);
    }
}
