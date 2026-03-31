package StringPrac;

public class Compression {
    public static void compression(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                sb.append(str.charAt(i));
                if (count > 1) {
                    sb.append(count);
                    count = 1;
                }
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        String str = "aaabbccc";
        compression(str);
    }
}
