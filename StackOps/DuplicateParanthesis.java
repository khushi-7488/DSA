package StackOps;

import java.util.Stack;

public class DuplicateParanthesis {
    public static boolean isDuplicate(String str1) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            // closing
            if (ch == ')') {
                int count = 0;
                while(!s.isEmpty() && s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count <1){
                    return true;   //duplicate exists
                }else{
                  s.pop();  //opening pair
                }
            }else{
                //opening
                s.push(ch);
            }
        }    
        return false;
    }

    public static void main(String[] args) {
        String str1 = "((a+b))";
        // String str2 = "(a+b)";
        System.out.println(isDuplicate(str1));
    }
}
