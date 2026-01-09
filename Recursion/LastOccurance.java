package Recursion;

public class LastOccurance {
    public static int occurance(int arr[], int i, int key) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = occurance(arr, i + 1, key);
        if (arr[i] == key && isFound == -1) {
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 2, 5 };
        System.out.println(occurance(arr, 0, 2));
    }
}
