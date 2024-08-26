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
    public ListNode reverseList(ListNode head) {
        ListNode l = null;
        ListNode c = head;
        ListNode r = head;
        while (r != null) {
            r = c.next;
            c.next = l;
            l = c;
            c = r;
        }
        return l;
    }
}
