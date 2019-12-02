package lesson2;

public class Demo2 {

	/**
	 * Create 2 random numbers (0-100):
	 * 1) Print them.
	 * 2) Print them in the same line with a comma separating them.
	 * 3) Print them as a sum expression.
	 * 4) Print them as a difference expression.
	 * 5) Print them as a multiplication expression.
	 * 6) Print them as a division expression.
	 * 
	 * 
	 */
	public static void main(String[] args) {

		int a = (int) (Math.random() * 101); // First number
		int b = (int) (Math.random() * 101); // Second number

		// 1)
		System.out.println("a: " + a);
		System.out.println("b: " + b);

		// 2)
		System.out.println("a, b: " + a + ", " + b);

		// 3)
		System.out.println("a + b: " + a + " + " + b + " = " + (a + b));

		// 4)
		System.out.println("a - b: " + a + " - " + b + " = " + (a - b));

		// 5)
		System.out.println("a*b: " + a + " * " + b + " = " + (a * b));

		// 6)
		System.out.println("a/b: " + a + " / " + b + " = " + (a / b) + ". Remainder: " + (a % b));
		// Another solution to 6: calculating beforehand.
		int R = a%b;
		int D = a/b;
		System.out.println("a/b: " + a + " / " + b + " = " + (D) + ". Remainder: " + (R));

	}
}
