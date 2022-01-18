package search;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSortIndex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter number of values - ");

        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Please enter, enter separated values: ");

        for (int i = 0; i < size; i++) {
            int num = sc.nextInt();

            arr[i] = num;
        }

        QuickSort quickSort = new QuickSort();
        quickSort.sort(arr);

        Arrays.stream(arr).forEach(System.out::println);
    }
}
