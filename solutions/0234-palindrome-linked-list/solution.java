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
    public boolean isPalindrome(ListNode head) {
        int[] vals = new int[100000];
        int l = 0;
        int r = 0;
        ListNode current = head;
        while (current != null) {
            vals[r++] = current.val;
            current = current.next;
        }
        r--;
        while (l < r) {
            if (vals[l] != vals[r]) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
