package Recursion;

public class Tiling {

    public static int tiling(int x, int n) {
        if (n == 0 || n == 1) {
          return 1;
        }
      
        int vtcl = tiling(x, n - 1);
        int hrzntl = tiling (x, n-2);
        return vtcl + hrzntl;
    }

    public static void main(String[] args) {
      System.out.println(tiling (2,4));   
    }
}
