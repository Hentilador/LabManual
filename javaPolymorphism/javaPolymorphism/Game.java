package javaPolymorphism;

// zone for 
import java.util.*;
import java.util.concurrent.TimeUnit;
// imports


public class Game {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws InterruptedException {
		Scanner input = new Scanner(System.in);
		
		cls();
		System.out.println("\tChoose your class\n\n1. Archer\n2. Knight\n\nSelection: ");
		int key = input.nextInt();
		if(key == 1) {
			input.nextLine(); // consume the newline character
			cls();
			System.out.print("Enter your name: ");
			Archer archer = new Archer(input.nextLine()); // instantiate an object of Archer while taking user input to assign as name
			battle(archer);
		}
		else if(key == 2) {
			input.nextLine(); // consume the newline character
			cls();
			System.out.print("Enter your name: ");
			Knight knight = new Knight(input.nextLine()); // instantiate an object of Knight while taking user input to assign as name
			battle(knight);
		}
	}
	
	public static void battle(Player player) throws InterruptedException {
		Scanner input = new Scanner(System.in);
		Skeleton skelenemy = new Skeleton();
		int x=0;
		do {
			cls();
			System.out.println(player.name+"\t\t\t\t\t"+skelenemy.name+"\nHP: "+player.hp+"\t\t\t\t\t"+"HP: "+skelenemy.hp);
			input.nextLine();
			skelenemy.hp -= player.attack(player.damage, skelenemy.hp, skelenemy.name);
			player.hp -= skelenemy.attack(skelenemy.damage, player.hp, player.name);
		}
		while(player.hp >= 0 && skelenemy.hp >= 0);
		if(player.hp <= 0) {
			cls();
			System.out.println("You lost.");
		}
		else if(skelenemy.hp <= 0) {
			cls();
			System.out.println("You won.");
		}
	}
	
	public static void cls() {
	    for (int i = 0; i < 50; ++i) {
	        System.out.println();
	    }
	}
	
}

class Player {
	Scanner input = new Scanner(System.in);
	
	String name;
	int hp;
	int damage;
	public int attack(int damage,int hp,String name) throws InterruptedException {
	return damage;
	}
}

class Knight extends Player {
	public Knight(String name) {
		this.name = name;
		this.hp=100;
		this.damage=15;
	}
	public int attack(int damage,int hp,String name) throws InterruptedException {
		System.out.println("You swing at "+name+" and deal "+damage+" damage");
		TimeUnit.SECONDS.sleep(1);
		return damage;
	}
}

class Archer extends Player {
	public Archer(String name) {
		this.name = name;
		this.hp=80;
		this.damage=22;
	}
	public int attack(int damage,int hp,String name) throws InterruptedException{
		System.out.println("You shoot an arrow at "+name+" and deal "+damage+" damage");
		TimeUnit.SECONDS.sleep(1);
		return damage;
	}
}

class Enemy {
	String name;
	int hp;
	int damage;
	public int attack(int damage,int hp,String name) throws InterruptedException {
		return damage;
	}
}

class Skeleton extends Enemy {
	String name="Skelly";
	int hp=100;
	int damage=12;
	public int attack(int damage,int hp,String name) throws InterruptedException {
		System.out.println("Enemy throws a bone at "+name+" that deals "+damage+" damage");
		TimeUnit.SECONDS.sleep(1);
		return damage;
	}
}
