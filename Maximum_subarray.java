import java.util.*;
public class Maximum_subarray {
    public int maxSubArray(int[] nums, int numsSize){
        int max = nums[0], currentmax = nums[0];
        for(int i = 1;i<numsSize; i++){
            if(nums[i]>(currentmax + nums[i])){
                currentmax = nums[i];
            }
            else{
                currentmax = currentmax + nums[i];
            }
            max = (currentmax>max)?currentmax:max;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Maximum_subarray obj = new Maximum_subarray();
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int result = obj.maxSubArray(nums, nums.length);
        System.out.println(result);
        sc.close();
    }
}