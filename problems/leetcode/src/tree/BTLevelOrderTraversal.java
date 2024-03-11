package tree;

import tree.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Took a while to figure out. Queuing and BFS are the obvious bit. What's not obvious
 * is that you need to have a way to figure out when the level ends within the queue.
 * So it's best to iterate for `level` counts.
 */
public class BTLevelOrderTraversal {
    public static void main(String[] args) {
        BTLevelOrderTraversal obj = new BTLevelOrderTraversal();
        System.out.println(obj.levelOrder(TreeNode.getExampleBalancedBST()));
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new LinkedList<>();
        }
        List<List<Integer>> output = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            int level = queue.size();
            List<Integer> outputLevel = new LinkedList<>();
            for(int i = 0; i < level; i++) {
                TreeNode node = queue.poll();
                outputLevel.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            output.add(outputLevel);
        }
        return output;
    }

    public List<List<Integer>> levelOrderAlt(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        helper(res, root, 0);
        return res;
    }

    public void helper(List<List<Integer>> res, TreeNode root, int height){
        if (root == null) return;
        if (height >= res.size()){
            res.add(new LinkedList<>());
        }
        res.get(height).add(root.val);
        helper(res, root.left, height+1);
        helper(res, root.right, height+1);
    }
}
