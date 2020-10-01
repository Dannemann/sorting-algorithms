package quicksort;

public class QuickSortJava2Novice {

	// -------------------------------------------------------------------------
	// Quick sort algorithm by 'Java 2 Novice':
	// https://www.java2novice.com/java-sorting-algorithms/quick-sort

	public static void sort(int[] array) {
		partition(array, 0, array.length - 1);
	}

	private static void partition(int[] array, int lower, int higher) {
		int pivot = lower + (higher - lower) / 2;
		int pivotVal = array[pivot];
		int i = lower;
		int j = higher;

		while (i < j) {
			while (array[i] < pivotVal)
				i++;

			while (array[j] > pivotVal)
				j--;

			if (i <= j) {
				swap(array, i, j);

				i++;
				j--;
			}
		}

		if (lower < j)
			partition(array, lower, j);

		if (i < higher)
			partition(array, i, higher);
	}

	private static void swap(int array[], int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	// -------------------------------------------------------------------------
}
