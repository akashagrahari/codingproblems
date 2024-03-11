package tree;

import tree.common.TreeNode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BuildTree {
    public static void main(String[] args) {
        BuildTree buildTree = new BuildTree();
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        buildTree.buildTree(preorder, inorder);
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> inorderMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }
        TreeNode root = buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, inorderMap);
        return root;
    }

    private TreeNode buildTree(int[] preorder, int preOrderL, int preOrderR, int[] inorder, int inOrderL, int inOrderR, Map<Integer, Integer> inorderMap) {
        if (preOrderL > preOrderR || inOrderL > inOrderR) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[preOrderL]);

        int rootPositionInorder = inorderMap.get(root.val);

        root.left = buildTree(preorder, preOrderL + 1, preOrderL + rootPositionInorder - inOrderL, inorder,
                inOrderL, rootPositionInorder - 1, inorderMap);
        root.right = buildTree(preorder, preOrderL + rootPositionInorder - inOrderL + 1, preOrderR,
                inorder, rootPositionInorder + 1, inOrderR, inorderMap);

        return root;
    }
}
