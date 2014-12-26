/**

https://oj.leetcode.com/problems/remove-duplicates-from-sorted-list-ii/

Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.

For example,
Given 1->2->3->3->4->4->5, return 1->2->5.
Given 1->1->1->2->3, return 2->3.

**/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current  = head;
        ListNode runner   = null;
        ListNode previous = null;
    

        while (current != null && current.next != null) {
            runner = current;
            while (runner.next != null && current.val == runner.next.val) {
                runner = runner.next;
            }
            
            if (runner != current) { //need to remove refs to all duplicates
                //runner moved at least once, is currently at last duplicate
                if (head == current) {
                    head = runner.next;
                    current = head;
                    previous = current;
                } else {
                    previous.next = runner.next;
                    current = previous.next;
                }
            } else {
                previous = current;
                current  = current.next;
            }
        }
        
        return head;
    }
}
