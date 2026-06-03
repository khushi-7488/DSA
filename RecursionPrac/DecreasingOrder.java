package RecursionPrac;

public class DecreasingOrder {
    public static void decrese(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        decrese(n - 1);
    }

    public static void inc(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        inc(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        // decrese(10);
        inc(10);
    }
}