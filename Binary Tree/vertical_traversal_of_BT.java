class info{
    int hd;
    int value;
    Node node;
    public info(int value,int hd,Node node){
        this.hd=hd;
        this.value=value;
        this.node=node;
    }
}

class BinaryTree
{
    static TreeMap<Integer,ArrayList<Integer>>map;
    static ArrayList<Integer>list;
    static ArrayList <Integer> verticalOrder(Node root)
    {
        
        Queue<info> q = new LinkedList<>();
        info n1=new info(root.data,0,root);
        q.add(n1);
        map=new TreeMap<>();
        while(q.size()>0){
            info n=q.remove();    
            if(!map.containsKey(n.hd)){
                list=new ArrayList<>();
                list.add(n.value);
                map.put(n.hd,list);
            }
            else{
                list=map.get(n.hd);
                list.add(n.value);
                map.put(n.hd,list);
            }
            Node left=n.node.left;
            Node right=n.node.right;
            if(left!=null){
                q.add(new info(left.data,(n.hd)-1,left));
            }
            if(right!=null){
                q.add(new info(right.data,(n.hd)+1,right));
            }
        }
        list=new ArrayList<>();
        for(int key:map.keySet()){
            list.addAll(map.get(key));
        }
        return list;
    }
}