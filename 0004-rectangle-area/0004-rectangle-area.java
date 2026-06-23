class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int areaA = (ax2 - ax1) * (ay2 - ay1);
        int areaB = (bx2 - bx1) * (by2 - by1);
        int overlapX1 = Math.max(ax1, bx1);
        int overlapX2 = Math.min(ax2, bx2);
        int overlapY1 = Math.max(ay1, by1);
        int overlapY2 = Math.min(ay2, by2);
        int overlapWidth = overlapX2 - overlapX1;
        int overlapHeight = overlapY2 - overlapY1;
        int overlapArea = 0;
        if (overlapWidth > 0 && overlapHeight > 0) {
            overlapArea = overlapWidth * overlapHeight;
        }
        return areaA + areaB - overlapArea;
    }
}