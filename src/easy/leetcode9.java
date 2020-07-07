package easy;

public class leetcode9 {
    public static void main(String[] args) {
        System.out.println(Solution.test(667766));
    }

    static class Solution {
        public static boolean isPalindrome(int x) {
            if (x < 0 || (x % 10 == 0 && x != 0)) {//先排除小于0和个位数是0的
                return false;
            }
            int revertedNumber = 0;//翻转的
            while ((x > revertedNumber)) {
                revertedNumber = revertedNumber * 10 + x % 10;
                x /= 10;
            }
            //前边是偶数的
            return x == revertedNumber || x == revertedNumber / 10;
        }

        public static boolean test(int x) {
            int origin = x;
            //首先如果末尾是0 那么一定不是palindrome
            if (x < 0 || (x % 10 == 0 && x != 0)) {
                return false;
            }
            //算出回文数 每次拿出个位 填补到个位 但是下次回文数要先向前进一位 什么时候停止呢 最后一位为0的时候
            //数字变换的过程 空间上的方向做出了改变
            int revertedNUmber = 0;
            while (x != 0) {
                revertedNUmber *= 10;
                int units = x % 10;
                revertedNUmber += units;//回文数的个位加上原来的个位
                x /= 10;//元数 变换
            }
            System.out.println(revertedNUmber);
            return revertedNUmber == origin;
        }
    }

}

