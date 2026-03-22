package ArrayPrac;

public class BinarySearch {

    public static int binary(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            int mid = (start + end) / 2;
            if (key == arr[mid]) {
                return mid;
            } else if (key > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6, 7, 8, 9, 12, 14 };
        System.out.println(binary(arr, 7));
    }
}
