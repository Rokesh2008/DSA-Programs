class Solution {
    public List<Integer> getRow(int rowIndex) {
        int n=rowIndex;

        for(int i=0;i<=n;i++){
            long num=1;
            List<Integer> val1=new ArrayList<Integer>();
            for(int j=0;j<=i;j++){
               
               val1.add((int)num);
                num=num*(i-j)/(j+1);
            }
            if(i==rowIndex){
                return val1;
            }
            
        }
        return null;
    }
}