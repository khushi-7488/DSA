package Backtracking;

public class Permutation {
    public static void arrangement(String str, String res) {
        if (str.length() == 0) {
            System.out.println(res + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            arrangement(remaining, res + ch);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        arrangement(str, "");
    }
}
