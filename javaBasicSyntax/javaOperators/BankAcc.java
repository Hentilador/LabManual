package javaOperators;

import java.util.Scanner;

public class BankAcc {

	private static int[] balance = {0,5000};
	private static int[] accountNumber = {1};
	private static float interestRate = 0.12f;
	
	public static void main(String args[]) {
		System.out.println("Bank App\n");
		System.out.print("1. Get Balance\n2. Account Info\n3. Deposit\n4. Withdraw\n5. Calculate Interest\n\nChoose a number: ");
		int key = skanir();
		switch(key) {
			case 1:
				cls();
				System.out.println("Your balance is: " + getBalance());
				break;
			case 2:
				cls();
				displayAccountInfo();
				break;
			case 3:
				cls();
				System.out.println("Amount to deposit: ");
				int depo = skanir();
				deposit(depo);
				break;
			case 4:
				cls();
				System.out.println("Amount to withdraw: ");
				int withd = skanir();
				withdraw(withd);
				break;
			case 5:
				cls();
				calculateInterest();
				break;
		}
	}
	
	public static void deposit(int depo) {
		balance[accountNumber[0]] = depo + balance[accountNumber[0]];
		System.out.println("\n"+ depo +" deposited\nYou now have "+balance[accountNumber[0]]+" in your Account");
	}
	
	public static void withdraw(int withd) {
		if(withd > balance[accountNumber[0]]) {
			System.out.println("You only have "+balance[accountNumber[0]]+" in your account");
		}
		else {
			balance[accountNumber[0]] = balance[accountNumber[0]] - withd;
			System.out.println("\n"+ withd + "withdrawn\nYou have "+balance[accountNumber[0]]+" left in your Account");
		}
	}
	
	public static int getBalance() {
		return balance[accountNumber[0]];
	}
	
	public static void calculateInterest() {
		float annum = balance[accountNumber[0]] * interestRate;
		System.out.println("Your interest is "+annum+" per year");
	}
	
	public static void displayAccountInfo() {
		System.out.println("Account Holder: Jan Angelo N. Heide");
		System.out.println("Account Number: 2023-0" + accountNumber[0]);
		System.out.println("Card Expires on: 12/27");
	}
	
	@SuppressWarnings("resource")
	public static int skanir() {
		int input = new Scanner(System.in).nextInt();
		return input;
	}
	
	public static void cls() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.print("\033[H\033[2J");  
		System.out.flush();
	}

}
