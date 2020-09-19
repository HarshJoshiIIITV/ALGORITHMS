
class LinkedList
{
    Node sortedMerge(Node headA, Node headB) {
        Node point1=headA;
        Node point2=headB;
        Node head=null,rear=null;
        while(point1!=null && point2!=null){
            if(point1.data<point2.data){
                if(head==null){
                    head=point1;
                    rear=point1;
                }
                else{
                    rear.next=point1;
                    rear=rear.next;
                }
                point1=point1.next;
            }
            else{
                if(head==null){
                    head=point2;
                    rear=point2;
                }
                else{
                    rear.next=point2;
                    rear=rear.next;
                }
                point2=point2.next;
                
            }
        }
        while(point1!=null){
             rear.next=point1;
             rear=rear.next;
             point1=point1.next;
        }
        while(point2!=null){
             rear.next=point2;
             rear=rear.next;
             point2=point2.next;
        }
        return head;
        
   } 
}
