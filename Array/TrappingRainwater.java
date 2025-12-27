public class TrappingRainwater {
    public static int trapWater(int height[]) {
        // calculate leftMax
        int leftMax[] = new int[height.length];
        int n = height.length;
        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            // if (leftMax[i - 1] < height[i]) {
            // leftMax[i - 1] = height[i];
            // }
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        // calculate rightMax
        int rightMax[] = new int[height.length];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            // if (rightMax[i + 1] < height[i]) {
            // rightMax[i + 1] = height[i];
            // }
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // loop
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            // waterLevel = min(leftMax , rightMax)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            // trapWater = waterLevel - height[i]
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;

    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trapWater(height));
    }
}
