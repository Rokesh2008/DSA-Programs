class Solution {
    public String convertToBase7(int num) {
        if(num == 0)return "0";
        boolean check = false;
        if(num<0){
            num = Math.abs(num);
            check= true;
        }
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        while(num!=0){
            int dig = num%7;
            num = num/7;
            sb.append(dig);
        }
        if(check){
            sb.append('-');
        }
        return sb.reverse().toString();
    }
}