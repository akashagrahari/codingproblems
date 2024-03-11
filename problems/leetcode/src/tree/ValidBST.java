package tree;

import tree.common.TreeNode;

public class ValidBST {
    public static void main(String[] args) {
        ValidBST validBST = new ValidBST();
        System.out.println(validBST.isValidBST(TreeNode.getExampleUnbalancedBST()));
    }

    public boolean isValidBST(TreeNode root) {
        return dfs(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean dfs(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }

        return dfs(root.left, min, root.val) && (root.val < max && root.val > min) && dfs(root.right, root.val, max);
    }
}
