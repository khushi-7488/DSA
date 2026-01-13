package Recursion;

public class TowerOfHanoi {
    public static void print(int n, String aSrc, String bHelper, String cDest) {
        if (n == 1) {
            System.out.println(aSrc + " to " + cDest);
            return;
        }
        print(n - 1, aSrc, cDest, bHelper);
        System.out.println(aSrc + " to " + cDest);
        print(n - 1, bHelper, aSrc, cDest );
    }

    public static void main(String[] args) {
        print(3, "a", "b", "c");
    }
}
