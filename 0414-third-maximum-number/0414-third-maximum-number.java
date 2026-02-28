class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set= new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        List<Integer> lst = new ArrayList<>(set);
        Collections.sort(lst, Collections.reverseOrder());
        int len = lst.size();
        if(len>=3){
            return lst.get(2);
        }
        return lst.get(0);
    }
}