package leetcode.week1;

/**
 * invert Binary Tree
 * invert a binary tree
 * Example:
 * input
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 * out put
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 *
 * trivia
 * This problem was inspired by this original tweet by Max Howeli
 *
 *
 *
 */

public class leetcode226 {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static TreeNode inverTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode right = inverTree(root.right);
        TreeNode left = inverTree(root.left);
        root.left = right;
        root.right = left;
        return root;
    }
}
