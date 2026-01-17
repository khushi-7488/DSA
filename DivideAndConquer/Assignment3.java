package DivideAndConquer;

public class Assignment3 {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int inversion(int arr[], int si, int ei) {

        int inversionCount = 0;
        if (ei > si) {
            int mid = si + (ei - si) / 2;
            inversionCount = inversion(arr, si, mid); // left
            inversionCount += inversion(arr, mid + 1, ei); // right
            inversionCount += merge(arr, si, ei, mid);
        }
        return inversionCount;
    }

    public static int getInversion(int arr[]) {
        int n = arr.length;
        return inversion(arr, 0, n - 1);
    }

    public static int merge(int arr[], int si, int ei, int mid) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid;
        int k = 0;
        int inversionCount = 0;

        while (i < mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
                k++;
            } else {
                temp[k] = arr[j];
                inversionCount += (mid - i);
                j++;
                k++;
            }
        }
        while (i < mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
        return inversionCount;
    }

    public static void main(String[] args) {
        int arr[] = { 2,4,1,3,5 };
        System.out.println(getInversion(arr));

    }
}
