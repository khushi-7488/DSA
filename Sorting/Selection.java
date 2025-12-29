package Sorting;

public class Selection {
    public static void SelectionSort(int num[]) {
        for (int i = 0; i < num.length; i++) {
            int min = i;
            for (int j = i + 1; j < num.length; j++) {
                if (num[j] > num[min]) {
                    min = j;
                }
            }
            int temp = num[min];
            num[min] = num[i];
            num[i] = temp;
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }

    public static void main(String[] args) {
        int num[] = { 5, 4, 1, 2, 3 };
        SelectionSort(num);
    }
}
