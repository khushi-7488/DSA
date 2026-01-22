package ArrayList;

public class Repeation {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        int arr2 = arr.length * 2;

        for (int i = 0; i < arr2; i++) {
            System.out.print(arr[i % arr.length]);
        }
    }
}
