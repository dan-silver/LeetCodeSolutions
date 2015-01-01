/**
 * 
 * Given a binary tree, return the postorder traversal of its nodes' values.
 * 
 * https://oj.leetcode.com/problems/binary-tree-postorder-traversal/
 * 
 */

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Solution {
    private List<Integer> nodes;

    public List<Integer> postorderTraversal(TreeNode root) {
        nodes = new ArrayList<Integer>();
        postOrder(root);
        return nodes;
    }

    public void postOrder(TreeNode root) {
        if (root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        nodes.add(root.val);
    }
}
