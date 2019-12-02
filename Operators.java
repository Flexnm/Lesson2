package lesson2;

// An example for operators
public class Operators {

	// Ternary
	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		
		// Boolean expression ? return value of true : return value if false.
		int max = a > b ? a : b;
		
		System.out.println(max);
		
		// The ! (not) operator: reverses the boolean value.
		System.out.println(!true);
		System.out.println(!!!!true);
		// In a sense it functions as \*(-1) in math.
	}
}
