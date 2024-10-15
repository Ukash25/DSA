class Solution {
    public ListNode middleNode(ListNode head) {
        int a=0;
        for(ListNode f=head;f!=null;f=f.next)
        {
            a++;
        }
        for(int i=0;i<a/2;i++)
        {
            head=head.next;
        }
        return head;
    }
}