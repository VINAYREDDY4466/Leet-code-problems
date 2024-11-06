class Solution {
    public int[] decrypt(int[] code, int r) {
           int n = code.length;
        int[] arr = new int[n * 2];
        
        // Step 1: Double the array to handle circular references
        for (int i = 0; i < n; i++) {
            arr[i] = code[i];
            arr[i + n] = code[i];
        }
        
        int[] result = new int[n];
        
        // Step 2: For each index, calculate the sum based on the value of r
        for (int i = 0; i < n; i++) {
            int sum;
            if (r > 0) {
                sum = callsum(arr, i + 1, i + r);
            } else if (r < 0) {
                sum = callsum(arr, i + n + r, i + n - 1);
            } else {
                sum = 0;  // If r is 0, the result is 0 for that element
            }
            result[i] = sum;
        }
        
        return result;
    }

    // Helper function to calculate sum from arr[start] to arr[end] (inclusive)
    public int callsum(int[] arr, int start, int end) {
        int ans = 0;
        for (int i = start; i <= end; i++) {
            ans += arr[i];
        }
        return ans;
    }
}
