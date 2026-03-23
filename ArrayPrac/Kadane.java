package ArrayPrac;

public class Kadane {
    public static void kadane(int arr[]) {
        int max = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (currSum < 0) {
                currSum = 0;
            }
            max = Math.max(max, currSum);
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        kadane(arr);
    }
}
