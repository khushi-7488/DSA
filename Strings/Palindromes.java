package Strings;

public class Palindromes {

    public static boolean isPalindrome(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        if (str.equals(reverse)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "carfac";
        str = str.toLowerCase();
        System.out.println(isPalindrome(str));
    }
}
