class Solution {
    public double[] convertTemperature(double celsius) {
        double k = celsius + 273.15;
        double f = celsius * 1.80 + 32.00;
        double[] arr= new double[2];
        arr[0] = k;
        arr[1] = f;
        return arr;
    }
}