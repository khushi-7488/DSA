package LinkedList;

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // add from the first
    public void addFirst(int data) {
        // step1 create new node
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step2 newNode neaxt = head
        newNode.next = head;

        // step3 head = newNode
        head = newNode;
    }

    // add from the last
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Add from the middle
    public void addMiddle(int data, int idx) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;

        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // remove

    // print
    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(2);
        ll.print();

        ll.addFirst(1);
        ll.print();

        ll.addLast(3);
        ll.print();

        ll.addLast(4);
        ll.print();

        ll.addMiddle(9, 2);
        ll.print();

    }
}
