/*                             70. Climbing Stairs - Easy

You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

 
Example 1:
Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps

Example 2:
Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
 

Constraints:
1 <= n <= 45 */

/*  
my leetcode solns 
class Solution {
    public int climbStairs(int n) {
        // int[] dp = new int[n+1];

        // return climbStairs_recursion(n);
        // return climbStairs_mem(n, dp);
        // return climbStairs_tab(n, dp);
        return climbStairs_optimization(n);
    }

    public int climbStairs_optimization(int N) {
        int a=1, b=1;
        for(int n=0; n<N; n++) {
            int sum = a+b;
            a=b;
            b=sum;
        }
        return a;
    }
    
    public int climbStairs_tab(int N, int[] dp) {
        for(int n=0; n<=N; n++) {
            if (n <= 1) {
                dp[n] = 1;
                continue;
            }
            dp[n] = dp[n-1] + dp[n-2];
        }
        return dp[N];
    }
    
    public int climbStairs_mem(int n, int[] dp) {
        if (n <= 1) {
            return dp[n] = 1;
        }

        if(dp[n]!=0) {
            return dp[n];
        }

        return dp[n] = climbStairs_mem(n-1, dp) + climbStairs_mem(n-2, dp);
    }
    
    public int climbStairs_recursion(int n) {
        if (n <= 1) {
            return 1;
        }

        return climbStairs(n-1) + climbStairs(n-2);
    }
} 
*/