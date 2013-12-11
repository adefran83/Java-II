package chap16examples;

public class IntQuickSorter {

	public static void quickSort(int array[]) {
		doQuickSort(array, 0, array.length - 1);
	}

	private static void doQuickSort(int array[], int start, int end) {
		int pivotPoint;

		if (start < end) {
			// Get the pivot point.
			pivotPoint = partition(array, start, end);

			// Sort the first sub list.
			doQuickSort(array, start, pivotPoint - 1);

			// Sort the second sub list.
			doQuickSort(array, pivotPoint + 1, end);
		}
	}

	/*
	 * The partition method selects a pivot value in an array and arranges the
	 * array into two sub lists. All the values less than the pivot will be
	 * stored in the left sub list and all the values greater than or equal to
	 * the pivot will be stored in the right sub list.
	 */

	private static int partition(int array[], int start, int end) {
		int pivotValue; // To hold the pivot value
		int endOfLeftList; // Last element in the left sub list.
		int mid; // To hold the mid-point subscript

		// Find the subscript of the middle element.
		// This will be our pivot value.
		mid = (start + end) / 2;

		// Swap the middle element with the first element.
		// This moves the pivot value to the start of
		// the list.
		swap(array, start, mid);

		// Save the pivot value for comparisons.
		pivotValue = array[start];

		// For now, the end of the left sub list is
		// the first element.
		endOfLeftList = start;

		// Scan the entire list and move any values that
		// are less than the pivot value to the left
		// sub list.
		for (int scan = start + 1; scan <= end; scan++) {
			if (array[scan] < pivotValue) {
				endOfLeftList++;
				swap(array, endOfLeftList, scan);
			}
		}

		// Move the pivot value to end of the
		// left sub list.
		swap(array, start, endOfLeftList);

		// Return the subscript of the pivot value.
		return endOfLeftList;
	}

	private static void swap(int[] array, int a, int b) {
		int temp;

		temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
}