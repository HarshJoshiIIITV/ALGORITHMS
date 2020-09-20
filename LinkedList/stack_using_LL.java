class MyStack {

    // Note that top is by default null
    // in Java
    StackNode top;

    void push(int a) {
        StackNode n=new StackNode(a);
        if(top==null){
            top=n;
        }
        else{
            n.next=top;
            top=n;
        }
    }
    int pop() {
        if(top==null){
            return -1;
        }
        else{
            int d=top.data;
            top=top.next;
            return d;
            
        }
    }
}
