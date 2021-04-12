package deprecated.leetcode.week1;

public class leetcode2 {



    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode pre = new ListNode(0);//新建一个链表 首位等于0
            ListNode cur = pre;//创建一个当前链表 等于 前链表
            int carry = 0;
            while (l1 != null || l2 != null) {
                int x = l1 == null ? 0 : l1.val;
                int y = l2 == null ? 0 : l2.val;

                int sum = x + y + carry;//当前位数加上 再加上 之前的上一位加上 9+9 = 18 需要吧1 加到下一位
                carry = sum / 10;//消去个位赋值给 carry
                sum = sum % 10;//sum等于个位
                cur.next = new ListNode(sum);


                cur = cur.next;
                if (l1 != null) {
                    l1 = l1.next;
                }
                if (l2 != null) {
                    l2 = l2.next;
                }
            }
            if (carry == 1) {
                cur.next = new ListNode(carry);
            }
            return pre.next;
        }
    }
}
