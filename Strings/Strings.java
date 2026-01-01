package Strings;

import java.util.Scanner;

public class Strings {

    public static void printletters(String fullname) {
        for (int i =0;i< fullname.length();i++){
            System.out.print(fullname.charAt(i) + " ");
        }
    }
    public static void main(String[] args) {
        // char arr[] = { 'a', 'b' };
        // String str = "ab";
        // String str2 = new String("ab");

        // strings are immutable
        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name);
        // System.out.println(name.length());

        //concatenation
        String firstname = "khushi";
        String lastname = "tiwari";
        String fullname = firstname + "" + lastname;
        // System.out.println(fullname.charAt(0));
        printletters(fullname);
    }
}
