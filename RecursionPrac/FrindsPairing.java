package RecursionPrac;

public class FrindsPairing {
    public static int pair(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        int single = pair(n - 1);
        int pairs = pair(n - 2);
        int pairways = single * pairs;

        int total = single + pairways;
        return total;
    }

    public static void main(String[] args) {
        System.out.println(pair(3));
    }
}
