package RecursionPrac;

public class Fabonacci {

    public static int fab(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int a = fab(n - 1) + fab(n - 2);
        return a;
    }

    public static void main(String[] args) {
        System.out.println(fab(5));
    }
}
