public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        boolean hasCycle = false;

        // Phase 1: Detect if a cycle exists
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast) {
                hasCycle = true;
                break; // Exit loop once they meet
            }
        }

        // If no cycle was found, return null
        if (!hasCycle) {
            return null;
        }

        // Phase 2: Find the start of the cycle
        // Reset slow to head, keep fast at the meeting point
        slow = head;
        
        // Move both one step at a time until they meet
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        
        return slow; // This is the start of the cycle
    }
}   
