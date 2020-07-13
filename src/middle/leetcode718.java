package middle;

public class leetcode718 {

    public static int test1(int[] A, int[] B) {
        int[][] ints = new int[A.length + 1][B.length + 1];
        for (int i = 1; i < A.length; i++) {
            for (int j = 1; j < B.length; j++) {
                ints[i][j] = A[i] == B[j] ? ints[i - 1][j - 1] + 1 : Math.max(ints[i - 1][j], ints[i][j - 1]);
            }
        }
        return ints[A.length + 1][B.length + 1];
    }
}
