//package leetcodenew.array;
//
//import kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt;
//
//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
///**
// * C length 1 to C length length
// * I need some methods that input array and combination number
// */
//
//public class leetcode0078 {
//
//    //if number equal 2
//    //拿出一个数组来 直到数组长度等于2
//    //c43 c42的数 加上所有的但个数
//    //C54 等于 所有的c53 加上但个数
//    //5 number 2
//    //0 1 2 3 4
//    //01 02 03 04
//    //12 13 14
//    //23 24
//    //34
//
//    //5 number 3
//    //0 1 2 3 4
//    //012 013 014 023 024 034 (0 + C52出了0开头的)
//    //123 124 134       (1 + C52出了0,1开头的)
//    //234               (2 + C52出了0,1,2开头的)
//
//    //5 number 4
//    //0 1 2 3 4
//    //0123 0124 0134 0234 （0+ C53出了0）
//    //1234
//
//    //4 number 2
//    //0 1 2 3
//    //01 02 03
//    //12 13
//    //23
//
//    //4 number 3
//    //0 1 2 3
//    //012 013 023
//    //123
//
//    public static List<List<Integer>> subsets(int[] nums) {
//
//
//        if (nums.length == 0) {
//            List<List<Integer>> arrayLists = new ArrayList<>();
//            List<Integer> arrayList = new ArrayList<>();
//            arrayLists.add(arrayList);
//            return arrayLists;
//        }
//        if (nums.length == 1) {
//            List<List<Integer>> arrayLists = new ArrayList<>();
//            List<Integer> arrayList = new ArrayList<>();
//            arrayList.add(nums[0]);
//            arrayLists.add(arrayList);
//            return arrayLists;
//        }
//        if (nums.length == 2) {
//            List<List<Integer>> arrayLists = new ArrayList<>();
//            List<Integer> arrayList = new ArrayList<>();
//            arrayList.add(nums[0]);
//            arrayList.add(nums[1]);
//            arrayLists.add(arrayList);
//            return arrayLists;
//        }
//        int[][] array2 = combination2(nums);
//        if (nums.length == 3) {
//            return array2List(array2);
//        }
//        //5 number 2
//        //0 1 2 3 4
//        //01 02 03 04
//        //12 13 14
//        //23 24
//        //34
//
//        //5 number 3
//        //0 1 2 3 4
//        //012 013 014 023 024 034 (0 + C52出了0开头的)
//        //123 124 134       (1 + C52出了0,1开头的)
//        //234               (2 + C52出了0,1,2开头的)
//
//        //5 number 4
//        //0 1 2 3 4
//        //0123 0124 0134 0234 （0+ C53出了0）
//        //1234
//
//        int[][] tmp = new int[array2.length - nums.length + 1][2];
//        System.arraycopy(array2, nums.length - 1, tmp, 0, array2.length - nums.length + 1);
//        int point = nums.length - 1;
//        int[][] second = new int[][];
//        for (int i = 3; i < nums.length; i++) { //中间部分有几次 5 number 3 和 5 number 4
//            for (int j = 0; j < nums.length - i + 1; j++) { //0 开头的 1 开头的 2 开头的
//                int one = nums[j];
//                for (int a = 0; a < tmp.length; a++) { // 0 开头的 要和 上一个数组1开头的结合
//                    combine1AndArray(one, tmp[a]);
//
//                }
//            }
//        }
//    }
//
//    public static int[] combine1AndArray(int one, int[] array) {
//        int[] combinationChild = new int[one + array.length];
//        combinationChild[0] = one;
//        System.arraycopy(array, 0, combinationChild, 1, array.length);
//        return combinationChild;
//    }
//
//    public static int kCombination(int n, int k) {
//        return factorials(n) / (factorials(k) * factorials(n - k));
//    }
//
//    public static int factorials(int o) {
//        int factorials = 1;
//        for (int i = 1; i <= o; i++) {
//            factorials *= i;
//        }
//        return factorials;
//    }
//
//
////    public int[][] combinationMore2(int number, int[] array) {
////
////    }
//
//    public static void main(String[] args) {
////        System.out.println(kCombination(5, 2));
////        int[][][] a = new int[][][]{new int[][]{new int[]{0, 1}, new int[]{0, 2}, new int[]{0, 3}, new int[]{0, 4}},
////                new int[][]{new int[]{1, 2}, new int[]{1, 3}, new int[]{1, 4}},
////                new int[][]{new int[]{2, 3}, new int[]{2, 4}},
////                new int[][]{new int[]{3, 4}}
////        };
////        printArray3(a);
////        int[][] a = new int[][]{new int[]{0, 1}, new int[]{0, 2}, new int[]{0, 3},
////                new int[]{1, 2}, new int[]{1, 3}, new int[]{2, 3}
////        };
////        printList(array2List(a));
//    }
//
//    public static void printArray(int[][] array) {
//        for (int[] first : array) {
//            StringBuilder stringBuffer = new StringBuilder();
//            for (int second : first) {
//                stringBuffer.append(second).append(",");
//            }
//            System.out.println(stringBuffer.toString());
//        }
//    }
//
//    public static void printArray3(int[][][] array) {
//        for (int[][] first : array) {
//            StringBuilder secondS = new StringBuilder();
//            for (int[] second : first) {
//                StringBuilder thirdS = new StringBuilder();
//                for (int third : second) {
//                    thirdS.append(third).append(",");
//                }
//                secondS.append(thirdS + " ");
//            }
//            System.out.println(secondS.toString());
//        }
//    }
//
//    public static void printList(List<List<Integer>> list) {
//        for (List<Integer> first : list) {
//            StringBuilder secondS = new StringBuilder();
//            for (int second : first) {
//                secondS.append(second).append(",");
//            }
//            System.out.println(secondS.toString());
//        }
//    }
//
//    public static List<List<Integer>> array2List(int[][] array) {
//        List<List<Integer>> arrayLists = new ArrayList<>();
//        for (int[] first : array) {
//            List<Integer> arrayList = new ArrayList<>();
//            for (int second : first) {
//                arrayList.add(second);
//            }
//            arrayLists.add(arrayList);
//        }
//        return arrayLists;
//    }
//
//
//    public static int[][] combination2(int[] nums) {
//        int arraySumLength = 0;
//        for (int i = nums.length - 1; i > 0; i--) {
//            arraySumLength += i;
//        }
//        int[][] arrays = new int[arraySumLength][2];
//        int[] tmpArray = null;
//        int point = 0;
//        // 4 number 0 1 2 3
//        // 0    1   2   3   4   5
//        // 01   02  03  12  13  23
//        int position = 0;
//        for (int i = 0; i < nums.length - 1; i++) {
//            point = nums[i];
//            tmpArray = new int[nums.length - i - 1];
//            System.arraycopy(nums, i + 1, tmpArray, 0, nums.length - 1 - i);
//            for (int j = 0; j < tmpArray.length; j++) {
//                arrays[position] = new int[]{point, tmpArray[j]};
//                position++;
//            }
//        }
//        return arrays;
//    }
//}
