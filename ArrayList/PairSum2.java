package ArrayList;

import java.util.ArrayList;

public class PairSum2 {
    // 2 pointer approach
    public static void pairSum2(ArrayList<Integer> list, int target) {
        int pivot = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                pivot = i;
                break;
            }
        }
        int lp = pivot + 1;
        int rp = pivot;
        int n = list.size();

        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {
                System.out.println(list.get(lp) + "," + list.get(rp));
                lp = (lp + 1) % n;
            } else if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (n + rp - 1) % n;
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(12);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        pairSum2(list, 16);
    }
}
