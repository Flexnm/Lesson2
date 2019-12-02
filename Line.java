package lesson2;
// A line has color and length, print both
public class Line {
	
	private int length;
	private String color;
	
	// CTOR
	public Line(int length, String color) {
	//	this.length = length; Replaced by setter and getter
	//	this.color = color; Replaced by setter and getter
		setColor(color);
		setLength(length);
	}
	
	// Empty CTOR
	public Line() {
	}
	
	// Methods - getters and setters
	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}

	
	// Methods
	// Both of these are replaced by the bottom method.
	// public int theLength() {
	// return length;
	// }
	
	// public void theColor() {
	// System.out.println(color);
	// }

	
	// The "this." keyword is a reference to the current object that invoked (called to) the method.
	public void theLine() {
		System.out.println("The length is: " + this.length);
		System.out.println("The color is: " + this.color + "\n");
	} 	// In a sense, when the program is running, all the keywords "this." are replaced by the keyword that is
		// the name of the object that is currently running through the program.
}
