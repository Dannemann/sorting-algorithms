package insertion;

import static utils.TestUtils.print;

class Insertion_Impl_2 {

	static int[] sort(int[] array) {
		print(array, "\nFirst loop i = 1");

		int arrLen = array.length;

		for (int i = 1; i < arrLen; i++) {
			for (int p = i - 1, c = i; p > -1; p--, c--) {
				int prev = array[p];
				int curr = array[c];

				if (prev > curr) {
					array[p] = curr;
					array[c] = prev;

					print(array);
				} else
					break;
			}

			print(i != arrLen - 1, "Next loop i = " + (i + 1));
		}

		return array;
	}

	static int[] sort_NoPrints(int[] array) {
		int arrLen = array.length;

		for (int i = 1; i < arrLen; i++)
			for (int p = i - 1, c = i; p > -1; p--, c--) {
				int prev = array[p];
				int curr = array[c];

				if (prev > curr) {
					array[p] = curr;
					array[c] = prev;
				} else
					break;
			}

		return array;
	}

}
