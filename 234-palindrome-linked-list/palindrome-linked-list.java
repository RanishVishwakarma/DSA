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
        if (head == null || head.next == null) {
            return true;
        }

        ListNode current = head;

        Stack<Integer> stack = new Stack<>();
        
        while(current != null) {
            stack.push(current.val);
            current = current.next;
        }

        current = head;

        while (current != null) {

            if(current.val != stack.pop()) {
                return false;
            }

            current = current.next;
        }
        return true;
    }
}