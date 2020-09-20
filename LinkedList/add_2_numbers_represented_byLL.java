
class Solution{
    int n1=0,n2=0;
    int carry=0;
    int sum=0;
    static void addthem(Node first,Node second){
        if(first==null || second==null){
            return ;
        }
        addthem(first.next,second.next);
        sum=first.data+second.data+carry;
        if(sum>=10){
            first.data=sum%10;
            sum=sum/10;
            carry=sum%10;
        }
        else{
            first.data=sum;
            carry=0;
        }
    }
    static Node addLists(Node first, Node second){
        Node temp1=first;
        while(temp1!=null){
           n1++;
           temp1=temp1.next;
        }
        temp1=second;
        while(temp1!=null){
            n2++;
            temp1=temp1.next;
        }
        if(n1==n2){
            addthem(first,second);
            if(carry>0){
                Node n=new Node(carry);
                n.next=first;
                return n;
            }
        }else if(n1>n2){
            k=n1-n2;
            temp1=first;
            while(k-->0){
                temp1=temp1.next;
            }
            addthem(temp1,second);
            if(carry==0){
                
            }
        }
        else{
            k=n2-n1;
            temp1=second;
            while(k-->0){
                temp1=temp1.next;
            }
            addthem(first,second);
        }
    }
}