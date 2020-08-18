package leetcode.week7;

import java.util.Arrays;
import java.util.Comparator;

public class leetcode0056 {
    /**
     * Given a collection of intervals, merge all overlapping intervals.
     * https://www.youtube.com/watch?v=qKczfGUrFY4
     * Huh okay let's do this
     * hey what's up guys knee right here
     * I didn't groaning stuff on twitch and YouTube check the description for all my information
     * you could support me on if you sub to me on Twitch patreon whatever
     *
     *
     *
     */


    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(v -> v[0]));
        int[][] res = new int[intervals.length][2];
        int idx = -1;
        for (int[] interval : intervals) {
            if (idx == -1 || interval[0] > res[idx][1]) {
                res[++idx] = interval;
            } else {
                res[idx][1] = Math.max(res[idx][1], interval[1]);
            }
        }
        return Arrays.copyOf(res, idx + 1);
    }
}
