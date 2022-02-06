/**                             88. Merge Sorted Array
 * 
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * Note:
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
 * 
 * Example 1:
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 * Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
 * The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 * 
 * Example 2:
 * Input: nums1 = [1], m = 1, nums2 = [], n = 0
 * Output: [1]
 * Explanation: The arrays we are merging are [1] and [].
 * The result of the merge is [1].
 * 
 *  Example 3:
 * Input: nums1 = [0], m = 0, nums2 = [1], n = 1
 * Output: [1]
 * Explanation: The arrays we are merging are [] and [1].
 * The result of the merge is [1].
 * Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
 *  
 * 
 * Constraints:
 * nums1.length == m + n
 * nums2.length == n
 * 0 <= m, n <= 200
 * 1 <= m + n <= 200
 * -109 <= nums1[i], nums2[j] <= 109
 */


/* my leetcode soln -> O(m+n) time and O(1) space
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // null and empty check
        if (nums1 == null && nums2 == null || m == 0 && n == 0) {
            return;
        }

        // two pointers start from right to left
        int idx1 = m - 1;
        int idx2 = n - 1;
        int idxSol = m + n - 1;

        // when idx1 and idx2 both not out of bound, iteratively copy bigger number to
        // end of nums1
        while (idx1 >= 0 && idx2 >= 0) {
            if (nums1[idx1] >= nums2[idx2]) {
                nums1[idxSol--] = nums1[idx1--];
            } else {
                nums1[idxSol--] = nums2[idx2--];
            }
        }

        // post-processing
        while (idx2 >= 0) { // idx1 = -1, out of bound, copy all remaining nums2 to nums1
            nums1[idxSol--] = nums2[idx2--];
        }
        while (idx1 >= 0) { // idx1 = -2, out of bound, copy all remaining nums1 to nums1
            nums1[idxSol--] = nums1[idx1--];
        }
    }
}
*/