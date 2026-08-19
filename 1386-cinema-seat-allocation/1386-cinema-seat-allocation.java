import java.util.*;
class Solution{
    public int maxNumberOfFamilies(int n, int[][] reservedSeats){
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] a : reservedSeats){
            int row = a[0];
            int seat = a[1];
            if ((seat>=2) && (seat<=9)){
                map.put(row, map.getOrDefault(row, 0) | (1 << (seat - 2)));
            }
        }
        int left = 15;
        int middle = 60;
        int right = 240;
        int ans = (n -map.size())*2;
        for (int mask : map.values()){
            boolean l = (mask & left) ==0;
            boolean m = (mask & middle) == 0;
            boolean r = (mask & right) == 0;
            if(l&&r){
                ans += 2;
            } 
            else if(l||m||r){
                ans++;
            }
        }
        return ans;
    }
}