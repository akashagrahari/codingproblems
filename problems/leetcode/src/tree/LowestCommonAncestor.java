package tree;

import tree.common.TreeNode;

/**
 * Interesting problem
 * Recursively search for either p or q in subtrees. If you find either in both,
 * then root is the LCA. Otherwise the LCA is the root of the subtree where you found
 * either p or q
 */

public class LowestCommonAncestor {
    public static void main(String[] args) {
        LowestCommonAncestor obj = new LowestCommonAncestor();
        TreeNode tree = TreeNode.getExampleUnbalancedBST();
        System.out.println(obj.lowestCommonAncestor(tree, tree.left, tree.right).val);
        System.out.println(obj.lowestCommonAncestor(tree, tree.left, tree.left.right).val);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }

        if (root == p || root == q) {
            return root;
        }

        TreeNode l = lowestCommonAncestor(root.left, p, q);
        TreeNode r = lowestCommonAncestor(root.right, p, q);

        if (l != null && r != null) {
            return root;
        } else if (l != null) {
            return l;
        } else {
            return r;
        }
    }
}
