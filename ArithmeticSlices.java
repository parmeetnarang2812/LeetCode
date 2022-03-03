class Solution {
    public int numberOfArithmeticSlices(int[] nums) {

        int curr = 0; // size of current arithmetic series
        int total = 0; // total no. of arithmetic series

        for (int i = 2; i < nums.length; i++) {
            // a,b,c are in a.p. if b-a == c-b
            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
                curr += 1;
                total += curr;
            } 
            else {
                curr = 0;
            }
        }
        
        return total;
    }
}