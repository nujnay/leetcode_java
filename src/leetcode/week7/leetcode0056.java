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
     * even just liking and subscribeing or discord
     * or whatever is awesome so i am streaming again
     * I did this on stream earlier if you guys want to check valve for those
     * I'm gonna try and do them a lot more but this
     * problems called merge intervals very popular
     * it looks like the method signature changed
     * it used to be like a little bit different but you know I this one's this
     * way is fine or whatever given a collection of intervals merge all
     * overlapping intervals okay so what this is is we have input like this like 1 3 to 6
     * you know each one of these it's a 2d array is the input and that's what we're gonna be outputting to
     * and we're looking at the studio rate in each sub
     * array is going to be an interval and it's going to be of size to the beginning of the interval is the first
     * element the ending is the second element beginning first element ending second so some of these intervals overlap
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

    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {//if intervals dot length is less than or equal to one that

        }
    }

}
