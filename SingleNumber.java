/*                              136. Single Number
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
    Note : You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:
Input: nums = [2,2,1]
Output: 1

Example 2:
Input: nums = [4,1,2,1,2]
Output: 4

Example 3:
Input: nums = [1]
Output: 1
 
Constraints:
1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Each element in the array appears twice except for one element which appears only once.
*/

/*     my solution using hashmap : time is O(n)=>22ms run time : space is O(n)=>53.4MB
// class Solution {
//   public int singleNumber(int[] nums) {
//     HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//     for(int num : nums) {
//         if(map.containsKey(num)==false) {
//            map.put(num, 1); 
//         }
//         else {
//             int val = map.get(num);
//             map.put(num, val+1);
//         }
//     }    
//     for(int num : nums) {
//         if(map.get(num)==1) {
//             return num;
//         }
//     }
//     return 0;  
//   }
// }


    // ***Best Optimal Soln using bit manipulation=> XOR*** (approach below)
        //time & space is O(1) => 1ms and 42MB   
    class Solution {
        public int singleNumber(int[] nums) {
            int result=0;
            for(int num : nums) {
                result ^= num; // XOR
            }
            return result;
        }
    }
*/

/*  Approach
    result = 0000
    result = result ^ 2    // in other words: 0000 ^ 0010 => 0010
    result = result ^ 4    // in other words: 0010 ^ 0100 => 0110
    result = result ^ 3    // in other words: 0110 ^ 0011 => 0101
    result = result ^ 2    // in other words: 0101 ^ 0010 => 0111
    result = result ^ 4    // in other words: 0111 ^ 0100 => 0011
    The bit in the 1's place was flipped only once, because of the number 3, so it never had the chance to flip back. 
    The bit in the 2's place was flipped three times; twice for the number 2, and once for the number 3. 
    So in the end, it stayed flipped "on" (to 1). 
    Finally, the bit in the 4's place was flipped twice, once for each number 4. As you can see, in the end, the order didn't matter.

    
****Question-> What if a negative number happens?
        Good question. Negative numbers are distinguished by one of the bits defining the overall number (usually the leading bit). As an example, an 8-bit, signed number 6 would be represented in binary as follows:
        00000110

        The binary representation of -6 would be represented as negative by having its leading bit flipped, as you see here:
        10000110

        Incidentally, this is why signed number types have smaller maximum values than their unsigned (always positive) counterparts. 
        The largest possible unsigned, 8-bit number is 255; but if you make it a signed byte, 
        the largest it can be is 127, because that final bit is reserved for designating sign (positive or negative).

        How does this answer your question? 
        It means the xor operation (^) accounts for both sign and value, because sign is captured by one of an integer's built-in bits. 
        So it still works, whether there are negatives in the duplicates, or the target itself is negative!

*/