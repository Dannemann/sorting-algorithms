package utils;

import static java.lang.System.out;

import java.util.Arrays;

public class TestUtils {

	public static void print(boolean shouldPrint, String string) {
		if (shouldPrint)
			out.println(string);
	}

	public static void print(int[] array) {
		out.println(Arrays.toString(array));
	}

	public static void print(boolean shouldPrint, int[] array) {
		if (shouldPrint)
			out.println(Arrays.toString(array));
	}

	public static void print(String preString, int[] array) {
		out.println(preString + Arrays.toString(array));
	}

	public static void print(int[] array, String posString) {
		out.println(Arrays.toString(array) + posString);
	}

	public static void print(String preString, int[] array, String posString) {
		out.println(preString + Arrays.toString(array) + posString);
	}

	public static boolean isIncreasingSequence(int[] array) {
		int seqLenMin1 = array.length - 1;

		for (int i = 0; i < seqLenMin1; i++)
			if (array[i] > array[i + 1])
				return false;

		return true;
	}

}
