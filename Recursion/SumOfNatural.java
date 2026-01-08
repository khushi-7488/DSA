package Recursion;

public class SumOfNatural {
    public static int sumOfNatural(int n){
            if (n == 1) {
            return 1;
        }
        return n + sumOfNatural(n-1);
    }
    public static void main(String[] args) {
      System.out.println(sumOfNatural(5));  
    }
}
