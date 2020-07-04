public class leetcode1 {
    public static void main(String[] args) {
        int[] ints = Solution.twoSum(new int[]{1, 2, 3, 4, 5}, 7);
        System.out.println(ints[0]);
        System.out.println(ints[1]);
    }


    static class Solution {
        public static int[] twoSum(int[] nums, int target) {
            int[] ints = new int[2];
            for (int i = 0; i < nums.length; i++) {
                for (int a = 0; a < nums.length; a++) {
                    if (a != i) {
                        int sum = nums[i] + nums[a];
                        if (sum == target) {
                            ints[0] = a;
                            ints[1] = i;
                        }
                    }
                }
            }
            return ints;
        }
    }

}
