class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>result=new ArrayList<>();
        for(int i=0;i<numRows;i++){
             List<Integer>li=new ArrayList<>();
              li.add(1);
            for (int j = 1; j < i; j++) {
                List<Integer> prev = result.get(i - 1);
                li.add(prev.get(j - 1) + prev.get(j));
            }
              if(i>0){
                li.add(1);
              }
              result.add(li);
        }
        return result;
    }
}