class Tree
{
    int minheight=-1;
    void recurse(Node root,int height){
        if(root==null)
            return ;
        if(height>minheight){
            minheight=height;
            System.out.print(root.data+" ");
        }
        recurse(root.left,height+1);
        recurse(root.right,height+1);
    }
    void leftView(Node root)
    {
        recurse(root,0);
    }
}