package ArrayList;

import java.util.ArrayList;

public class Assignment1 {
    public static boolean monotonic(ArrayList<Integer> list) {
        int i = 0;
        boolean increasing = true;
        boolean decreasing = true;
        while (i < list.size() - 1) {
            if (list.get(i) > list.get(i + 1)) {
                increasing = false;
            }
            if (list.get(i) < list.get(i + 1)) {
                decreasing = false;
            }
            i++;
        }
        return increasing || decreasing;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(monotonic(list));
    }

}
