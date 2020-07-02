package practice.week3;

import practice.utility.TreeNode;

public class Day1_BinarySearchTree {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null)
            return null;
        if (root.val > val) return searchBST(root.left, val);
        else if (root.val < val) return searchBST(root.right, val);
        else return root;
    }
}
