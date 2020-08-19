class Tree {
    int max=0;
    int height(Node root){
        if(root==null){
            return 0;
        }
        return Math.max(height(root.left),height(root.right))+1;
    }
    void iterate(Node root){
        if(root==null)
            return;
        int sum=height(root.left)+height(root.right)+1;
        if(sum>max)
            max=sum;
        iterate(root.left);
        iterate(root.right);
    }
    int diameter(Node root) {
        iterate(root);
        return max;
    }
}
