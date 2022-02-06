/*                              66. Plus One

You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. 
The digits are ordered from most significant to least significant in left-to-right order. 
The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

Example 1:
    Input: digits = [1,2,3]
    Output: [1,2,4]
    Explanation: The array represents the integer 123.
    Incrementing by one gives 123 + 1 = 124.
    Thus, the result should be [1,2,4].

Example 2:
    Input: digits = [9]
    Output: [1,0]
    Explanation: The array represents the integer 9.
    Incrementing by one gives 9 + 1 = 10.
    Thus, the result should be [1,0].
*/

/* my leetcode solution
class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length; // length of array;
        int carry = 1;

        // start the loop from last index;
        for (int i = len-1; i>=0; i--) {
            
            digits[i] += carry;

            // if ith index is 9, that means there will be an overflow if we add 1
            // adding 1 will make it 10, so we set it to 0. and continue the loop; 
            
            if (digits[i] <= 9) {   //early return
                return digits;  // if ith value is not 9 we just add 1 to it and return;
            }else {
                digits[i] = 0;
            }
                 
        }
        
        // if we are here, that means all the value of the array were 9;
        // and they are 0 now;
        // example: [9,9,9,9], after loop becomes [0,0,0,0];
        // so we have to create a new array of +1 length of the previous.
        // and place 1 at 0th index;
        int[] arr = new int[len+1];
        arr[0] = 1;
        return arr;
    }
}
*/

/*
Key Tips:

Use carry = 1 as initial value;
Early return:
use the sum <= 9 as trigger;
Reuse the array when early return;
If early return not happens, then the highest two positions must be 1 and 0. And the new array with the size of length + 1 is needed.

*/