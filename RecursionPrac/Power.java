package RecursionPrac;

public class Power {
    public static int pow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int a = pow(x, n - 1);
        int b = x * a;
        return b;
    }

    public static void main(String[] args) {
        System.out.println(pow(2, 10));
    }
}
