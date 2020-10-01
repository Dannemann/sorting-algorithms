package insertion;

import static utils.TestUtils.print;

class Insertion_Impl_1 {

	static int[] sort(int[] array) {
		print(array, "\nFirst loop i = 1");

		int arrLen = array.length;

		for (int i = 1; i < arrLen; i++) {
			int key = array[i];
			int j = i - 1;

			while (j > -1 && array[j] > key) {
				array[j + 1] = array[j];
				j--;

				print(array);
			}

			array[j + 1] = key;

			print(j + 1 != i, array);
			print(i != arrLen - 1, "Next loop i = " + (i + 1));
		}

		return array;
	}

	static int[] sort_NoPrints(int[] array) {
		int arrLen = array.length;

		for (int i = 1; i < arrLen; i++) {
			int key = array[i];
			int j = i - 1;

			while (j > -1 && array[j] > key) {
				array[j + 1] = array[j];
				j--;
			}

			array[j + 1] = key;
		}

		return array;
	}

}
