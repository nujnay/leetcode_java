package leetcodenew.math;

public class Combination {
    /**
     * k-combination of set S is a subset of k distinct elements of S
     * @param n set has n elements
     * @param k distinct elements of S
     *          k <= n
     * @return n!/k!(n-k)!
     * n = 10 k =2
     * 10! / 3! * 7!
     *
     */
    public static int kCombination(int n, int k) {
        return factorials(n) / (factorials(k) * factorials(n - k));
    }

    public static int factorials(int o) {
        int factorials = 1;
        for (int i = 1; i <= o; i++) {
            factorials *= i;
        }
        return factorials;
    }
}
