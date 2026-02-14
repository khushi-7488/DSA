package greedyAlgorithm;

import java.util.*;

public class JobSequencing {
    public static void main(String[] args) {
        int jobs[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };
        int time = 0;

        Arrays.sort(jobs, Comparator.comparingDouble(o -> o[1]));
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < jobs.length; i++) {
            if (jobs[i][0] > time) {
                ans.add(jobs[i][1]);
                time++;
            }
        }
        System.out.println(time);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
}
