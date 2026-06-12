class Solution {
    List<Integer>[] lt;
    int[] depth;
    int[][] up;
    int Log=0;
    int[] ans;


    public int[] assignEdgeWeights(int[][] edges, int[][] queries) {
         int n=edges.length+1;
         Log=(int)(Math.log(n)/Math.log(2))+1;
         up=new int[n+1][Log];
         lt=new ArrayList[n+1];
         ans=new int[queries.length];
         depth=new int[n+1];

         for(int i=1;i<=n;i++){
            lt[i]=new ArrayList<>();
         }
         for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];

            lt[u].add(v);
            lt[v].add(u);
         }
         dfs(1,0);

         for(int i=0;i<queries.length;i++){
            int dist=distance(queries[i][0],queries[i][1]);
            if(dist==0){
              ans[i]=0;
            }else{
              ans[i]=(int)(modPow(dist-1));
            }
         }
        return ans;
         
    }
    public int lcv(int a, int b){
        if(depth[a]<depth[b]){
            int temp=a;
            a=b;
            b=temp;
        }
        int diff=depth[a]-depth[b];

        for(int i=Log-1;i>=0;i--){
            if((diff & (1<<i))!=0){
                a=up[a][i];
            }
        }

        if(a==b){
            return a;
        }

        for(int i=Log-1;i>=0;i--){
            if(up[a][i]!=up[b][i]){
               a=up[a][i];
               b=up[b][i]; 
            }
        }
        return up[a][0];
    }

    public int distance(int u,int v){
         int anscestor=lcv(u,v);

         return depth[u]+depth[v]-2*depth[anscestor];
    }
    public void dfs(int node,int parent){

        up[node][0]=parent;
        
        for(int i=1;i<Log;i++){
            up[node][i]=up[up[node][i-1]][i-1];
        }

        for(int nei:lt[node]){
            if(nei==parent){
                continue;
            }
            depth[nei]=depth[node]+1;
            dfs(nei,node);
        }

    }
    long modPow(long exp) {
    long ans = 1;
    long base = 2;

    while (exp > 0) {

        if ((exp & 1) == 1) {
            ans = (ans * base) % 1_000_000_007;
        }

        base = (base * base) % 1_000_000_007;
        exp >>= 1;
    }

    return ans;
}
}