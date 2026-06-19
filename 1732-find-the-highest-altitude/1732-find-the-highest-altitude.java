class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int sum = 0;
        for(int n : gain){
            sum+=n;
            if(sum>0 && sum>max) max = sum;
        }
        return max;
    }
}