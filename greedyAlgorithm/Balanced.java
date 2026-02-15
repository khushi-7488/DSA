package greedyAlgorithm;

public class Balanced {
    public static void main(String[] args) {
        int balance = 0;
        int count = 0;

        String s = "RLRRLLRLRL";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                balance++;
            } else {
                balance--;
            }
            if (balance == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
