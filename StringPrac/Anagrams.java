package StringPrac;

import java.util.Arrays;

public class Anagrams {
    public static void anagram(char arr1[], char arr2[]) {
        if (arr1.length != arr2.length) {
            System.out.println("not anagrams");
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("not Anagrams");
        }
    }

    public static void main(String[] args) {
        String str1 = "race";
        char arr1[] = str1.toCharArray();
        String str2 = "cera";
        char arr2[] = str2.toCharArray();
        anagram(arr1, arr2);
    }
}
