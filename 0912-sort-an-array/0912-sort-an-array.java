class Solution {
    public static void mergeSort(int[] array) {
        int len = array.length;
        if(len<=1) return;
        int mid = len/2;
        int[] larray = new int[mid];
        int[] rarray = new int[len - mid];
        int i = 0, j = 0;
        for(; i<len; i++){
            if(i<mid){
                larray[i] = array[i];
            }
            else{
                rarray[j] = array[i];
                j++;
            }
        }
        mergeSort(larray);
        mergeSort(rarray);
        merge(larray, rarray, array);
    }
    public static void merge(int[] larray, int[] rarray, int[] array){
        int len = array.length;
        int lsize = len/2;
        int rsize = len - lsize;
        int i = 0, l = 0, r = 0;
        while(l<lsize && r<rsize){
            if(larray[l]<rarray[r]){
                array[i] = larray[l];
                i++;
                l++;
            }
            else{
                array[i] = rarray[r];
                i++;
                r++;
            }
        }
        while(l<lsize){
            array[i] = larray[l];
            i++;
            l++;
        }
        while(r<rsize){
            array[i] = rarray[r];
            i++;
            r++;
        }

    }
    public int[] sortArray(int[] nums) {
        mergeSort(nums);
        return nums;
    }
}