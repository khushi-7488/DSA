package Recursion;

public class Stringlength {
    public static int print(String str) {
        // if (i == str.length()) {
        //     System.out.println(i);
        //     return;
        // }
        // print(str, i + 1);
        if(str.length()==0){
            return 0;
        }
        return print(str.substring(1))+1;
    }

    public static void main(String[] args) {
    System.out.println(print("bubu"));   
    }
}
