package leetcodenew.linkedlist;

import leetcodenew.ListNode;

public class leetcode0206 {
    /**
     * Reverse a singly linked list.
     * origin = 1 -> 2 -> 3 -> 4 -> 5 -> null
     * result = null
     *
     * tmp = 2 -> 3 -> 4 -> 5 -> null
     * result = 1 -> null
     * origin = 2 -> 3 -> 4 -> 5 -> null
     *
     */
    public static void main(String[] args) {
        ListNode root = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
        System.out.println(root);
        ListNode result = reverseList(root);
        System.out.println(result);
    }

    public static ListNode reverseList(ListNode head) {
        ListNode origin = head;
        ListNode result = null;
        while (origin.next != null) {
            ListNode tmp = origin.next;
            origin.next = result;
            result = origin;
            origin = tmp;
        }

        return result;
    }
}
