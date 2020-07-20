package leetcode.week2;

public class leetcode277 {
    public int findCelebrity(int n) {
        int left = 0;//左边一个指针
        int right = n - 1;
        while (left != right) {
            if (knows(left, right)) {
                left++;
            } else {
                right--;
            }
        }
        for (int i = 0; i < n; i++) {
            if (i != left && (knows(left, i) || !knows(i, left))) {
                return -1;
            }
        }
        return left;
    }

    public static boolean knows(int a, int b) {
        return true;
    }
}
