/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public boolean hasCycle(ListNode head) {
        
        if (head == null)      return false;
        if (head.next == null) return false;

        ListNode p1 = head,
                 p2 = head;
        
        do {
            p1 = p1.next;
            p2 = p2.next;
            if (p2 == null)
                return false;

            p2 = p2.next;
            if (p1 == null || p2 == null) {
                return false;
            }
        } while (p1 != p2);

        return true;
    }
}
