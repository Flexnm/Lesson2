package lesson2;

public class Cartest {
	public static void main(String[] args) {
		
		Car car1 = new Car(50, "Blue", 100);
		
		System.out.println(car1.whatSpeed());
		System.out.println(car1.paint());
		car1.drive();
	}

}
