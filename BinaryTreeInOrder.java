/**
 * 
 * https://oj.leetcode.com/problems/binary-tree-inorder-traversal/
 * 
 * Given a binary tree, return the inorder traversal of its nodes' values.
 * 
 * Recursive solution. 
 * 
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
    
    ArrayList<Integer> nodes = new ArrayList<>();
    
    public List<Integer> inorderTraversal(TreeNode root) {
        inOrderTraverse(root);
        return nodes;
    }
    
    public void inOrderTraverse(TreeNode node) {
        if (node == null) return;
        if (node.left != null) inOrderTraverse(node.left);
        nodes.add(node.val);
        if (node.right != null) inOrderTraverse(node.right);
    }
}
