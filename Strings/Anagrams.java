package Strings;

import java.util.*;

public class Anagrams {
    public static String sortString(String inputString) {
        char arr[] = inputString.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "cera";

        String s1 = sortString(str1);
        String s2 = sortString(str2);

        if (s1.equals(s2)) {
            System.out.println("is anagrams");
        } else {
            System.out.println("not anagrams");
        }
    }
}
