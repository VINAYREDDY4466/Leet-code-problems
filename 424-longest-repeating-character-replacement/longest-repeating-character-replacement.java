class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int maxFreq = 0;  // This keeps track of the count of the most frequent character in the current window
        int maxlen = 0;
        int l = 0;

        for (int r = 0; r < s.length(); r++) {
            // Increment the count of the current character
            count[s.charAt(r) - 'A']++;
            
            // Update maxFreq to be the maximum frequency of any character in the current window
            maxFreq = Math.max(maxFreq, count[s.charAt(r) - 'A']);
            
            // If the current window size minus the frequency of the most common character is greater than k, shrink the window
            if ((r - l + 1) - maxFreq > k) {
                count[s.charAt(l) - 'A']--;
                l++;
            }
            
            // Update maxlen
            maxlen = Math.max(maxlen, r - l + 1);
        }

        return maxlen;
    }
}