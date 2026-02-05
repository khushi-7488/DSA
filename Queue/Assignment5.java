package Queue;

import java.util.*;

public class Assignment5 {
    public static void printMax(int[] arr, int n, int k) {
        // Deque to store indices of useful elements
        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            // 1. Remove elements out of this window
            if (!dq.isEmpty() && dq.peek() == i - k) {
                dq.poll();
            }

            // 2. Remove smaller elements from back (they are useless)
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.removeLast();
            }

            // 3. Add current element's index
            dq.addLast(i);

            // 4. Print max (starts after the first window is full)
            if (i >= k - 1) {
                System.out.print(arr[dq.peek()] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int k = 3;
        int n = arr.length;
        
        System.out.print("Maximum of all subarrays of size " + k + ": ");
        printMax(arr, n, k);
    }
}
