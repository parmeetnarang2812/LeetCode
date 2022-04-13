/*                                             289. Game of Life - Medium

According to Wikipedia's article: "The Game of Life, also known simply as Life, is a cellular automaton devised by the British mathematician."

The board is made up of an m x n grid of cells, where each cell has an initial state: live (represented by a 1) or dead (represented by a 0). 
Each cell interacts with its eight neighbors (horizontal, vertical, diagonal) using the following four rules :
    Any live cell with fewer than two live neighbors dies as if caused by under-population.
    Any live cell with two or three live neighbors lives on to the next generation.
    Any live cell with more than three live neighbors dies, as if by over-population.
    Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.

The next state is created by applying the above rules simultaneously to every cell in current state, where births and deaths occur simultaneously. 
Given the current state of the m x n grid board, return the next state.

Example 1:
    Input: board = [[0,1,0],[0,0,1],[1,1,1],[0,0,0]]
    Output: [[0,0,0],[1,0,1],[0,1,1],[0,1,0]]

Example 2:
Input: board = [[1,1],[1,0]]
Output: [[1,1],[1,1]]
 
Constraints:
    m == board.length
    n == board[i].length
    1 <= m, n <= 25
    board[i][j] is 0 or 1.
 

Follow up:
Could you solve it in-place? Remember that the board needs to be updated simultaneously: You cannot update some cells first and then use their updated values to update other cells.
In this question, we represent the board using a 2D array. In principle, the board is infinite, which would cause problems when the active area encroaches upon the border of the array (i.e., live cells reach the border). How would you address these problems?
*/

/*  my leetcode soln -> T/S : O(n)/O(1) where n = size(board) * size(board[0])
class Solution {
    public void gameOfLife(int[][] A) {
        int m= A.length, n=A[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int res= count(A,i,j,m,n); //count live neighbours
                //original alive
                if(A[i][j]==1){
                    if(res<2 || res>3) A[i][j]=-A[i][j];   
                }
                else{
                    A[i][j]=2;  //make it 2 for identifying it as a dead cell
                    if(res!=3) A[i][j]=-A[i][j]; //make -2 if still dead
                }
            }
        }

        //convert all -ve to 0 and +ve to 1
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++) A[i][j]= A[i][j]<0? 0 : 1;
    }

    //indices of neighbours in 8 direction
    int dis[][]={{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};

    //function for counting the live neighbours of current cell
    int count(int[][] A,int i,int j,int m,int n){
        int cnt=0;
        for(int k=0;k<8;k++){
            int x= i+dis[k][0], y= j+dis[k][1];
            if(x>=0 && y>=0 && x<m && y<n && Math.abs(A[x][y])==1) cnt++;
        }
        return cnt;
    }
} 
*/