package leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class leetcode0001 {
    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        String a = "1";
        int b = a.hashCode();
        System.out.println(b);
        Integer v = Integer.valueOf(1);
        int d = v.hashCode();
        System.out.println(d);
    }

    public static class Test {

    }

    public static int[] test2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{i, map.get(complement)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
