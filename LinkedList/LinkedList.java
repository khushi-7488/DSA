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
    public static int size;

    // add from the first
    public void addFirst(int data) {
        // step1 create new node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step2 newNode next = head
        newNode.next = head;

        // step3 head = newNode
        head = newNode;
    }

    // add from the last
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
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
        size++;
        Node temp = head;

        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // remove from the first
    public int removeFirst() {
        if (size == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // remove from the last
    public int removeLast() {
        if (size == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = tail.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node temp = head;
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }
        int val = temp.next.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }

    // find and remove nth node from end
    public void removeFromNt(int n) {
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        if (n == size) {
            head = head.next;
            return;
        }
        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;

    }

    // print
    public void print(Node head) {
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

    // serach in a linked list
    public int search(int key) {
        int i = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    // search using recursion : first make a helper fuction
    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int searchUsingRecursion(int key) {
        return helper(head, key);
    }

    // reverse a linked list
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // Check for palindrome -----------------

    // --------------- slow fast approach ---------------
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        // find mid
        Node midNode = findMid(head);

        // reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        // check left half and right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    // loop
    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    // remove a loop/cycle
    public static void removeCycle() {
        // first detect whether is this a cycle or not
        Node slow = head;
        Node fast = head;
        boolean iscycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                iscycle = true;
                break;
            }
        }
        if (iscycle == false) {
            return;
        }
        // find meeting point
        Node prev = null;
        slow = head;

        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
    }

    // sort the linked list using mergeSort
    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node merge(Node leftHead, Node rightHead) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while (leftHead != null && rightHead != null) {
            if (leftHead.data <= rightHead.data) {
                temp.next = leftHead;
                leftHead = leftHead.next;
                temp = temp.next;
            } else {
                temp.next = rightHead;
                rightHead = rightHead.next;
                temp = temp.next;
            }
        }
        while (leftHead != null) {
            temp.next = leftHead;
            leftHead = leftHead.next;
            temp = temp.next;
        }
        while (rightHead != null) {
            temp.next = rightHead;
            rightHead = rightHead.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }

    // mergesort
    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // find mid
        Node mid = getMid(head);
        // left & right
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // merge
        return merge(newLeft, newRight);

    }

    // add the linkedlist in the zigZag form
    public void zigZag() {
        // find mid
        Node mid = getMid(head);

        // reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node next;
        Node prev = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nextLeft, nextRight;

        // alt merge - zigzag merge
        while (left != null && right != null) {
            nextLeft = left.next;
            left.next = right;
            nextRight = right.next;
            right.next = nextLeft;

            left = nextLeft;
            right = nextRight;
        }
    }

    // Assignment questions 1
    // find the intersection point in the linked list
    public Node getIntersectionPoint(Node headA, Node headB) {
        if (headA == null || headB == null) {
            return null;
        }
        Node p1 = headA;
        Node p2 = headB;

        while (p1 != p2) {
            if (p1 == null) {
                p1 = headB;
            } else {
                p1 = p1.next;
            }
            if (p2 == null) {
                p2 = headA;
            } else {
                p2 = p2.next;
            }
        }
        return p1; // Intersection node or null
    }

    // Assignment2
    // delete n nodes after m nodes of a linked list
    public static Node deleteNNodes(Node head, int n) {
        if (head == null || n <= 0)
            return head;

        Node current = head;

        while (current != null) {
            // Skip first n nodes
            int count = 1;
            while (current != null && count < n) {
                current = current.next;
                count++;
            }

            // If we reached the end, break
            if (current == null)
                break;

            // Delete next n nodes
            // current.next points to the first node to delete
            Node nodeToDelete = current.next;
            count = 0;

            while (nodeToDelete != null && count < n) {
                nodeToDelete = nodeToDelete.next;
                count++;
            }

            // Link current to the node after deleted nodes
            current.next = nodeToDelete;

            // Move to next node for next iteration
            current = current.next;
        }

        return head;
    }

    //Assignment3
    // swap two nodes by their key values in a linked list
    public static Node swapByValue(Node head, int key1, int key2) {
        if (head == null || key1 == key2) {
            return head;
        }

        // Find first node with key1
        Node node1Prev = null;
        Node node1 = head;
        while (node1 != null && node1.data != key1) {
            node1Prev = node1;
            node1 = node1.next;
        }

        // Find second node with key2
        Node node2Prev = null;
        Node node2 = head;
        while (node2 != null && node2.data != key2) {
            node2Prev = node2;
            node2 = node2.next;
        }

        // If either key not found
        if (node1 == null || node2 == null) {
            System.out.println("One or both keys not found in the list");
            return head;
        }

        // If node1 is head
        if (node1Prev == null) {
            head = node2;
        } else {
            node1Prev.next = node2;
        }

        // If node2 is head
        if (node2Prev == null) {
            head = node1;
        } else {
            node2Prev.next = node1;
        }

        // Swap the next pointers
        Node temp = node1.next;
        node1.next = node2.next;
        node2.next = temp;

        return head;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.println("Original List:");
        ll.print(head);

        int key1 = 2;
        int key2 = 4;
        head = swapByValue(head, key1, key2);

        System.out.println("After swapping " + key1 + " and " + key2 + ":");
        ll.print(head);
        // Node headA, headB;
        // headA = new Node(10);
        // headB = new Node(3);

        // Node newNode = new Node(6);
        // headB.next = newNode;

        // newNode = new Node(9);
        // headB.next.next = newNode;

        // newNode = new Node(15);
        // headA.next = newNode;
        // headB.next.next.next = newNode;

        // newNode = new Node(30);
        // headA.next.next = newNode;

        // headA.next.next.next = null;

        // ll.print(headB);
        // ll.print(headA);

        // Node getIntersection = ll.getIntersectionPoint(headA, headB);

        // if (getIntersection == null) {
        // System.out.println("No intersection point");
        // } else {
        // System.out.println("Intersection point " + getIntersection.data);
        // }

        // ll.print();
        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;

        // System.out.println(isCycle());
        // removeCycle();
        // System.out.println(isCycle());

        // ll.addFirst(2);
        // ll.print();

        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addFirst(3);
        // ll.addFirst(4);
        // ll.addFirst(5);
        // ll.print();

        // ll.head = ll.mergeSort(ll.head);
        // ll.print();
        // ll.zigZag();
        // ll.print();
        // ll.addLast(1);
        // // ll.print();

        // ll.addLast(2);
        // // ll.print();
        // ll.addLast(2);
        // // ll.print();
        // ll.addLast(1);
        // ll.print();

        // ll.addMiddle(9, 2);
        // ll.print();

        // ll.removeFirst();
        // ll.print();

        // ll.removeLast();
        // ll.print();

        // System.out.println(ll.search(9));
        // ll.print();

        // System.out.println(ll.searchUsingRecursion(3));
        // ll.print();

        // ll.reverse();
        // ll.print();

        // ll.removeFromEnd(3);
        // ll.print();

        // System.out.println(ll.isPalindrome());

        // System.out.println("size of linkedList is " + ll.size);
    }
}
