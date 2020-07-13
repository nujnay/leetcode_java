package middle;

public class leetcode104 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

    }

    public static int test1(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int left_height = test1(root.left);
            int right_height = test1(root.right);
            return Math.max(left_height, right_height) + 1;
        }

    }

}
