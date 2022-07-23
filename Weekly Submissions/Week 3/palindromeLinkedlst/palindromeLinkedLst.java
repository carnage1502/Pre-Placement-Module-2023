class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null) return true;
        
        ListNode slow=head;
        ListNode fast=head;
        
        //Middle node
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //Reverse the list after the middle node
        slow.next=reverseList(slow.next);
        
        slow=slow.next;
        
        //Check left half and right half val
        while(slow!=null){
            if(head.val!=slow.val) return false;
            head=head.next;
            slow=slow.next;
        }
        return true;
    }
    //Reverse lst
    ListNode reverseList(ListNode head){
        ListNode prev=null;
        ListNode next=null;
        while(head!=null){
            next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }
}