package Recursion;

public class CalcPower {
    public static int CalcPower(int x, int y) {
        if(y == 0){
            return 1;
        }
        int halfPwr = CalcPower(x, y / 2);
        int halfPowerSq = halfPwr * halfPwr;
        if (y % 2 != 0){
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }

    public static void main(String[] args) {
      System.out.println(CalcPower(2, 7));    
    }
}
