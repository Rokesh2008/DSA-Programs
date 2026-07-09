class Solution {
    public ListNode findMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public boolean isPalindrome(ListNode head) {
        if(head == null){
            return true;
        }

        // Step 1: Find middle
        ListNode mid = findMid(head);

        // Step 2: Reverse second half
        ListNode prev = null;
        ListNode curr = mid.next;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3: Compare both halves
        ListNode right = prev;
        ListNode left = head;

        while(right != null){
            if(left.val != right.val){
                return false;
            }

            left = left.next;
            right = right.next;
        }

        return true;
    }
}