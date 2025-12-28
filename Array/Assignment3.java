public class Assignment3 {
    public static void threeSum(int num[]) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                for (int k = j + 1; k < num.length; k++) {
                    if (num[i] + num[j] + num[k] == 0) {
                        // if (num[i] != num[j] && num[j] != num[k] && num[i] != num[k]) {
                        System.out.println("(" + num[i] + "," + num[j] + "," + num[k] + ")");
                    }
                }
            }
        }
        // }
    }

    public static void main(String[] args) {
        int num[] = { -1, 0, 1, 2, -1, -4 };
        threeSum(num);
    }
}