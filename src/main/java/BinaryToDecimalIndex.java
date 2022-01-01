import java.util.Scanner;

public class BinaryToDecimalIndex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        System.out.println(number);

        int decimal = findDecimal(number, 1);

        System.out.println(decimal);
    }

    private static int findDecimal(int number, int multiplier) {

        if (number == 0 || number == 1) {
            return number * multiplier;
        }

        return findDecimal(number / 10, multiplier * 2) + ((number % 10) * multiplier);
    }
}
