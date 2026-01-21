package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Swap {
    public static void swap(ArrayList<Integer> list, int i, int j) {
        int temp = list.get(i);

        list.set(i, list.get(j));
        list.set(j, temp);
        System.out.println(list);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        System.out.println(list);
        swap(list, 1, 3);
        System.out.println(list);

    }
}
