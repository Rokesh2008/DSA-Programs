class Solution {
    public double angleClock(int hour, int minutes) {
        double min = minutes * 6;
        double hr = (hour * 30) + ((double)minutes / 2);

        double angle = Math.abs(min - hr);

        return Math.min(angle, 360 - angle);
    }
}