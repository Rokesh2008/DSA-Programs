class Solution {
    static boolean check(String s1,String s2){
        if(s1.length()==s2.length()){
            return s1.equals(s2);
        }
        return s1.contains(s2);
    }
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(int i=0;i<patterns.length;i++){
            if(check(word,patterns[i])){
                count++;
            }
        }
        return count;
    }
}