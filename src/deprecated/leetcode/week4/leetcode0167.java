package deprecated.leetcode.week4;

public class leetcode0167 {
    public static void main(String[] args) {
        for (int i : twoSum1(new int[]{1, 2}, 3)) {
            System.out.println(i);
        }
        for (int i : twoSum1(new int[]{0, 1, 2}, 3)) {
            System.out.println(i);
        }
    }
    //167. Two Sum II - Input array is sorted

    /**
     * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
     * <p>
     * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
     * <p>
     * Note:
     * <p>
     * Your returned answers (both index1 and index2) are not zero-based.
     * You may assume that each input would have exactly one solution and you may not use the same element twice.
     * Example:
     * <p>
     * Input: numbers = [2,7,11,15], target = 9
     * Output: [1,2]
     * Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
     *
     * @param numbers
     * @param target
     * @return 1只有一个 2
     */
    public static int[] twoSum1(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {//便利数组所有的元素
            int low = i + 1;//定义低的变量等于当前下表加一
            int high = numbers.length - 1;//定义高的变量 等于数组长度减一
            while (low <= high) {//如果低的坐标等于或者大于打得变量
                int mid = (high - low) / 2 + low;//中间的变量的高的变量减低的变量的一半+低的变量 mid = 1
                if (numbers[mid] == target - numbers[i]) { // 2  == 3 - 1
                    return new int[]{i + 1, mid + 1}; // 1 2
                } else if (numbers[mid] > target - numbers[i]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return new int[]{-1, -1};
    }

    /**
     * 双指针
     * @param numbers
     * @param target
     * @return
     */
    public static int[] twoSum2(int[] numbers, int target) {
        int low = 0, high = numbers.length - 1;
        while (low < high) {
            int sum = numbers[low] + numbers[high];
            if (sum == target) {
                return new int[]{low + 1, high + 1};
            } else if (sum < target) {
                ++low;
            } else {
                --high;
            }
        }
        return new int[]{-1, -1};
    }
}
