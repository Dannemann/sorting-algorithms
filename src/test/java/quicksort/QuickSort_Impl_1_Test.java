package quicksort;

import static java.lang.System.out;
import static org.junit.Assert.assertTrue;
import static utils.TestUtils.isIncreasingSequence;

import org.junit.Test;

public class QuickSort_Impl_1_Test {

	@Test
	public void testIt() {
//		int[] input0 = { 2, 1, 3, 6, 5, 3, 7, 10, 11 };
//		QuickSort_Impl_1.sort(input0);
//		assertTrue(isIncreasingSequence(input0));
//		out.println();
//		
//		
//		int[] input1 = { 8, 7, 6, 5, 4, 3, 2, 1 };
//		QuickSort_Impl_1.sort(input1);
//		assertTrue(isIncreasingSequence(input1));
//		out.println();
//
//		int[] input2 = { 2, 1, 3, 4, 5, 6, 7, 8 };
//		QuickSort_Impl_1.sort(input2);
//		assertTrue(isIncreasingSequence(input2));
//		out.println();

		int[] input3 = { 59, 65, 50, 62, 8, 67, 6, 28 };
		QuickSort_Impl_1.sort(input3);
		assertTrue(isIncreasingSequence(input3));
		out.println();

		int[] input4 = { 39, 28, 6, 54, 42, 40, 22, 18 };
		QuickSort_Impl_1.sort(input4);
		assertTrue(isIncreasingSequence(input4));
		out.println();

		int[] input5 = { 66, 43, 39, 61, 62, 4, 92, 15 };
		QuickSort_Impl_1.sort(input5);
		assertTrue(isIncreasingSequence(input5));
		out.println();

		int[] input6 = { 38, 89, 92, 63, 64, 56, 7, 45 };
		QuickSort_Impl_1.sort(input6);
		assertTrue(isIncreasingSequence(input6));
		out.println();

		int[] input7 = { 37, 97, 59, 70, 65, 58, 33, 85 };
		QuickSort_Impl_1.sort(input7);
		assertTrue(isIncreasingSequence(input7));
		out.println();

		int[] input8 = { 4, 38, 83, 77, 62, 4, 55, 14 };
		QuickSort_Impl_1.sort(input8);
		assertTrue(isIncreasingSequence(input8));
		out.println();

		int[] input9 = { 97, 28, 47, 4, 66, 81, 61, 28 };
		QuickSort_Impl_1.sort(input9);
		assertTrue(isIncreasingSequence(input9));
		out.println();

		int[] input10 = { 52, 86, 95, 56, 54, 52, 33, 6 };
		QuickSort_Impl_1.sort(input10);
		assertTrue(isIncreasingSequence(input10));
		out.println();

		int[] input11 = { 57, 1, 49, 45, 67, 88, 22, 84 };
		QuickSort_Impl_1.sort(input11);
		assertTrue(isIncreasingSequence(input11));
		out.println();

		int[] input12 = { 35, 1, 20, 6, 7, 37, 80, 11 };
		QuickSort_Impl_1.sort(input12);
		assertTrue(isIncreasingSequence(input12));
		out.println();

		int[] input13 = { 23, 57, 54, 81, 39, 74, 57, 0 };
		QuickSort_Impl_1.sort(input13);
		assertTrue(isIncreasingSequence(input13));
		out.println();

		int[] input14 = { 43, 73, 83, 73, 81, 83, 23, 9 };
		QuickSort_Impl_1.sort(input14);
		assertTrue(isIncreasingSequence(input14));
		out.println();

		int[] input15 = { 22, 96, 51, 46, 59, 50, 21, 86 };
		QuickSort_Impl_1.sort(input15);
		assertTrue(isIncreasingSequence(input15));
		out.println();

		int[] input16 = { 92, 81, 59, 17, 69, 25, 31, 47 };
		QuickSort_Impl_1.sort(input16);
		assertTrue(isIncreasingSequence(input16));
		out.println();

		int[] input17 = { 91, 97, 85, 51, 14, 37, 51, 70 };
		QuickSort_Impl_1.sort(input17);
		assertTrue(isIncreasingSequence(input17));
		out.println();

		int[] input18 = { 45, 24, 2, 65, 96, 18, 47, 41 };
		QuickSort_Impl_1.sort(input18);
		assertTrue(isIncreasingSequence(input18));
		out.println();

		int[] input19 = { 78, 4, 66, 18, 6, 21, 11, 95 };
		QuickSort_Impl_1.sort(input19);
		assertTrue(isIncreasingSequence(input19));
		out.println();

		int[] input20 = { 78, 28, 53, 36, 5, 11, 27, 74 };
		QuickSort_Impl_1.sort(input20);
		assertTrue(isIncreasingSequence(input20));
		out.println();

		int[] input21 = { 11, 58, 40, 80, 43, 41, 46, 41 };
		QuickSort_Impl_1.sort(input21);
		assertTrue(isIncreasingSequence(input21));
		out.println();

		int[] input22 = { 82, 1, 14, 98, 76, 87, 19, 95 };
		QuickSort_Impl_1.sort(input22);
		assertTrue(isIncreasingSequence(input22));
		out.println();

		int[] input23 = { 94, 40, 16, 25, 60, 8, 43, 55 };
		QuickSort_Impl_1.sort(input23);
		assertTrue(isIncreasingSequence(input23));
		out.println();

		int[] input24 = { 36, 64, 38, 37, 16, 46, 29, 64 };
		QuickSort_Impl_1.sort(input24);
		assertTrue(isIncreasingSequence(input24));
		out.println();

		int[] input25 = { 88, 6, 2, 59, 18, 19, 66, 58 };
		QuickSort_Impl_1.sort(input25);
		assertTrue(isIncreasingSequence(input25));
		out.println();

		int[] input26 = { 97, 59, 56, 75, 58, 61, 64, 61 };
		QuickSort_Impl_1.sort(input26);
		assertTrue(isIncreasingSequence(input26));
		out.println();

		int[] input27 = { 58, 72, 10, 58, 29, 21, 48, 48 };
		QuickSort_Impl_1.sort(input27);
		assertTrue(isIncreasingSequence(input27));
		out.println();

		int[] input28 = { 44, 22, 60, 80, 91, 58, 51, 36 };
		QuickSort_Impl_1.sort(input28);
		assertTrue(isIncreasingSequence(input28));
		out.println();

		int[] input29 = { 58, 55, 32, 60, 94, 84, 95, 28 };
		QuickSort_Impl_1.sort(input29);
		assertTrue(isIncreasingSequence(input29));
		out.println();

		int[] input30 = { 46, 27, 88, 45, 55, 91, 37, 82 };
		QuickSort_Impl_1.sort(input30);
		assertTrue(isIncreasingSequence(input30));
		out.println();

		int[] input31 = { 78, 28, 69, 73, 98, 47, 66, 31 };
		QuickSort_Impl_1.sort(input31);
		assertTrue(isIncreasingSequence(input31));
		out.println();

		int[] input32 = { 85, 81, 15, 80, 94, 58, 55, 43 };
		QuickSort_Impl_1.sort(input32);
		assertTrue(isIncreasingSequence(input32));
		out.println();

		int[] input33 = { 46, 33, 71, 21, 85, 24, 78, 38 };
		QuickSort_Impl_1.sort(input33);
		assertTrue(isIncreasingSequence(input33));
		out.println();

		int[] input34 = { 79, 89, 62, 25, 66, 88, 31, 54 };
		QuickSort_Impl_1.sort(input34);
		assertTrue(isIncreasingSequence(input34));
		out.println();

		int[] input35 = { 86, 96, 45, 23, 88, 11, 8, 72 };
		QuickSort_Impl_1.sort(input35);
		assertTrue(isIncreasingSequence(input35));
		out.println();

		int[] input36 = { 67, 24, 95, 79, 63, 35, 44, 58 };
		QuickSort_Impl_1.sort(input36);
		assertTrue(isIncreasingSequence(input36));
		out.println();

		int[] input37 = { 78, 82, 18, 61, 74, 71, 64, 29 };
		QuickSort_Impl_1.sort(input37);
		assertTrue(isIncreasingSequence(input37));
		out.println();

		int[] input38 = { 38, 98, 81, 68, 44, 64, 53, 70 };
		QuickSort_Impl_1.sort(input38);
		assertTrue(isIncreasingSequence(input38));
		out.println();

		int[] input39 = { 97, 3, 74, 67, 14, 12, 57, 87 };
		QuickSort_Impl_1.sort(input39);
		assertTrue(isIncreasingSequence(input39));
		out.println();

		int[] input40 = { 67, 45, 58, 21, 37, 51, 77, 32 };
		QuickSort_Impl_1.sort(input40);
		assertTrue(isIncreasingSequence(input40));
		out.println();

		int[] input41 = { 42, 46, 96, 29, 13, 59, 30, 59 };
		QuickSort_Impl_1.sort(input41);
		assertTrue(isIncreasingSequence(input41));
		out.println();

		int[] input42 = { 88, 9, 89, 41, 93, 14, 63, 31 };
		QuickSort_Impl_1.sort(input42);
		assertTrue(isIncreasingSequence(input42));
		out.println();

		int[] input43 = { 56, 62, 13, 24, 31, 49, 73, 78 };
		QuickSort_Impl_1.sort(input43);
		assertTrue(isIncreasingSequence(input43));
		out.println();

		int[] input44 = { 95, 28, 88, 65, 4, 57, 78, 62 };
		QuickSort_Impl_1.sort(input44);
		assertTrue(isIncreasingSequence(input44));
		out.println();

		int[] input45 = { 40, 77, 65, 55, 42, 4, 86, 75 };
		QuickSort_Impl_1.sort(input45);
		assertTrue(isIncreasingSequence(input45));
		out.println();

		int[] input46 = { 20, 74, 24, 10, 46, 97, 89, 48 };
		QuickSort_Impl_1.sort(input46);
		assertTrue(isIncreasingSequence(input46));
		out.println();

		int[] input47 = { 22, 79, 41, 65, 20, 27, 62, 86 };
		QuickSort_Impl_1.sort(input47);
		assertTrue(isIncreasingSequence(input47));
		out.println();

		int[] input48 = { 89, 31, 17, 85, 18, 30, 37, 1 };
		QuickSort_Impl_1.sort(input48);
		assertTrue(isIncreasingSequence(input48));
		out.println();

		int[] input49 = { 96, 16, 36, 31, 21, 1, 38, 43 };
		QuickSort_Impl_1.sort(input49);
		assertTrue(isIncreasingSequence(input49));
		out.println();

		int[] input50 = { 23, 15, 20, 68, 24, 83, 81, 12 };
		QuickSort_Impl_1.sort(input50);
		assertTrue(isIncreasingSequence(input50));
		out.println();

		int[] input51 = { 63, 43, 78, 14, 42, 67, 3, 17 };
		QuickSort_Impl_1.sort(input51);
		assertTrue(isIncreasingSequence(input51));
		out.println();

		int[] input52 = { 59, 42, 6, 14, 84, 73, 80, 80 };
		QuickSort_Impl_1.sort(input52);
		assertTrue(isIncreasingSequence(input52));
		out.println();

		int[] input53 = { 45, 39, 68, 29, 87, 9, 78, 48 };
		QuickSort_Impl_1.sort(input53);
		assertTrue(isIncreasingSequence(input53));
		out.println();

		int[] input54 = { 13, 10, 49, 98, 31, 40, 71, 21 };
		QuickSort_Impl_1.sort(input54);
		assertTrue(isIncreasingSequence(input54));
		out.println();

		int[] input55 = { 28, 27, 37, 90, 57, 21, 65, 49 };
		QuickSort_Impl_1.sort(input55);
		assertTrue(isIncreasingSequence(input55));
		out.println();

		int[] input56 = { 32, 13, 31, 3, 7, 45, 77, 51 };
		QuickSort_Impl_1.sort(input56);
		assertTrue(isIncreasingSequence(input56));
		out.println();

		int[] input57 = { 32, 45, 59, 68, 31, 97, 65, 44 };
		QuickSort_Impl_1.sort(input57);
		assertTrue(isIncreasingSequence(input57));
		out.println();

		int[] input58 = { 96, 31, 39, 50, 6, 76, 54, 49 };
		QuickSort_Impl_1.sort(input58);
		assertTrue(isIncreasingSequence(input58));
		out.println();

		int[] input59 = { 71, 3, 35, 70, 89, 73, 71, 51 };
		QuickSort_Impl_1.sort(input59);
		assertTrue(isIncreasingSequence(input59));
		out.println();

		int[] input60 = { 8, 89, 70, 1, 39, 6, 14, 83 };
		QuickSort_Impl_1.sort(input60);
		assertTrue(isIncreasingSequence(input60));
		out.println();

		int[] input61 = { 82, 26, 86, 18, 59, 40, 23, 30 };
		QuickSort_Impl_1.sort(input61);
		assertTrue(isIncreasingSequence(input61));
		out.println();

		int[] input62 = { 27, 54, 4, 33, 22, 76, 8, 23 };
		QuickSort_Impl_1.sort(input62);
		assertTrue(isIncreasingSequence(input62));
		out.println();

		int[] input63 = { 40, 10, 83, 26, 31, 85, 67, 29 };
		QuickSort_Impl_1.sort(input63);
		assertTrue(isIncreasingSequence(input63));
		out.println();

		int[] input64 = { 31, 95, 25, 74, 48, 93, 61, 27 };
		QuickSort_Impl_1.sort(input64);
		assertTrue(isIncreasingSequence(input64));
		out.println();

		int[] input65 = { 29, 1, 37, 56, 70, 67, 50, 9 };
		QuickSort_Impl_1.sort(input65);
		assertTrue(isIncreasingSequence(input65));
		out.println();

		int[] input66 = { 90, 97, 78, 43, 2, 75, 57, 53 };
		QuickSort_Impl_1.sort(input66);
		assertTrue(isIncreasingSequence(input66));
		out.println();

		int[] input67 = { 44, 32, 60, 41, 84, 12, 45, 8 };
		QuickSort_Impl_1.sort(input67);
		assertTrue(isIncreasingSequence(input67));
		out.println();

		int[] input68 = { 38, 54, 34, 44, 76, 47, 38, 46 };
		QuickSort_Impl_1.sort(input68);
		assertTrue(isIncreasingSequence(input68));
		out.println();

		int[] input69 = { 51, 95, 17, 85, 75, 63, 91, 31 };
		QuickSort_Impl_1.sort(input69);
		assertTrue(isIncreasingSequence(input69));
		out.println();

		int[] input70 = { 34, 52, 21, 12, 47, 33, 65, 84 };
		QuickSort_Impl_1.sort(input70);
		assertTrue(isIncreasingSequence(input70));
		out.println();

		int[] input71 = { 4, 86, 80, 95, 32, 4, 57, 27 };
		QuickSort_Impl_1.sort(input71);
		assertTrue(isIncreasingSequence(input71));
		out.println();

		int[] input72 = { 3, 19, 57, 43, 78, 46, 56, 97 };
		QuickSort_Impl_1.sort(input72);
		assertTrue(isIncreasingSequence(input72));
		out.println();

		int[] input73 = { 36, 3, 86, 72, 36, 72, 79, 28 };
		QuickSort_Impl_1.sort(input73);
		assertTrue(isIncreasingSequence(input73));
		out.println();

		int[] input74 = { 96, 32, 77, 63, 39, 6, 76, 7 };
		QuickSort_Impl_1.sort(input74);
		assertTrue(isIncreasingSequence(input74));
		out.println();

		int[] input75 = { 50, 66, 5, 97, 86, 58, 51, 54 };
		QuickSort_Impl_1.sort(input75);
		assertTrue(isIncreasingSequence(input75));
		out.println();

		int[] input76 = { 62, 96, 52, 22, 37, 97, 45, 87 };
		QuickSort_Impl_1.sort(input76);
		assertTrue(isIncreasingSequence(input76));
		out.println();

		int[] input77 = { 86, 82, 42, 53, 54, 61, 8, 56 };
		QuickSort_Impl_1.sort(input77);
		assertTrue(isIncreasingSequence(input77));
		out.println();

		int[] input78 = { 97, 54, 10, 49, 27, 77, 23, 7 };
		QuickSort_Impl_1.sort(input78);
		assertTrue(isIncreasingSequence(input78));
		out.println();

		int[] input79 = { 23, 39, 81, 12, 64, 96, 79, 83 };
		QuickSort_Impl_1.sort(input79);
		assertTrue(isIncreasingSequence(input79));
		out.println();

		int[] input80 = { 81, 48, 45, 9, 36, 58, 72, 82 };
		QuickSort_Impl_1.sort(input80);
		assertTrue(isIncreasingSequence(input80));
		out.println();

		int[] input81 = { 36, 68, 5, 17, 32, 64, 88, 47 };
		QuickSort_Impl_1.sort(input81);
		assertTrue(isIncreasingSequence(input81));
		out.println();

		int[] input82 = { 88, 75, 54, 19, 94, 56, 95, 87 };
		QuickSort_Impl_1.sort(input82);
		assertTrue(isIncreasingSequence(input82));
		out.println();

		int[] input83 = { 58, 38, 53, 5, 53, 11, 56, 21 };
		QuickSort_Impl_1.sort(input83);
		assertTrue(isIncreasingSequence(input83));
		out.println();

		int[] input84 = { 32, 34, 80, 16, 72, 31, 25, 21 };
		QuickSort_Impl_1.sort(input84);
		assertTrue(isIncreasingSequence(input84));
		out.println();

		int[] input85 = { 85, 81, 50, 28, 93, 54, 76, 43 };
		QuickSort_Impl_1.sort(input85);
		assertTrue(isIncreasingSequence(input85));
		out.println();

		int[] input86 = { 36, 76, 38, 38, 55, 24, 67, 93 };
		QuickSort_Impl_1.sort(input86);
		assertTrue(isIncreasingSequence(input86));
		out.println();

		int[] input87 = { 84, 95, 48, 8, 67, 36, 8, 6 };
		QuickSort_Impl_1.sort(input87);
		assertTrue(isIncreasingSequence(input87));
		out.println();

		int[] input88 = { 52, 76, 31, 73, 33, 36, 61, 49 };
		QuickSort_Impl_1.sort(input88);
		assertTrue(isIncreasingSequence(input88));
		out.println();

		int[] input89 = { 14, 23, 16, 56, 68, 45, 41, 81 };
		QuickSort_Impl_1.sort(input89);
		assertTrue(isIncreasingSequence(input89));
		out.println();

		int[] input90 = { 25, 81, 77, 10, 17, 96, 39, 18 };
		QuickSort_Impl_1.sort(input90);
		assertTrue(isIncreasingSequence(input90));
		out.println();

		int[] input91 = { 48, 76, 18, 74, 50, 92, 64, 75 };
		QuickSort_Impl_1.sort(input91);
		assertTrue(isIncreasingSequence(input91));
		out.println();

		int[] input92 = { 82, 4, 18, 52, 4, 56, 82, 18 };
		QuickSort_Impl_1.sort(input92);
		assertTrue(isIncreasingSequence(input92));
		out.println();

		int[] input93 = { 21, 2, 48, 7, 31, 59, 27, 41 };
		QuickSort_Impl_1.sort(input93);
		assertTrue(isIncreasingSequence(input93));
		out.println();

		int[] input94 = { 44, 89, 27, 24, 35, 43, 91, 26 };
		QuickSort_Impl_1.sort(input94);
		assertTrue(isIncreasingSequence(input94));
		out.println();

		int[] input95 = { 38, 93, 41, 11, 26, 63, 3, 93 };
		QuickSort_Impl_1.sort(input95);
		assertTrue(isIncreasingSequence(input95));
		out.println();

		int[] input96 = { 64, 60, 7, 71, 92, 28, 38, 5 };
		QuickSort_Impl_1.sort(input96);
		assertTrue(isIncreasingSequence(input96));
		out.println();

		int[] input97 = { 64, 70, 35, 43, 29, 94, 88, 50 };
		QuickSort_Impl_1.sort(input97);
		assertTrue(isIncreasingSequence(input97));
		out.println();

		int[] input98 = { 44, 54, 66, 25, 71, 28, 26, 42 };
		QuickSort_Impl_1.sort(input98);
		assertTrue(isIncreasingSequence(input98));
		out.println();

		int[] input99 = { 84, 52, 32, 84, 82, 78, 55, 64 };
		QuickSort_Impl_1.sort(input99);
		assertTrue(isIncreasingSequence(input99));
		out.println();

		int[] input100 = { 57, 59, 6, 54, 6, 51, 8, 97 };
		QuickSort_Impl_1.sort(input100);
		assertTrue(isIncreasingSequence(input100));
		out.println();

		out.println("*** Done! ***");
	}

}
