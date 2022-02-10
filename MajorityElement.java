/**
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * You may assume that the array is non-empty and the majority element always exist in the array.
 * 
 * Example 1:
 * Input: [3,2,3]
 * Output: 3
 * 
 * Example 2:
 * Input: [2,2,1,1,1,2,2]
 * Output: 2
 */

 /* my leetcode soln
class Solution {

    //***using boyer moore's voting algorithm***
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = Integer.MIN_VALUE;
        
        for(int num: nums)
        {
            if(count == 0)
                candidate = num;
            
            count+= (num == candidate) ? 1 : -1;
        }
        
        return candidate;
    }
*/

/*
Explanation
So, Moore's Voting algorithm is based on the fact that the majority element is present more than n/2 number of times, 
so if we iterate in the array and increase the count if element is same as the choosen element and decrement the count otherwise, 
then also we will be left with the majority element because it is present more than n/2 number of times and rest of the elements 
cannot cancel it's presence.

We need not care about the count value, we just need the value in candidate, 
as already mentioned in the question that there is always a majority element.
Time complexity - O(n)
Space complexity - O(1)
*/


/*  not an effecient solution -> space n time both are not good(22ms, 55.4MB)   

* We know that the majority element occurs more than floor(n / 2) times, 
and a HashMap allows us to count element occurrences efficiently.
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    
        int res = 0;
        
        for (int num : nums) 
        {
            map.put(num, map.getOrDefault(num, 0) + 1);

            if (map.get(num) > nums.length/2) 
            {
                res = num;
                break;
            }
        }
        return res;
    }
}
*/