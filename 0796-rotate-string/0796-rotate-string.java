class Solution {
    public boolean rotateString(String s, String goal) {
        int len = s.length();
        int x = len;
        while(x-->0){
            StringBuilder sb = new StringBuilder();
            sb.append(s.charAt(len-1));
            for(int i = 0; i<len-1; i++){
                sb.append(s.charAt(i));
            }
            if(sb.toString().equals(goal))return true;
            s = sb.toString();
        }
        return false;
    }
}