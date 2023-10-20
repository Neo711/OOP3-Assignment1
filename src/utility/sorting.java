package utility;

public class Sorting {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        int i = 0;
        int j = 0;
        for (i = 0; i < n; i++) {
            for (j = 1; j < (n - i); j++) {

                if (arr[j - 1] > arr[j]) {
                    // swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > current) {
                arr[j+1] = arr[j];
                j = j -1;
            }
            arr[j+1] = current;
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            // Recursively sort elements before partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1; // index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // return the index of the pivot
        return i + 1;
    }



    public static void selectionSort(double[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            double temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
    
    
    public static void mergeSort(double[] array) {
        if (array == null || array.length <= 1) {
            return;
        }

        double[] temp = new double[array.length];
        mergeSort(array, temp, 0, array.length - 1);
    }

    private static void mergeSort(double[] array, double[] temp, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(array, temp, left, middle);
            mergeSort(array, temp, middle + 1, right);
            merge(array, temp, left, middle, right);
        }
    }

    private static void merge(double[] array, double[] temp, int left, int middle, int right) {
        System.arraycopy(array, left, temp, left, right - left + 1);

        int i = left;
        int j = middle + 1;
        int k = left;

        while (i <= middle && j <= right) {
            if (temp[i] <= temp[j]) {
                array[k] = temp[i];
                i++;
            } else {
                array[k] = temp[j];
                j++;
            }
            k++;
        }

        while (i <= middle) {
            array[k] = temp[i];
            i++;
            k++;
        }
    }

    
}



