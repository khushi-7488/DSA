package Recursion;

public class PrintIncreasing {
    public static void increasingNum(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        increasingNum(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        increasingNum(5);
    }
}
