package Queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Job {
    char id;
    int deadline;
    int profit;

    public Job(char id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}
public class Assignment3 {
    public static void printJobSequence(List<Job> jobs, int n) {
        // 1. Sort jobs based on descending order of profit
        Collections.sort(jobs, (a, b) -> b.profit - a.profit);

        int maxDeadline = 0;
        for (Job j : jobs) {
            maxDeadline = Math.max(maxDeadline, j.deadline);
        }

        // 2. Initialize slots (using 1-based indexing for clarity)
        char[] result = new char[maxDeadline + 1];
        boolean[] slot = new boolean[maxDeadline + 1];

        int totalProfit = 0;

        // 3. Iterate through all sorted jobs
        for (Job job : jobs) {
            // Find a free slot for this job (starting from its deadline)
            for (int j = job.deadline; j > 0; j--) {
                if (!slot[j]) {
                    slot[j] = true;
                    result[j] = job.id;
                    totalProfit += job.profit;
                    break;
                }
            }
        }

        // Print results
        System.out.print("Job Sequence: ");
        for (char id : result) {
            if (id != '\0') System.out.print(id + " ");
        }
        System.out.println("\nTotal Profit: " + totalProfit);
    }

    public static void main(String[] args) {
        List<Job> jobs = new ArrayList<>();
        jobs.add(new Job('A', 4, 20));
        jobs.add(new Job('B', 1, 10));
        jobs.add(new Job('C', 1, 40));
        jobs.add(new Job('D', 1, 30));

        printJobSequence(jobs, 5);
    }
}
