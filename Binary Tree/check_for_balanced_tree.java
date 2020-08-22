class Tree
{
    
     /* This function should return tree if passed  tree 
     is balanced, else false. */
    int height(Node root){
        if(root==null){
            return 0;
        }
        return Math.max(height(root.left),height(root.right))+1;
    }
    boolean isBalanced(Node root)
    {
        if(root==null){
            return true;
        }
        if(Math.abs(height(root.left)-height(root.right))>1){
            return false;
        }
        return isBalanced(root.left)&&isBalanced(root.right);
    }
}

