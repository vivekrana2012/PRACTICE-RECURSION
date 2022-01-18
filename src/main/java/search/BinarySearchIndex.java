package search;

import java.util.Scanner;

public class BinarySearchIndex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter number of values - ");

        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Please enter, enter separated values: ");

        for (int i = 0; i < size; i++){
            int num = sc.nextInt();

            arr[i] = num;
        }

        System.out.print("Please enter the number to search: ");

        int searchValue = sc.nextInt();

        BinarySearch binarySearch = new BinarySearch();

        int value = binarySearch.search(arr, searchValue);

        if (value == -1){
            System.out.println("Not able to find - " + searchValue);
        } else {
            System.out.println("Got value - " + value);
        }
    }
}
