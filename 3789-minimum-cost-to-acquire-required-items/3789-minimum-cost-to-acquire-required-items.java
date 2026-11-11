class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        if (need1 > need2) {
            return minimumCost(cost2, cost1, costBoth, need2, need1);
        }

        long collectBoth = (long) need1 * Math.min(costBoth, cost1 + cost2);

        long collectRem = (long) (need2 - need1) * Math.min(cost2, costBoth);

        return collectBoth + collectRem;
    }
}