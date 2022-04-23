/*                                     258. Add Digits
    Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

    Example 1:
        Input: num = 38
        Output: 2
        Explanation: The process is
        38 --> 3 + 8 --> 11
        11 --> 1 + 1 --> 2 
        Since 2 has only one digit, return it.

    Example 2:
        Input: num = 0
        Output: 0
    

    Constraints:
        0 <= num <= 231 - 1
*/

/*  Better optimal soln -> less time & space
    class Solution {
    public int addDigits(int num) {
        if (num / 10 == 0) {
        return num;
        }
        int digitSum = 0;
        while (num > 0) {
        digitSum += num % 10;
        num /= 10;
        }
        return addDigits(digitSum);
    }
    }

    My solution
    class Solution {
        public int addDigits(int nums) {
            if(nums<10) {
                return nums;
            }
            
            int sum = 0;
            while(nums >= 10) {
                int onesPlace = nums % 10;
                int tensPlace = nums / 10;
                sum = tensPlace + onesPlace;
                nums = sum;
            }
            
            return sum;
        }
    }
*/