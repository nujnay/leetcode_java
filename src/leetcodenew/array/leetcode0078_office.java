package leetcodenew.array;

import java.util.ArrayList;
import java.util.List;

public class leetcode0078_office {
    class Solution {
        List<Integer> t = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        /**
         *
         * @param nums
         * @return
         */
        public List<List<Integer>> subsets(int[] nums) {
            int n = nums.length;
            for (int mask = 0; mask < (1 << n); ++mask) {
                t.clear();
                for (int i = 0; i < n; ++i) {
                    if ((mask & (1 << i)) != 0) {
                        t.add(nums[i]);
                    }
                }
                ans.add(new ArrayList<>(t));
            }
            return ans;
        }
    }

    class Solution2 {
        List<Integer> t = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        public List<List<Integer>> subsets(int[] nums) {
            dfs(0, nums);
            return ans;
        }

        public void dfs(int cur, int[] nums) {
            if (cur == nums.length) {
                ans.add(new ArrayList<>(t));
                return;
            }
            t.add(nums[cur]);
            dfs(cur + 1, nums);
            t.remove(t.size() - 1);
            dfs(cur + 1, nums);
        }
    }


    public static void main(String[] args) {
//        int a = 0B01;
//        int b = a << 0b01;
//        int c = a << 0b10;
//        int d = a << 0b11;
//        System.out.println(Integer.toBinaryString(a));
//        System.out.println("===");
//        System.out.println("1");
//        System.out.println(Integer.toBinaryString(b));
//        System.out.println("===");
//        System.out.println("10");
//        System.out.println(Integer.toBinaryString(c));
//        System.out.println("===");
//        System.out.println("11");
//        System.out.println(Integer.toBinaryString(d));
        int n = 0B11;
        int length = 1 << n;
        System.out.println(Integer.toBinaryString(length));
        System.out.println(length);
        System.out.println("====");
        for (int mask = 0; mask < (1 << n); ++mask) {
            System.out.println(Integer.toBinaryString(mask));
        }
    }

}
