package Recursion;

public class CalcPower {
    public static int CalcPow(int x, int y) {
        if(y == 0){
            return 1;
        }
        int halfPwr = CalcPow(x, y / 2);
        int halfPowerSq = halfPwr * halfPwr;
        if (y % 2 != 0){
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }

    public static void main(String[] args) {
      System.out.println(CalcPow(2, 7));    
    }
}
