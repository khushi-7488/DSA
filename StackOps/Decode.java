package StackOps;

import java.util.Stack;

public class Decode {
    public static String decode(String str) {
     Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> resStack = new Stack<>();
        StringBuilder currentRes = new StringBuilder();
        int k = 0;
        //if number
       for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                // Handle multi-digit numbers (like "12[a]")
                k = k * 10 + (ch - '0');
            } else if (ch == '[') {
                // Push the current count and the current string into their stacks
                countStack.push(k);
                resStack.push(currentRes);
                // Reset for the content inside the brackets
                currentRes = new StringBuilder();
                k = 0;
            } else if (ch == ']') {
                // Closing bracket: build the repeated string
                StringBuilder temp = currentRes;
                currentRes = resStack.pop();
                int repeatTimes = countStack.pop();
                
                for (int i = 0; i < repeatTimes; i++) {
                    currentRes.append(temp);
                }
            } else {
                // Just a normal character, add to current building block
                currentRes.append(ch);
            }
        }
        return currentRes.toString();
    }


    
    public static void main(String[] args) {
        String str = "2[cv]";
        System.out.println(decode(str));
    }
}
