/*              1.Two Sum
 * Given an array of integers, return indices of the two numbers such that they
 * add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 *
 * Example:
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
 */

 /* my leetcode soln
 class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        Map<Integer, Integer> map = new HashMap<>();    //Entry: <Value, Index>
        for(int i=0; i<nums.length; i++) {
            //for each item, search the map for the complement.
            //if the complement exists, return current index & compliment's index (from mapping). else continue.

            if(map.containsKey(target - nums[i])) {
                arr[1] = i;
                arr[0] = map.get(target - nums[i]);
                break;
            }
            map.put(nums[i], i);    //add all values and indicies to mapping
        }
        return arr;
    }
}
 */

 /* better soln -> less time & space
 class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[] {-1, -1};
        }
        Map<Integer, Integer> visited = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (visited.containsKey(diff)) {
                return new int[] {visited.get(diff), i};
            }
            visited.put(nums[i], i);
        }
        return new int[] {-1, -1};
    }
}
 */