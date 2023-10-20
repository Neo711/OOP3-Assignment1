package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import utility.Sorting;

public class SortingTest {

	@Test
	public void testBubbleSort() {
		double[] arr = { 3.0, 1.0, 4.0, 2.0, 5.0 };
		double[] expected = { 1.0, 2.0, 3.0, 4.0, 5.0 };
		Sorting.bubbleSort(arr);
		assertArrayEquals(expected, arr, 0.0);
	}

	@Test
	public void testQuickSort() {
		double[] arr = { 3.0, 1.0, 4.0, 2.0, 5.0 };
		double[] expected = { 1.0, 2.0, 3.0, 4.0, 5.0 };
		Sorting.quickSort(arr, 0, arr.length - 1);
		assertArrayEquals(expected, arr, 0.0);
	}

	@Test
	public void testSelectionSort() {
		int[] arr = { 3, 1, 4, 2, 5 };
		int[] expected = { 1, 2, 3, 4, 5 };
		Sorting.selectionSort(arr);
		assertArrayEquals(expected, arr);
	}

	@Test
	public void testMergeSort() {
		int[] arr = { 38, 27, 43, 3, 9, 82, 10 };
		int[] expected = { 3, 9, 10, 27, 38, 43, 82 };
		int[] sortedArray = Sorting.MergeSort.sort(arr);
		assertArrayEquals(expected, sortedArray);
	}

}