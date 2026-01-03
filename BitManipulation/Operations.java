package BitManipulation;

public class Operations {
    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }
    public static int clearRangeOfBit(int n, int i, int j) {
        int a = ((~0) << (j+1));
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static void main(String[] args) {
        // System.err.println(getIthBit(5, 3));
        // System.err.println(clearIthBit(15, 2));
        System.err.println(clearRangeOfBit(10, 2,4));
        // System.err.println(setIthBit(15, 2));
        
    }
}
