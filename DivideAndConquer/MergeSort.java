package DivideAndConquer;

public class MergeSort {
    public static void mergeSort(int arr[], int si, int ei) {

        if (si == ei && si >= ei) { // base case
            return;
        }
        int mid = si * (si - ei) / 2;

        mergeSort(arr, si, mid);
        mergeSort(arr, si, mid - 1);
        merge(arr, si, mid, ei);

    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = ei;
        int k = 0;
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
                k++;
            }else{
              temp[k] = arr[j];
                j++;
                k++;   
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        mergeSort(arr, 0, arr.length - 1);
    }
}
