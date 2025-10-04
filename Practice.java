import java.util.Scanner;

class Practice {
    public static void pattern1() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void pattern2(int n) {
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();

        }
    }

    public static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();

        }
    }

    public static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static int calculateSum(int c, int d) {
        int sum = c + d;
        System.out.println(sum);
        return sum;
    }

    public static void swap(int c, int d) {
        int temp = c;
        c = d;
        d = temp;
        System.out.println(c);
        System.out.println(d);
    }

    public static int product(int c, int d) {
        int mul = c * d;
        return mul;
    }

        public static int factorial(int n) {
            int f = 1;
            for(int i=1; i<=n; i++){
                f = f*i;
            }
            return f;
        }

    public static void main(String args[]) {
        System.out.println(factorial(4));
    }
}
