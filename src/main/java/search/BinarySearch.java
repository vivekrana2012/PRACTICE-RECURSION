package search;

public class BinarySearch {

    public int search(int[] arr, int searchValue) {
        return searchNow(arr, 0, arr.length, searchValue);
    }

    private int searchNow(int[] arr, int low, int high, int searchValue) {

        if (low >= high) {
            return -1;
        }

        int mid = (low + high) / 2;

        if (arr[mid] == searchValue) {
            return arr[mid];
        }

        if (arr[mid] < searchValue) {
            return searchNow(arr, mid + 1, high, searchValue);
        } else {
            return searchNow(arr, low, mid, searchValue);
        }
    }
}
