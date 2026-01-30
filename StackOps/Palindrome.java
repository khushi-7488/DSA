package StackOps;

import java.util.Stack;

public class Palindrome {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static boolean isPalindrome(Node head) {
        Stack<Integer> s = new Stack<>();
        Node slow = head;
        boolean palindrome = true;
        while (slow != null) {
            s.push(slow.data);
            slow = slow.next;
        }
        while (head != null) {
            int i = s.pop();
            if (head.data == i) {
                palindrome = true;
            } else {
                palindrome = false;
                break;
            }
            head = head.next;
        }
        return palindrome;
    }

    public static void main(String[] args) {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(3);
        Node six = new Node(2);
        Node seven = new Node(1);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = seven;
       System.out.println(isPalindrome(one)); 
    }
}
