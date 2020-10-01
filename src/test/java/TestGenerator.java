import java.util.Random;

public class TestGenerator {

	protected static int rowcount = 0;

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++)
//			generate("InsertionSortMIT.sort");
//			generate("BubbleSortJava2Novice.sort");
//			generate("InsertionSortJava2Novice.sort");
			generate("QuickSortJava2Novice.sort");
	}

	protected static void generate(String methodName) {
		Random random = new Random();
		int[] ints = new int[12];
		int intsLen = ints.length;

		for (int i = 0; i < intsLen; i++)
			ints[i] = random.nextInt(99);

		System.out.print("int[] input" + ++rowcount + " = { ");

		for (int i = 0; i < intsLen; i++)
			System.out.print(ints[i] + (i != intsLen - 1 ? ", " : ""));

		System.out.println(" };");
		System.out.println(methodName + "(input" + rowcount + ");");
		System.out.println("Assert.assertTrue(TestUtils.isIncreasingSequence(input" + rowcount + "));");
		System.out.println("System.out.println();");
		System.out.println();
	}

}
