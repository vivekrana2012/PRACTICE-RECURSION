import java.util.Scanner;

public class DecimalToBinaryIndex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(str);

        String binaryString = printBinary(str);

        System.out.println(binaryString);
    }

    private static String printBinary(String str) {

        int number = Integer.parseInt(str);

        if (number == 0) {
            return "";
        }

        return printBinary((number / 2) + "") + number % 2;
    }
}
