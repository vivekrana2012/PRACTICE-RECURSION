import java.util.Scanner;

public class SumNaturalIndex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        System.out.println(number);

        int sum = sum(number);

        System.out.println(sum);
    }

    private static int sum(int number) {

        if (number == 1) {
            return 1;
        }

        return sum(number - 1) + number;
    }
}
