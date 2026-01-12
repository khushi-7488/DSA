package Recursion;

public class NumberToString {
    public static void print(int num) {
        // if (i == num.length()) {
        // System.out.println(sb);
        // return;
        // }
        // String arr[] = { "Zero", "one", "two", "three", "four", "five", "six",
        // "seven", "eight", "nine" };
        // int ch = num.charAt(i) - '0';
        // print(num, sb.append(arr[ch] + " "), i+1);
        // }
        if (num == 0) {
            return;
        }
        String arr[] = { "Zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        int lastDigit = num % 10;
        print(num / 10); 
        System.out.println(arr[lastDigit]+ " ");
    }

    public static void main(String[] args) {
        print(1234);
    }
}