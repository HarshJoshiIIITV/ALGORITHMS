class Solution
{
    int getMiddle(Node head)
    {
        Node temp=head;
        Node temp2=head;
        while(temp!=null && temp.next!=null){
            temp=temp.next.next;
            temp2=temp2.next;
        }
        return temp2.data;
    }
}
