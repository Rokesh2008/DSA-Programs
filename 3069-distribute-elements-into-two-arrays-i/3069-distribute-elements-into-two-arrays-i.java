
class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        int[] a1 = new int[n];
        int[] a2 = new int[n];

        int size1 = 0, size2 = 0;

        a1[size1++] = nums[0];
        a2[size2++] = nums[1];

        for (int i = 2; i < n; ++i) {
            if (a1[size1 - 1] > a2[size2 - 1])
                a1[size1++] = nums[i];
            else
                a2[size2++] = nums[i];
        }

        int[] result = new int[n];
        int index = 0;

        for (int i = 0; i < size1; ++i)
            result[index++] = a1[i];

        for (int i = 0; i < size2; ++i)
            result[index++] = a2[i];

        return result;
    }
}