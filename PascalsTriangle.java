/*                         118. Pascal's Triangle
Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
                    1
                   1 1
                  1 2 1
                 1 3 3 1
                1 4 6 4 1

Example 1:
    Input: numRows = 5
    Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

Example 2:
    Input: numRows = 1
    Output: [[1]]
 
Constraints:
    1 <= numRows <= 30
*/

/*  my leetcode soln
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for(int i=0; i<numRows; i++) {
            List<Integer> ans = new ArrayList<>();
            int val = 1;
            ans.add(1);
            for(int j=0; j<i; j++) {
                val=(val *(i-j))/(j+1); //binomial
                ans.add(val);
            }
            res.add(ans);
        }
        return res;
    }
}
*/