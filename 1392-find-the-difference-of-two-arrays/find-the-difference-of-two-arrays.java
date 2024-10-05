import java.util.*;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // Use HashSet to track unique elements
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        
        // Add all elements from nums1 to set1
        for (int num : nums1) {
            set1.add(num);
        }
        
        // Add all elements from nums2 to set2
        for (int num : nums2) {
            set2.add(num);
        }

        // Find elements in nums1 that are not in nums2
        List<Integer> diff1 = new ArrayList<>();
        for (int num : nums1) {
            if (!set2.contains(num)&&!diff1.contains(num)) {
                diff1.add(num);
            }
        }
        
        // Find elements in nums2 that are not in nums1
        List<Integer> diff2 = new ArrayList<>();
        for (int num : nums2) {
            if (!set1.contains(num)&&!diff2.contains(num)) {
                diff2.add(num);
            }
        }

        // Prepare the result list
        List<List<Integer>> res = new ArrayList<>();
        res.add(diff1);  // First list: elements in nums1 but not in nums2
        res.add(diff2);  // Second list: elements in nums2 but not in nums1

        return res;
    }
}
