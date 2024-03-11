package tree;

import tree.common.TreeNode;

public class SubTree {
    public static void main(String[] args) {
        SubTree subTree = new SubTree();

        System.out.println(subTree.isSubtree(TreeNode.getExampleBalancedBST(),
                TreeNode.getExampleBalancedBST().right));
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == subRoot || subRoot == null) {
            return true;
        }

        if (root == null) {
            return false;
        }

        return isSameTree(root, subRoot) || isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == q) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if (p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
