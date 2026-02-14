package greedyAlgorithm;

import java.util.*;

public class IndianCoins {
    public static void main(String[] args) {
        Integer coins[] = { 2000, 500, 100, 50, 20, 10, 5, 2, 1 };
        // Integer coins[] = { 1, 2, 5 };
        int amount = 590;
        int count = 0;

        Arrays.sort(coins, Comparator.reverseOrder());

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < coins.length; i++) {
            if (coins[i] < amount) {
                while (amount >= coins[i]) {
                    count++;
                    ans.add(coins[i]);
                    amount = amount - coins[i];
                }
            }
        }
        System.out.println(count);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
}