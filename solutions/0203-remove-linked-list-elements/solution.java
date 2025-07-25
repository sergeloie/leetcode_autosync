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
    public ListNode removeElements(ListNode head, int val) {
        ListNode newHead = head;
        while (newHead != null && newHead.val == val) {
            newHead = newHead.next;
        }
        ListNode current = newHead;
        while (current != null && current.next != null) {
            setNextToNonTarget(current,val);
            current = current.next;
        }
        return newHead;
    }
    
    public void setNextToNonTarget(ListNode node, int target) {
        while (node.next != null && node.next.val == target) {
            node.next = node.next.next;
        }
    }
}
