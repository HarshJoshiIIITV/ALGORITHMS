class Spiral
{
        TreeMap<Integer,ArrayList<Integer>>map=new TreeMap<>();
        ArrayList<Integer>list;
        void iterate_it(Node node,int height){
            if(node==null){
                return;
            }
            list=new ArrayList<>();
            if(!map.containsKey(height)){
                list.add(node.data);
                map.put(height,list);
            }  
            else{
                list=map.get(height);
                list.add(node.data);
                map.put(height,list);
            }
            iterate_it(node.left,height+1);
            iterate_it(node.right,height+1);
        }
      
      
        void printSpiral(Node node) 
        {
            if(node==null)
                return;
          iterate_it(node,0);
          for(int key:map.keySet()){
            list=map.get(key);
            if(key==0){
                System.out.print(map.get(key).get(0)+" ");
            }
            else if(key%2!=0){
                for(int i=0;i<list.size();i++)
                    System.out.print(list.get(i)+" ");
            }
            else{
                for(int i=list.size()-1;i>=0;i--)
                    System.out.print(list.get(i)+" ");
            }
          }
          
        }
}