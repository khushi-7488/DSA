package RecursionPrac;

public class FirstOccurance {

    public static void abc(int i, int arr[], int key) {
        if (i == arr.length - 1) {
            return;
        }
        if (key == arr[i]) {
            System.out.println(i);
        }
        abc(i + 1, arr, key);
    }

    public static int lastOccurance(int i, int arr[], int key) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurance(i + 1, arr, key);
        if (isFound != -1) {
            return isFound;
        }
        if (key == arr[i]) {
            return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 4 };
        System.out.println(lastOccurance(0, arr, 4));
    }
}