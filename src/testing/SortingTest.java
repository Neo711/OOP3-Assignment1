package testing;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import shapes.Cone;
import shapes.Cylinder;
import shapes.OctagonalPrism;
import shapes.Shape;
import shapes.TriangularPrism;
import utility.Sorting;

public class SortingTest {

	@Test
	public void testBubbleSortDoubles() {
		double[] arr = { 3.0, 1.0, 4.0, 2.0, 5.0 };
		double[] expected = { 1.0, 2.0, 3.0, 4.0, 5.0 };
		Sorting.bubbleSort(arr);
		assertArrayEquals(expected, arr, 0.0);
	}

	@Test
	public void testBubbleSortShapesHeight() {
		Shape[] arr = new Shape[5];
		Shape[] expected = new Shape[5];
		Shape s1 = new TriangularPrism(3.0, 3.0);
		Shape s2 = new Cone(1.0, 1.0);
		Shape s3 = new Cylinder(4.0, 4.0);
		Shape s4 = new TriangularPrism(2.0, 2.0);
		Shape s5 = new OctagonalPrism(5.0, 5.0);
		arr[0] = s1;
		arr[1] = s2;
		arr[2] = s3;
		arr[3] = s4;
		arr[4] = s5;
		expected[0] = s2;
		expected[1] = s4;
		expected[2] = s1;
		expected[3] = s3;
		expected[4] = s5;
		Shape.compareType = "height";
		Sorting.bubbleSort(arr);
		assertArrayEquals(expected, arr);
	}

	@Test
	public void testBubbleSortShapesVolume() {
		Shape[] arr = new Shape[5];
		Shape[] expected = new Shape[5];
		Shape s1 = new TriangularPrism(3.0, 3.0);
		Shape s2 = new Cone(1.0, 1.0);
		Shape s3 = new Cylinder(4.0, 4.0);
		Shape s4 = new TriangularPrism(2.0, 2.0);
		Shape s5 = new OctagonalPrism(5.0, 5.0);
		arr[0] = s1;
		arr[1] = s2;
		arr[2] = s3;
		arr[3] = s4;
		arr[4] = s5;
		expected[0] = s2;
		expected[1] = s4;
		expected[2] = s1;
		expected[3] = s3;
		expected[4] = s5;
		Shape.compareType = "volume";
		Sorting.bubbleSort(arr);
		assertArrayEquals(expected, arr);
	}

	@Test
	public void testBubbleSortShapesBaseArea() {
		Shape[] arr = new Shape[5];
		Shape[] expected = new Shape[5];
		Shape s1 = new TriangularPrism(3.0, 3.0);
		Shape s2 = new Cone(1.0, 1.0);
		Shape s3 = new Cylinder(4.0, 4.0);
		Shape s4 = new TriangularPrism(2.0, 2.0);
		Shape s5 = new OctagonalPrism(5.0, 5.0);
		arr[0] = s1;
		arr[1] = s2;
		arr[2] = s3;
		arr[3] = s4;
		arr[4] = s5;
		expected[0] = s4;
		expected[1] = s2;
		expected[2] = s1;
		expected[3] = s3;
		expected[4] = s5;
		Shape.compareType = "base area";
		Sorting.bubbleSort(arr);
		assertArrayEquals(expected, arr);
	}

	@Test
	public void testQuickSortDoubles() {
		double[] arr = { 3.0, 1.0, 4.0, 2.0, 5.0 };
		double[] expected = { 1.0, 2.0, 3.0, 4.0, 5.0 };
		Sorting.quickSort(arr);
		assertArrayEquals(expected, arr, 0.0);
	}

	@Test
	public void testQuickSortShapesHeight() {
		Shape[] arr = new Shape[5];
		Shape[] expected = new Shape[5];
		Shape s1 = new TriangularPrism(3.0, 3.0);
		Shape s2 = new Cone(1.0, 1.0);
		Shape s3 = new Cylinder(4.0, 4.0);
		Shape s4 = new TriangularPrism(2.0, 2.0);
		Shape s5 = new OctagonalPrism(5.0, 5.0);
		arr[0] = s1;
		arr[1] = s2;
		arr[2] = s3;
		arr[3] = s4;
		arr[4] = s5;
		expected[0] = s2;
		expected[1] = s4;
		expected[2] = s1;
		expected[3] = s3;
		expected[4] = s5;
		Shape.compareType = "height";
		Sorting.quickSort(arr);
		assertArrayEquals(expected, arr);
	}

	@Test
	public void testQuickSortShapesVolume() {
		Shape[] arr = new Shape[5];
		Shape[] expected = new Shape[5];
		Shape s1 = new TriangularPrism(3.0, 3.0);
		Shape s2 = new Cone(1.0, 1.0);
		Shape s3 = new Cylinder(4.0, 4.0);
		Shape s4 = new TriangularPrism(2.0, 2.0);
		Shape s5 = new OctagonalPrism(5.0, 5.0);
		arr[0] = s1;
		arr[1] = s2;
		arr[2] = s3;
		arr[3] = s4;
		arr[4] = s5;
		expected[0] = s2;
		expected[1] = s4;
		expected[2] = s1;
		expected[3] = s3;
		expected[4] = s5;
		Shape.compareType = "volume";
		Sorting.quickSort(arr);
		assertArrayEquals(expected, arr);
	}

	@Test
	public void testQuickSortShapesBaseArea() {
		Shape[] arr = new Shape[5];
		Shape[] expected = new Shape[5];
		Shape s1 = new TriangularPrism(3.0, 3.0);
		Shape s2 = new Cone(1.0, 1.0);
		Shape s3 = new Cylinder(4.0, 4.0);
		Shape s4 = new TriangularPrism(2.0, 2.0);
		Shape s5 = new OctagonalPrism(5.0, 5.0);
		arr[0] = s1;
		arr[1] = s2;
		arr[2] = s3;
		arr[3] = s4;
		arr[4] = s5;
		expected[0] = s4;
		expected[1] = s2;
		expected[2] = s1;
		expected[3] = s3;
		expected[4] = s5;
		Shape.compareType = "base area";
		Sorting.quickSort(arr);
		assertArrayEquals(expected, arr);
	}

	@Test
	public void testSelectionSortDoubles() {
		double[] arr = { 3.0, 1.0, 4.0, 2.0, 5.0 };
		double[] expected = { 1.0, 2.0, 3.0, 4.0, 5.0 };
		Sorting.selectionSort(arr);
		assertArrayEquals(expected, arr, 0.0);
	}

	@Test
	public void testSelectionSortShapesHeight() {
		Shape[] arr = new Shape[5];
		Shape[] expected = new Shape[5];
		Shape s1 = new TriangularPrism(3.0, 3.0);
		Shape s2 = new Cone(1.0, 1.0);
		Shape s3 = new Cylinder(4.0, 4.0);
		Shape s4 = new TriangularPrism(2.0, 2.0);
		Shape s5 = new OctagonalPrism(5.0, 5.0);
		arr[0] = s1;
		arr[1] = s2;
		arr[2] = s3;
		arr[3] = s4;
		arr[4] = s5;
		expected[0] = s2;
		expected[1] = s4;
		expected[2] = s1;
		expected[3] = s3;
		expected[4] = s5;
		Shape.compareType = "height";
		Sorting.selectionSort(arr);
		assertArrayEquals(expected, arr);
	}

	@Test
	public void testSelectionSortShapesVolume() {
		Shape[] arr = new Shape[5];
		Shape[] expected = new Shape[5];
		Shape s1 = new TriangularPrism(3.0, 3.0);
		Shape s2 = new Cone(1.0, 1.0);
		Shape s3 = new Cylinder(4.0, 4.0);
		Shape s4 = new TriangularPrism(2.0, 2.0);
		Shape s5 = new OctagonalPrism(5.0, 5.0);
		arr[0] = s1;
		arr[1] = s2;
		arr[2] = s3;
		arr[3] = s4;
		arr[4] = s5;
		expected[0] = s2;
		expected[1] = s4;
		expected[2] = s1;
		expected[3] = s3;
		expected[4] = s5;
		Shape.compareType = "volume";
		Sorting.selectionSort(arr);
		assertArrayEquals(expected, arr);
	}

	@Test
	public void testSelectionSortShapesBaseArea() {
		Shape[] arr = new Shape[5];
		Shape[] expected = new Shape[5];
		Shape s1 = new TriangularPrism(3.0, 3.0);
		Shape s2 = new Cone(1.0, 1.0);
		Shape s3 = new Cylinder(4.0, 4.0);
		Shape s4 = new TriangularPrism(2.0, 2.0);
		Shape s5 = new OctagonalPrism(5.0, 5.0);
		arr[0] = s1;
		arr[1] = s2;
		arr[2] = s3;
		arr[3] = s4;
		arr[4] = s5;
		expected[0] = s4;
		expected[1] = s2;
		expected[2] = s1;
		expected[3] = s3;
		expected[4] = s5;
		Shape.compareType = "base area";
		Sorting.selectionSort(arr);
		assertArrayEquals(expected, arr);
	}

	@Test
	public void testMergeSortDoubles() {
		double[] arr = { 38, 27, 43, 3, 9, 82, 10 };
		double[] expected = { 3, 9, 10, 27, 38, 43, 82 };
		Sorting.mergeSort(arr);
		assertArrayEquals(expected, arr, 0.0);
	}

	@Test
	public void testMergeSortShapesHeight() {
		Shape[] arr = new Shape[5];
		Shape[] expected = new Shape[5];
		Shape s1 = new TriangularPrism(3.0, 3.0);
		Shape s2 = new Cone(1.0, 1.0);
		Shape s3 = new Cylinder(4.0, 4.0);
		Shape s4 = new TriangularPrism(2.0, 2.0);
		Shape s5 = new OctagonalPrism(5.0, 5.0);
		arr[0] = s1;
		arr[1] = s2;
		arr[2] = s3;
		arr[3] = s4;
		arr[4] = s5;
		expected[0] = s2;
		expected[1] = s4;
		expected[2] = s1;
		expected[3] = s3;
		expected[4] = s5;
		Shape.compareType = "height";
		Sorting.mergeSort(arr);
		assertArrayEquals(expected, arr);
	}

	@Test
	public void testMergeSortShapesVolume() {
		Shape[] arr = new Shape[5];
		Shape[] expected = new Shape[5];
		Shape s1 = new TriangularPrism(3.0, 3.0);
		Shape s2 = new Cone(1.0, 1.0);
		Shape s3 = new Cylinder(4.0, 4.0);
		Shape s4 = new TriangularPrism(2.0, 2.0);
		Shape s5 = new OctagonalPrism(5.0, 5.0);
		arr[0] = s1;
		arr[1] = s2;
		arr[2] = s3;
		arr[3] = s4;
		arr[4] = s5;
		expected[0] = s2;
		expected[1] = s4;
		expected[2] = s1;
		expected[3] = s3;
		expected[4] = s5;
		Shape.compareType = "volume";
		Sorting.mergeSort(arr);
		assertArrayEquals(expected, arr);
	}

	@Test
	public void testMergeSortShapesBaseArea() {
		Shape[] arr = new Shape[5];
		Shape[] expected = new Shape[5];
		Shape s1 = new TriangularPrism(3.0, 3.0);
		Shape s2 = new Cone(1.0, 1.0);
		Shape s3 = new Cylinder(4.0, 4.0);
		Shape s4 = new TriangularPrism(2.0, 2.0);
		Shape s5 = new OctagonalPrism(5.0, 5.0);
		arr[0] = s1;
		arr[1] = s2;
		arr[2] = s3;
		arr[3] = s4;
		arr[4] = s5;
		expected[0] = s4;
		expected[1] = s2;
		expected[2] = s1;
		expected[3] = s3;
		expected[4] = s5;
		Shape.compareType = "base area";
		Sorting.mergeSort(arr);
		assertArrayEquals(expected, arr);
	}

	@Test
	public void testInsertionSortDoubles() {
		double[] arr = { 3.0, 1.0, 4.0, 2.0, 5.0 };
		double[] expected = { 1.0, 2.0, 3.0, 4.0, 5.0 };
		Sorting.insertionSort(arr);
		assertArrayEquals(expected, arr, 0.0);
	}

	@Test
	public void testInsertionSortShapesHeight() {
		Shape[] arr = new Shape[5];
		Shape[] expected = new Shape[5];
		Shape s1 = new TriangularPrism(3.0, 3.0);
		Shape s2 = new Cone(1.0, 1.0);
		Shape s3 = new Cylinder(4.0, 4.0);
		Shape s4 = new TriangularPrism(2.0, 2.0);
		Shape s5 = new OctagonalPrism(5.0, 5.0);
		arr[0] = s1;
		arr[1] = s2;
		arr[2] = s3;
		arr[3] = s4;
		arr[4] = s5;
		expected[0] = s2;
		expected[1] = s4;
		expected[2] = s1;
		expected[3] = s3;
		expected[4] = s5;
		Shape.compareType = "height";
		Sorting.insertionSort(arr);
		assertArrayEquals(expected, arr);
	}

	@Test
	public void testInsertionSortShapesBaseArea() {
		Shape[] arr = new Shape[5];
		Shape[] expected = new Shape[5];
		Shape s1 = new TriangularPrism(3.0, 3.0);
		Shape s2 = new Cone(1.0, 1.0);
		Shape s3 = new Cylinder(4.0, 4.0);
		Shape s4 = new TriangularPrism(2.0, 2.0);
		Shape s5 = new OctagonalPrism(5.0, 5.0);
		arr[0] = s1;
		arr[1] = s2;
		arr[2] = s3;
		arr[3] = s4;
		arr[4] = s5;
		expected[0] = s2;
		expected[1] = s4;
		expected[2] = s1;
		expected[3] = s3;
		expected[4] = s5;
		Shape.compareType = "base area";
		Sorting.insertionSort(arr);
		assertArrayEquals(expected, arr);
	}

	@Test
	public void testInsertionSortShapesVolume() {
		Shape[] arr = new Shape[5];
		Shape[] expected = new Shape[5];
		Shape s1 = new TriangularPrism(3.0, 3.0);
		Shape s2 = new Cone(1.0, 1.0);
		Shape s3 = new Cylinder(4.0, 4.0);
		Shape s4 = new TriangularPrism(2.0, 2.0);
		Shape s5 = new OctagonalPrism(5.0, 5.0);
		arr[0] = s1;
		arr[1] = s2;
		arr[2] = s3;
		arr[3] = s4;
		arr[4] = s5;
		expected[0] = s2;
		expected[1] = s4;
		expected[2] = s1;
		expected[3] = s3;
		expected[4] = s5;
		Shape.compareType = "volume";
		Sorting.insertionSort(arr);
		assertArrayEquals(expected, arr);
	}

	@Test
	public void testRadixSortDoubles() {
		double[] arr = { 3.0, 1.0, 4.0, 2.0, 5.0 };
		double[] expected = { 1.0, 2.0, 3.0, 4.0, 5.0 };
		Sorting.radixSort(arr);
		assertArrayEquals(expected, arr, 0.0);
	}

	@Test
	public void testRadixSortShapesHeight() {
		Shape[] arr = new Shape[5];
		Shape[] expected = new Shape[5];
		Shape s1 = new TriangularPrism(3.0, 3.0);
		Shape s2 = new Cone(1.0, 1.0);
		Shape s3 = new Cylinder(4.0, 4.0);
		Shape s4 = new TriangularPrism(2.0, 2.0);
		Shape s5 = new OctagonalPrism(5.0, 5.0);
		arr[0] = s1;
		arr[1] = s2;
		arr[2] = s3;
		arr[3] = s4;
		arr[4] = s5;
		expected[0] = s2;
		expected[1] = s4;
		expected[2] = s1;
		expected[3] = s3;
		expected[4] = s5;
		Shape.compareType = "height";
		Sorting.radixSort(arr);
		assertArrayEquals(expected, arr);
	}

	@Test
	public void testRadixSortShapesBaseArea() {
		Shape[] arr = new Shape[5];
		Shape[] expected = new Shape[5];
		Shape s1 = new TriangularPrism(3.0, 3.0);
		Shape s2 = new Cone(1.0, 1.0);
		Shape s3 = new Cylinder(4.0, 4.0);
		Shape s4 = new TriangularPrism(2.0, 2.0);
		Shape s5 = new OctagonalPrism(5.0, 5.0);
		arr[0] = s1;
		arr[1] = s2;
		arr[2] = s3;
		arr[3] = s4;
		arr[4] = s5;
		expected[0] = s2;
		expected[1] = s4;
		expected[2] = s1;
		expected[3] = s3;
		expected[4] = s5;
		Shape.compareType = "base area";
		Sorting.radixSort(arr);
		assertArrayEquals(expected, arr);
	}

	@Test
	public void testRadixSortShapesVolume() {
		Shape[] arr = new Shape[5];
		Shape[] expected = new Shape[5];
		Shape s1 = new TriangularPrism(3.0, 3.0);
		Shape s2 = new Cone(1.0, 1.0);
		Shape s3 = new Cylinder(4.0, 4.0);
		Shape s4 = new TriangularPrism(2.0, 2.0);
		Shape s5 = new OctagonalPrism(5.0, 5.0);
		arr[0] = s1;
		arr[1] = s2;
		arr[2] = s3;
		arr[3] = s4;
		arr[4] = s5;
		expected[0] = s2;
		expected[1] = s4;
		expected[2] = s1;
		expected[3] = s3;
		expected[4] = s5;
		Shape.compareType = "volume";
		Sorting.radixSort(arr);
		assertArrayEquals(expected, arr);
	}

}
