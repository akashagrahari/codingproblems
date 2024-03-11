package tree;

import tree.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class KSmallestBST {

    List<Integer> arr = new ArrayList<>();
    public static void main(String[] args) {
        KSmallestBST obj = new KSmallestBST();
        System.out.println(obj.kthSmallest(TreeNode.getExampleBalancedBST(), 5)); //k=3, output =3; k=4 output =4; k=5 output=6
    }


    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        System.out.println(arr);
        return arr.get(k-1);
    }

    public void inorder(TreeNode root, int k) {
        if (root == null || arr.size() >= k) {
            return;
        }

        inorder(root.left, k);
        arr.add(root.val);
        inorder(root.right, k);
    }

}
