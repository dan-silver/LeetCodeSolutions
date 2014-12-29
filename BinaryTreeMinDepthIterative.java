/**

https://oj.leetcode.com/problems/minimum-depth-of-binary-tree/

Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

**/

// Iterative solution using a queue.  A more concise solution can be written with recursion


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
    public class TreeNodeWithHeight {
        public int height;
        TreeNode node;

        TreeNodeWithHeight (TreeNode n, int h) {
            node = n;
            height = h;
        }
    }
    
    Queue<TreeNodeWithHeight> queue = new LinkedList<TreeNodeWithHeight>();
    
    public int minDepth(TreeNode root) {
        if (root == null) return 0;

        queue.add(new TreeNodeWithHeight(root, 0));
        while (queue.size() != 0) {
            TreeNodeWithHeight container = queue.remove();
            TreeNode node = container.node;
            
            if (node.left == null && node.right == null)
                return container.height + 1;
            
            if (node.left != null) {
                queue.add(new TreeNodeWithHeight(node.left, container.height + 1));
            }
            if (node.right != null) {
                queue.add(new TreeNodeWithHeight(node.right, container.height + 1));
            }
        }
        return -1;
    }
}
