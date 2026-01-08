package Recursion;

public class Fabonacci {
    public static int calcFab(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int first = calcFab(n - 1);
        int sec = calcFab(n - 2);
        return first + sec;
    }

    public static void main(String[] args) {
        System.out.println(calcFab(30));
    }
}
