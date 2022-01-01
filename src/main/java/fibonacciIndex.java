import java.util.Scanner;

public class fibonacciIndex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cutOff = sc.nextInt();

        System.out.println(cutOff);

        printFibonacci(0, 1, cutOff);
    }

    private static void printFibonacci(int smallNumber, int largeNumber, int cutOff) {

        int newNumber = smallNumber + largeNumber;

        if (newNumber > cutOff) {
            return;
        }

        System.out.println(newNumber);

        printFibonacci(largeNumber, newNumber, cutOff);
    }
}
