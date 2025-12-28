public class Assignment1 {
    public static boolean arr(int num[]) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                if (num[i] == num[j])
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int num[] = { 1, 2, 1 };
        System.out.println(arr(num));
    }
}
