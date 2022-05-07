/*                                      75. Sort Colors - Medium

Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, 
    with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the librarys sort function.

Example 1:
    Input: nums = [2,0,2,1,1,0]
    Output: [0,0,1,1,2,2]

Example 2:
    Input: nums = [2,0,1]
    Output: [0,1,2]
 
Constraints:
    n == nums.length
    1 <= n <= 300
    nums[i] is either 0, 1, or 2.
 
Follow up: Could you come up with a one-pass algorithm using only constant extra space?
*/


/*  // my leetcode solns
    // 1 pass
class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(low, mid, nums);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(mid, high, nums);
                high--;
            }
        }
    }

    void swap(int i, int j, int arr[]) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

    // 2 pass
class Solution {
    public void sortColors(int[] nums) {
        int zero=0, one=0, two=0;
        for(int num : nums) {
            if(num==0) {
                zero++;
            }
            else if(num==1) {
                one++;
            }
        }
        
//         two = nums.length-zero-one;  -> no use of two(no need to declare even)
        
        for(int i = 0; i < nums.length; i++) {
            if (i < zero) {nums[i] = 0;}
            else if (i < zero + one) {nums[i] = 1;}
            else {nums[i] = 2;}
        }
    }
}
*/