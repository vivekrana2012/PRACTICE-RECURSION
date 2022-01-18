package sort;

import java.util.Arrays;
import java.util.Scanner;

public class SortIndex {

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

        Sort sort = new MergeSort();
        sort.sort(arr);

        Arrays.stream(arr).forEach(System.out::println);
    }
}
