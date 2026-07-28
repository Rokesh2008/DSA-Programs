class Solution{
    class disjoin{
        int[] leader;
        int[] size;
        disjoin(int n){
            leader = new int[n];
            size = new int[n];
            for (int i = 0; i < n; i++){
                leader[i] =i;
                size[i] =1;
            }
        }
        void union(int u, int v){
            int pu =find(u);
            int pv =find(v);
            if (pu ==pv){
                return;
            }
            if (size[pu]<size[pv]){
                leader[pu] = pv;
                size[pv]+= size[pu];
            } 
            else{
                leader[pv] =pu;
                size[pu] +=size[pv];
            }
        }
        int find(int n){
            if(leader[n] == n){
                return n;

            }
            return leader[n]=find(leader[n]);
        }

    }
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        disjoin dis = new disjoin(n);
        for (int i = 0;i < n; i++){
            for (int j =i;j < n; j++){
                if (isConnected[i][j] == 1){
                    dis.union(i, j);

                }
            }
        }
        int provi = 0;
        for(int i = 0; i<n; i++){
            if(dis.find(i) == i){
                provi++;
            }
        }
        return provi;

    }
}