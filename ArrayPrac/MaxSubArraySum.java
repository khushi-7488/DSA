package ArrayPrac;

public class MaxSubArraySum {
    public static void maxSum(int arr[]) {
        int count = 0;
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                count = 0;
                for (int j2 = i; j2 <= j; j2++) {
                    System.out.print(arr[j2] + " ");
                    count += arr[j2];
                }
                if (count > max_sum) {
                    max_sum = count;
                }
                System.out.println("count is" + count);
            }
            System.out.println("max sum is " + max_sum);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        maxSum(arr);
    }
}
