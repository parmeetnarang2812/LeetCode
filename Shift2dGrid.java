/*                     1260. Shift 2D Grid - Easy

Given a 2D grid of size m x n and an integer k. You need to shift the grid k times.
    In one shift operation:
        Element at grid[i][j] moves to grid[i][j + 1].
        Element at grid[i][n - 1] moves to grid[i + 1][0].
        Element at grid[m - 1][n - 1] moves to grid[0][0].
        Return the 2D grid after applying shift operation k times.

Example 1:
    Input: grid = [[1,2,3],[4,5,6],[7,8,9]], k = 1
    Output: [[9,1,2],[3,4,5],[6,7,8]]

Example 2:
    Input: grid = [[3,8,1,9],[19,7,2,5],[4,6,11,10],[12,0,21,13]], k = 4
    Output: [[12,0,21,13],[3,8,1,9],[19,7,2,5],[4,6,11,10]]

Example 3:
    Input: grid = [[1,2,3],[4,5,6],[7,8,9]], k = 9
    Output: [[1,2,3],[4,5,6],[7,8,9]]
 
Constraints:
    m == grid.length
    n == grid[i].length
    1 <= m <= 50
    1 <= n <= 50
    -1000 <= grid[i][j] <= 1000
    0 <= k <= 100 
*/


/*  my leetcode soln
    Time Complexity : O(M * N)
    Space Complexity: O(M * N)
    
class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int row = grid.length;
        int col = grid[0].length;

        // Create temporary array of the same size in which we will add element in new
        // position after k shifting.
        int temp[][] = new int[row][col];

        // Solution Approach:
            // Assume if we convert given array into 1D Array then shift element to k positions and after shiting all the elements 
            // we will again convert 1D Array to our original dimention array.

        // Logic for Finding current elements's index in 1D Array after shifting K times:
        // For current element We will just find that what will be it's index in 1D Array
        // After for New postion in 1D Array we will shift it k times means we will add K in current index
        // And if new positon in 1D Array get's increased by it's total size, we will modulo it by 1D Array Size

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                // (i * col) + j : will Give Index in 1D Array
                // (i * col) + j + k : Adding K means we will shift it k times
                // ((i * col) + j + k ) % (row * col) : modulo it by array size (row * col), if it exceeds the size
                int indexIn1DArray = ((i * col) + j + k) % (row * col);

                // Now Based on the 1D Array Index we will find it's index in our temporary
                // result array
                int tempRowIndex = indexIn1DArray / col; // Find the particular row
                int tempColIndex = indexIn1DArray % col; // Find the particular column
                temp[tempRowIndex][tempColIndex] = grid[i][j]; // Add Element at that new index in our temporary result array
            }
        }

        // Prepare Result in List
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        for (int i = 0; i < row; i++) {
            List<Integer> list = new ArrayList<Integer>();
            for (int j = 0; j < col; j++) {
                list.add(temp[i][j]);
            }
            result.add(list);
        }

        return result;
    }
} 
*/