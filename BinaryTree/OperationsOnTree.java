package BinaryTree;

import java.util.*;

public class OperationsOnTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        int height = Math.max(lh, rh) + 1;
        return height;
    }

    public static int count(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = count(root.left);
        int rh = count(root.right);
        int treeCount = lh + rh + 1;
        return treeCount;
    }

    public static int sum(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = sum(root.left);
        int rh = sum(root.right);
        int treeSum = lh + rh + root.data;
        return treeSum;
    }

    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int ldm = diameter(root.left);
        int rdm = diameter(root.right);
        int lh = height(root.left);
        int rh = height(root.right);
        int selftDiam = lh + rh + 1;
        return Math.max(selftDiam, Math.max(ldm, rdm));
    }

    // efficient time complexity
    static class Info {
        int diam;
        int ht;

        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diameter2(Node root) {
        if (root == null) {
            return new Info(0, 0);
        }
        Info leftInfo = diameter2(root.left);
        Info rightInfo = diameter2(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(diam, ht);
    }

    public static boolean isIdentical(Node node, Node subRoot) {
        if (node == null && subRoot == null) {
            return true;
        } else if (node == null || subRoot == null || node.data != subRoot.data) {
            return false;
        }
        if (!isIdentical(node.left, subRoot.left)) {
            return false;
        }
        if (!isIdentical(node.right, subRoot.right)) {
            return false;
        }
        return true;
    }

    public static boolean isSubTree(Node root, Node subRoot) {
        if (root == null) {
            return false;
        }
        if (root.data == subRoot.data) {
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }
        boolean left = isSubTree(root.left, subRoot);
        boolean right = isSubTree(root.right, subRoot);

        return left || right;
    }

    static class Info2 {
        Node node;
        int hd;

        public Info2(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root) {
        Queue<Info2> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0, max = 0;
        q.add(new Info2(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            Info2 curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if (!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }
                if (curr.node.left != null) {
                    q.add(new Info2(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd - 1);
                }
                if (curr.node.right != null) {
                    q.add(new Info2(curr.node.right, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);
                }
            }
        }
        for (int i = min; i <= max; i++) {
            System.out.println(map.get(i).data + " ");
        }
    }

    public static void kthLevel(Node root, int level, int k) {
        if (root == null) {
            return;
        }
        if (level == k) {
            System.out.println(root.data);
            return;
        }
        kthLevel(root.left, level + 1, k);
        kthLevel(root.right, level + 1, k);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // Node subRoot = new Node(2);
        // subRoot.left = new Node(4);
        // subRoot.right = new Node(5);

        // System.out.println(height(root));
        // System.out.println(count(root));
        // System.out.println(diameter(root));
        // System.out.println(diameter2(root).diam);
        // System.out.println(isSubTree(root, subRoot));
        // topView(root);
        kthLevel(root, 1, 2);
    }
}