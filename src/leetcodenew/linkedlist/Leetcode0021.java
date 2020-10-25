package leetcodenew.linkedlist;

import leetcodenew.ListNode;

import javax.swing.plaf.IconUIResource;


/**
 * 21. Merge Two Sorted Lists
 * Merge two sorted linked lists and return it as a new sorted list.
 * The new list should be made by splicing together the nodes of the first two lists.
 * <p>
 * leftL1 1 -> 2 -> 3 -> 4 -> 5 -> 6
 * leftL2 1 -> 5 -> 7
 * result null
 * <p>
 * leftL1 2 -> 3 -> 4 -> 5 -> 6
 * leftL2 5 -> 7
 * result 1 -> 1 -> null
 * <p>
 * leftL1 3 -> 4 -> 5 -> 6
 * leftL2 5 -> 7
 * result 1 -> 1 -> 2 -> null
 * <p>
 * leftL1 4 -> 5 -> 6
 * leftL2 5 -> 7
 * result 1 -> 1 -> 2 -> 3 -> null
 * <p>
 * leftL1 5 -> 6
 * leftL2 5 -> 7
 * result 1 -> 1 -> 2 -> 3 -> 4 -> null
 * <p>
 * leftL1 6
 * leftL2 7
 * result 1 -> 1 -> 2 -> 3 -> 4 -> 5 -> 5 -> null
 * <p>
 * leftL1
 * leftL2 7
 * result 1 -> 1 -> 2 -> 3 -> 4 -> 5 -> 5 -> 6 -> null
 * <p>
 * leftL1 2 -> 5 -> 6
 * leftL2 1 -> 3 -> 4
 * result null
 * <p>
 * leftL1 2 -> 5 -> 6
 * leftL2 3 -> 4
 * result 1 -> null
 * <p>
 * leftL1 5 -> 6
 * leftL2 4
 * result 1 -> 2 -> 3 -> null
 *
 *
 * leftL1 1 -> 2 -> 3 -> 4 -> 5
 * leftL2 6 -> null
 * result
 */


class Solution {
    //Fill in the smaller one
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode leftL1 = l1;
        ListNode leftL2 = l2;
        ListNode nextL1 = null;
        ListNode nextL2 = null;
        while (leftL1 != null || leftL2 != null) {
            if (leftL1 == null) {
                result = addToLast(leftL2, result);
                nextL2 = leftL2.next;
                leftL2 = nextL2;
            }
            if (leftL2 == null) {
                result = addToLast(leftL1, result);
                nextL1 = leftL1.next;
                leftL1 = nextL1;
            }
            if (leftL1 != null && leftL2 != null) {
                if (leftL1.val < leftL2.val) {
                    result = addToLast(leftL1, result);
                    nextL1 = leftL1.next;
                    leftL1 = nextL1;
                } else if (leftL1.val > leftL2.val) {
                    result = addToLast(leftL2, result);
                    nextL2 = leftL2.next;
                    leftL2 = nextL2;
                } else {
                    result = addToLast(leftL1, result);
                    result = addToLast(leftL2, result);
                    nextL1 = leftL1.next;
                    leftL1 = nextL1;
                    nextL2 = leftL2.next;
                    leftL2 = nextL2;
                }
            }
        }
        ;

        return result;
    }

    public ListNode addToLast(ListNode last, ListNode root) {
        ListNode lastTrue = new ListNode(last.val);
        ListNode current = root;
        ListNode tmp = null;
        if (root == null) {
            root = lastTrue;
            return root;
        }
        for (; ; ) {
            if (current.next == null) {
                current.next = lastTrue;
                break;
            } else {
                tmp = current.next;
                current = tmp;
            }
        }
        return root;
    }
}

public class Leetcode0021 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
        System.out.println(l1);
        ListNode l2 = new ListNode(6, null);
        System.out.println(l2);
        ListNode result = solution.mergeTwoLists(l1, l2);
        System.out.println(result);
    }
}
