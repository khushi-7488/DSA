package Recursion;

public class Tiling {

    public static int tiling(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int vtcl = tiling(n - 1);
        int hrzntl = tiling(n - 2);
        return vtcl + hrzntl;
    }

    public static void main(String[] args) {
        System.out.println(tiling(5));
    }
}
