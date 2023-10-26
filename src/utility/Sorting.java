package utility;

import shapes.Shape;

public class Sorting {

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

    public static void bubbleSort(Shape[] arr) {
        int n = arr.length;
        Shape temp;
        int i = 0;
        int j = 0;
        for (i = 0; i < n; i++) {
            for (j = 1; j < (n - i); j++) {
                boolean swap = false;
                if (Shape.compareType == "height") {
                    if (arr[j - 1].getHeight() > arr[j].getHeight()) {
                        swap = true;
                    }
                } else if (Shape.compareType == "volume") {
                    if (arr[j - 1].calcVolume() > arr[j].calcVolume()) {
                        swap = true;
                    }
                } else if (Shape.compareType == "base area") {
                    if (arr[j - 1].calcBaseArea() > arr[j].calcBaseArea()) {
                        swap = true;
                    }
                }
                if (swap == true) {
                    // swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void quickSort(double[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    public static void quickSort(Shape[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    public static void quickSort(double[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            // Recursively sort elements before partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void quickSort(Shape[] arr, int low, int high) {
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

    public static int partition(Shape[] arr, int low, int high) {
        Shape pivot = arr[high];
        int i = low - 1; // index of smaller element

        for (int j = low; j < high; j++) {
            boolean swap = false;
            if (Shape.compareType == "height") {
                if (arr[j].getHeight() <= pivot.getHeight()) {
                    swap = true;
                }
            } else if (Shape.compareType == "volume") {
                if (arr[j].calcVolume() <= pivot.calcVolume()) {
                    swap = true;
                }
            } else if (Shape.compareType == "base area") {
                if (arr[j].calcBaseArea() <= pivot.calcBaseArea()) {
                    swap = true;
                }
            }
            if (swap == true) {
                i++;
                // swap arr[i] and arr[j]
                Shape temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        Shape temp = arr[i + 1];
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

    public static void selectionSort(Shape[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (Shape.compareType == "height") {
                    if (arr[j].getHeight() < arr[minIdx].getHeight()) {
                        minIdx = j;
                    }
                } else if (Shape.compareType == "volume") {
                    if (arr[j].calcVolume() < arr[minIdx].calcVolume()) {
                        minIdx = j;
                    }
                } else if (Shape.compareType == "base area") {
                    if (arr[j].calcBaseArea() < arr[minIdx].calcBaseArea()) {
                        minIdx = j;
                    }
                }
            }
            Shape temp = arr[minIdx];
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

    public static void mergeSort(Shape[] array) {
        if (array == null || array.length <= 1) {
            return;
        }

        Shape[] temp = new Shape[array.length];
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

    private static void mergeSort(Shape[] array, Shape[] temp, int left, int right) {
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

    private static void merge(Shape[] array, Shape[] temp, int left, int middle, int right) {
        System.arraycopy(array, left, temp, left, right - left + 1);

        int i = left;
        int j = middle + 1;
        int k = left;

        while (i <= middle && j <= right) {
            if (Shape.compareType == "height") {
                if (temp[i].getHeight() <= temp[j].getHeight()) {
                    array[k] = temp[i];
                    i++;
                } else {
                    array[k] = temp[j];
                    j++;
                }
                k++;
            } else if (Shape.compareType == "volume") {
                if (temp[i].calcVolume() <= temp[j].calcVolume()) {
                    array[k] = temp[i];
                    i++;
                } else {
                    array[k] = temp[j];
                    j++;
                }
                k++;
            } else if (Shape.compareType == "base area") {
                if (temp[i].calcBaseArea() <= temp[j].calcBaseArea()) {
                    array[k] = temp[i];
                    i++;
                } else {
                    array[k] = temp[j];
                    j++;
                }
                k++;
            }
        }
        while (i <= middle) {
            array[k] = temp[i];
            i++;
            k++;
        }
    }
}
