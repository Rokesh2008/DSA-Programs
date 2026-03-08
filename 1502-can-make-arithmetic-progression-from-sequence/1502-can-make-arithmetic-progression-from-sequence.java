class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int len = arr.length;
        int diff = arr[1] - arr[0];
        for(int i = 0; i<len-1; i++){
            if(arr[i]+diff != arr[i+1]){
                return false;
            }
        }        
        return true;
    }
}