package RecursionPrac;

public class Factorial {
    public static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        int a = fact(n - 1);
        int b = n * a;
        return b;
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
