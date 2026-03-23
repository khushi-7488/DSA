package SortingPrac;

public class Bubble {
    public static void sorting(int arr[]) {
        int n = arr.length - 1;
        for (int i = 0; i < n; i++) {
            int swap = 0;
            for (int j = 0; j < n - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }
            if (swap == 0) {
                System.out.println("sorted");
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 4, 9, 7, 1 };
        sorting(arr);
    }
}