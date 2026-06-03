package RecursionPrac;

public class DecreasingOrder {
    public static void decrese(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        decrese(n - 1);
    }

    public static void main(String[] args) {
        decrese(10);
    }
}