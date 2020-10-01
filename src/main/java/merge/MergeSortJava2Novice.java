package merge;

public class MergeSortJava2Novice {

	// -------------------------------------------------------------------------
	// Merge sort algorithm by 'Java 2 Novice':
	// https://www.java2novice.com/java-sorting-algorithms/merge-sort

	private int[] array;
	private int[] tempMergArr;
	private int length;

	public static void main(String a[]) {
		int[] inputArr = { 45, 23, 11, 89, 77, 98, 4, 28, 65, 43 };

		MergeSortJava2Novice mms = new MergeSortJava2Novice();
		mms.sort(inputArr);

		for (int i : inputArr)
			System.out.print(i + " ");
	}

	public void sort(int inputArr[]) {
		this.array = inputArr;
		this.length = inputArr.length;
		this.tempMergArr = new int[length];

		doMergeSort(0, length - 1);
	}

	private void doMergeSort(int lowerIndex, int higherIndex) {
		if (lowerIndex < higherIndex) {
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;

			doMergeSort(lowerIndex, middle); // Sorts the left side of the array.
			doMergeSort(middle + 1, higherIndex); // Sorts the right side of the array.
			mergeParts(lowerIndex, middle, higherIndex); // Now merge both sides.
		}
	}

	private void mergeParts(int lowerIndex, int middle, int higherIndex) {
		for (int i = lowerIndex; i <= higherIndex; i++)
			tempMergArr[i] = array[i];

		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;

		while (i <= middle && j <= higherIndex) {
			if (tempMergArr[i] <= tempMergArr[j]) {
				array[k] = tempMergArr[i];
				i++;
			} else {
				array[k] = tempMergArr[j];
				j++;
			}

			k++;
		}

		while (i <= middle) {
			array[k] = tempMergArr[i];
			k++;
			i++;
		}
	}

	// -------------------------------------------------------------------------
}
