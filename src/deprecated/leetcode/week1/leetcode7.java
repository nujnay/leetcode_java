package deprecated.leetcode.week1;

public class leetcode7 {
    public static void main(String[] args) {
        ReverseInteger.reverse(71);
    }


    static class ReverseInteger{
        public static int reverse(int x) {//本质上 前后换位置 就是每次都拿最后一位 填到最后一位
            if (x == Integer.MIN_VALUE) return 0;
            int neg = x < 0 ? -1 : 1;
            x *= neg;//输入参数的求绝对值
            int ret = 0;
            while (x > 0) {
                int n = ret;//新建一个临时数
                n *= 10;//临时数 上次循环拿出来的个位向前进一位 为了本次的个位也就是上次的十位填充进来
                n += x % 10;// 每次都拿x的个位
                x /= 10;//去掉个位 知道只剩下个位 每次输入参数的绝对值 都少了个位 这样 在下次循环的时候就可以直接拿到本次循环的倒数第二位
                if (n / 10 != ret) {//新建的临时数 到这一步 已经进了一位了
                    return 0;
                }
                ret = n;
            }
            return ret * neg;
        }
    }
}

