class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i=0;
        while(i<word1.length() || i<word2.length()) {
            if(i>=word1.length()) {
                sb.append(word2.substring(i,word2.length())); 
                break;
            }
            if(i>=word2.length()) {
                sb.append(word1.substring(i,word1.length()));
                break;
            }
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
            i++;
        }
        return sb.toString();
    }
}