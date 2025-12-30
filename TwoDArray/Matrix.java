package TwoDArray;

import java.util.*;

public class Matrix {
    public static void Search(int arr[][], int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == key) {
                    System.out.println("row is " + i + " column is " + j);
                } else {
                    System.out.println("not found");
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int m = 3;
        System.out.println("enter the number");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter the number you are searching for");
        int key = sc.nextInt();
        Search(arr, key);
    }
}
