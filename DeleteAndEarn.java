/*                              740. Delete and Earn - Medium
You are given an integer array nums. You want to maximize the number of points you get by performing the following operation 
any number of times:

Pick any nums[i] and delete it to earn nums[i] points. Afterwards, you must delete every element equal to nums[i] - 1 
and every element equal to nums[i] + 1.
Return the maximum number of points you can earn by applying the above operation some number of times.

Example 1:
    Input: nums = [3,4,2]
    Output: 6
    Explanation: You can perform the following operations:
    - Delete 4 to earn 4 points. Consequently, 3 is also deleted. nums = [2].
    - Delete 2 to earn 2 points. nums = [].
    You earn a total of 6 points.

Example 2:
    Input: nums = [2,2,3,3,3,4]
    Output: 9
    Explanation: You can perform the following operations:
    - Delete a 3 to earn 3 points. All 2's and 4's are also deleted. nums = [3,3].
    - Delete a 3 again to earn 3 points. nums = [3].
    - Delete a 3 once more to earn 3 points. nums = [].
    You earn a total of 9 points.
 
Constraints:
    1 <= nums.length <= 2 * 104
    1 <= nums[i] <= 104
*/

/*  APPROACH : This problem is similar to House Robber problem:

House robber asks to optimze the total with constraint that you cannot pick adjacent houses. 
This problem is also optimization problem with the constraist that once you pick a number from the input you cannot select 
adjacent values (stated as you must delete every element equal to nums[i] - 1 and every element equal to nums[i] + 1). 
Note that numbers in input array can be repeating. With some pre-processing this problem can be transformed to match House robber problem.

*    The adjustment that is required would be to sort the numbers and aggregate the values of repeating numbers in input array. 
*    This can be easily achieved by use of one additional array (with capacity as defined in max input values constraint) 
*    with the index in this new array representing the number from input array the value aggregate. The solution evaluates 
*    and decides whether to choose current number or not based on previous max. 

*/

/*  my leetcode soln 
class Solution {
    public int deleteAndEarn(int[] nums) {
        int n = 10001;
        int[] values = new int[n];
        for (int num : nums)
            values[num] += num; // storing points we will get after deleting that number

        int take = 0, skip = 0;
        for (int i = 0; i < n; i++) {
            int takei = skip + values[i];
            int skipi = Math.max(skip, take);
            take = takei;
            skip = skipi;
        }
        return Math.max(take, skip);
    }
} 
*/