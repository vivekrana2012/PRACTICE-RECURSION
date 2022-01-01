public class StringReverseIndex {

    public static void main(String[] args) {

        String str = "Hello World";

        System.out.println(str);

        String reverse = reverseString(str);

        System.out.println(reverse);
    }

    private static String reverseString(String str) {

        if (str == null || str.isEmpty()) {
            return str;
        }

        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
