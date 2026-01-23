package ArrayList;

import java.util.*;

public class Assignment2 {
    public static void lonely(int num[]) {
        Arrays.sort(num);
        for (int i = 0; i < num.length; i++) {
            boolean isLonely = true;
            
            // Check left neighbor
            if (i > 0) {
                if (num[i] == num[i - 1] || num[i] == num[i - 1] + 1) {
                    isLonely = false;
                }
            }
            
            // Check right neighbor
            if (i < num.length - 1) {
                if (num[i] == num[i + 1] || num[i] == num[i + 1] - 1) {
                    isLonely = false;
                }
            }
            
            // Print if lonely
            if (isLonely) {
                System.out.println(num[i]);
            }
        }
    }

    public static void main(String[] args) {
        int num[] = { 10, 6, 5, 8 };
        lonely(num);
    }
}

// public class Assignment2 {
// public static void printLonely(int[] nums) {
// // Step 1: Sort the array so neighbors are next to each other
// Arrays.sort(nums);

// System.out.print("Lonely Numbers: ");

// boolean isLonely = true;
// for (int i = 0; i < nums.length; i++) {

// // Check the number to the left
// if (i > 0) {
// if (nums[i] == nums[i - 1] || nums[i] == nums[i - 1] + 1) {
// isLonely = false;
// }
// }

// // Check the number to the right
// if (i < nums.length - 1) {
// if (nums[i] == nums[i + 1] || nums[i] == nums[i + 1] - 1) {
// isLonely = false;
// }
// }

// // If it passed both checks, print it
// if (isLonely) {
// System.out.print(nums[i] + " ");
// }
// }
// System.out.println();
// }

// public static void main(String[] args) {
// int[] myNumbers = { 10, 6, 5, 8, 20, 20, 15 };
// // 5 and 6 are neighbors (not lonely)
// // 20 appears twice (not lonely)
// // 8, 10, and 15 are lonely
// printLonely(myNumbers);
// }
// }