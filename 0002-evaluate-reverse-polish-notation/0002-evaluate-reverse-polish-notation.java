class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String str : tokens){
            if(str.matches("-?\\d+")){
                int val = Integer.parseInt(str);
                st.push(val);
            }else{
                switch(str){
                    case "+":{
                       int b = st.pop();
                       int a = st.pop();
                       int v1 = a+b;
                       st.push(v1);
                       break;
                    }
                    case "-":{
                       int b = st.pop();
                       int a = st.pop();
                       int v1 = a-b;
                       st.push(v1);
                       break;
                    }
                    case "*":{
                       int b = st.pop();
                       int a = st.pop();
                       int v1 = a*b;
                       st.push(v1);
                       break;
                    }
                    default:{
                       int b = st.pop();
                       int a = st.pop();
                       int v1 = a/b;
                       st.push(v1);
                    }
                }
            }
        }
        return st.peek();
    }
}