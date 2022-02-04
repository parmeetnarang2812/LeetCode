/**                     143. ReorderList
 
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

/* my leetcode soln
 class Solution {
    public ListNode midNode(ListNode node) {
        if (node == null || node.next == null)
            return node;
        ListNode slow = node, fast = node;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public ListNode reverse(ListNode node) {
        if (node == null || node.next == null)
            return node;

        ListNode curr = node, prev = null;
        while (curr != null) {
            ListNode forw = curr.next;

            curr.next = prev;

            prev = curr;
            curr = forw;
        }

        return prev;
    }
    public void reorderList(ListNode head) {
        if (head == null || head.next == null)
            return;

        ListNode midNode = midNode(head);
        ListNode nHead = midNode.next;
        midNode.next = null;

        nHead = reverse(nHead);

        ListNode c1 = head, c2 = nHead;
        while (c2 != null) {
            ListNode f1 = c1.next, f2 = c2.next; // backup

            c1.next = c2; // linkup
            c2.next = f1;

            c1 = f1;
            c2 = f2;
        }
    }
   
}
*/