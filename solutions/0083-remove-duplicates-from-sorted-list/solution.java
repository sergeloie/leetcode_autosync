/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null) {
            setNextToNotEqualVal(current);
            current = current.next;
        }
        return head;
    }

    public void setNextToNotEqualVal(ListNode node) {
        while (node != null && node.next != null && node.val == node.next.val) {
            node.next = node.next.next;
        }
    }
}
