class GfG
{
    // Function to find the nth node from end in the linked list
    // head: head of the linked list
    // n: nth node from end to find
    int getNthFromLast(Node head, int n)
    {
    	int len=0;
    	Node temp=head;
    	while(temp!=null){
    	    temp=temp.next;
    	    len++;
    	}
    	len=len-n;
    	if(len<0){
    	    return -1;
    	}
    	temp=head;
    	while(len-->0){
    	    temp=temp.next;
    	}
    	return temp.data;
    }
}
