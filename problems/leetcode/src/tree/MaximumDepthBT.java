package tree;

import tree.common.TreeNode;

public class MaximumDepthBT {
    public static void main(String[] args) {
        MaximumDepthBT maximumDepthBT = new MaximumDepthBT();

        System.out.println(maximumDepthBT.maxDepth(TreeNode.getExampleUnbalancedTree()));
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return Math.max(leftDepth, rightDepth) + 1;
    }
}
