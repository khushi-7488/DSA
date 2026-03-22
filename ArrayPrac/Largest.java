package ArrayPrac;

public class Largest {

    public static int largest(int arr[]) {
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 7, 5, 9, 7 };
        System.out.println(largest(arr));
    }
}
