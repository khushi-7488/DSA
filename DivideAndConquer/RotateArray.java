package DivideAndConquer;

public class RotateArray {
    public static int rotate(int arr[], int si, int ei, int key) {
        if (si > ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2;
        if (arr[mid] == key) {
            return mid;
        }
        if (arr[si] <= arr[mid]) {
            if (arr[si] <= key && key < arr[mid]) {
                return rotate(arr, si, mid - 1, key);
            } else {
                return rotate(arr, mid + 1, ei, key);
            }
        } else {
            if (arr[mid] <= key && key <= arr[ei]) {
                return rotate(arr, mid + 1, ei, key);
            } else {
                return rotate(arr, si, mid - 1, key);

            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 7, 0, 1, 2 };
        int res = rotate(arr, 0, arr.length - 1, 2);
        System.out.println(res);
    }
}
