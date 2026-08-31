class Solution
{
    public int stoneGameV(int[] stoneValue)
    {
        int n = stoneValue.length;

        int[][] dp = new int[n][n];
        int[][] maxL = new int[n][n];
        int[][] maxR = new int[n][n];

        for (int i = 0; i < n; i++)
        {
            maxL[i][i] = stoneValue[i];
            maxR[i][i] = stoneValue[i];
        }

        for (int left = n - 1; left >= 0; left--)
        {
            int mid = left - 1;
            int leftSum = 0;
            int totalSum = stoneValue[left];

            for (int right = left + 1; right < n; right++)
            {
                totalSum += stoneValue[right];

                while (mid + 1 < right && (leftSum + stoneValue[mid + 1]) * 2 <= totalSum)
                {
                    mid++;
                    leftSum += stoneValue[mid];
                }

                int res = 0;

                if (mid >= left && leftSum * 2 == totalSum)
                {
                    res = Math.max(maxL[left][mid], maxR[mid + 1][right]);
                }
                else
                {
                    if (mid >= left)
                    {
                        res = maxL[left][mid];
                    }
                    if (mid + 1 < right)
                    {
                        res = Math.max(res, maxR[mid + 2][right]);
                    }
                }

                dp[left][right] = res;

                maxL[left][right] = Math.max(maxL[left][right - 1], totalSum + res);
                maxR[left][right] = Math.max(maxR[left + 1][right], totalSum + res);
            }
        }

        return dp[0][n - 1];
    }
}