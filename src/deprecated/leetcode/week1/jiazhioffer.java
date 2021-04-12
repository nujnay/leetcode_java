package deprecated.leetcode.week1;

public class jiazhioffer {

    //https://leetcode-cn.com/problems/yuan-quan-zhong-zui-hou-sheng-xia-de-shu-zi-lcof/

    public static int lastRemaining(int n, int m) {
        int ans = 0;
        for (int i = 2; i <= n; i++) {
            ans = (ans + m) % i;
        }
        return ans;
    }

    public static void test(int n, int m) {
        //如果数组长度大于 移除位数 ，直接移除位数。如果数组长度小于移除位数，使用数组长度，对移除位数取余，然后移除数组第余数个。
        //数组长度等于1的时候 结束
    }
}
