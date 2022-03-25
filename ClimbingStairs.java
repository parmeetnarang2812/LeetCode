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
    //Part1 - memoization
    // public int climbStairs_mem(int n) {
    //     int[] dp = new int[n+1];
    //     Arrays.fill(dp, -1);
        
    //     return climb_mem(dp, n);
    // }
    
    // public static int climb_mem(int[] dp, int n) {
    //     if(n<0) {
    //         return 0;
    //     }
    //     else if(n==0 || n==1) {
    //         return 1;
    //     }

    //     if(dp[n]!=-1) {
    //         return dp[n];
    //     }

    //     return dp[n] = climb_mem(dp, n-1) + climb_mem(dp, n-2);

    // }

    //Part2 - tabulation
    // public int climbStairs(int n) {
    //     return climb_tab(n);
    // }
    // public int climb_tab(int n) {
    //     int[] dp = new int[n+1];
    //     dp[0]=1;
    //     dp[1]=1;
    //     for(int i=2; i<=n; i++) {
    //         dp[i] = dp[i-1] + dp[i-2];
    //     }
    //     return dp[n];
    // }

    //Part3 - without extra space
    // public int climbStairs(int n) {
    //     int prev2 = 1;
    //     int prev = 1;
    //     for(int i=2; i<=n; i++) {
    //         int curr = prev2 + prev;
    //         prev2 = prev;
    //         prev = curr;
    //     }
    //     return prev;
    // }
} 
*/