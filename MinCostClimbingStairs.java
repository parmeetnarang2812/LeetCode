/*                          746. Min Cost Climbing Stairs - Easy

You are given an integer array cost where cost[i] is the cost of ith step on a staircase. 
Once you pay the cost, you can either climb one or two steps.
You can either start from the step with index 0, or the step with index 1.
Return the minimum cost to reach the top of the floor.

Example 1:
    Input: cost = [10,15,20]
    Output: 15
    Explanation: You will start at index 1.
    - Pay 15 and climb two steps to reach the top.
    The total cost is 15.

Example 2:
    Input: cost = [1,100,1,1,1,100,1,1,100,1]
    Output: 6
    Explanation: You will start at index 0.
    - Pay 1 and climb two steps to reach index 2.
    - Pay 1 and climb two steps to reach index 4.
    - Pay 1 and climb two steps to reach index 6.
    - Pay 1 and climb one step to reach index 7.
    - Pay 1 and climb two steps to reach index 9.
    - Pay 1 and climb one step to reach the top.
    The total cost is 6.
 
Constraints:
    2 <= cost.length <= 1000
    0 <= cost[i] <= 999 
*/


/* 
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n + 1];
        // return minCostClimbingStairs_recursion(n,cost);
        // return minCostClimbingStairs_mem(n,cost,dp);
        // return minCostClimbingStairs_tab(n,cost,dp);
        return minCostClimbingStairs_optimiztion(n, cost);
    }

    public int minCostClimbingStairs_optimiztion(int N, int[] cost) {
        int one = 0, two = 0;
        for (int i = 0; i < N; i++) {
            int current = Math.min(one, two) + cost[i];
            one = two;
            two = current;
        }
        return Math.min(one, two);
    }

    public int minCostClimbingStairs_tab(int N, int[] cost, int[] dp) {
        for (int n = 0; n <= N; n++) {
            if (n <= 1) {
                dp[n] = cost[n];
                continue;
            }
            dp[n] = Math.min(dp[n - 1], dp[n - 2]) + (n == cost.length ? 0 : cost[n]);
        }
        return dp[N];
    }

    public int minCostClimbingStairs_mem(int n, int[] cost, int[] dp) {
        if (n <= 1) {
            return dp[n] = cost[n];
        }

        if (dp[n] != 0) {
            return dp[n];
        }

        int climb_nm1 = minCostClimbingStairs_mem(n - 1, cost, dp);
        int climb_nm2 = minCostClimbingStairs_mem(n - 2, cost, dp);
        return dp[n] = Math.min(climb_nm1, climb_nm2) + (n == cost.length ? 0 : cost[n]);
    }

    public int minCostClimbingStairs_recursion(int n, int[] cost) {
        if (n <= 1) {
            return cost[n];
        }

        int climb_nm1 = minCostClimbingStairs_recursion(n - 1, cost);
        int climb_nm2 = minCostClimbingStairs_recursion(n - 2, cost);
        return Math.min(climb_nm1, climb_nm2) + (n == cost.length ? 0 : cost[n]);
    }
} 
*/