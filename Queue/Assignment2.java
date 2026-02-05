package Queue;

import java.util.PriorityQueue;

public class Assignment2 {
    public static int minCost(int[] ropes) {
        // Min-Priority Queue to always get the smallest ropes
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add all ropes to the priority queue
        for (int rope : ropes) {
            pq.add(rope);
        }

        int totalCost = 0;

        // Connect ropes until only one is left
        while (pq.size() > 1) {
            int first = pq.poll(); // Smallest
            int second = pq.poll(); // Second smallest

            int cost = first + second;
            totalCost += cost;

            // Add the combined rope back to the heap
            pq.add(cost);
        }

        return totalCost;
    }

    public static void main(String[] args) {
        int[] ropes = { 4, 3, 2, 6 };
        System.out.println("Minimum cost: " + minCost(ropes));
        // Example Output: 29
    }
}
