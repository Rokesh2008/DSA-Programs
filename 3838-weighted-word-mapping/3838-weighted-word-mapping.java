class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String res = "";

        for(String w:words){
            int val=0;
            for(char c:w.toCharArray()){
                val+=weights[c-'a'];
            }
            val%=26;

            res+= (char)('z'-val);
        }

        return res;
    }
}