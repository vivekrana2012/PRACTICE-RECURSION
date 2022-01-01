import java.util.Scanner;

public class PalindromeIndex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(str);

        System.out.println("isPalindrome :: " + isPalindrome(str));
    }

    private static boolean isPalindrome(String str) {

        if (str.length() == 1 || str.isEmpty()) {
            return true;
        }

        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return isPalindrome(str.substring(1, str.length() - 1));
        } else {
            return false;
        }
    }
}
