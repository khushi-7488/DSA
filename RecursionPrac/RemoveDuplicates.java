package RecursionPrac;

public class RemoveDuplicates {
    public static void remove(String str, int i, StringBuilder sb, boolean map[]) {

        if (str.length() == i) {
            System.out.println(sb);
            return;
        }
        char curr = str.charAt(i);
        if (map[curr - 'a'] == true) {
            remove(str, i + 1, sb, map);
        } else {
            map[curr - 'a'] = true;
            remove(str, i + 1, sb.append(curr), map);
        }
    }

    public static void main(String[] args) {
        remove("appnaacolllege", 0, new StringBuilder(" "), new boolean[26]);
    }
}
