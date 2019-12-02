package lesson2;

// Class
public class Car {
	// Attributes
	private int number;
	private String color;
	private int speed;
	
	// CTOR
	public Car() {}
	
	public Car(int number, String color, int speed) {
		this.number = number;
		this.color = color;
		this.speed = speed;
		
	}
	
	// Methods
	public void drive() {
		System.out.println("Driving");
	}
	public int whatSpeed() {
		return speed + number;
	}
	public String paint() {
		return color;
	}


}
