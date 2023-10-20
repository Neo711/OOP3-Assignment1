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
		Sorting.quickSort(arr);
		assertArrayEquals(expected, arr, 0.0);
	}

	@Test
	public void testSelectionSort() {
		double[] arr = { 3.0, 1.0, 4.0, 2.0, 5.0 };
		double[] expected = { 1.0, 2.0, 3.0, 4.0, 5.0 };
		Sorting.selectionSort(arr);
		assertArrayEquals(expected, arr, 0.0);
	}

	@Test
	public void testMergeSort() {
		double[] arr = { 38, 27, 43, 3, 9, 82, 10 };
		double[] expected = { 3, 9, 10, 27, 38, 43, 82 };
		Sorting.mergeSort(arr);
		assertArrayEquals(expected, arr, 0.0);
	}

}
