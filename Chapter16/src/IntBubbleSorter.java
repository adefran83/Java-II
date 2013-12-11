package chap16examples;

public class IntBubbleSorter {

	public static void bubbleSort(int[] array) {
		int lastPos; 	// Position of last element to compare
		int index; 		// Index of an element to compare
		int temp; 		// Used to swap to elements

		// The outer loop positions lastPos at the last element to compare during each pass
		// through the array. Initially lastPos is the index of the last element in the array.
		// During each iteration, it is decreased by one.
		for (lastPos = array.length - 1; lastPos >= 0; lastPos--) {
			// The inner loop steps through the array, comparing each element with its neighbor.
			// All of the elements from index 0 through lastPos are involved in the comparison.
			// If two elements are out of order, they are swapped.
			for (index = 0; index <= lastPos - 1; index++) {
				// Compare an element with its neighbor.
				if (array[index] > array[index + 1]) {
					// Swap the two elements.
					temp = array[index];
					array[index] = array[index + 1];
					array[index + 1] = temp;
				}
			}
		}
	}
}