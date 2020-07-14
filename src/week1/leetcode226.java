package week1;

import com.sun.source.tree.Tree;

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
