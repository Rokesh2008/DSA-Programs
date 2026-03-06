class Solution {
    public int maxArea(int[] height) {
        int len = height.length;
        int max = 0;
        int i = 0, j = len-1;
        while(i<j){
            int min = Math.min(height[i], height[j]);
            int val = min*(Math.abs(j-i));
            if(val>max) max = val;
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return max;
    }
}