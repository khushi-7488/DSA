package Queue;

import java.util.*;

public class FirstNonRepeatingLetter {

    public static void printNonoRepeating(String str) {
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            q.add(ch);
            
        }
    }

    public static void main(String[] args) {
        String str = "aabccxb";
    }
}
