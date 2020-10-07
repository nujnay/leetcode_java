package leetcodenew.array;

import java.util.List;

/**
 * C length 1 to C length length
 * I need some methods that input array and combination number
 */

public class leetcode0078 {
    //4个数 = c41 c42 c43 c44
    //5个数 = c51 c52 c53 c54 c55

    public List<List<Integer>> subsets(int[] nums) {
        //先求出c length2 之后所有的数就都出来了

    }

    public int[][] combination2(int[] nums) {
        int arraySumLength = 0;
        for (int i = nums.length - 1; i > 0; i--) {
            arraySumLength += i;
        }
        int[][] arrays = new int[2][arraySumLength];
        int[] tmpArray = new int[nums.length - 1];
        int point = 0;
        for (int i = 0; i < nums.length - 2; i = i + 1) {
            for (int j = 0; j < tmpArray.length; j++) {

            }
        }

    }

    //if number equal 2
    //拿出一个数组来 直到数组长度等于2
    //c43 c42的数 加上所有的但个数
    //C54 等于 所有的c53 加上但个数


    public void input(int number, int[] array) {

    }
}
