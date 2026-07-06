class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int count = 0;
        for(int i = 0; i < intervals.length; i++) {
            int x1 = intervals[i][0];
            int y1 = intervals[i][1];
            boolean isCovered = false;
            for(int j = 0; j < intervals.length; j++) {
                if(i == j) continue;
                int x2 = intervals[j][0];
                int y2 = intervals[j][1];
                if(x2 <= x1 && y1 <= y2) {
                    isCovered = true;
                    break;
                }
            }
            if(!isCovered) count++;
        }
        return count;
    }
}