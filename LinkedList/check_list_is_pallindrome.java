class Palindrome
{
    Node reverse(Node head){
        Node current=head,forward=head,prev=null;
        while(current!=null){
            forward=current.next;
            current.next=prev;
            prev=current;
            current=forward;
        }
        return prev;
    }
    boolean isPalindrome(Node head) 
    {
        Node temp=head,temp2=head;
        int mid=0;
        while(temp!=null && temp.next!=null){
            temp=temp.next.next;
            temp2=temp2.next;
            mid++;
        }
        temp2=reverse(temp2);
        temp=head;
        while(mid-->0){
            if(temp.data!=temp2.data){
                return false;
            }
            temp=temp.next;
            temp2=temp2.next;
        }
        return true;
        
    }    
}

