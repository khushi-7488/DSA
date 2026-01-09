package Recursion;

public class FirstOccurance {
    public static int calcFab(int arr[], int i, int key) {
        if (i == arr.length ) {
            return -1;
        }
        if (arr[i] == key) {
           return i ;
        }
        return calcFab(arr, i+1, key);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 2, 5 };
     System.out.println(calcFab(arr, 0, 2));   
    }
}
    