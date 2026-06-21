import java.util.Arrays;
class Solution {
    public int maxIceCream(int[] costs, int coins) {

        Arrays.sort(costs);

        int maxIcecream = 0;

        for (int cost : costs) {
            if (cost <= coins) {
                maxIcecream++;
                coins -= cost;
            } else {
                break;
            }
        }

        return maxIcecream;
    }
};