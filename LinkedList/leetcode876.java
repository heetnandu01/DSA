package DSA.LinkedList;

// 876 - Middle of the Linked List
// leetcode link:https://leetcode.com/problems/middle-of-the-linked-list/description/

public class leetcode876 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    class Solution {
        public ListNode middleNode(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

            }
            return slow;
        }
    }
}
