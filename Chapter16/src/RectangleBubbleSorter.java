package chap16examples;

public class RectangleBubbleSorter {

	public static void bubbleSort(Rectangle[] array) {
		int lastPos; // Marks the last element to compare
		int index; // Index of an element to compare
		Rectangle temp; // Used to swap to elements

		for (lastPos = array.length - 1; lastPos >= 0; lastPos--) {

			for (index = 0; index <= lastPos - 1; index++) {
				// Compare an element with its neighbor.
				if (array[index].compareTo(array[index + 1]) > 0) {
					// Swap the two elements.
					temp = array[index];
					array[index] = array[index + 1];
					array[index + 1] = temp;
				}
			}
		}
	}
}