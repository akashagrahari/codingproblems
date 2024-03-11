package tree;

import tree.common.TreeNode;

public class SameTree {
    public static void main(String[] args) {
        SameTree sameTree = new SameTree();

        System.out.println(sameTree.isSameTree(TreeNode.getExampleBalancedBST(),
                TreeNode.getExampleUnbalancedTree()));
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
