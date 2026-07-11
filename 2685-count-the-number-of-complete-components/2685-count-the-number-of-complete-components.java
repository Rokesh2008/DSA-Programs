class Solution {
    public static boolean bfs(int s,boolean[] vis,ArrayList<Integer> graph[]){
        int e=0;
        int v=1;
        vis[s]=true;
        Queue<Integer>q=new LinkedList<>();
        q.add(s);
        while (!q.isEmpty()) {
            int curr = q.poll();
            e += graph[curr].size();
            for (int next : graph[curr]) {
            if (!vis[next]) {
              vis[next] = true;
              q.add(next);
              v++;
            }
          }
       }
        if(e/2==(v*(v-1)/2)){
            return true;
        }else{
            return false;
        }
    }
    public int countCompleteComponents(int n, int[][] edges) {
        ArrayList<Integer> graph[]=new ArrayList[n];
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        }
        for (int[] edge : edges){
             int s=edge[0];
             int e=edge[1];
             graph[s].add(e);
             graph[e].add(s);
        }
        boolean vis[]=new boolean[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(!vis[i]){
            if(bfs(i,vis,graph)){
                count++;
            }
            }
        }
        return count;
    }
}