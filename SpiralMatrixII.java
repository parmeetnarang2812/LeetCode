/*                              59. Spiral Matrix II - Medium

Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.

Example 1:
    Input: n = 3
    Output: [[1,2,3],[8,9,4],[7,6,5]]

Example 2:
    Input: n = 1
    Output: [[1]]
 
Constraints:
    1 <= n <= 20
*/

/*  my leetcode soln -> T/S : O(n^2) / O(1)
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int top = 0, bottom = n-1, left = 0, right = n-1;
        int val=1;
        
        while(left<=right && top<=bottom) {     // while(val <= n*n) -> condition
            
            for(int j=left; j<=right; j++) {
                ans[top][j] = val;
                val++;
            }
            top++;
            
            for(int i=top; i<=bottom; i++) {
                ans[i][right] = val;
                val++;
            }
            right--;
            
            for(int j=right; j>=left; j--) {
                ans[bottom][j] = val;
                val++;
            }
            bottom--;
            
            for(int i=bottom; i>=top; i--) {
                ans[i][left] = val;
                val++;
            }
            left++;
        }
        return ans;
    }
} 
*/