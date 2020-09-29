class Traversal {
    static boolean visited[];
    static ArrayList<Integer>queue;
    static ArrayList<Integer>ans;
    static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> g, int N) {
        visited=new boolean[g.size()];
        queue=new ArrayList<>();
        ans=new ArrayList<>();
        queue.add(0);
        visited[0]=true;
        while(queue.size()>0){
            int node=queue.remove(0);
            ans.add(node);
            for(int i=0;i<g.get(node).size();i++){
                int x=g.get(node).get(i);
                if(!visited[x]){
                    queue.add(x);
                    visited[x]=true;   
                }
            }
        }
        return ans;
    }
}