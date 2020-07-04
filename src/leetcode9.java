public class leetcode9 {


    static class Solution{
        public boolean isPalindrome(int x) {
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


    }
}

