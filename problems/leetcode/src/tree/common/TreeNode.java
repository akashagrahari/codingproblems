package tree.common;


public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode getExampleBalancedBST() {
        TreeNode treeNode1 = new TreeNode(1, null, null);
        TreeNode treeNode3 = new TreeNode(3, null, null);
        TreeNode treeNode2 = new TreeNode(2, treeNode1, treeNode3);
        TreeNode treeNode6 = new TreeNode(6, null, null);
        TreeNode treeNode9 = new TreeNode(9, null, null);
        TreeNode treeNode7 = new TreeNode(7, treeNode6, treeNode9);
        TreeNode treeNode4 = new TreeNode(4, treeNode2, treeNode7);

        return treeNode4;
    }

    public static TreeNode getExampleUnbalancedTree() {
        TreeNode treeNode15 = new TreeNode(15, null, null);
        TreeNode treeNode7 = new TreeNode(7, null, null);
        TreeNode treeNode20 = new TreeNode(20, treeNode15, treeNode7);
        TreeNode treeNode9 = new TreeNode(9, null, null);
        TreeNode treeNode3 = new TreeNode(3, treeNode9, treeNode20);

        return treeNode3;
    }

    public static TreeNode getExampleUnbalancedBST() {
        TreeNode treeNode3 = new TreeNode(3, null, null);
        TreeNode treeNode5 = new TreeNode(5, null, null);
        TreeNode treeNode4 = new TreeNode(4, treeNode3, treeNode5);
        TreeNode treeNode0 = new TreeNode(0, null, null);
        TreeNode treeNode2 = new TreeNode(2, treeNode0, treeNode4);
        TreeNode treeNode7 = new TreeNode(7, null, null);
        TreeNode treeNode9 = new TreeNode(9, null, null);
        TreeNode treeNode8 = new TreeNode(8, treeNode7, treeNode9);
        TreeNode treeNode6 = new TreeNode(6, treeNode2, treeNode8);

        return treeNode6;
    }
}