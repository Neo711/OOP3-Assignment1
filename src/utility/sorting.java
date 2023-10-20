package utility;

public class sorting {

    public static void bubbleSort(double[] arr) {
        int n = arr.length;
        double temp = 0;
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

    public static void quickSort(double[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            // Recursively sort elements before partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(double[] arr, int low, int high) {
        double pivot = arr[high];
        int i = low - 1; // index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;

                // swap arr[i] and arr[j]
                double temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        double temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // return the index of the pivot
        return i + 1;
    }



    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
    

    public class MergeSort {

        // Public method to start the sort
        public static int[] sort(int[] array) {
            if (array == null || array.length <= 1) {
                return array;
            }
            int[] sortedArray = array.clone(); // Clone the array to avoid modifying the original
            mergeSort(sortedArray, 0, sortedArray.length - 1);
            return sortedArray;
        }
    
        private static void mergeSort(int[] arr, int l, int r) {
            if (l < r) {
                int m = l + (r - l) / 2;
                mergeSort(arr, l, m);
                mergeSort(arr, m + 1, r);
                merge(arr, l, m, r);
            }
        }
    
        private static void merge(int[] arr, int l, int m, int r) {
            int n1 = m - l + 1;
            int n2 = r - m;
    
            int[] L = new int[n1];
            int[] R = new int[n2];
    
            System.arraycopy(arr, l, L, 0, n1);
            System.arraycopy(arr, m + 1, R, 0, n2);
    
            int i = 0, j = 0, k = l;
            while (i < n1 && j < n2) {
                if (L[i] <= R[j]) {
                    arr[k++] = L[i++];
                } else {
                    arr[k++] = R[j++];
                }
            }
    
            while (i < n1) {
                arr[k++] = L[i++];
            }
    
            while (j < n2) {
                arr[k++] = R[j++];
            }
        }
    
        public static void main(String[] args) {
            int[] array = {38, 27, 43, 3, 9, 82, 10};
            System.out.println("Given Array:");
            printArray(array);
            
            int[] sortedArray = sort(array);
            
            System.out.println("\nSorted Array:");
            printArray(sortedArray);
        }
    
        private static void printArray(int[] arr) {
            for (int value : arr) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
    

}



