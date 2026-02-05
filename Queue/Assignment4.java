package Queue;

import java.util.*;

public class Assignment4 {

   public static void reverseFirstKElements(Queue<Integer> q, int k) {
        if (q.isEmpty() || k > q.size() || k <= 0) return;

        Stack<Integer> s = new Stack<>();

        // 1. Push first k elements into stack
        for (int i = 0; i < k; i++) {
            s.push(q.remove());
        }

        // 2. Add them back to the queue (they are now reversed)
        while (!s.isEmpty()) {
            q.add(s.pop());
        }

        // 3. Move the remaining (size - k) elements to the back
        int remaining = q.size() - k;
        for (int i = 0; i < remaining; i++) {
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100));
        int k = 5;

        reverseFirstKElements(q, k);

        // Result: 50 40 30 20 10 60 70 80 90 100
        System.out.println(q);
    
}
}
