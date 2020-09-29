//DFS by Harsh Joshi
class Traversal
{
    static boolean visited[];
    static ArrayList<Integer>ans;
    static void iterate(ArrayList<ArrayList<Integer>> g,int node){
        if(visited[node])
            return;
        ans.add(node);
        visited[node]=true;
        for(int i=0;i<g.get(node).size();i++){
            int x=g.get(node).get(i);
            if(!visited[x])
                iterate(g,x);
        }
    }
    static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> g, int N)
    {
        visited=new boolean[g.size()];
        ans=new ArrayList<>();
        iterate(g,0);
        return ans;
    }
}