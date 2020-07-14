package week2;

import com.sun.source.tree.Tree;

public class leetcode108 {
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
