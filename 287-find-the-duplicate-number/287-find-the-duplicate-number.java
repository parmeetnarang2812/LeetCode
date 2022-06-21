class Solution {
    public int findDuplicate(int[] nums) {
        int length = nums.length;
        for(int i : nums) {
            int val = Math.abs(i);
            if(nums[val] < 0) {
                return val;
            }
            nums[val] = -nums[val];
        }
        return length;
    }
}