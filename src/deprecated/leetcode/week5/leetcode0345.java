package deprecated.leetcode.week5;

public class leetcode0345 {
    /**
     * Write a function that takes a string as input and reverse only the vowels of a string.
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/reverse-vowels-of-a-string
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public static String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int l = 0;
        int r = n - 1;
        while (l < r) {
            while (l < n && !isVowel(arr[l])) {
                l++;
            }
            while (r >= 0 && !isVowel(arr[r])) {
                r--;
            }
            if (l >= r) {
                break;
            }
            swap(arr, l, r);
            l++;
            r++;
        }
        return new String(arr);
    }

    public static boolean isVowel(char c) {
        if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U') {
            return true;
        } else {
            return false;
        }
    }

    public static void swap(char[] chars, int a, int b) {
        char tmp = chars[a];
        chars[a] = chars[b];
        chars[b] = tmp;
    }
}
