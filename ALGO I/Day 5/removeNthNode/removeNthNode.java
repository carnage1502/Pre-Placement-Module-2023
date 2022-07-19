class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dum = new ListNode(0);
        dum.next=head;
        ListNode fast=dum;
        ListNode slow=dum;
        for(int i=1;i<=n;i++) fast=fast.next;
        
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return dum.next;
    }
}