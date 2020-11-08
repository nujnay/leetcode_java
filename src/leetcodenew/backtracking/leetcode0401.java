package leetcodenew.backtracking;

import leetcodenew.Utils.PrintUtil;

import java.util.ArrayList;
import java.util.List;

public class leetcode0401 {
    /**
     * A binary watch has 4 LEDs on the top which represent the hours (0-11), and the 6 LEDs on the bottom represent the minutes (0-59).
     * <p>
     * Each LED represents a zero or one, with the least significant bit on the right.
     * <p>
     * <p>
     * For example, the above binary watch reads "3:25".
     * <p>
     * Given a non-negative integer n which represents the number of LEDs that are currently on,
     * return all possible times the watch could represent.
     * <p>
     * Example:
     * <p>
     * Input: n = 1
     * Return: ["1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32"]
     * Note:
     * The order of output does not matter.
     * The hour must not contain a leading zero, for example "01:00" is not valid, it should be "1:00".
     * The minute must be consist of two digits and may contain a leading zero, for example "10:2" is not valid, it should be "10:02".
     *
     */

    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintUtil.printList2(solution.readBinaryWatch(2));
    }

    /**
     * 方法2:回溯,二叉树(官方喜欢的选和不选)
     * 使用一个数组来保存手表上的数组,其中前四位1,2,4,8表示是小时,后面6位01,02,04,08,16,32表示的是分钟;
     */
     static class Solution {

        // 下标索引在0-3范围内的表示的是小时,不在这个范围内的表示的是分钟;
        Integer[] watch = {1, 2, 4, 8, 1, 2, 4, 8, 16, 32};

        List<String> res = new ArrayList<>();

        public List<String> readBinaryWatch(int num) {
            dfs(num, 0, 0, 0, 0);
            return res;
        }



        /**
         * @param num    题目要求用的总的数字个数;
         * @param idx    当前watch数组中用到数字的索引
         * @param count  当前已经用到的数字个数
         * @param hour   当前已经算出来的小时
         * @param minute 当前已经算出来的分钟
         */
        private void dfs(int num, int idx, int count, int hour, int minute) {
            // 剪枝;
            if (hour > 11 || minute > 59) {
                // 这些结果是要丢弃的;
                return;
            }
            // 凑足了数字,则需要添加结果;
            if (count == num) {
                StringBuffer sb = new StringBuffer();
                // 小时不会以零开头，比如 “01:00” 是不允许的，应为 “1:00”。
                sb.append(hour).append(":");
                // 分钟必须由两位数组成，可能会以零开头，比如 “10:2” 是无效的，应为 “10:02”。
                if (minute < 10) {
                    sb.append("0").append(minute);
                } else {
                    sb.append(minute);
                }
                res.add(sb.toString());
                return;
            }
            // 如果不用for循环,则需要自己添加递归终止判定;
            if (idx >= watch.length) {
                return;
            }
            // 不选;不选数字则count不需要加1;
            dfs(num, idx + 1, count, hour, minute);
            // 选;
            if (idx <= 3) { // 加到小时上;
                hour += watch[idx];
            } else {
                minute += watch[idx];
            }

            dfs(num, idx + 1, count + 1, hour, minute);

            if (idx <= 3) {
                hour -= watch[idx];
            } else {
                minute -= watch[idx];
            }


            return;
        }
    }
}
