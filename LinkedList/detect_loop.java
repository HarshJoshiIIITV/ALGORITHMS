
class Solution {
    public static boolean detectLoop(Node head){
        Node temp=head;
        Node temp2=head;
        while(temp2!=null && temp2.next!=null){
            temp=temp.next;
            temp2=temp2.next.next;
            if(temp==temp2){
                return true;
            }
        }
        return false;
    }
}