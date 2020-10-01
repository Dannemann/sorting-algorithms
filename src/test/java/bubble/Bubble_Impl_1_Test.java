package bubble;

import static java.lang.System.out;
import static org.junit.Assert.assertTrue;
import static utils.TestUtils.isIncreasingSequence;

import org.junit.Test;

public class Bubble_Impl_1_Test {

	@Test
	public void testIt() {
		int[] input1 = { 8, 7, 6, 5, 4, 3, 2, 1 };
		Bubble_Impl_1.sort(input1);
		assertTrue(isIncreasingSequence(input1));
		out.println();

		int[] input2 = { 49, 25, 51, 50, 43, 64, 90, 22 };
		Bubble_Impl_1.sort(input2);
		assertTrue(isIncreasingSequence(input2));
		out.println();

		int[] input3 = { 88, 91, 30, 54, 29, 21, 76, 50 };
		Bubble_Impl_1.sort(input3);
		assertTrue(isIncreasingSequence(input3));
		out.println();

		int[] input4 = { 20, 69, 73, 36, 48, 23, 85, 19 };
		Bubble_Impl_1.sort(input4);
		assertTrue(isIncreasingSequence(input4));
		out.println();

		int[] input5 = { 93, 15, 50, 61, 2, 45, 62, 70 };
		Bubble_Impl_1.sort(input5);
		assertTrue(isIncreasingSequence(input5));
		out.println();

		int[] input6 = { 56, 47, 49, 16, 50, 32, 55, 27 };
		Bubble_Impl_1.sort(input6);
		assertTrue(isIncreasingSequence(input6));
		out.println();

		int[] input7 = { 83, 73, 40, 0, 96, 84, 0, 67 };
		Bubble_Impl_1.sort(input7);
		assertTrue(isIncreasingSequence(input7));
		out.println();

		int[] input8 = { 88, 44, 31, 18, 30, 15, 14, 77 };
		Bubble_Impl_1.sort(input8);
		assertTrue(isIncreasingSequence(input8));
		out.println();

		int[] input9 = { 80, 94, 70, 57, 3, 82, 66, 39 };
		Bubble_Impl_1.sort(input9);
		assertTrue(isIncreasingSequence(input9));
		out.println();

		int[] input10 = { 85, 10, 52, 75, 45, 58, 95, 43 };
		Bubble_Impl_1.sort(input10);
		assertTrue(isIncreasingSequence(input10));
		out.println();

		int[] input11 = { 68, 77, 31, 21, 0, 64, 48, 76 };
		Bubble_Impl_1.sort(input11);
		assertTrue(isIncreasingSequence(input11));
		out.println();

		int[] input12 = { 54, 15, 94, 0, 35, 97, 87, 57 };
		Bubble_Impl_1.sort(input12);
		assertTrue(isIncreasingSequence(input12));
		out.println();

		int[] input13 = { 67, 50, 56, 28, 33, 8, 92, 71 };
		Bubble_Impl_1.sort(input13);
		assertTrue(isIncreasingSequence(input13));
		out.println();

		int[] input14 = { 60, 79, 68, 30, 90, 10, 9, 2 };
		Bubble_Impl_1.sort(input14);
		assertTrue(isIncreasingSequence(input14));
		out.println();

		int[] input15 = { 5, 85, 10, 70, 68, 88, 41, 68 };
		Bubble_Impl_1.sort(input15);
		assertTrue(isIncreasingSequence(input15));
		out.println();

		int[] input16 = { 47, 13, 39, 25, 52, 84, 91, 15 };
		Bubble_Impl_1.sort(input16);
		assertTrue(isIncreasingSequence(input16));
		out.println();

		int[] input17 = { 92, 82, 16, 73, 76, 36, 13, 3 };
		Bubble_Impl_1.sort(input17);
		assertTrue(isIncreasingSequence(input17));
		out.println();

		int[] input18 = { 92, 79, 54, 69, 42, 90, 52, 87 };
		Bubble_Impl_1.sort(input18);
		assertTrue(isIncreasingSequence(input18));
		out.println();

		int[] input19 = { 23, 74, 35, 37, 57, 5, 23, 56 };
		Bubble_Impl_1.sort(input19);
		assertTrue(isIncreasingSequence(input19));
		out.println();

		int[] input20 = { 14, 56, 2, 8, 64, 24, 15, 55 };
		Bubble_Impl_1.sort(input20);
		assertTrue(isIncreasingSequence(input20));
		out.println();

		int[] input21 = { 20, 23, 52, 3, 40, 97, 89, 20 };
		Bubble_Impl_1.sort(input21);
		assertTrue(isIncreasingSequence(input21));
		out.println();

		int[] input22 = { 94, 21, 17, 7, 92, 24, 3, 34 };
		Bubble_Impl_1.sort(input22);
		assertTrue(isIncreasingSequence(input22));
		out.println();

		int[] input23 = { 39, 94, 73, 77, 15, 18, 70, 95 };
		Bubble_Impl_1.sort(input23);
		assertTrue(isIncreasingSequence(input23));
		out.println();

		int[] input24 = { 67, 8, 15, 92, 90, 40, 27, 3 };
		Bubble_Impl_1.sort(input24);
		assertTrue(isIncreasingSequence(input24));
		out.println();

		int[] input25 = { 61, 56, 2, 43, 20, 32, 89, 26 };
		Bubble_Impl_1.sort(input25);
		assertTrue(isIncreasingSequence(input25));
		out.println();

		int[] input26 = { 26, 86, 89, 64, 37, 80, 84, 18 };
		Bubble_Impl_1.sort(input26);
		assertTrue(isIncreasingSequence(input26));
		out.println();

		int[] input27 = { 23, 79, 96, 62, 53, 68, 81, 32 };
		Bubble_Impl_1.sort(input27);
		assertTrue(isIncreasingSequence(input27));
		out.println();

		int[] input28 = { 10, 44, 84, 16, 21, 53, 83, 47 };
		Bubble_Impl_1.sort(input28);
		assertTrue(isIncreasingSequence(input28));
		out.println();

		int[] input29 = { 21, 0, 59, 80, 75, 11, 67, 61 };
		Bubble_Impl_1.sort(input29);
		assertTrue(isIncreasingSequence(input29));
		out.println();

		int[] input30 = { 49, 86, 64, 29, 35, 1, 53, 28 };
		Bubble_Impl_1.sort(input30);
		assertTrue(isIncreasingSequence(input30));
		out.println();

		int[] input31 = { 93, 48, 63, 71, 35, 41, 81, 56 };
		Bubble_Impl_1.sort(input31);
		assertTrue(isIncreasingSequence(input31));
		out.println();

		int[] input32 = { 19, 49, 21, 37, 12, 45, 42, 20 };
		Bubble_Impl_1.sort(input32);
		assertTrue(isIncreasingSequence(input32));
		out.println();

		int[] input33 = { 96, 43, 20, 23, 62, 17, 58, 95 };
		Bubble_Impl_1.sort(input33);
		assertTrue(isIncreasingSequence(input33));
		out.println();

		int[] input34 = { 67, 27, 59, 81, 76, 93, 97, 29 };
		Bubble_Impl_1.sort(input34);
		assertTrue(isIncreasingSequence(input34));
		out.println();

		int[] input35 = { 26, 42, 44, 25, 2, 32, 74, 52 };
		Bubble_Impl_1.sort(input35);
		assertTrue(isIncreasingSequence(input35));
		out.println();

		int[] input36 = { 51, 77, 35, 13, 19, 58, 37, 78 };
		Bubble_Impl_1.sort(input36);
		assertTrue(isIncreasingSequence(input36));
		out.println();

		int[] input37 = { 66, 39, 59, 41, 18, 96, 13, 40 };
		Bubble_Impl_1.sort(input37);
		assertTrue(isIncreasingSequence(input37));
		out.println();

		int[] input38 = { 93, 42, 5, 16, 96, 32, 67, 17 };
		Bubble_Impl_1.sort(input38);
		assertTrue(isIncreasingSequence(input38));
		out.println();

		int[] input39 = { 21, 62, 9, 44, 76, 41, 37, 3 };
		Bubble_Impl_1.sort(input39);
		assertTrue(isIncreasingSequence(input39));
		out.println();

		int[] input40 = { 82, 1, 48, 32, 78, 26, 66, 49 };
		Bubble_Impl_1.sort(input40);
		assertTrue(isIncreasingSequence(input40));
		out.println();

		int[] input41 = { 24, 11, 96, 60, 35, 64, 1, 95 };
		Bubble_Impl_1.sort(input41);
		assertTrue(isIncreasingSequence(input41));
		out.println();

		int[] input42 = { 66, 54, 74, 13, 86, 48, 58, 17 };
		Bubble_Impl_1.sort(input42);
		assertTrue(isIncreasingSequence(input42));
		out.println();

		int[] input43 = { 92, 31, 86, 63, 4, 11, 73, 32 };
		Bubble_Impl_1.sort(input43);
		assertTrue(isIncreasingSequence(input43));
		out.println();

		int[] input44 = { 87, 91, 46, 82, 36, 6, 92, 61 };
		Bubble_Impl_1.sort(input44);
		assertTrue(isIncreasingSequence(input44));
		out.println();

		int[] input45 = { 24, 1, 33, 51, 58, 95, 36, 35 };
		Bubble_Impl_1.sort(input45);
		assertTrue(isIncreasingSequence(input45));
		out.println();

		int[] input46 = { 36, 72, 8, 9, 39, 98, 78, 56 };
		Bubble_Impl_1.sort(input46);
		assertTrue(isIncreasingSequence(input46));
		out.println();

		int[] input47 = { 2, 2, 93, 47, 85, 10, 45, 54 };
		Bubble_Impl_1.sort(input47);
		assertTrue(isIncreasingSequence(input47));
		out.println();

		int[] input48 = { 94, 33, 67, 67, 47, 52, 76, 30 };
		Bubble_Impl_1.sort(input48);
		assertTrue(isIncreasingSequence(input48));
		out.println();

		int[] input49 = { 94, 21, 36, 5, 39, 14, 64, 55 };
		Bubble_Impl_1.sort(input49);
		assertTrue(isIncreasingSequence(input49));
		out.println();

		int[] input50 = { 63, 3, 27, 81, 86, 10, 95, 58 };
		Bubble_Impl_1.sort(input50);
		assertTrue(isIncreasingSequence(input50));
		out.println();

		int[] input51 = { 83, 47, 37, 72, 50, 0, 75, 67 };
		Bubble_Impl_1.sort(input51);
		assertTrue(isIncreasingSequence(input51));
		out.println();

		int[] input52 = { 58, 57, 67, 97, 37, 11, 41, 63 };
		Bubble_Impl_1.sort(input52);
		assertTrue(isIncreasingSequence(input52));
		out.println();

		int[] input53 = { 6, 62, 73, 67, 81, 16, 8, 58 };
		Bubble_Impl_1.sort(input53);
		assertTrue(isIncreasingSequence(input53));
		out.println();

		int[] input54 = { 67, 7, 2, 50, 72, 90, 66, 53 };
		Bubble_Impl_1.sort(input54);
		assertTrue(isIncreasingSequence(input54));
		out.println();

		int[] input55 = { 21, 80, 14, 45, 84, 28, 7, 13 };
		Bubble_Impl_1.sort(input55);
		assertTrue(isIncreasingSequence(input55));
		out.println();

		int[] input56 = { 26, 32, 79, 5, 58, 38, 77, 79 };
		Bubble_Impl_1.sort(input56);
		assertTrue(isIncreasingSequence(input56));
		out.println();

		int[] input57 = { 3, 66, 21, 43, 83, 0, 35, 37 };
		Bubble_Impl_1.sort(input57);
		assertTrue(isIncreasingSequence(input57));
		out.println();

		int[] input58 = { 13, 87, 73, 24, 27, 98, 62, 12 };
		Bubble_Impl_1.sort(input58);
		assertTrue(isIncreasingSequence(input58));
		out.println();

		int[] input59 = { 50, 89, 8, 38, 90, 12, 27, 74 };
		Bubble_Impl_1.sort(input59);
		assertTrue(isIncreasingSequence(input59));
		out.println();

		int[] input60 = { 83, 73, 82, 22, 25, 8, 29, 1 };
		Bubble_Impl_1.sort(input60);
		assertTrue(isIncreasingSequence(input60));
		out.println();

		int[] input61 = { 21, 67, 20, 24, 57, 47, 55, 30 };
		Bubble_Impl_1.sort(input61);
		assertTrue(isIncreasingSequence(input61));
		out.println();

		int[] input62 = { 31, 42, 49, 47, 62, 42, 6, 10 };
		Bubble_Impl_1.sort(input62);
		assertTrue(isIncreasingSequence(input62));
		out.println();

		int[] input63 = { 20, 34, 35, 36, 42, 29, 45, 4 };
		Bubble_Impl_1.sort(input63);
		assertTrue(isIncreasingSequence(input63));
		out.println();

		int[] input64 = { 58, 90, 57, 61, 49, 39, 13, 48 };
		Bubble_Impl_1.sort(input64);
		assertTrue(isIncreasingSequence(input64));
		out.println();

		int[] input65 = { 67, 22, 49, 76, 94, 3, 66, 34 };
		Bubble_Impl_1.sort(input65);
		assertTrue(isIncreasingSequence(input65));
		out.println();

		int[] input66 = { 19, 31, 34, 66, 82, 46, 20, 75 };
		Bubble_Impl_1.sort(input66);
		assertTrue(isIncreasingSequence(input66));
		out.println();

		int[] input67 = { 1, 72, 5, 94, 67, 7, 97, 71 };
		Bubble_Impl_1.sort(input67);
		assertTrue(isIncreasingSequence(input67));
		out.println();

		int[] input68 = { 36, 86, 98, 45, 32, 80, 59, 67 };
		Bubble_Impl_1.sort(input68);
		assertTrue(isIncreasingSequence(input68));
		out.println();

		int[] input69 = { 11, 8, 31, 55, 61, 86, 86, 58 };
		Bubble_Impl_1.sort(input69);
		assertTrue(isIncreasingSequence(input69));
		out.println();

		int[] input70 = { 52, 16, 47, 93, 30, 95, 51, 75 };
		Bubble_Impl_1.sort(input70);
		assertTrue(isIncreasingSequence(input70));
		out.println();

		int[] input71 = { 84, 55, 46, 6, 98, 92, 92, 23 };
		Bubble_Impl_1.sort(input71);
		assertTrue(isIncreasingSequence(input71));
		out.println();

		int[] input72 = { 88, 58, 95, 93, 34, 52, 96, 70 };
		Bubble_Impl_1.sort(input72);
		assertTrue(isIncreasingSequence(input72));
		out.println();

		int[] input73 = { 25, 47, 78, 73, 81, 66, 79, 8 };
		Bubble_Impl_1.sort(input73);
		assertTrue(isIncreasingSequence(input73));
		out.println();

		int[] input74 = { 72, 75, 87, 14, 50, 95, 20, 34 };
		Bubble_Impl_1.sort(input74);
		assertTrue(isIncreasingSequence(input74));
		out.println();

		int[] input75 = { 23, 48, 0, 91, 70, 38, 78, 41 };
		Bubble_Impl_1.sort(input75);
		assertTrue(isIncreasingSequence(input75));
		out.println();

		int[] input76 = { 3, 44, 74, 67, 92, 31, 70, 79 };
		Bubble_Impl_1.sort(input76);
		assertTrue(isIncreasingSequence(input76));
		out.println();

		int[] input77 = { 8, 74, 9, 70, 84, 97, 18, 64 };
		Bubble_Impl_1.sort(input77);
		assertTrue(isIncreasingSequence(input77));
		out.println();

		int[] input78 = { 37, 66, 42, 32, 75, 64, 29, 62 };
		Bubble_Impl_1.sort(input78);
		assertTrue(isIncreasingSequence(input78));
		out.println();

		int[] input79 = { 22, 86, 3, 76, 64, 25, 11, 9 };
		Bubble_Impl_1.sort(input79);
		assertTrue(isIncreasingSequence(input79));
		out.println();

		int[] input80 = { 26, 34, 57, 12, 55, 1, 0, 89 };
		Bubble_Impl_1.sort(input80);
		assertTrue(isIncreasingSequence(input80));
		out.println();

		int[] input81 = { 44, 14, 97, 20, 48, 43, 54, 75 };
		Bubble_Impl_1.sort(input81);
		assertTrue(isIncreasingSequence(input81));
		out.println();

		int[] input82 = { 34, 66, 68, 25, 60, 30, 48, 41 };
		Bubble_Impl_1.sort(input82);
		assertTrue(isIncreasingSequence(input82));
		out.println();

		int[] input83 = { 52, 78, 83, 69, 87, 54, 20, 7 };
		Bubble_Impl_1.sort(input83);
		assertTrue(isIncreasingSequence(input83));
		out.println();

		int[] input84 = { 73, 13, 77, 97, 94, 93, 66, 95 };
		Bubble_Impl_1.sort(input84);
		assertTrue(isIncreasingSequence(input84));
		out.println();

		int[] input85 = { 9, 69, 6, 98, 25, 84, 2, 79 };
		Bubble_Impl_1.sort(input85);
		assertTrue(isIncreasingSequence(input85));
		out.println();

		int[] input86 = { 94, 63, 6, 69, 97, 60, 57, 37 };
		Bubble_Impl_1.sort(input86);
		assertTrue(isIncreasingSequence(input86));
		out.println();

		int[] input87 = { 27, 45, 29, 24, 68, 16, 52, 66 };
		Bubble_Impl_1.sort(input87);
		assertTrue(isIncreasingSequence(input87));
		out.println();

		int[] input88 = { 16, 93, 30, 2, 98, 49, 87, 55 };
		Bubble_Impl_1.sort(input88);
		assertTrue(isIncreasingSequence(input88));
		out.println();

		int[] input89 = { 88, 0, 45, 20, 87, 18, 70, 24 };
		Bubble_Impl_1.sort(input89);
		assertTrue(isIncreasingSequence(input89));
		out.println();

		int[] input90 = { 4, 73, 62, 64, 26, 7, 94, 90 };
		Bubble_Impl_1.sort(input90);
		assertTrue(isIncreasingSequence(input90));
		out.println();

		int[] input91 = { 2, 19, 69, 18, 7, 29, 76, 47 };
		Bubble_Impl_1.sort(input91);
		assertTrue(isIncreasingSequence(input91));
		out.println();

		int[] input92 = { 28, 39, 1, 28, 29, 25, 2, 44 };
		Bubble_Impl_1.sort(input92);
		assertTrue(isIncreasingSequence(input92));
		out.println();

		int[] input93 = { 15, 80, 86, 22, 87, 39, 48, 75 };
		Bubble_Impl_1.sort(input93);
		assertTrue(isIncreasingSequence(input93));
		out.println();

		int[] input94 = { 85, 12, 49, 16, 62, 34, 31, 25 };
		Bubble_Impl_1.sort(input94);
		assertTrue(isIncreasingSequence(input94));
		out.println();

		int[] input95 = { 37, 92, 96, 40, 30, 14, 12, 56 };
		Bubble_Impl_1.sort(input95);
		assertTrue(isIncreasingSequence(input95));
		out.println();

		int[] input96 = { 59, 45, 51, 31, 5, 92, 94, 4 };
		Bubble_Impl_1.sort(input96);
		assertTrue(isIncreasingSequence(input96));
		out.println();

		int[] input97 = { 69, 84, 51, 13, 93, 22, 3, 32 };
		Bubble_Impl_1.sort(input97);
		assertTrue(isIncreasingSequence(input97));
		out.println();

		int[] input98 = { 26, 22, 24, 52, 1, 98, 68, 74 };
		Bubble_Impl_1.sort(input98);
		assertTrue(isIncreasingSequence(input98));
		out.println();

		int[] input99 = { 29, 39, 41, 77, 14, 67, 43, 26 };
		Bubble_Impl_1.sort(input99);
		assertTrue(isIncreasingSequence(input99));
		out.println();

		int[] input100 = { 25, 31, 95, 20, 4, 16, 56, 85 };
		Bubble_Impl_1.sort(input100);
		assertTrue(isIncreasingSequence(input100));
		out.println();

		out.println("*** Done! ***");
	}

}
