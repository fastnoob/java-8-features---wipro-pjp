package Interfaces;

interface Vehicle {
	default void message() {
		System.out.println("Inside vehicle");
	}

}
interface FourWheeler {
	default void message() {
		System.out.println("Inside fourwheeler");
	}
}
public class Car implements Vehicle, FourWheeler {
	
	public static void main(String[] args) {
		Car c = new Car();
		c.message();
	}
	@Override
	public void message() {
		Vehicle.super.message();
	}
}
