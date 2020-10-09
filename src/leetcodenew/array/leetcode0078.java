package leetcodenew.array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * C length 1 to C length length
 * I need some methods that input array and combination number
 */

public class leetcode0078 {

    //if number equal 2
    //拿出一个数组来 直到数组长度等于2
    //c43 c42的数 加上所有的但个数
    //C54 等于 所有的c53 加上但个数
    //5 number 2
    //0 1 2 3 4
    //01 02 03 04
    //12 13 14
    //23 24
    //34

    //5 number 3
    //0 1 2 3 4
    //012 013 014 023 024 034 (0 + C52出了0开头的)
    //123 124 134       (1 + C52出了0,1开头的)
    //234               (2 + C52出了0,1,2开头的)

    //5 number 4
    //0 1 2 3 4
    //0123 0124 0134 0234 （0+ C53出了0）
    //1234
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> arrayAll = new ArrayList<>();
        int[][] tmp = null;
        int lengthNext = nums.length;
        int point = 0;
        for (int i = 0; i < nums.length; i++) {
            int length = nums.length;
            int itemLength = i + 2;
            tmp = new int[length][itemLength];
            for (int j = 0; j < nums.length - i; j++) {
                tmp[0] = new int[nums.length][i + 2];
            }
        }
    }


//    public int[][] combinationMore2(int number, int[] array) {
//
//    }

    public static void main(String[] args) {
        int[][][] a = new int[][][]{new int[][]{new int[]{0, 1}, new int[]{0, 2}, new int[]{0, 3}, new int[]{0, 4}},
                new int[][]{new int[]{1, 2}, new int[]{1, 3}, new int[]{1, 4}},
                new int[][]{new int[]{2, 3}, new int[]{2, 4}},
                new int[][]{new int[]{3, 4}}
        };
        printArray3(a);
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

    public static void printArray3(int[][][] array) {
        for (int[][] first : array) {
            StringBuilder secondS = new StringBuilder();
            for (int[] second : first) {
                StringBuilder thirdS = new StringBuilder();
                for (int third : second) {
                    thirdS.append(third).append(",");
                }
                secondS.append(thirdS + " ");
            }
            System.out.println(secondS.toString());
        }
    }


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
}
