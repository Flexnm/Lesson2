package lesson2;

public class RandomNumber {

	public static void main(String[] args) {

		System.out.println(Math.random()); // Math.random() - returns a random value 0 < x < 1

		// integer 0 - 10 inclusive:
		System.out.println(Math.random() * 11);

		// can turn it into whole numbers:
		System.out.println((int) (Math.random() * 11));

		// integer 0 - 100 inclusive:
		System.out.println((int) (Math.random() * 101)); // This is specifically whole numbers

		// 0 - 3:
		System.out.println((int) (Math.random() * 4));

		// 3 - 6:
		System.out.println((int) (Math.random() * 4 + 3));

		// 100 - 102: random numbers 0 - 2 and adding 100.
		System.out.println((int) (Math.random() * 3 + 100));

		// 10 - 20: random numbers 0 - 10 and adding 10.
		System.out.println((int) (Math.random() * 11 + 10));

		// -20 - -10:
		System.out.println((int) ((Math.random() * 11) - 20));
	}
}
