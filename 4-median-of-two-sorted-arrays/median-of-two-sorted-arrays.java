// Java code block for the brute force approach
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Merge two arrays
        int[] mergedArr = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, mergedArr, 0, nums1.length);
        System.arraycopy(nums2, 0, mergedArr, nums1.length, nums2.length);

        // Sort the merged array
        Arrays.sort(mergedArr);

        // Calculate median based on the length
        int n = mergedArr.length;
        if (n % 2 == 0) {
            return (double) (mergedArr[n / 2 - 1] + mergedArr[n / 2]) / 2.0;
        } else {
            return (double) mergedArr[n / 2];
        }
    }
}