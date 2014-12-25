/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
//Given two binary trees, write a function to check if they are equal or not.

//Two binary trees are considered equal if they are structurally identical and the nodes have the same value.

//https://oj.leetcode.com/problems/same-tree/
 
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //both are empty (same) ✓
        if (p == null && q == null) return true;
        
        //one is null, the other is not ✖
        if (p == null || q == null) return false;

        if (p.val != q.val) return false;
        
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
