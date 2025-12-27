public class BuyOrSell {
    public static int profit(int num[]) {
        int sp = Integer.MIN_VALUE;  //sp = selling price
        int bp = Integer.MAX_VALUE;  //bp = buying price
        for (int i = 0; i < num.length; i++) {
            if (sp < num[i]) {
                sp = num[i];
            }
            if (bp > num[i]) {
                bp = num[i];
            }
        }
        if (bp < sp) {
            return sp - bp;
        }
        return 0;
    }

    public static void main(String[] args) {
        int num[] = { 7, 1, 5, 3, 6, 4 };
        int profit = profit(num);
        if (profit == 0) {
            System.out.println("no profit ");
        } else {

            System.out.println(profit);
        }
    }

}
