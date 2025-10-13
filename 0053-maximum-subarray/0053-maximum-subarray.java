class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        // Initialize both to first element
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < n; i++) {
            // Either extend the current subarray, or start new at nums[i]
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            // Update global max
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
