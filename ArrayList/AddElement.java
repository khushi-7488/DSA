package ArrayList;

import java.util.*;

public class AddElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        // add element
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(6);

        list.add(1, 0);
        System.out.println(list);

        // get operation
        int ele = list.get(2);
        System.out.println(ele);

        // remove element
        list.remove(2);
        System.out.println(list);

        // set element at index
        list.set(0, 8);
        System.out.println(list);

        // contains element or not
        boolean a = list.contains(8);
        System.out.println(a);
    }
}
