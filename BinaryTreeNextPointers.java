/**
 * Populating Next Right Pointers in Each Node
 * 
 * https://oj.leetcode.com/problems/populating-next-right-pointers-in-each-node/
 * 
 * Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.
 *
 * Initially, all next pointers are set to NULL.
 * 
 **/


/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        while (root != null) {
            TreeLinkNode r = root;
            while (r != null && r.left != null) {
                r.left.next = r.right;
                if (r.next != null)
                    r.right.next = r.next.left;
                r = r.next;
            }
            root = root.left;
        }
    }
}
