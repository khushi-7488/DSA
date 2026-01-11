package Recursion;

public class PairingFriends {
    public static int waysPairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        int oneWay = waysPairing(n - 1);
        int twoWay = (n-1) * waysPairing(n - 2);
        return oneWay + twoWay;
    }

    public static void main(String[] args) {
        System.out.println(waysPairing(5));
    }
}
