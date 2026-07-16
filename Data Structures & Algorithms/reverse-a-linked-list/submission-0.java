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
        ListNode dummy = null;
        ListNode ptr = head;
        while (ptr!=null)
        {
            if (dummy == null)
            {
                dummy = new ListNode(ptr.val);
            }
            else
            {
                ListNode insert = new ListNode(ptr.val, dummy);
                dummy = insert;
            }

            ptr = ptr.next;
        }
        return dummy;
    }
}
