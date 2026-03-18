public class Largest {

    // second largest
    public static void largest(int arr[]) {
        int max = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                sec = max;
                max = arr[i];
            } else if (arr[i] > sec && arr[i] != max) {
                sec = arr[i];
            }
        }
        System.out.println(sec);
    }

    public static void main() {
        int arr[] = { 1, 4, 3, 7 };
        largest(arr);
    }
}
