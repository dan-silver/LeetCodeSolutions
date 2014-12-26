/**

Given a binary tree, return the preorder traversal of its nodes' values.

https://oj.leetcode.com/problems/binary-tree-preorder-traversal/

Recursive Solution

**/


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

    public List<Integer> preorderTraversal(TreeNode root) {
        nodes = new ArrayList<Integer>();
        preOrder(root);
        return nodes;
    }

    public void preOrder(TreeNode root) {
        if (root == null)
            return;
        nodes.add(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }
}
