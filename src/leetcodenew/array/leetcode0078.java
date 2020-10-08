package leetcodenew.array;

import java.util.Arrays;
import java.util.List;

/**
 * C length 1 to C length length
 * I need some methods that input array and combination number
 */

public class leetcode0078 {
    //4个数 = c41 c42 c43 c44
    //5个数 = c51 c52 c53 c54 c55

//    public static List<List<Integer>> subsets(int[] nums) {
//        //先求出c length2 之后所有的数就都出来了
//
//    }

    public static int[][] combination2(int[] nums) {
        int arraySumLength = 0;
        for (int i = nums.length - 1; i > 0; i--) {
            arraySumLength += i;
        }
        int[][] arrays = new int[arraySumLength][2];
        int[] tmpArray = null;
        int point = 0;
        // 4 number 0 1 2 3
        // 0    1   2   3   4   5
        // 01   02  03  12  13  23
        int position = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            point = nums[i];
            tmpArray = new int[nums.length - i - 1];
            System.arraycopy(nums, i + 1, tmpArray, 0, nums.length - 1 - i);
            for (int j = 0; j < tmpArray.length; j++) {
                arrays[position] = new int[]{point, tmpArray[j]};
                position++;
            }

        }
        return arrays;
    }

    //if number equal 2
    //拿出一个数组来 直到数组长度等于2
    //c43 c42的数 加上所有的但个数
    //C54 等于 所有的c53 加上但个数


    public void input(int number, int[] array) {

    }

    public static void main(String[] args) {
        int[] a = new int[]{5, 1, 2, 3, 4};
        printArray(combination2(a));
    }

    public static void printArray(int[][] array) {
        for (int[] first : array) {
            StringBuilder stringBuffer = new StringBuilder();
            for (int second : first) {
                stringBuffer.append(second).append(",");
            }
            System.out.println(stringBuffer.toString());
        }
    }
}
