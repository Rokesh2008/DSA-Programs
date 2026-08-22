class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0, prod = 1, temp = n;
        while(temp>0){
            int val = temp%10;
            sum+=val;
            prod*=val;
            temp/=10;
        }
        if((n%(sum + prod)==0)){
            return true;
        }
        return false;
    }
}