package StackOps;

import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        String str = "Hello Arijit";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            s.push(ch);
        }
        while (!s.isEmpty()) {
            System.out.print(s.pop());
        }
    }
}
