package tree;

import tree.common.TreeNode;

public class InvertBinaryTree {


    public static void main(String[] args) {
        TreeNode treeNode = TreeNode.getExampleBalancedBST();

        InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
        invertBinaryTree.invertTree(treeNode);
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
