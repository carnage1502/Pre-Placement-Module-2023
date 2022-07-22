class Solution {
    public int length(ListNode head){
        int l=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            l++;
        }
        return l;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        int len=length(head);
        return KGroup(head,k,len);
    }
    public ListNode KGroup(ListNode head,int k,int le){
        if(le<k) return head;
        int c=0;
        ListNode prev=null;
        ListNode curr=head;
        ListNode nex=null;
        
        while(c<k && curr!=null){
            nex=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nex;
            c++;
        }
        if(nex!=null) head.next=KGroup(nex,k,le-k);
        return prev;
        
    }
}