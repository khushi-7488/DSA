package Queue;

import java.util.*;

public class Assignment1 {
    public static List<String> getBinaryNum(int n) {
        List<String> res = new ArrayList<>();
        Queue<String> q = new LinkedList<>();

        q.add("1");
        for (int i = 1; i <= n; i++) {
            String curr = q.poll();
            res.add(curr);
            q.add(curr + "0");
            q.add(curr + "1");
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(getBinaryNum(4));

    }
}
