/**
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.
 * 
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * 
 * Example 1:
 * Input: nums = [3,2,2,3], val = 3
 * Output: 2, nums = [2,2,_,_]
 * Explanation: Your function should return k = 2, with the first two elements of nums being 2.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 * 
 * Example 2:
 * Input: nums = [0,1,2,2,3,0,4,2], val = 2
 * Output: 5, nums = [0,1,4,0,3,_,_,_]
 * Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
 * Note that the five elements can be returned in any order.
 * It does not matter what you leave beyond the returned k (hence they are underscores).

 * Constraints:
 * 0 <= nums.length <= 100
 * 0 <= nums[i] <= 50
 * 0 <= val <= 100
 */

/*  my leetcode soln
class Solution {
    public int removeElement(int[] nums, int val) {
        // Here we declared a pointer to keep the track of previous index
        int slow=0;

        for(int fast=0; fast<nums.length; fast++) {
            // Condition->if the integer at i'th index is not equal to val then the condition is satisfied
            // i.e both the integer are different
            if(nums[fast]!=val) {
                // Inserting the value at i'th index to the previous'th index
                // Incresing the previous by one to update its position by 1.
                nums[slow++] = nums[fast];
            }
        }
        
        return slow;
    }
}
*/