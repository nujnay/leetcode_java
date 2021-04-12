package deprecated.leetcode.week1;

import java.util.ArrayList;

public class leetcode1035 {
    public static void main(String[] args) {
        maxUncrossedLines(new int[]{1, 2, 3}, new int[]{9, 1, 2, 3});
    }

    public static int maxUncrossedLines(int[] A, int[] B) {
        //归根结底 A点 之后的点集合B{} 做链接的点集合C{} 大于a点的最大连接位置
        //先找到所有的连接的点的位置
        ArrayList<int[]> location = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {//找到第一个位置
                    System.out.println("::" + i + "|||" + j);
                    location.add(new int[]{i, j});
                }
            }
        }
        return 0;
    }


    public static int test1(int[] A, int[] B) {
        int[][] dp = new int[A.length + 1][B.length + 1];
        for (int i = 1; i < A.length; i++) {
            for (int j = 1; j < B.length; j++) {
                dp[i][j] = A[i - 1] == B[j - 1] ? dp[i - 1][j - 1] + 1 : Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[A.length][B.length];
    }

    public static int test2(int[] A, int[] B) {
        int[][] dp = new int[A.length][B.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                dp[i][j] = A[i - 1] == B[j - 1] ? dp[i - 1][j - 1] + 1 : Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[A.length][B.length];
    }
}
