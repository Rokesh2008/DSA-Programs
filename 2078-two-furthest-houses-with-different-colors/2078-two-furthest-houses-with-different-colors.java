class Solution {
    public int maxDistance(int[] colors) {
        int max = Integer.MIN_VALUE;
        int len = colors.length, dis = 0;
        for(int i = 0; i<len; i++){
            for(int j = len-1; j>i; j--){
                if(colors[i]!=colors[j]){
                    int temp = Math.abs(j-i);
                    if(temp>dis) dis = temp;
                }
            }
        }
        return dis;
    }
}