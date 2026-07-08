class Solution {
    public ListNode middleNode(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode temp = head;
        int count = 0;

        while(temp != null) {
            count++;
            temp = temp.next;
        }

        int mid = count / 2 + 1;
        temp = head;

        while(temp != null) {
            mid--;

            if(mid == 0) break;

            temp = temp.next;
        }

        return temp;
    }
}