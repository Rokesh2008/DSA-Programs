class Solution {
    public int pairSum(ListNode head) {
        int c=0;
        ListNode temp=head;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }
        int [] wow =new int [c];
        temp=head;
        int p=0;
        while(temp!=null)
        {
            wow[p]=temp.val;
            p++;
            temp=temp.next;
        }
        p=0;
        int maxs=0;
        int count=wow.length;
        for(int i=0;i<(c/2);i++)
        {
            maxs=Math.max(maxs,(wow[p]+wow[count-1])); 
            p++;
            count--;
        }
        return maxs;
    }
}