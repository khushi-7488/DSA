package Recursion;

public class fabonaccis {
    public static int fabo(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        int first = fabo(n - 1);
        int sec = fabo(n - 2);

        return first + sec;
    }

    public static void main(String[] args) {
        System.out.println(fabo(4));
    }
}
