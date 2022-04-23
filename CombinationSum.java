/*                                  39. Combination Sum - Medium

Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates 
where the chosen numbers sum to target. You may return the combinations in any order.

The same number may be chosen from candidates an unlimited number of times. 
Two combinations are unique if the frequency of at least one of the chosen numbers is different.

It is guaranteed that the number of unique combinations that sum up to target is less than 150 combinations for the given input.

Example 1:
    Input: candidates = [2,3,6,7], target = 7
    Output: [[2,2,3],[7]]
    Explanation:
    2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
    7 is a candidate, and 7 = 7.
    These are the only two combinations.

Example 2:
    Input: candidates = [2,3,5], target = 8
    Output: [[2,2,2,2],[2,3,3],[3,5]]

Example 3:
    Input: candidates = [2], target = 1
    Output: []
 
Constraints:
    1 <= candidates.length <= 30
    1 <= candidates[i] <= 200
    All elements of candidates are distinct.
    1 <= target <= 500 
*/


/*  my leetcode soln
    recursion method
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> recAns = new ArrayList<>();
        combination(ans, recAns, candidates, target, 0);
        return ans;
    }

    public void combination(List<List<Integer>> ans, List<Integer> recAns, int[] candidates, int target, int idx) {
        if (target == 0) {
            List<Integer> base = new ArrayList<>(recAns);
            ans.add(base);
            return;
        }

        for (int i = idx; i < candidates.length; i++) {
            if (target - candidates[i] >= 0) {
                recAns.add(candidates[i]);
                combination(ans, recAns, candidates, target - candidates[i], i);
                recAns.remove(recAns.size() - 1);
            }
        }
    }
} */