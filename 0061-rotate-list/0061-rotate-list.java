class Solution{
    public ListNode rotateRight(ListNode head, int k){
        if (head == null || head.next == null){
            return head;
        }
        int length = 1;
        ListNode tail = head;
        while(tail.next!=null){
            tail = tail.next;
            length++;
        }
        k = k % length;
        if(k==0){
            return head;
        }
        int steps = length - k;
        ListNode newTail = head;
        for(int i = 1;i<steps;i++){
            newTail = newTail.next;
        }
        ListNode newHead = newTail.next;
        newTail.next = null;
        tail.next = head;
        return newHead;        
    }
}