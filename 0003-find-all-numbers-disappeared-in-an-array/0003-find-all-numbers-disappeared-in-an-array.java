class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer> lst = new ArrayList<>();
        for(int i = 1; i<=nums.length; i++){
            if(Arrays.binarySearch(nums, i)<0){
                lst.add(i);
            }
        }
        return lst;
    }
}