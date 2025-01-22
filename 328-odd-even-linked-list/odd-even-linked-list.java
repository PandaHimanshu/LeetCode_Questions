/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        // Handle edge cases for empty or single-node lists
        if (head == null || head.next == null) {
            return head;
        }

        // Initialize pointers for odd and even lists
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        // Rearrange nodes
        while (even != null && even.next != null) {
            odd.next = even.next;        // Link next odd node
            odd = odd.next;              // Move odd pointer forward

            even.next = odd.next;        // Link next even node
            even = even.next;            // Move even pointer forward
        }

        // Connect the odd list to the even list
        odd.next = evenHead;

        return head;
    }
}
