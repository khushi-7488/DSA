package Recursion;

public class BinaryString {
    public static void printStr(int n, String newStr, int lastBit) {
        if (n == 0) {
            System.out.println(newStr);
            return;
        }

        printStr(n - 1, newStr + "0", 0);

        if (lastBit == 0) {
            printStr(n - 1, newStr + "1", 1);
        }
    }

    public static void main(String[] args) {

        printStr(3, "", 0);
    }
}