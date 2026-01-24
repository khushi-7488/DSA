package Strings;

public class Palindrome {
    public static boolean palindrome(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
          reverse += str.charAt(i);
        }
        if(str.equals(reverse)){
            return true;
        }
        return false;
    }

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String str = "racecar";
        str = str.toLowerCase();
        System.out.println(palindrome(str));
    }
}
