package ArrayPrac;

public class BuyAndSell {
    public static int stock(int arr[]) {
        int Buying = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (Buying < arr[i]) {
                int profit = arr[i] - Buying; // today's profit
                maxProfit = Math.max(profit, maxProfit);
            } else {
                Buying = arr[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(stock(arr));
    }
}
