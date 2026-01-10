package Recursion;

public class Duplicate {
    public static void duplicate(String str, int idx, StringBuilder sb, boolean map[]) {

        if (idx == str.length()) {
            System.out.println(sb);
            return;
        }
        // kaam
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            duplicate(str, idx + 1, sb, map);
        } else {
            map[currChar - 'a'] = true;
            duplicate(str, idx + 1, sb.append(currChar), map);
        }
    }

    public static void main(String[] args) {
        String str = "apnacollege";
        duplicate(str, 0, new StringBuilder(" "), new boolean[26]);
    }
}
