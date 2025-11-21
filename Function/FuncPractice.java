class FuncPractice {
    public static int avg() {
        int a = 10;
        int b = 5;
        int c = (a + b) / 2;
        return c;
    }

    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void palindrome() {
        int number = 121;
        int copy = number;
        int rev = 0;

        while (number != 0) {
            int rem = number % 10;
            rev = rev * 10 + rem;
            number = number / 10;
        }
        if (copy == rev) {
            System.out.println("true");
        } else {
            System.out.println("false");

        }
    }
    public static void main(String[] args) {
        palindrome();
    }

    // public static void main(String[] args) {
    // System.out.println(isEven(6));
    // }

    // public static void main(String args[]) {
    // int res = avg();
    // System.out.println(res);

    // }
}
