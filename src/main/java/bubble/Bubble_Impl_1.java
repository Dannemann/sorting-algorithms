package bubble;

import static utils.TestUtils.print;

class Bubble_Impl_1 {

	static void sort(int[] array) {
		print(array);

		int arrLen = array.length - 1;

		for (int i = 0; i < arrLen; i++) {
			int k = arrLen - i;

			for (int c = 0, n = 1; c < k; c++, n++) {
				int curr = array[c];
				int next = array[n];

				if (curr > next) {
					array[n] = curr;
					array[c] = next;
				}
			}

			print(array);
		}
	}

	static void sort_NoPrints(int[] array) {
		int arrLen = array.length - 1;

		for (int i = 0; i < arrLen; i++) {
			int k = arrLen - i;

			for (int c = 0, n = 1; c < k; c++, n++) {
				int curr = array[c];
				int next = array[n];

				if (curr > next) {
					array[n] = curr;
					array[c] = next;
				}
			}
		}
	}

}
