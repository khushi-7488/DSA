package Recursion;

public class Power {
    public static int calcPow(int n, int y) {
        if(y == 1){
            return n;
        }
        return n * calcPow(n, y-1);
    }

    public static void main(String[] args) {
      System.out.println(calcPow(2, 5));  
    }
}
