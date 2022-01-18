package sort;

public class MergeSort implements Sort {

    @Override
    public void sort(int[] arr) {
        mergeSortNow(arr, 0, arr.length - 1);
    }

    private static void mergeSortNow(int[] arr, int startIndex, int endIndex) {

        if (startIndex >= endIndex) {
            return;
        }

        int mid = ((endIndex - startIndex) / 2) + startIndex;

        mergeSortNow(arr, startIndex, mid);
        mergeSortNow(arr, mid + 1, endIndex);

        merge(arr, startIndex, mid, endIndex);
    }

    private static void merge(int[] arr, int startIndex, int mid, int endIndex) {

        int[] temp = new int[endIndex - startIndex + 1];

        int i = startIndex;
        int j = mid + 1;
        int z = 0;

        while (i <= mid && j <= endIndex) {

            if (arr[i] < arr[j]) {
                temp[z++] = arr[i++];
            } else {
                temp[z++] = arr[j++];
            }
        }

        for (; i <= mid; i++) {
            temp[z++] = arr[i];
        }

        for (; j <= endIndex; j++) {
            temp[z++] = arr[j];
        }

        for (int k = 0; k < temp.length; k++) {
            arr[startIndex + k] = temp[k];
        }
    }
}
