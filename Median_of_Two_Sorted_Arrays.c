double findMedianSortedArrays(int* nums1, int nums1Size, int* nums2, int nums2Size) {
    int len = nums1Size + nums2Size;
    int arr[len],posi=0,mid = len/2;
    for(int i = 0;i<nums1Size;i++){
        arr[posi]=nums1[i];
        posi++;
    }
    for(int i = 0;i<nums2Size;i++){
        arr[posi]=nums2[i];
        posi++;
    }
    for(int i = 0;i<len;i++){
        for(int j = i+1;j<len;j++){
            if(arr[i]>arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    float val;
    if(len%2==0){
        val = (float)(arr[mid-1]+arr[mid])/2;
    }
    else{
        val = arr[mid];
    }
    return val;
}