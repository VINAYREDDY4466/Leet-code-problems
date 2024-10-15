import java.util.Arrays;

class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n]; // 1D DP array to store minimum jumps for each index
        Arrays.fill(dp, -1);   // Initialize with -1 (uncomputed)
        int ans = solve(0, nums, dp, n);
        return ans;
    }

    // Recursive function to find the minimum jumps from the current index
    public int solve(int index, int[] arr, int[] dp, int n) {
        if (index >= n - 1) {   // If we reached or exceeded the last index
            return 0;
        }
        if (dp[index] != -1) {  // Return previously computed result
            return dp[index];
        }

        int mini = Integer.MAX_VALUE;  // Minimum number of jumps to reach the end
        for (int i = 1; i <= arr[index]; i++) {  // Try all jumps from 1 to arr[index]
            if (index + i < n) {  // Check to stay within bounds
                int jumps = solve(index + i, arr, dp, n);
                if (jumps != Integer.MAX_VALUE) {
                    mini = Math.min(mini, 1 + jumps);  // Add 1 jump to the result
                }
            }
        }
        
        dp[index] = mini;  // Memoize the result for the current index
        return dp[index];
    }
}
