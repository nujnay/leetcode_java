package leetcodenew.linkedlist;

import leetcodenew.ListNode;

public class leetcode0206 {
    /**
     * Reverse a singly linked list.
     * 1 -> 2 -> 3 -> 4 -> 5 -> null
     *
     * 2 -> 3 -> 4 -> 5 -> null
     *
     * 1 -> 2
     *
     * 3 -> 2 -> 1
     *
     *
     *
     */
    public static void main(String[] args) {

    }

    public ListNode reverseList(ListNode head) {
        ListNode tmp = head;
        ListNode result = null;
        while (tmp.next != null) {
            result = tmp.next;
            result.next = tmp;
        }
    }
}
