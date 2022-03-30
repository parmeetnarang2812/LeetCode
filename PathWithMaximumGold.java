/*                          1219. Path with Maximum Gold - Medium

In a gold mine grid of size m x n, each cell in this mine has an integer representing the amount of gold in that cell,
0 if it is empty.
Return the maximum amount of gold you can collect under the conditions:

Every time you are located in a cell you will collect all the gold in that cell.
From your position, you can walk one step to the left, right, up, or down.
You can't visit the same cell more than once.
Never visit a cell with 0 gold.
You can start and stop collecting gold from any position in the grid that has some gold.
 
Example 1:
    Input: grid = [[0,6,0],[5,8,7],[0,9,0]]
    Output: 24
    Explanation:
    [[0,6,0],
    [5,8,7],
    [0,9,0]]
    Path to get the maximum gold, 9 -> 8 -> 7.

Example 2:
    Input: grid = [[1,0,7],[2,0,6],[3,4,5],[0,3,0],[9,0,20]]
    Output: 28
    Explanation:
    [[1,0,7],
    [2,0,6],
    [3,4,5],
    [0,3,0],
    [9,0,20]]
    Path to get the maximum gold, 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7.
 
Constraints:
    m == grid.length
    n == grid[i].length
    1 <= m, n <= 15
    0 <= grid[i][j] <= 100
    There are at most 25 cells containing gold.
    
*******Hint : Use recursion to try all such paths and find the one with the maximum value.*******    
*/

/*  my leetcode soln -> recursive solution
class Solution {
    int[][] dirs = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

    public int getMaximumGold(int[][] grid) {
        int maxGold = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int currGold = getMaxGold(grid, i, j, rows, cols, new boolean[rows][cols]);
                maxGold = Math.max(maxGold, currGold);
            }
        }
        return maxGold;
    }

    private int getMaxGold(int[][] grid, int x, int y, int rows, int cols, boolean[][] visited) {
        if (x < 0 || x >= rows || y < 0 || y >= cols || visited[x][y] || grid[x][y] == 0) {
            return 0;
        }
        int curr = 0;
        visited[x][y] = true;
        for (int[] dir : dirs) {
            int newX = x + dir[0];
            int newY = y + dir[1];
            curr = Math.max(curr, getMaxGold(grid, newX, newY, rows, cols, visited));
        }
        visited[x][y] = false;
        return grid[x][y] + curr;
    }
} 
*/