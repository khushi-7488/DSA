package StackOps;

import java.util.Stack;

public class TrappingRainWater {
    public static int trappedWater(int height[]) {
        Stack<Integer> s = new Stack<>();
        int totalWater = 0;
        int curr = 0;
        if (height == null || height.length == 0) {
            return 0;
        }
        while (curr < height.length) {
            while (!s.isEmpty() && height[curr] > height[s.peek()]) {
                int top = s.pop();
                if (s.isEmpty()) {
                    break;
                }
                int distance = curr - s.peek() - 1;
                int boundedHeight = Math.min(height[curr], height[s.peek()]) - height[top];
                if (boundedHeight > 0) {
                    totalWater += distance * boundedHeight;
                }
            }
            s.push(curr++);
        }
        return totalWater;
    }

    public static void main(String[] args) {
        int height[] = { 7, 0, 4, 2, 5, 0, 6, 4, 0, 6 };
System.out.println(trappedWater(height));
    }
}
