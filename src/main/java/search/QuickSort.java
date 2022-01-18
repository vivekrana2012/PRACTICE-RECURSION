package search;

public class QuickSort {

    public void sort(int[] arr) {
        sortNow(arr, 0, arr.length - 1);
    }

    private void sortNow(int[] arr, int low, int high) {

        if (low >= high) {
            return;
        }

        int p = partition(arr, low, high);

        sortNow(arr, low, p - 1);
        sortNow(arr, p + 1, high);
    }

    private int partition(int[] arr, int low, int high) {

        int exchange = low;

        for (int i = low; i < high; i++) {

            if (arr[high] > arr[i]) {
                swap(arr, exchange++, i);
            }
        }

        swap(arr, exchange, high);

        return exchange;
    }

    private void swap(int[] arr, int index1, int index2) {

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
