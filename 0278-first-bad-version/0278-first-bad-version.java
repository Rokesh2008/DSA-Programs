/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l=0;
        int h=n;
        int ans=Integer.MAX_VALUE;
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            boolean f = isBadVersion(mid);
            if(f==false)
            {
                l=mid+1;
            }
            else
            {
                ans=mid;
                h=mid-1;
            }
        }
        return ans;
    }
}