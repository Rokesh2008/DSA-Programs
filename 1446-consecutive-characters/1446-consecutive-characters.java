class Solution {
    public int maxPower(String s) {
        int len = s.length();
        int max = 0;
        for(int i = 0; i<len; i++){
            int count = 0;
            for(int j = i+1; j<len; j++){
                if(s.charAt(j) == s.charAt(i)){
                    count++;
                }
                else{
                    break;
                }
            }
            if(max<count)max = count;
        }
        return max+1;
    }
}