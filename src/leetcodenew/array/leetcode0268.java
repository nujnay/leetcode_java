package leetcodenew.array;

/**
 * given an array numbers containing n distinct numbers in the range [ 0, n]
 * , return the only number in the range that is missing from the array .
 * follow up: could you implement a solution using only o(1) extra space conplecity and o(n)
 * runtime complexity?
 */
public class leetcode0268 {
    public int missingNumber(int[] nums) {

        int length = 0;
        boolean thereAreZero = false;
        int[] array = new int[0];
        for (int i : nums) {
            if (i + 1 > length) {
                length = i + 1;
                array = new int[i + 1];
            }
            if (i == 0) {
                thereAreZero = true;
            }
            array[i] = i;
        }
        int empty = -1;
        for (int i2 = 0; i2 < array.length ;i2++) {
            if (i2 != 0) {
                if (array[i2] == 0) {
                    empty = i2;
                }
            }
        }
        if (thereAreZero) {
            return empty;
        } else {
            return 0;
        }
        //first I need sort it, what should I sort it
        //I need dynamic generate a array
    }
    /**
     * my first solution is misunderstand the description
     * I think it is the max number it the array length
     */

}
