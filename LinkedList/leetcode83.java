package DSA.LinkedList;

// 83 - Remove Duplicates from Sorted List
// leetcode link:https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/

public class leetcode83 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }
}
