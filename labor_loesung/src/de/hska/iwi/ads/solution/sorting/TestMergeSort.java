package de.hska.iwi.ads.solution.sorting;

import org.junit.Assert;
import org.junit.Test;

public class TestMergeSort {
	
	@Test
	public void testIntegerArray() {
		Integer[] array1 = new Integer[] {3,6,4,1,2,5,0,8,9,7};
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(array1);
		System.out.println("Test1: ");
		for (Integer integer : array1) {
			System.out.print(integer + ",");
		}
		System.out.println();
		Assert.assertArrayEquals(new Integer[] {0,1,2,3,4,5,6,7,8,9}, array1);
	}

	@Test
	public void testIntegerArrayReverse() {
		Integer[] array2 = new Integer[] {9,8,7,6,5,4,3,2,1};
		ReverseArray reverse = new ReverseArray();
		reverse.reverse(array2, 0, 8);
		System.out.println("Test2: ");
		for (Integer integer : array2) {
			System.out.print(integer + ",");
		}
		System.out.println();
	Assert.assertArrayEquals(new Integer[] {1,2,3,4,5,6,7,8,9}, array2);
	}
	
	@Test
	public void testIntegerArrayReverseMergeSort() {
		Integer[] array3 = new Integer[] {9,4,7,8,2,1,3,5,6};
		ReverseMergeSort reverseMergeSort = new ReverseMergeSort();
		reverseMergeSort.sort(array3);
		System.out.println("Test3: ");
		for (Integer integer : array3) {
			System.out.print(integer + ",");
		}
		System.out.println();
	Assert.assertArrayEquals(new Integer[] {1,2,3,4,5,6,7,8,9}, array3);
	}

}
