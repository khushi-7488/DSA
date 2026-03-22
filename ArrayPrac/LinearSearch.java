package ArrayPrac;

public class LinearSearch {

    public static int linear(int arr[], int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 6, 5, 9, 7 };
        System.out.println(linear(arr, 8));
    }
}
