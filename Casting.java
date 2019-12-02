package lesson2;

public class Casting {
	public static void main(String[] args) {

		{
			int x = 10; // Is 32 bit
			long y = x; // Inserts 32 bits into 64 bit = implicit casting from int to long.
			int z = y; // Error occurs.
			int a = (int) y; // Explicit casting from long to int (can overflow).
			byte b = (byte) y; // Explicit casting from long to byte (can overflow).
		}
		{
			double x = 3.5;
			int y = x; // Error occurs.
			int z = (int) x; // Explicit casting.
		}
		// Casting operator: (Type)
		// Type: int, byte, long....
		{
			char c = 'à';
			System.out.println(c + " - " + (int) c); // char to int.
			System.out.println((char)(c + 1) + " - " + (c + 1)); // Example to show more things that can be done.
		}
	}
}
