package Backtracking;

public class Subset {
    public static void subset(String str, int idx, String ans) {
        // base case
        if (idx == str.length()) {
            if (str.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }
        // recursion
        // yes choice
        subset(str, idx + 1, ans + str.charAt(idx));
        // no choice
        subset(str, idx + 1, ans);
    }

    public static void main(String[] args) {
        String str = "abc";
        subset(str, 0, " ");
    }
}
