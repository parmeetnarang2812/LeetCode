/**
 * Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
 * 
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * 
 * Example 1:
 * Input: nums = [1,1,2]
 * Output: 2, nums = [1,2]
 * Explanation: Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. 
 * It doesn't matter what you leave beyond the returned length.
 * 
 * Example 2:
 * Input: nums = [0,0,1,1,1,2,2,3,3,4]
 * Output: 5, nums = [0,1,2,3,4]
 * Explanation: Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively. It doesn't matter what values are set beyond the returned length.
 * 
 * Constraints:
 * 0 <= nums.length <= 3 * 104
 * -104 <= nums[i] <= 104
 * nums is sorted in ascending order.
 */

 
/* my leetcode soln
class Solution {
    public int removeDuplicates(int[] nums) {
        // Here we declared a pointer to keep the track of previous index
        int slow = 0;

        for (int fast = 1; fast < nums.length; fast++) {
            // Condition->if the integer at i'th index is not equal to integer at i-1'th index then the condition is satisfied
            // i.e both the integer are different
            if (nums[slow] != nums[fast]) {
                // Incresing the previous by one to update its position by 1.
                // Inserting the value at i'th index to the previous'th index
                nums[++slow] = nums[fast];
            }
        }

        return slow + 1;
    }
}
*/