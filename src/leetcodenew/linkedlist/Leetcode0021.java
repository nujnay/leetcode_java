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
 */


class Solution {
    //Fill in the smaller one
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode leftL1 = l1;
        ListNode leftL2 = l2;
        ListNode nextL1 = l1;
        ListNode nextL2 = l2;
        ListNode TmpL1 = null;
        ListNode TmpL2 = null;
        do {
            if (leftL1.val < leftL2.val) {
                TmpL1 = leftL1;
                TmpL1.next = null;
                result = addToLast(TmpL1, result);
                nextL1 = leftL1.next;
                leftL1 = nextL1;
            }
            if (leftL1.val > leftL2.val) {
                TmpL2 = leftL2;
                TmpL2.next = null;
                result = addToLast(TmpL2, result);
                nextL2 = leftL2.next;
                leftL2 = nextL2;
            }
            if (leftL1.val == leftL2.val) {
                TmpL1 = leftL1;
                TmpL1.next = null;
                result = addToLast(TmpL1, result);
                TmpL2 = leftL2;
                TmpL2.next = null;
                result = addToLast(TmpL2, result);
                nextL1 = leftL1.next;
                leftL1 = nextL1;
                nextL2 = leftL2.next;
                leftL2 = nextL2;
            }
        } while (leftL1.next == null && leftL2.next == null);

        return result;
    }

    public ListNode addToLast(ListNode last, ListNode root) {
        ListNode current = root;
        ListNode tmp = null;
        if (root == null) {
            root = last;
            return root;
        }
        for (; ; ) {
            if (current.next == null) {
                current.next = last;
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
        ListNode root = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
        System.out.println(root);
        ListNode add = new ListNode(6, null);
        System.out.println(add);
        ListNode result = solution.addToLast(add, root);
        System.out.println(result);
    }
}
