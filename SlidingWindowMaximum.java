/*  my leetcode soln 
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int[] nge = new int[nums.length];
        Stack<Integer> st = new Stack<>();

        nge[nums.length - 1] = nums.length;
        st.push(nums.length - 1);

        for (int i = nums.length - 2; i >= 0; i--) {
            while (st.size() > 0 && nums[st.peek()] <= nums[i]) {
                st.pop();
            }
            if (st.size() == 0) {
                nge[i] = nums.length;
            } else {
                nge[i] = st.peek();
            }
            st.push(i);
        }

        int[] ans = new int[nums.length - k + 1];
        int j = 0;
        for (int i = 0; i < ans.length; i++) {
            if (j < i) {
                j = i;
            }

            while (nge[j] < i + k) {
                j = nge[j];
            }
            ans[i] = nums[j];
        }
        return ans;
    }
}
*/