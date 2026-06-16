class Solution {
    public String processStr(String s) {
        StringBuilder str=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch=='a'){
                str.append('a');
            }
            else if(ch=='#'){
                if (str.length()>0)
                str.append(str.substring(0,str.length()));
            }
            else if(ch=='b'){
                str.append('b');
            }
            else if(ch=='%'){
                str.reverse();
            }
            else if (ch=='*'){
                    if(str.length()>0)
                    str.deleteCharAt(str.length()-1);
            }
            else {
                str.append(ch);
            }
        }
        return str.toString();
    }
}