class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int len1= nums1.length, len2 = nums2.length;
        int i = 0, j = 0;
        List<Integer> lst = new ArrayList<>();
        while(i<len1 && j<len2){
            int x =nums1[i];
            int y = nums2[j];
            if(x == y){
                lst.add(x);
                i++;
                j++;
            }
            else if(x<y){
                i++;
            }
            else{
                j++;
            }
        }
        int[] ret = new int[lst.size()];
        for(int k=0; k<lst.size(); k++){
            ret[k] = lst.get(k);
        }
        return ret;
    }
}