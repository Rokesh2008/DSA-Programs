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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int result[]={-1,-1};
        if(head==null||head.next==null||head.next.next==null) return result;
        int min=Integer.MAX_VALUE;
        int firstcp=-1;
        int prevcp=-1;
        ListNode prev=head;
        ListNode curr=head.next;
        int index=1;
        while(curr.next!=null){
            if((curr.val>prev.val &&curr.val>curr.next.val)||
            (curr.val<prev.val&&curr.val<curr.next.val)){
                  if(firstcp==-1) firstcp=index;
                  else{
                    min=Math.min(min,index-prevcp);
                    result[1]=index-firstcp;
                  }
                  prevcp=index;
            }
            prev=curr;
            curr=curr.next;
            index++;
        } 
        if(min!=Integer.MAX_VALUE){
            result[0]=min;
        }
        return result;
    }
}