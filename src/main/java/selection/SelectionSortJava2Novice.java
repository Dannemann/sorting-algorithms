package selection;

public class SelectionSortJava2Novice {

	// -------------------------------------------------------------------------
	// Selection sort algorithm by 'Java 2 Novice':
	// https://www.java2novice.com/java-sorting-algorithms/selection-sort

	public static int[] sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int smallestIndex = i;

			for (int j = i + 1; j < arr.length; j++)
				if (arr[j] < arr[smallestIndex])
					smallestIndex = j;

			int smallestNumber = arr[smallestIndex];
			arr[smallestIndex] = arr[i];
			arr[i] = smallestNumber;
		}

		return arr;
	}

	// -------------------------------------------------------------------------
}
