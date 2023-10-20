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
}
