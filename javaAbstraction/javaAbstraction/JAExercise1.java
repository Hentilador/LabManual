package javaAbstraction;

public class JAExercise1 {
	public static void main(String[] args) {
		Car car = new Car();
		Truck truck = new Truck();
		car.drive();
		truck.drive();
	}
	
}

abstract class Vehicle {
	public abstract void drive();
}

class Car extends Vehicle{
	
	public void drive() {
		System.out.println("Driving a car");
	}
}
class Truck extends Vehicle{
	
	public void drive() {
		System.out.println("Driving a truck");
	}
}
