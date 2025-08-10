package DSA.LinkedList;

// 237 - Delete Node in a Linked List
// leetcode link - https://leetcode.com/problems/delete-node-in-a-linked-list/description/

public class leetcode237 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    class Solution {
        public void deleteNode(ListNode node) {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }
}
