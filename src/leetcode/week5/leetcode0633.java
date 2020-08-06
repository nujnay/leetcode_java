package leetcode.week5;

public class leetcode0633 {
    /**
     * Given a non-negative integer c, your task is to decide whether there're two integers a and b such that a2 + b2 = c.
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/sum-of-square-numbers
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public static boolean  judgeSquareSum(int c) {
        for (long a = 0; a * a <= c; a++) {
            int b = c - (int) (a * a);
            if (binary_search(0, b, b)) {
                return true;
            }
        }
        return false;
    }

    public static boolean binary_search(long s, long e, int n) {
        if (s > e) {
            return false;
        }
        long mid = s + (e - s) / 2;
        if (mid * mid == n) {
            return true;
        }
        if (mid * mid > n) {
            return binary_search(s, mid - 1, n);
        }
        return binary_search(mid + 1, e, n);
    }
}
