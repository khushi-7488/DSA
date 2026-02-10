package greedyAlgorithm;

import java.util.Arrays;

public class MinimumSumAbloluteDiffPairs {
    public static void main(String[] args) {
        int a[] = { 1, 7, 5 };
        int b[] = { 2, 3, 5 };

        Arrays.sort(a);
        Arrays.sort(b);

        int minDiff = 0;
        for (int i = 0; i < a.length; i++) {
            minDiff += Math.abs(a[i] - b[i]);
        }
        System.out.println(minDiff);
    }
}
