class LinkedList
{
    static Node segregate(Node head)
    {
        int zero=0,one=0,two=0;
        Node temp=head;
        while(temp!=null){
            if(temp.data==0)
                zero++;
            if(temp.data==1)
                one++;
            else
                two++;
            temp=temp.next;
        }
        temp=head;
        int count=0;
        while(temp!=null){
            if(count<zero)
                temp.data=0;
            else if(count<zero+one)
                temp.data=1;
            else
                temp.data=2;
            temp=temp.next;
            count++;
        }
        return head;
    }
}