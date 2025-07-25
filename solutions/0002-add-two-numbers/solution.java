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
import java.math.BigInteger;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger a = getNumber(l1);
        BigInteger b = getNumber(l2);
        return setNumber(a.add(b));

    }

    public BigInteger getNumber(ListNode listNode) {
        if (listNode.next == null) {
            return new BigInteger(String.valueOf(listNode.val));
        } else {
            return getNumber(listNode.next).multiply(BigInteger.TEN).add(new BigInteger(String.valueOf(listNode.val)));
        }
    }

    public ListNode setNumber(BigInteger value) {
        String[] number = String.valueOf(value).split("");
        int eol = number.length - 1;
        ListNode result = null;
        ListNode next = null;
        for (int i = 0; i <= eol; i++) {
            result = new ListNode(Integer.parseInt(number[i]), next);
            next = result;
        }
        return result;
    }
}
