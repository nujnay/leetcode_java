package leetcode.week2;

public class leetcode108 {
    /**
     * 108 Convert sorted Array to Binary Search Tress
     *
     * Given an array where elements are sorted in ascending order, convert it to a
     * hight balanced BST
     * for this problem, a height-balanced binary tree is defined as a binary
     * tree in which the depth of the two subtrees of every node never differ by
     * more than 1
     * Example:
     * Given the sorted array: [-10, -3, 0, 5, 9],
     * One possible answer is: [0,-1, 9, -10, null, 5], which
     * represents the following height balanced BST:
     *          0
     *         / \
     *       -3   9
     *       /   /
     *     -10  5
     */



    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        return tset1(nums, 0, nums.length - 1);
    }

    public static TreeNode tset1(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = (left - right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = tset1(nums, left, mid - 1);
        root.right = tset1(nums, mid + 1, right);
        return root;
    }
}
