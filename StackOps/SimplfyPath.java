package StackOps;

import java.util.Stack;

public class SimplfyPath {
    public static void simplfyPath(String str) {
        Stack<String> s = new Stack<>();
        String[] ss = str.split("/");
        for (int i = 0; i < ss.length; i++) {
            String part = ss[i];
            if (part.equals("") || part.equals(".")) {
                continue;
            } else if (part.equals("..")) {
                if (!s.isEmpty()) {
                    s.pop();
                }
            } else {
                s.push(part);
            }

        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.size(); i++) {
            sb.append("/").append(s.get(i));
        }
        if (sb.length() == 0) {
            System.out.println("/");
        } else {
            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {
        String str = "/apnacollege/..";
        simplfyPath(str);
    }
}
