package Backtracking;
import java.util.*;

public class MobileKeypad {
    // Mapping digits to letters
    private static final String[] KEYPAD = {
        "",    // 0
        "",    // 1
        "abc", // 2
        "def", // 3
        "ghi", // 4
        "jkl", // 5
        "mno", // 6
        "pqrs",// 7
        "tuv", // 8
        "wxyz" // 9
    };

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        backtrack(result, new StringBuilder(), digits, 0);
        return result;
    }

    private void backtrack(List<String> result, StringBuilder current, String digits, int index) {
        // Base case: if the current combination length equals input length
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        // Get the letters corresponding to the current digit
        String letters = KEYPAD[digits.charAt(index) - '0'];
        
        for (char c : letters.toCharArray()) {
            current.append(c);             // Choose
            backtrack(result, current, digits, index + 1); // Explore
            current.deleteCharAt(current.length() - 1);    // Backtrack (un-choose)
        }
    }

    public static void main(String[] args) {
        MobileKeypad solver = new MobileKeypad();
        System.out.println(solver.letterCombinations("235")); 
        // Output: [ad, ae, af, bd, be, bf, cd, ce, cf]
    }
}











// package Backtracking;

// public class Assignment2 {
//     final static char[][] str = { {}, {}, { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' }, { 'j', 'k', 'l' },
//             { 'm', 'n', 'o' }, { 'p', 'q', 'r', 's' }, { 't', 'u', 'v' }, { 'w', 'x', 'y', 'z' } };

//     public static void backtrack(char[][] str, StringBuilder curr, int digit, int i, String res) {
//         if (i == digit) {
//             System.out.println(curr.toString() + res);
//             return;
//         }
//         char[] letters = str[digit];
//         for (char ch : letters) {
    
//     // ACTION: Add the character to your current combination
//     curr.append(ch);
    
//     // RECURSION: Move to the next digit in the input string
//     backtrack(digit, i + 1, curr);
    
//     // BACKTRACK: Remove the last character so the loop can try the next one
//     curr.deleteCharAt(curr.length() - 1);
// }

    
//     }

//     public static void main(String[] args) {

//     }
// }
