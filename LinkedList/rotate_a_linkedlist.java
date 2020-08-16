class Rotate{
    // This function should rotate list counter-
    // clockwise by k and return head node
    
    public Node rotate(Node head, int k) {
        Node temp=head,temp2=head;
        Node newhead=head;
        while(k-->0){
            temp2=temp;
            temp=temp.next;
        }
        if(temp==null){
            return head;
        }
        temp2.next=null;
        newhead=temp;
        temp2=newhead;
        while(temp2.next!=null){
            temp2=temp2.next;
        }
        temp2.next=head;
        return newhead;
        
    }
}
