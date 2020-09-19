class Intersect
{
	int intersectPoint(Node headA, Node headB)
	{
	    Node temp1=headA;
	    Node temp2=headB;
        while(temp1!=temp2){
            temp1=(temp1!=null)?temp1.next:headB;
            temp2=(temp2!=null)?temp2.next:headA;
        }
        if(temp1==null)
            return -1;
        else
            return temp1.data;
	}
}
