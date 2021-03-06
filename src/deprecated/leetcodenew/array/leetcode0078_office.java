package deprecated.leetcodenew.array;

import deprecated.leetcodenew.Utils.PrintUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * for 选择 in 选择列表:
 *     # 做选择
 *     将该选择从选择列表移除
 *     路径.add(选择)
 *     backtrack(路径, 选择列表)
 *     # 撤销选择
 *     路径.remove(选择)
 *     将该选择再加入选择列表
 */

public class leetcode0078_office {
    class Solution {
        List<Integer> t = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        /**
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

    /**
     * cur 0 [1, 2]
     * t 1
     * <p>
     * cur 1 [1, 2]
     * t {1, 2}
     * <p>
     * cur 2 [1, 2]
     * t {1, 2}
     * ans {1, 2}
     * <p>
     * cur 0 [1, 2]
     * t {1, 2}
     * t {1 }
     * <p>
     * cur 1 [1, 2]
     */

    static class Solution2 {
        List<Integer> t = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        public List<List<Integer>> subsets(int[] nums) {
            dfs(0, nums);
            return ans;
        }

        public void dfs(int cur, int[] nums) {
            System.out.println("\n\nstart: cur "+cur);
            if (cur == nums.length) {
                ans.add(new ArrayList<>(t));System.out.print("62 ");System.out.print("ans：");PrintUtil.printList(ans);System.out.println();
                return;
            }
            t.add(nums[cur]);//递归之前加入选择
            System.out.print("65 ");System.out.print("t1：");PrintUtil.printList1(t);System.out.print("cur："); System.out.print(cur);
            dfs(cur + 1, nums);
            t.remove(t.size() - 1);//递归之后移除选择
            System.out.print("68 ");System.out.print("t2：");PrintUtil.printList1(t);System.out.print("cur："); System.out.print(cur);
            dfs(cur + 1, nums);
            System.out.println("end");
        }
    }

    static class Solution3 {
        /**
         * 1 2 3
         *
         * 1 2 3
         * 1 2
         * 1 3
         * 1
         *
         * 2 3
         * 2
         * 3
         *
         * 1 2 3 4
         * 1  2  3  4
         *    3  4
         *    4
         *
         * 2  3  4
         *    4
         *
         * 3  4
         *
         * 4
         *
         *
         *
         */

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
//        int n = 0B11;
//        int length = 1 << n;
//        System.out.println(Integer.toBinaryString(length));
//        System.out.println(length);
//        System.out.println("====");
//        for (int mask = 0; mask < (1 << n); ++mask) {
//            System.out.println(Integer.toBinaryString(mask));
//        }

        int[] a = new int[]{1, 2,3 };
        Solution2 solution2 = new Solution2();
        List list = solution2.subsets(a);
//        PrintUtil.printList(list);
    }

}
