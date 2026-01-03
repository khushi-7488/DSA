package BitManipulation;

public class PowerOfTwoOrNot {
    public static boolean powerOfTwoOrNot(int n) {
        return (n & (n-1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println(powerOfTwoOrNot(0));
    }
}
