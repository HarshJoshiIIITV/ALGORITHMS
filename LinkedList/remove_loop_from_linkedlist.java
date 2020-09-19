class solver
{
    public static void removeLoop(Node head){
        HashSet<Node>set=new HashSet<>();
        Node temp=head;
        while(temp!=null){
            if(set.contains(temp.next)){
                temp.next=null;
                break;
            }
            else{
                set.add(temp);
            }
            temp=temp.next;
        }
    }
}