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
        int count = 0;
        ListNode current = head;
        while (current != null) {
            current = current.next;
            count++;
            if (count > 10010) {
                return true;
            }
        }
        return false;
    }
}
