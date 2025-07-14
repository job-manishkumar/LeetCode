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

    public int getDecimalValue(ListNode head) {
        return findDecimalValue(head);
    }

    public int findDecimalValue(ListNode node) {
        int ans = 0;
        while (node != null) {
            ans = (ans << 1) | node.val;
            node = node.next;
        }
        return ans;
    }
}
