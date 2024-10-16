class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum=0;
         for (int i = 0; i < arr.length; i++) {
            // Iterate over all odd-length subarrays starting from index i
            for (int len = 1; i + len <= arr.length; len += 2) {  // Increase by 2 for odd lengths
                // Sum the current subarray
                for (int j = i; j < i + len; j++) {
                    sum += arr[j];
                }
            }
        }

        return sum;
    }
}