package leetcode.week6;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 *
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * alright hey what'up guys they`re quite here to tech encoding stuff on twich and
 * Youtube and yeah that's cool right
 * this is the longest substring without repeating characters
 * so this is given a string find the length of the longest substring
 * substring meaning part of the string that don't have repeating characters
 * so in this case you know this is a substring any this is a substring
 *
 *
 */
public class leetcode0003 {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> occ = new HashSet<>();
        int n = s.length();
        int rk = -1;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (i != 0) {
                occ.remove(s.charAt(i - 1));
            }
            while (!occ.contains(s.charAt(rk + 1))) {
                occ.add(s.charAt(rk + 1));
            }
            ans = Math.max(ans, rk - i + 1);
        }
        return ans;
    }
}
