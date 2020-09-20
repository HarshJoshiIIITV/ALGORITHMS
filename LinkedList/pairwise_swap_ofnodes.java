class Swap
{
    public static Node pairwise_swap(Node node)
    {
        Node temp=node;
        int tempy=0;
        while(temp!=null && temp.next!=null){
            tempy=temp.next.data;
            temp.next.data=temp.data;
            temp.data=tempy;
            temp=temp.next.next;
        }
        return node;
    }
       
}