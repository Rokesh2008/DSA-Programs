class Solution {
    public int[] closestPrimes(int left, int right) {

         ArrayList<Integer> res =   getAllPrimeNumberInRange(left , right);
           if (res.size() < 2) {
            return new int[]{-1, -1};
        }

        int minDiff = Integer.MAX_VALUE;
        int[] ans = new int[2];

        for (int i = 0; i < res.size() - 1; i++) {
            int diff = res.get(i + 1) - res.get(i);

            if (diff < minDiff) {
                minDiff = diff;
                ans[0] = res.get(i);
                ans[1] = res.get(i + 1);
            }
        }
        return ans;        
    }
    public boolean isPrime(int n){
        if(n <= 1){
            return false;
        }

        for(int i = 2 ; i <= Math.sqrt(n) ; i++){
             if( n % i == 0){
                return false;
             }
        }

        return true;
    }
    public ArrayList<Integer> getAllPrimeNumberInRange(int left , int right){
        ArrayList<Integer> lst = new ArrayList<>();

        for(int i = left ; i <=right ; i++){
            if(isPrime(i)){
                 lst.add(i);
            }
        }
        return lst;
    }
}