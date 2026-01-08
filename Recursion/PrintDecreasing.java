package Recursion;

public class PrintDecreasing {
    public static int decreasingNum(int n) {
        System.out.print(n + " ");
        if (n == 1) {
            return 1;
        }
        return decreasingNum(n - 1);
    }

    public static void main(String[] args) {
        decreasingNum(10);
    }
}
