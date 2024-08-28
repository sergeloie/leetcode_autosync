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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = null;
        ListNode next1 = list1;
        ListNode next2 = list2;
        ListNode current = null;

        if (next1 != null & next2 != null) {
            if (next1.val <= next2.val) {
                head = next1;
                next1 = next1.next;
            } else {
                head = next2;
                next2 = next2.next;
            }
        } else if (next1 == null && next2 == null) {
            return null;
        } else if (next1 == null) {
            head = next2;
            next2 = next2.next;
        } else if (next2 == null) {
            head = next1;
            next1 = next1.next;
        }
        current = head;
        while (next1 != null || next2 != null) {
            if (next1 != null & next2 != null) {
                if (next1.val <= next2.val) {
                    current.next = next1;
                    current = next1;
                    next1 = next1.next;
                } else {
                    current.next = next2;
                    current = next2;
                    next2 = next2.next;
                }
            } else if (next1 == null) {
                current.next = next2;
                current = next2;
                next2 = next2.next;
            } else if (next2 == null) {
                current.next = next1;
                current = next1;
                next1 = next1.next;
            }
        }
        return head;
    }
}
