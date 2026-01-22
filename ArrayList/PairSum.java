package ArrayList;

import java.util.ArrayList;

public class PairSum {
    public static void pairSum(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == 5) {
                    System.out.println(list.get(i) + "," + list.get(j));
                }
            }
        }
    }

    // 2 pointer approach
    public static void sum(ArrayList<Integer> list, int target) {
        int i = 0;
        int j = list.size() - 1;
        while (i < j) {
            if (list.get(i) + list.get(j) == target) {
                System.out.println(list.get(i) + "," + list.get(j));
                i++;
            } else if (list.get(i) + list.get(j) < target) {
                i++;
            } else {
                j--;
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        sum(list, 5);
    }
}
