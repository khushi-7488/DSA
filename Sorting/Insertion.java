package Sorting;

public class Insertion {
    public static void InsertionSort(int num[]) {

        int n = num.length;
        for (int i = 1; i < n ; i++) {
            int curr = num[i];
            int prev = i - 1;
            while (prev >= 0 && num[prev] > curr) {
                num[prev + 1] = num[prev];
                prev--;
            }
            num[prev + 1] = curr;
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }

    public static void main(String[] args) {
        int num[] = { 3, 5, 2, 1, 4 };
        InsertionSort(num);
    }
}
