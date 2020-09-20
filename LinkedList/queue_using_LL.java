
class MyQueue
{
    QueueNode front, rear;
    
    // This function should add an item at
    // rear
	void push(int a)
	{
	    QueueNode q=new QueueNode(a);
        if(front==null){
            front=q;
            rear=q;
        }
        else{
            rear.next=q;
            rear=rear.next;
        }
	}
	
    
	int pop()
	{
	    if(front==null){
	        return -1;
	    }
	    else{
	        int d=front.data;
	        front=front.next;
	        return d;
	    }
	}
}




