package RecursionPrac;

public class CheckSortedArr {
    public static boolean sorted(int i, int arr[]) {
        if (arr.length - 1 == i) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return sorted(i + 1, arr);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(sorted(0, arr));
    }
}
