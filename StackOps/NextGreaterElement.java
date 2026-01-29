package StackOps;

import java.util.*;

public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };
        Stack<Integer> s = new Stack<>();
        int nextGreater[] = new int[arr.length];

        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            // step1
            while (!s.isEmpty() && arr[i] >= arr[s.peek()]) {
                s.pop();
            }
            // step2
            if (s.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = arr[s.peek()];
            }
            // step3 push in s
            s.push(i);
        }
        for (int i = 0; i < nextGreater.length; i++) {
            System.out.print(nextGreater[i] + " ");
        }
        System.out.println();
    }
    // next greater right
    // next greater left
    // next smaller left
    // next smaller right
    // in these four condition we have to change only the loop and conditions that
    // means the logic will be same
}
