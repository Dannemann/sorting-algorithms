package quicksort;

/**
 * <p>
 * <b>The most important thing to understand about Quick Sort:</b> A single
 * number <b>N</b> is considered sorted <b>if and only if all numbers on its
 * left are smaller and all numbers on its right are bigger. That's what the
 * pivot means</b>. It doesn't matter if the numbers on the left or right are
 * ordered. What matters is that all numbers on the left are smaller and all
 * numbers on the right are bigger. This way, we can be sure that <b>N</b> is in
 * its correct place.
 * </p>
 * <p>
 * <code>[3, 1, 4, 2, <b style="color:red;">5</b>, 10, 9, 7, 5, 8, 6]</code>
 * </p>
 * <p>
 * In the example above, 5 is considered ordered because all numbers before it
 * are smaller and all numbers after it are bigger. 5 is the pivot in the
 * algorithm.
 * </p>
 */
class QuickSort_Impl_1 {

	static void sort(int[] array) {
		partition(array, 0, array.length - 1);
	}

	static void partition(int[] array, int lower, int higher) {
		int pivotIndex = lower + (higher - lower) / 2;
		int pivot = array[pivotIndex];
		int i = lower;
		int j = higher;

		while (i < j) {
			while (array[i] < pivot)
				i++;

			while (array[j] > pivot)
				j--;

			if (i <= j) { // Doesn't need the "=" for the swap, only for the increment/decrement of i/j.
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;

				i++;
				j--;
			}
		}

		if (lower < j)
			partition(array, lower, j);

		if (i < higher)
			partition(array, i, higher);
	}

}
