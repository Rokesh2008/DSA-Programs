class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> ls = new ArrayList<>();
        for(int i =0;i<(1<<n);i++){
            ls.add(i^(i>>1));
        }
        return ls;
    }
}