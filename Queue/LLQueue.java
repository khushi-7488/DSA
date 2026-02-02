package Queue;

public class LLQueue {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queque {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        public static void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        // remove
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Empty queque");
                return -1;
            }
            int temp = head.data;
            // single
            if (tail == head) {
                tail = head = null;
            }
            head = head.next;
            return temp;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty queque");
                return -1;
            }
            int temp = head.data;
            return temp;

        }
    }
      public static void main(String[] args) {
        Queque q = new Queque();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }

}
