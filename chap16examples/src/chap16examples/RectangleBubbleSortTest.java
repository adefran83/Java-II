package chap16examples;

// Tests the bubbleSort method in RectangleBubbleSorter

public class RectangleBubbleSortTest {
	public static void main(String[] args) {
		// Create a Rectangle array with test values.
		// Note that Rectangle implements Comparable.
		Rectangle[] values = { new Rectangle(5.0,2.0),
							   new Rectangle(4.0,2.0),
							   new Rectangle(6.0,2.0) };

		// Display the array's contents.
		System.out.println("Original order: ");
		for (Rectangle element : values) {
			System.out.print(element.area() + ", ");
		}
		// Sort the array.
		RectangleBubbleSorter.bubbleSort(values);

		// Display the array's contents.
		System.out.println("\nSorted order: ");
		for (Rectangle element : values) {
			System.out.print(element.area() + ", ");
		}

		System.out.println();
	}
}