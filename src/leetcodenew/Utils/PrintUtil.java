package leetcodenew.Utils;

import java.util.List;

public class PrintUtil {
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

    public static void printList(List<List<Integer>> list) {
        for (List<Integer> first : list) {
            StringBuilder secondS = new StringBuilder();
            for (int second : first) {
                secondS.append(second).append(",");
            }
            System.out.println(secondS.toString());
        }
    }
}
