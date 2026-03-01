class Solution {
    public boolean check(char ch){
        return ch=='a' || ch=='e'|| ch=='i'||ch=='o'||ch=='u';
    }
    public String trimTrailingVowels(String s) {
        int len = s.length()-1;
        while(len>=0){
            if(check(s.charAt(len))){
                len--;
            }
            else{
                break;
            }
        }
        return s.substring(0, len+1);
    }
}