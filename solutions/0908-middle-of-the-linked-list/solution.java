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
    public ListNode middleNode(ListNode head) {
        int length = getLength(head);
        int middle = length / 2 + 1;
        ListNode result = head;
        for (int i = 1; i < middle; i++) {
            result = result.next;
        }
        return result;
    }
    public int getLength(ListNode listNode) {
        int count = 0;
        ListNode current = listNode;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }
}
