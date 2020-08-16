class ReverseLL
{
    // This function should reverse linked list and return
    // head of the modified linked list.
    Node reverseList(Node head)
    {
        Node prev=null,current=head,forward=head;
        while(current!=null){
            forward=current.next;
            current.next=prev;
            prev=current;
            current=forward;
        }
        return prev;
    }
}
