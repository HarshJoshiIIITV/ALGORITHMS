class GfG
{
    public static Node recrev(Node head,int k){
         Node current=head,prev=null;
        Node forward=current;
        int c=k;
        while(c-->0 && current!=null){
            forward=current.next;
            current.next=prev;
            prev=current;
            current=forward;
        }
        if(forward !=null){
            head.next=recrev(forward,k);
        }
        return prev;
    }
    public static Node reverse(Node head, int k)
    {
        return recrev(head,k);
        
    }
}

