package Recursion;

public class ContigiousSubString {
    public static int print(String str, StringBuilder sb) {
        if (str.length() == 0) {
            return 0;
        }
        return print(str.substring(1), sb.append(str)) + 1;
    }
    
    public static void main(String[] args) {
        System.out.println(print("manku", new StringBuilder("")));
    }
}
