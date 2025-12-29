package Sorting;

public class Bubble {
    public static void BubbleSort(int num[]) {
        int n = num.length - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                if (num[j] > num[j+1]) {
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }

    public static void main(String[] args) {
        int num[] = { 3, 5, 2, 6, 1,4,10,14 };
        BubbleSort(num);
    }
}